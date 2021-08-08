package com.omar_aly.domain.repository

import com.omar_aly.domain.model.banners.BannerModel
import io.reactivex.Single

interface BannersRepository : Repository {
    fun getItems(): Single<List<BannerModel>>
}