package com.omar_aly.data.di

import com.omar_aly.data.BannersRepositoryImpl
import com.omar_aly.data.CatalogRepositoryImpl
import com.omar_aly.domain.repository.BannersRepository
import com.omar_aly.domain.repository.CatalogRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {


    @Provides
    @Singleton
    fun providerBannersRepository(repository: BannersRepositoryImpl): BannersRepository {
        return repository
    }

    @Provides
    @Singleton
    fun providerCatalogRepository(repository: CatalogRepositoryImpl): CatalogRepository {
        return repository
    }

}
