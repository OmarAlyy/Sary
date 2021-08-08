package com.omar_aly.sary.extension

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.omar_aly.sary.R



fun Fragment.toast(message: String) {
     Toast.makeText(this.activity, message ,  Toast.LENGTH_SHORT).show()

}