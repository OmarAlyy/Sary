package com.omar_aly.data.local.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/omar_aly/data/local/pref/AppPrefs;", "Lcom/omar_aly/data/local/pref/PrefHelper;", "mContext", "Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "(Landroid/content/Context;Lcom/google/gson/Gson;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getLang", "", "getToken", "setLang", "", "lang", "setToken", "Companion", "data_debug"})
public final class AppPrefs implements com.omar_aly.data.local.pref.PrefHelper {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.Context mContext = null;
    private final com.google.gson.Gson gson = null;
    private static final java.lang.String LANG = "lang";
    private static final java.lang.String TOKEN = "token";
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.data.local.pref.AppPrefs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLang() {
        return null;
    }
    
    @java.lang.Override()
    public void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getToken() {
        return null;
    }
    
    @java.lang.Override()
    public void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    @javax.inject.Inject()
    public AppPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/omar_aly/data/local/pref/AppPrefs$Companion;", "", "()V", "LANG", "", "TOKEN", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}