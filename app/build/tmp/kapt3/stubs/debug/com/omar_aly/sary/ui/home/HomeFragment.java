package com.omar_aly.sary.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\nR+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00168B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006,"}, d2 = {"Lcom/omar_aly/sary/ui/home/HomeFragment;", "Lcom/omar_aly/sary/base/BaseFragment;", "Lcom/omar_aly/sary/databinding/FragmentMainBinding;", "Lcom/omar_aly/sary/ui/home/HomeViewModel;", "()V", "bindingComponent", "Lcom/omar_aly/sary/binding/FragmentDataBindingComponent;", "bindingVariable", "", "getBindingVariable", "()I", "<set-?>", "Lcom/omar_aly/sary/ui/home/CatalogParentAdapter;", "catalogParentAdapter", "getCatalogParentAdapter", "()Lcom/omar_aly/sary/ui/home/CatalogParentAdapter;", "setCatalogParentAdapter", "(Lcom/omar_aly/sary/ui/home/CatalogParentAdapter;)V", "catalogParentAdapter$delegate", "Lcom/omar_aly/sary/util/AutoClearedValue;", "layoutId", "getLayoutId", "Lcom/omar_aly/sary/ui/home/ImageSliderPagerAdapter;", "pagerAdapter", "getPagerAdapter", "()Lcom/omar_aly/sary/ui/home/ImageSliderPagerAdapter;", "setPagerAdapter", "(Lcom/omar_aly/sary/ui/home/ImageSliderPagerAdapter;)V", "pagerAdapter$delegate", "viewModel", "getViewModel", "()Lcom/omar_aly/sary/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setUpViewpager", "subscribeUI", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.omar_aly.sary.base.BaseFragment<com.omar_aly.sary.databinding.FragmentMainBinding, com.omar_aly.sary.ui.home.HomeViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.omar_aly.sary.util.AutoClearedValue pagerAdapter$delegate = null;
    private final com.omar_aly.sary.util.AutoClearedValue catalogParentAdapter$delegate = null;
    private com.omar_aly.sary.binding.FragmentDataBindingComponent bindingComponent;
    public static final long INTERVAL_DURATION = 3000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.omar_aly.sary.ui.home.HomeFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.omar_aly.sary.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    private final com.omar_aly.sary.ui.home.ImageSliderPagerAdapter getPagerAdapter() {
        return null;
    }
    
    private final void setPagerAdapter(com.omar_aly.sary.ui.home.ImageSliderPagerAdapter p0) {
    }
    
    private final com.omar_aly.sary.ui.home.CatalogParentAdapter getCatalogParentAdapter() {
        return null;
    }
    
    private final void setCatalogParentAdapter(com.omar_aly.sary.ui.home.CatalogParentAdapter p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViewpager() {
    }
    
    private final void subscribeUI() {
    }
    
    public HomeFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/omar_aly/sary/ui/home/HomeFragment$Companion;", "", "()V", "INTERVAL_DURATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}