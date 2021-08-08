package com.omar_aly.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00028\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/omar_aly/domain/usecase/UseCase;", "Params", "T", "", "()V", "createObservable", "params", "(Ljava/lang/Object;)Ljava/lang/Object;", "onCleared", "", "domain_debug"})
public abstract class UseCase<Params extends java.lang.Object, T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract T createObservable(@org.jetbrains.annotations.Nullable()
    Params params);
    
    public void onCleared() {
    }
    
    public UseCase() {
        super();
    }
}