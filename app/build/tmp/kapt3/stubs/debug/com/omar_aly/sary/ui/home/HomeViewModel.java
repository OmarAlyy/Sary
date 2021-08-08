package com.omar_aly.sary.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/omar_aly/sary/ui/home/HomeViewModel;", "Lcom/omar_aly/sary/base/BaseViewModel;", "getBannersUseCase", "Lcom/omar_aly/domain/usecase/item/GetBannersUseCase;", "getCatalogUseCase", "Lcom/omar_aly/domain/usecase/item/GetCatalogUseCase;", "(Lcom/omar_aly/domain/usecase/item/GetBannersUseCase;Lcom/omar_aly/domain/usecase/item/GetCatalogUseCase;)V", "bannersData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/omar_aly/domain/model/banners/BannerModel;", "getBannersData", "()Landroidx/lifecycle/MutableLiveData;", "catalogData", "Lcom/omar_aly/domain/model/catalog/CatalogResponse;", "getCatalogData", "loading", "", "getLoading", "getBanners", "", "getCatalog", "app_debug"})
public final class HomeViewModel extends com.omar_aly.sary.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.omar_aly.domain.model.banners.BannerModel>> bannersData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.omar_aly.domain.model.catalog.CatalogResponse> catalogData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    private final com.omar_aly.domain.usecase.item.GetBannersUseCase getBannersUseCase = null;
    private final com.omar_aly.domain.usecase.item.GetCatalogUseCase getCatalogUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.omar_aly.domain.model.banners.BannerModel>> getBannersData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.omar_aly.domain.model.catalog.CatalogResponse> getCatalogData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void getBanners() {
    }
    
    public final void getCatalog() {
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.omar_aly.domain.usecase.item.GetBannersUseCase getBannersUseCase, @org.jetbrains.annotations.NotNull()
    com.omar_aly.domain.usecase.item.GetCatalogUseCase getCatalogUseCase) {
        super(null);
    }
}