package com.omar_aly.data.remote.interceptor

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.omar_aly.data.BuildConfig
import com.omar_aly.data.local.pref.AppPrefs
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeaderInterceptor @Inject constructor(
    @ApplicationContext private val context: Context
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val token: String? = AppPrefs(context, Gson()).getToken()
        val lang : String = AppPrefs(context, Gson()).getLang()


        var request = chain.request()
        request = request.newBuilder()
            .addHeader(LANG, lang)
            .addHeader(DEVICE_TYPE, ANDROID)
            .addHeader(APP_VERSION,  BuildConfig.VERSION_NAME)
            .apply { token?.let { addHeader("Authorization", "token $it") } }
            .build()

        return chain.proceed(request)
    }

    companion object {
        private const val APP_VERSION = "App-Version"
         private const val LANG = "Accept-Language"
         private const val DEVICE_TYPE = "Device-Type"
         private const val ANDROID = "android"

    }
}