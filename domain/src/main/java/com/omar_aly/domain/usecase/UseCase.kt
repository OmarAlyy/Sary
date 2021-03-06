package com.omar_aly.domain.usecase


abstract class UseCase<in Params, out T> where T : Any {

    abstract fun createObservable(params: Params? = null): T

    open fun onCleared() {}
}