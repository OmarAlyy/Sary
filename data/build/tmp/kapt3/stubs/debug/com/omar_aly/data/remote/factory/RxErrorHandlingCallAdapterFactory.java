package com.omar_aly.data.remote.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J4\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0002\u00a2\u0006\u0002\u0010\u0015R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/omar_aly/data/remote/factory/RxErrorHandlingCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_original", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "kotlin.jvm.PlatformType", "get_original", "()Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "_original$delegate", "Lkotlin/Lazy;", "get", "Lretrofit2/CallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "Companion", "RxCallAdapterWrapper", "data_debug"})
public final class RxErrorHandlingCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    private final kotlin.Lazy _original$delegate = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.data.remote.factory.RxErrorHandlingCallAdapterFactory.Companion Companion = null;
    
    private final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory get_original() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.CallAdapter<?, ?> get(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type returnType, @org.jetbrains.annotations.NotNull()
    java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public RxErrorHandlingCallAdapterFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/omar_aly/data/remote/factory/RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper;", "R", "Lretrofit2/CallAdapter;", "", "_context", "Landroid/content/Context;", "_retrofit", "Lretrofit2/Retrofit;", "_wrappedCallAdapter", "(Landroid/content/Context;Lretrofit2/Retrofit;Lretrofit2/CallAdapter;)V", "get_context", "()Landroid/content/Context;", "get_retrofit", "()Lretrofit2/Retrofit;", "get_wrappedCallAdapter", "()Lretrofit2/CallAdapter;", "retrofitExceptionMapper", "Lcom/omar_aly/data/remote/mapper/RetrofitExceptionMapper;", "getRetrofitExceptionMapper", "()Lcom/omar_aly/data/remote/mapper/RetrofitExceptionMapper;", "retrofitExceptionMapper$delegate", "Lkotlin/Lazy;", "adapt", "call", "Lretrofit2/Call;", "asRetrofitException", "Lcom/omar_aly/data/remote/exception/RetrofitException;", "throwable", "", "responseType", "Ljava/lang/reflect/Type;", "data_debug"})
    static final class RxCallAdapterWrapper<R extends java.lang.Object> implements retrofit2.CallAdapter<R, java.lang.Object> {
        private final kotlin.Lazy retrofitExceptionMapper$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context _context = null;
        @org.jetbrains.annotations.NotNull()
        private final retrofit2.Retrofit _retrofit = null;
        @org.jetbrains.annotations.NotNull()
        private final retrofit2.CallAdapter<R, ?> _wrappedCallAdapter = null;
        
        private final com.omar_aly.data.remote.mapper.RetrofitExceptionMapper getRetrofitExceptionMapper() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.reflect.Type responseType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public java.lang.Object adapt(@org.jetbrains.annotations.NotNull()
        retrofit2.Call<R> call) {
            return null;
        }
        
        private final com.omar_aly.data.remote.exception.RetrofitException asRetrofitException(java.lang.Throwable throwable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context get_context() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.Retrofit get_retrofit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.CallAdapter<R, ?> get_wrappedCallAdapter() {
            return null;
        }
        
        public RxCallAdapterWrapper(@org.jetbrains.annotations.NotNull()
        android.content.Context _context, @org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit _retrofit, @org.jetbrains.annotations.NotNull()
        retrofit2.CallAdapter<R, ?> _wrappedCallAdapter) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/omar_aly/data/remote/factory/RxErrorHandlingCallAdapterFactory$Companion;", "", "()V", "create", "Lretrofit2/CallAdapter$Factory;", "context", "Landroid/content/Context;", "data_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.CallAdapter.Factory create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}