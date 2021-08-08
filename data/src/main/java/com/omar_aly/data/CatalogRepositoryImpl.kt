package com.omar_aly.data


import com.omar_aly.data.remote.api.ItemsApi
import com.omar_aly.domain.model.catalog.CatalogResponse
import com.omar_aly.domain.repository.CatalogRepository
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class CatalogRepositoryImpl @Inject constructor(
    private val itemsApi: ItemsApi,
) : CatalogRepository {

    override fun getItems(): Single<CatalogResponse> {
        return itemsApi.getCatalog()

    }
}


