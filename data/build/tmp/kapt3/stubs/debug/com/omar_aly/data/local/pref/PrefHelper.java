package com.omar_aly.data.local.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/omar_aly/data/local/pref/PrefHelper;", "", "getLang", "", "getToken", "setLang", "", "lang", "setToken", "token", "data_debug"})
public abstract interface PrefHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLang();
    
    public abstract void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String lang);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getToken();
    
    public abstract void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
}