package com.omar_aly.sary.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u001c\u001a\u00020\u001d2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001dH\u0016J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\u001a\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J%\u0010/\u001a\u00020\u001d2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0002\u0010!J%\u00100\u001a\u00020\u001d2\n\b\u0001\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0002\u0010!J\b\u00102\u001a\u00020\u001dH\u0003R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00008F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0019\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00063"}, d2 = {"Lcom/omar_aly/sary/base/BaseFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "V", "Lcom/omar_aly/sary/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "bindingVariable", "", "getBindingVariable", "()I", "layoutId", "getLayoutId", "snackBar", "Lcom/google/android/material/snackbar/Snackbar;", "toast", "Landroid/widget/Toast;", "<set-?>", "viewDataBinding", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "viewDataBinding$delegate", "Lcom/omar_aly/sary/util/AutoClearedValue;", "viewModel", "getViewModel", "()Lcom/omar_aly/sary/base/BaseViewModel;", "negativeAction", "", "action", "data", "", "(Ljava/lang/Integer;Ljava/lang/Object;)V", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStop", "onViewCreated", "view", "positiveAction", "redirectAction", "redirect", "subscriberException", "app_debug"})
public abstract class BaseFragment<T extends androidx.databinding.ViewDataBinding, V extends com.omar_aly.sary.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final com.omar_aly.sary.util.AutoClearedValue viewDataBinding$delegate = null;
    private android.widget.Toast toast;
    private com.google.android.material.snackbar.Snackbar snackBar;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getBindingVariable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewDataBinding() {
        return null;
    }
    
    public final void setViewDataBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @android.annotation.SuppressLint(value = {"ShowToast"})
    private final void subscriberException() {
    }
    
    public void positiveAction(@org.jetbrains.annotations.Nullable()
    @com.omar_aly.domain.annotation.Action()
    java.lang.Integer action, @org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
    
    public void negativeAction(@org.jetbrains.annotations.Nullable()
    @com.omar_aly.domain.annotation.Action()
    java.lang.Integer action, @org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
    
    public void redirectAction(@org.jetbrains.annotations.Nullable()
    @com.omar_aly.domain.annotation.Redirect()
    java.lang.Integer redirect, @org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
    
    public void onBackPressed() {
    }
    
    public BaseFragment() {
        super();
    }
}