package com.omar_aly.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/omar_aly/data/remote/api/ItemsApi;", "", "geBanners", "Lio/reactivex/Single;", "Lcom/omar_aly/domain/model/banners/BannersResponse;", "getCatalog", "Lcom/omar_aly/domain/model/catalog/CatalogResponse;", "searchRepos", "Lcom/omar_aly/data/remote/response/SearchRepoResponse;", "page", "", "data_debug"})
public abstract interface ItemsApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/repositories")
    public abstract io.reactivex.Single<com.omar_aly.data.remote.response.SearchRepoResponse> searchRepos(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "catalog")
    public abstract io.reactivex.Single<com.omar_aly.domain.model.catalog.CatalogResponse> getCatalog();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "banners")
    public abstract io.reactivex.Single<com.omar_aly.domain.model.banners.BannersResponse> geBanners();
}