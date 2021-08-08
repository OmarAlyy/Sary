package com.omar_aly.data.local.pref

interface PrefHelper {
    fun getLang(): String

    fun setLang(lang: String)

    fun getToken(): String?

    fun setToken(token: String)
}