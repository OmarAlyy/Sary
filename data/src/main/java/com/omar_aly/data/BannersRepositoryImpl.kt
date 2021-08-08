package com.omar_aly.data


import com.omar_aly.data.remote.api.ItemsApi
import com.omar_aly.domain.model.banners.BannerModel
import com.omar_aly.domain.repository.BannersRepository
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class BannersRepositoryImpl @Inject constructor(
    private val itemsApi: ItemsApi,
) : BannersRepository {


    override fun getItems(): Single<List<BannerModel>> {
        return itemsApi.geBanners()
            .map { response ->
                response.bannerModel.map { it }
            }



    }
}


