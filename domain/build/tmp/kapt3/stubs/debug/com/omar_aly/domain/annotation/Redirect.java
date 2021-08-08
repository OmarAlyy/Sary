package com.omar_aly.domain.annotation;

import java.lang.System;

@androidx.annotation.IntDef(value = {1})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/omar_aly/domain/annotation/Redirect;", "", "Companion", "domain_debug"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface Redirect {
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.domain.annotation.Redirect.Companion Companion = null;
    public static final int OPEN_HOME_SCREEN = 1;
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/omar_aly/domain/annotation/Redirect$Companion;", "", "()V", "OPEN_HOME_SCREEN", "", "domain_debug"})
    public static final class Companion {
        public static final int OPEN_HOME_SCREEN = 1;
        
        private Companion() {
            super();
        }
    }
}