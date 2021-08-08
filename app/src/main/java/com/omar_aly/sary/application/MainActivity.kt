package com.omar_aly.sary.application

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.omar_aly.data.local.pref.AppPrefs
import com.omar_aly.sary.R
import com.omar_aly.sary.databinding.ActivityMainBinding
import com.omar_aly.sary.extension.startGoToMain
import com.omar_aly.sary.extension.startGoToSplash
import com.omar_aly.sary.util.Localize
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity() : AppCompatActivity() {

    @Inject
    lateinit var prefHelper: AppPrefs

    private val TAG = "MainActivity"


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupNavigation()
        binding.lang.setOnClickListener {
            changeLang()

        }
    }





    private fun setupNavigation() {
        val navController = findNavController(R.id.mainNavFragment)
        binding.bottomNavBar.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp() = findNavController(R.id.mainNavFragment).navigateUp()

    private fun changeLang() {

        var lang = prefHelper.getLang()
        lang = if (lang == "ar") "en" else "ar"
        Localize.changeLang(this, lang)
        prefHelper.setLang(lang)
        startGoToSplash()
    }
}