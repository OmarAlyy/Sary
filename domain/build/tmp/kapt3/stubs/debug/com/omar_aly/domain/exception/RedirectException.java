package com.omar_aly.domain.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/omar_aly/domain/exception/RedirectException;", "Lcom/omar_aly/domain/exception/CleanException;", "code", "", "redirect", "Lcom/omar_aly/domain/model/Redirect;", "(ILcom/omar_aly/domain/model/Redirect;)V", "getCode", "()I", "getRedirect", "()Lcom/omar_aly/domain/model/Redirect;", "domain_debug"})
public final class RedirectException extends com.omar_aly.domain.exception.CleanException {
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.omar_aly.domain.model.Redirect redirect = null;
    
    @java.lang.Override()
    public int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.omar_aly.domain.model.Redirect getRedirect() {
        return null;
    }
    
    public RedirectException(int code, @org.jetbrains.annotations.NotNull()
    com.omar_aly.domain.model.Redirect redirect) {
        super(0, 0, null);
    }
}