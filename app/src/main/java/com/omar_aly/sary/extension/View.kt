package com.omar_aly.sary.extension

import android.content.Context
import android.view.View
import android.view.ViewTreeObserver
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit


fun View.isVisible() = this.visibility == View.VISIBLE

fun View.setVisible(visible: Boolean, invisible: Boolean? = false) {
    visibility = when {
        visible -> View.VISIBLE
        invisible == true -> View.INVISIBLE
        else -> View.GONE
    }
}

fun View.zoomOut() {
    val animZoomIn: Animation =
        AnimationUtils.loadAnimation(context, com.omar_aly.sary.R.anim.zoom_out)
    animZoomIn.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationStart(animation: Animation?) {

        }

        override fun onAnimationEnd(animation: Animation?) {
            setVisible(false)

        }

        override fun onAnimationRepeat(animation: Animation?) {
        }

    })
    startAnimation(animZoomIn)


}

fun ImageView.loadFromUrl(url: String) =
    Glide.with(this.context.applicationContext)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(this)

fun View.hideKeyboard() {
    val inputMethod: InputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethod.hideSoftInputFromWindow(windowToken, 0)
}

fun View.showKeyboard() {
    val inputMethod: InputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethod.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}

fun ViewPager2.slide(duration: Long) {

    Observable.interval(duration, TimeUnit.MILLISECONDS)
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe {
            if (this.currentItem < (this.adapter?.itemCount
                    ?: 1) - 1
            ) {
                this.currentItem =
                    this.currentItem + 1
            } else {
                this.currentItem = 0
            }
        }
}

inline fun View.afterMeasured(crossinline f: View.() -> Unit) {
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            if (measuredWidth > 0 && measuredHeight > 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this)
                f()
            }
        }
    })
}


@BindingAdapter("circleUrl")
fun ImageView.circleUrl(url: String?) = url?.let {
    Glide.with(context)
        .load(it)
        .apply(RequestOptions.circleCropTransform())
        .into(this)
}

@BindingAdapter("image")
fun ImageView.load(url: String?) = url?.let {
    Glide.with(this.context.applicationContext)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(this)
}