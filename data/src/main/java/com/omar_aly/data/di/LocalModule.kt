package com.omar_aly.data.di

import android.content.Context
import com.google.gson.Gson
import com.omar_aly.data.local.pref.AppPrefs
import com.omar_aly.data.local.pref.PrefHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalModule {


    @Provides
    @Singleton
    fun providePrefHelper(appPrefs: AppPrefs): PrefHelper {
        return appPrefs
    }

    @Provides
    @Singleton
    fun providerAppPrefs(@ApplicationContext context: Context): AppPrefs {
        return AppPrefs(context, Gson())
    }



}
