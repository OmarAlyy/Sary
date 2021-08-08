package com.omar_aly.data.remote.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0002\u001d\u001eBC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J!\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0019\u001a\u00020\tJ\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007J\b\u0010\u001b\u001a\u0004\u0018\u00010\rJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/omar_aly/data/remote/exception/RetrofitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_message", "", "_url", "_response", "Lretrofit2/Response;", "_kind", "Lcom/omar_aly/data/remote/exception/RetrofitException$Kind;", "_exception", "", "_retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/String;Ljava/lang/String;Lretrofit2/Response;Lcom/omar_aly/data/remote/exception/RetrofitException$Kind;Ljava/lang/Throwable;Lretrofit2/Retrofit;)V", "_errorData", "Lcom/omar_aly/data/remote/response/ServerErrorResponse;", "deserializeServerError", "", "getErrorBodyAs", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getErrorData", "getKind", "getResponse", "getRetrofit", "getUrl", "Companion", "Kind", "data_debug"})
public final class RetrofitException extends java.lang.RuntimeException {
    private com.omar_aly.data.remote.response.ServerErrorResponse _errorData;
    private final java.lang.String _message = null;
    private final java.lang.String _url = null;
    private final retrofit2.Response<?> _response = null;
    private final com.omar_aly.data.remote.exception.RetrofitException.Kind _kind = null;
    private final java.lang.Throwable _exception = null;
    private final retrofit2.Retrofit _retrofit = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.data.remote.exception.RetrofitException.Companion Companion = null;
    
    /**
     * The request URL which produced the error.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    /**
     * Response object containing status code, headers, body, etc.
     */
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Response<?> getResponse() {
        return null;
    }
    
    /**
     * The event kind which triggered this error.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.data.remote.exception.RetrofitException.Kind getKind() {
        return null;
    }
    
    /**
     * The Retrofit this request was executed on
     */
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    /**
     * The data returned from the server in the response body
     */
    @org.jetbrains.annotations.Nullable()
    public final com.omar_aly.data.remote.response.ServerErrorResponse getErrorData() {
        return null;
    }
    
    private final void deserializeServerError() {
    }
    
    /**
     * HTTP response body converted to specified `type`. `null` if there is no
     * response.
     * @throws IOException if unable to convert the body to the specified `type`.
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getErrorBodyAs(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        return null;
    }
    
    public RetrofitException(@org.jetbrains.annotations.Nullable()
    java.lang.String _message, @org.jetbrains.annotations.Nullable()
    java.lang.String _url, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<?> _response, @org.jetbrains.annotations.NotNull()
    com.omar_aly.data.remote.exception.RetrofitException.Kind _kind, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable _exception, @org.jetbrains.annotations.Nullable()
    retrofit2.Retrofit _retrofit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/omar_aly/data/remote/exception/RetrofitException$Kind;", "", "(Ljava/lang/String;I)V", "NETWORK", "HTTP", "HTTP_422_WITH_DATA", "UNEXPECTED", "data_debug"})
    public static enum Kind {
        /*public static final*/ NETWORK /* = new NETWORK() */,
        /*public static final*/ HTTP /* = new HTTP() */,
        /*public static final*/ HTTP_422_WITH_DATA /* = new HTTP_422_WITH_DATA() */,
        /*public static final*/ UNEXPECTED /* = new UNEXPECTED() */;
        
        Kind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/omar_aly/data/remote/exception/RetrofitException$Companion;", "", "()V", "httpError", "Lcom/omar_aly/data/remote/exception/RetrofitException;", "url", "", "response", "Lretrofit2/Response;", "retrofit", "Lretrofit2/Retrofit;", "httpErrorWithObject", "networkError", "exception", "Ljava/io/IOException;", "unexpectedError", "", "data_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.omar_aly.data.remote.exception.RetrofitException httpError(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        retrofit2.Response<?> response, @org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.omar_aly.data.remote.exception.RetrofitException httpErrorWithObject(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        retrofit2.Response<?> response, @org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.omar_aly.data.remote.exception.RetrofitException networkError(@org.jetbrains.annotations.NotNull()
        java.io.IOException exception) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.omar_aly.data.remote.exception.RetrofitException unexpectedError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}