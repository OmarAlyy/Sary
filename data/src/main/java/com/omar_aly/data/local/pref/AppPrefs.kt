package com.omar_aly.data.local.pref

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.google.gson.Gson
import javax.inject.Inject

class AppPrefs @Inject constructor(
    private val mContext: Context,
    private val gson: Gson
) : PrefHelper {

    private val sharedPreferences: SharedPreferences =
        mContext.getSharedPreferences(mContext.packageName, Context.MODE_PRIVATE)

    override fun getLang(): String {
         return sharedPreferences.getString(LANG, "ar").toString()
    }

    override fun setLang(lang: String) {
         sharedPreferences.edit { putString(LANG, lang) }

    }

    override fun getToken(): String {
         return sharedPreferences.getString(TOKEN, "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6ODg2NiwidXNlcl9waG9uZSI6Ijk2NjU2NDk4OTI1MCJ9.VYE28vtnMRLmwBISgvvnhOmPuGueW49ogOhXm5ZqsGU").toString()
    }

    override fun setToken(lang: String) {
         sharedPreferences.edit { putString(TOKEN, lang) }

    }





    companion object {
        private const val LANG = "lang"
        private const val TOKEN = "token"
    }
}