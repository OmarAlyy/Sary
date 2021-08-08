package com.omar_aly.data.remote.builder

import android.content.Context
import com.omar_aly.data.BuildConfig
import com.omar_aly.data.HttpClient
import com.omar_aly.data.R
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Authenticator
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitBuilder @Inject constructor(@ApplicationContext private val context: Context) {
    private var connectionTimeout = HttpClient.CONNECT_TIMEOUT
    private var writeTimeout = HttpClient.WRITE_TIMEOUT
    private var readTimeout = HttpClient.READ_TIMEOUT
    private var okHttpClientBuilder: OkHttpClient.Builder? = null
    private var interceptors = mutableListOf<Interceptor>()
    private var logEnable: Boolean = BuildConfig.DEBUG
    private var isSupportAuthorization = false
    private var authenticator: Authenticator? = null
    private var baseUrl: String = context.getString(R.string.base_url)



    /**
     * add custom interceptor for ok http client
     * @param interceptor is a interceptor for ok http client
     */
    fun addInterceptors(vararg interceptor: Interceptor): RetrofitBuilder {
        interceptors.addAll(interceptor)
        return this
    }






    /**
     * Make a Retrofit
     */
    fun build(): Retrofit {
        val clientBuilder = okHttpClientBuilder?.let { it } ?: OkHttpClient.Builder().apply {
            connectTimeout(connectionTimeout, TimeUnit.SECONDS)
            writeTimeout(writeTimeout, TimeUnit.SECONDS)
            readTimeout(readTimeout, TimeUnit.SECONDS)

            if (logEnable) {
                addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            }

            val auth: Authenticator? = when {
                authenticator != null -> authenticator
                 else -> null
            }

            auth?.let { authenticator(it) }

            interceptors.forEach { addInterceptor(it) }
        }

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(clientBuilder.build())

            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}