package com.omar_aly.sary.extension

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.WindowManager
import com.omar_aly.sary.application.MainActivity
import com.omar_aly.sary.application.SplashActivity

fun Context.showDialog(
    title: String? = null,
    message: String? = null,
    cancelable: Boolean? = false,
    positiveMessage: String? = null,
    positiveAction: (() -> Unit)? = null,
    negativeMessage: String? = null,
    negativeAction: (() -> Unit)? = null
) {
    AlertDialog.Builder(this).apply {
        title?.let { setTitle(it) }
        cancelable?.let { setCancelable(it) }
        message?.let { setMessage(message) }
        positiveMessage?.let { setPositiveButton(it) { _, _ -> positiveAction?.invoke() } }
        negativeMessage?.let { setNegativeButton(it) { _, _ -> negativeAction?.invoke() } }
    }.create().show()
}

fun Activity.startGoToSplash() {
    val intent = Intent(this, SplashActivity::class.java)
    startActivity(intent)
    finish()
}


fun Activity.fullScreen() {
    getWindow().setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    );
}


fun Activity.startGoToMain() {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
    finish()
}
