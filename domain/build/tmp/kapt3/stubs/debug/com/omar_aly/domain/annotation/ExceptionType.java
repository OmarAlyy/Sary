package com.omar_aly.domain.annotation;

import java.lang.System;

/**
 * Clear exception from Throwable
 * @param SNACK is type of show message via Snack bar
 * @param TOAST is type of show message via Toast
 * @param INLINE is type of show or hide view warning, omar_aly: password in correct hint of password field
 * @param ALERT is type of show message type Alert Dialog, but only message & button `OK`
 * @param DIALOG is type of show Alert Dialog, with multiple attributes: title, message, positive, negative & action
 * @param REDIRECT is type of auto-redirect with view, action or finished, ...
 */
@androidx.annotation.IntDef(value = {1, 2, 3, 4, 5, 6})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/omar_aly/domain/annotation/ExceptionType;", "", "Companion", "domain_debug"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface ExceptionType {
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.domain.annotation.ExceptionType.Companion Companion = null;
    public static final int SNACK = 1;
    public static final int TOAST = 2;
    public static final int INLINE = 3;
    public static final int ALERT = 4;
    public static final int DIALOG = 5;
    public static final int REDIRECT = 6;
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/omar_aly/domain/annotation/ExceptionType$Companion;", "", "()V", "ALERT", "", "DIALOG", "INLINE", "REDIRECT", "SNACK", "TOAST", "domain_debug"})
    public static final class Companion {
        public static final int SNACK = 1;
        public static final int TOAST = 2;
        public static final int INLINE = 3;
        public static final int ALERT = 4;
        public static final int DIALOG = 5;
        public static final int REDIRECT = 6;
        
        private Companion() {
            super();
        }
    }
}