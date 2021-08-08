package com.omar_aly.sary.util

import android.content.Context
import android.content.res.Configuration
import java.util.*

class Localize {

    companion object {
        fun changeLang(context: Context, language: String) {
            val locale = Locale(language)
            Locale.setDefault(locale)
            val config = Configuration()
            config.locale = locale
            context.resources.updateConfiguration(config, null)
        }
    }

}