package com.omar_aly.domain.repository

import com.omar_aly.domain.model.catalog.CatalogResponse
import io.reactivex.Single

interface CatalogRepository : Repository {
    fun getItems(): Single<CatalogResponse>
}