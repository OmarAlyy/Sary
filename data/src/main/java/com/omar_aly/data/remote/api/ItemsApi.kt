package com.omar_aly.data.remote.api

import com.omar_aly.data.remote.response.SearchRepoResponse
import com.omar_aly.domain.model.banners.BannersResponse
import com.omar_aly.domain.model.catalog.CatalogResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ItemsApi {

    @GET("search/repositories")
    fun searchRepos(  @Query("page") page: Int): Single<SearchRepoResponse>

    @GET("catalog")
    fun getCatalog(): Single<CatalogResponse>

    @GET("banners")
    fun geBanners(): Single<BannersResponse>
}