package com.omar_aly.sary.base

import androidx.lifecycle.ViewModel
import com.omar_aly.domain.exception.DialogException
import com.omar_aly.domain.exception.RedirectException
import com.omar_aly.domain.exception.SnackBarException
import com.omar_aly.domain.exception.ToastException
import com.omar_aly.domain.model.Dialog
import com.omar_aly.domain.model.Redirect
import com.omar_aly.domain.usecase.UseCase
import com.omar_aly.sary.util.SingleLiveData
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel constructor(
    private vararg val useCases: UseCase<*, *>?
) : ViewModel() {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val snackBarMessage = SingleLiveData<String>()
    val toastMessage = SingleLiveData<String>()
    val dialogException = SingleLiveData<Dialog>()
    val redirectException = SingleLiveData<Redirect>()

    fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    fun setThrowable(throwable: Throwable) {
        when (throwable) {
            is SnackBarException -> snackBarMessage.value = throwable.message
            is ToastException -> toastMessage.value = throwable.message
            is DialogException -> dialogException.value = throwable.dialog
            is RedirectException -> redirectException.value = throwable.redirect
        }
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        useCases.let { userCases ->
            if (userCases.isNotEmpty()) userCases.forEach { it?.onCleared() }
        }
        super.onCleared()
    }
}