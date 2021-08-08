package com.omar_aly.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/omar_aly/data/di/RepositoryModule;", "", "()V", "providerBannersRepository", "Lcom/omar_aly/domain/repository/BannersRepository;", "repository", "Lcom/omar_aly/data/BannersRepositoryImpl;", "providerCatalogRepository", "Lcom/omar_aly/domain/repository/CatalogRepository;", "Lcom/omar_aly/data/CatalogRepositoryImpl;", "data_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.omar_aly.domain.repository.BannersRepository providerBannersRepository(@org.jetbrains.annotations.NotNull()
    com.omar_aly.data.BannersRepositoryImpl repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.omar_aly.domain.repository.CatalogRepository providerCatalogRepository(@org.jetbrains.annotations.NotNull()
    com.omar_aly.data.CatalogRepositoryImpl repository) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}