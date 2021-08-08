package com.omar_aly.sary.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u0001B-\u0012&\u0010\u0002\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003\"\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\"\u0010\u0002\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/omar_aly/sary/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "", "Lcom/omar_aly/domain/usecase/UseCase;", "([Lcom/omar_aly/domain/usecase/UseCase;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dialogException", "Lcom/omar_aly/sary/util/SingleLiveData;", "Lcom/omar_aly/domain/model/Dialog;", "getDialogException", "()Lcom/omar_aly/sary/util/SingleLiveData;", "redirectException", "Lcom/omar_aly/domain/model/Redirect;", "getRedirectException", "snackBarMessage", "", "getSnackBarMessage", "toastMessage", "getToastMessage", "[Lcom/omar_aly/domain/usecase/UseCase;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "onCleared", "setThrowable", "throwable", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final com.omar_aly.sary.util.SingleLiveData<java.lang.String> snackBarMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.omar_aly.sary.util.SingleLiveData<java.lang.String> toastMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.omar_aly.sary.util.SingleLiveData<com.omar_aly.domain.model.Dialog> dialogException = null;
    @org.jetbrains.annotations.NotNull()
    private final com.omar_aly.sary.util.SingleLiveData<com.omar_aly.domain.model.Redirect> redirectException = null;
    private final com.omar_aly.domain.usecase.UseCase<?, ?>[] useCases = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.sary.util.SingleLiveData<java.lang.String> getSnackBarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.sary.util.SingleLiveData<java.lang.String> getToastMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.sary.util.SingleLiveData<com.omar_aly.domain.model.Dialog> getDialogException() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.sary.util.SingleLiveData<com.omar_aly.domain.model.Redirect> getRedirectException() {
        return null;
    }
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final void setThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.omar_aly.domain.usecase.UseCase<?, ?>... useCases) {
        super();
    }
}