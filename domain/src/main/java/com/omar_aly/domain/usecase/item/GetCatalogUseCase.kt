package com.omar_aly.domain.usecase.item

import com.omar_aly.domain.model.catalog.CatalogResponse
import com.omar_aly.domain.repository.CatalogRepository
import com.omar_aly.domain.usecase.UseCase
import io.reactivex.Single
import javax.inject.Inject

class GetCatalogUseCase @Inject constructor(
    private val catalogRepository: CatalogRepository
) : UseCase<GetCatalogUseCase.Params, Single<CatalogResponse>>() {

    override fun createObservable(params: Params?): Single<CatalogResponse> {
        params?.let { return catalogRepository.getItems() }
        return Single.error(Throwable(""))
    }

    override fun onCleared() {
    }

    data class Params(val pageNumber: Int? = 1)
}