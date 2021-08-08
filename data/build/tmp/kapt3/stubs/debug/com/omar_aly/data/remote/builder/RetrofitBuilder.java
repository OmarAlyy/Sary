package com.omar_aly.data.remote.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0017\"\u00020\r\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/omar_aly/data/remote/builder/RetrofitBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "authenticator", "Lokhttp3/Authenticator;", "baseUrl", "", "connectionTimeout", "", "interceptors", "", "Lokhttp3/Interceptor;", "isSupportAuthorization", "", "logEnable", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "readTimeout", "writeTimeout", "addInterceptors", "interceptor", "", "([Lokhttp3/Interceptor;)Lcom/omar_aly/data/remote/builder/RetrofitBuilder;", "build", "Lretrofit2/Retrofit;", "data_debug"})
@javax.inject.Singleton()
public final class RetrofitBuilder {
    private long connectionTimeout = 10L;
    private long writeTimeout = 10L;
    private long readTimeout = 10L;
    private okhttp3.OkHttpClient.Builder okHttpClientBuilder;
    private java.util.List<okhttp3.Interceptor> interceptors;
    private boolean logEnable;
    private boolean isSupportAuthorization = false;
    private okhttp3.Authenticator authenticator;
    private java.lang.String baseUrl;
    private final android.content.Context context = null;
    
    /**
     * add custom interceptor for ok http client
     * @param interceptor is a interceptor for ok http client
     */
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.data.remote.builder.RetrofitBuilder addInterceptors(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor... interceptor) {
        return null;
    }
    
    /**
     * Make a Retrofit
     */
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit build() {
        return null;
    }
    
    @javax.inject.Inject()
    public RetrofitBuilder(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
}