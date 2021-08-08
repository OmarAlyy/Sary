package com.omar_aly.sary.application

import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.omar_aly.data.local.pref.AppPrefs
import com.omar_aly.sary.R
import com.omar_aly.sary.extension.fullScreen
import com.omar_aly.sary.extension.startGoToMain
import com.omar_aly.sary.extension.zoomOut
import com.omar_aly.sary.util.Localize
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject


@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var prefHelper: AppPrefs
    val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fullScreen()
        Localize.changeLang(this, prefHelper.getLang())
        setContentView(R.layout.activity_splash)

    }

    private fun startApp() {
        compositeDisposable.add(
            Observable.timer(1, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe {
                logo.zoomOut()
            })
        compositeDisposable.add(
            Observable.timer(1330, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).subscribe {
                startGoToMain()
            })
    }

    override fun onResume() {
        startApp()
        super.onResume()
    }
    override fun onStop() {
        super.onStop()
        compositeDisposable.dispose()

    }

}