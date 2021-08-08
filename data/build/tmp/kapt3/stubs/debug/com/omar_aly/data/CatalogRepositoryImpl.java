package com.omar_aly.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/omar_aly/data/CatalogRepositoryImpl;", "Lcom/omar_aly/domain/repository/CatalogRepository;", "itemsApi", "Lcom/omar_aly/data/remote/api/ItemsApi;", "(Lcom/omar_aly/data/remote/api/ItemsApi;)V", "getItems", "Lio/reactivex/Single;", "Lcom/omar_aly/domain/model/catalog/CatalogResponse;", "data_debug"})
@javax.inject.Singleton()
public final class CatalogRepositoryImpl implements com.omar_aly.domain.repository.CatalogRepository {
    private final com.omar_aly.data.remote.api.ItemsApi itemsApi = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.omar_aly.domain.model.catalog.CatalogResponse> getItems() {
        return null;
    }
    
    @javax.inject.Inject()
    public CatalogRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.omar_aly.data.remote.api.ItemsApi itemsApi) {
        super();
    }
}