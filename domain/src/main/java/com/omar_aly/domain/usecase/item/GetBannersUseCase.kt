package com.omar_aly.domain.usecase.item

import com.omar_aly.domain.model.banners.BannerModel
import com.omar_aly.domain.repository.BannersRepository
import com.omar_aly.domain.usecase.UseCase
import io.reactivex.Single
import javax.inject.Inject

class GetBannersUseCase @Inject constructor(
    private val bannersRepository: BannersRepository
) : UseCase<GetBannersUseCase.Params, Single<List<BannerModel>>>() {

    override fun createObservable(params: Params?): Single<List<BannerModel>> {
        params?.let { return bannersRepository.getItems() }
        return Single.error(Throwable(""))
    }

    override fun onCleared() {
    }

    data class Params(val pageNumber: Int? = 1)
}