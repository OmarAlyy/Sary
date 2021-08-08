package com.omar_aly.domain.usecase.item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/omar_aly/domain/usecase/item/GetCatalogUseCase;", "Lcom/omar_aly/domain/usecase/UseCase;", "Lcom/omar_aly/domain/usecase/item/GetCatalogUseCase$Params;", "Lio/reactivex/Single;", "Lcom/omar_aly/domain/model/catalog/CatalogResponse;", "catalogRepository", "Lcom/omar_aly/domain/repository/CatalogRepository;", "(Lcom/omar_aly/domain/repository/CatalogRepository;)V", "createObservable", "params", "onCleared", "", "Params", "domain_debug"})
public final class GetCatalogUseCase extends com.omar_aly.domain.usecase.UseCase<com.omar_aly.domain.usecase.item.GetCatalogUseCase.Params, io.reactivex.Single<com.omar_aly.domain.model.catalog.CatalogResponse>> {
    private final com.omar_aly.domain.repository.CatalogRepository catalogRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.omar_aly.domain.model.catalog.CatalogResponse> createObservable(@org.jetbrains.annotations.Nullable()
    com.omar_aly.domain.usecase.item.GetCatalogUseCase.Params params) {
        return null;
    }
    
    @java.lang.Override()
    public void onCleared() {
    }
    
    @javax.inject.Inject()
    public GetCatalogUseCase(@org.jetbrains.annotations.NotNull()
    com.omar_aly.domain.repository.CatalogRepository catalogRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/omar_aly/domain/usecase/item/GetCatalogUseCase$Params;", "", "pageNumber", "", "(Ljava/lang/Integer;)V", "getPageNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/omar_aly/domain/usecase/item/GetCatalogUseCase$Params;", "equals", "", "other", "hashCode", "toString", "", "domain_debug"})
    public static final class Params {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer pageNumber = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPageNumber() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.Nullable()
        java.lang.Integer pageNumber) {
            super();
        }
        
        public Params() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.omar_aly.domain.usecase.item.GetCatalogUseCase.Params copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer pageNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}