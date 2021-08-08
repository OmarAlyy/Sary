package com.omar_aly.sary.ui.home

import androidx.lifecycle.MutableLiveData
import com.omar_aly.domain.model.banners.BannerModel
import com.omar_aly.domain.model.catalog.CatalogResponse
import com.omar_aly.domain.usecase.item.GetBannersUseCase
import com.omar_aly.domain.usecase.item.GetCatalogUseCase
import com.omar_aly.sary.base.BaseViewModel
import com.omar_aly.sary.extension.add
import com.omar_aly.sary.util.RxUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getBannersUseCase: GetBannersUseCase,
    private val getCatalogUseCase: GetCatalogUseCase,
) : BaseViewModel() {


    val bannersData = MutableLiveData<List<BannerModel>>()
    val catalogData = MutableLiveData<CatalogResponse>()
    val loading = MutableLiveData<Boolean>().apply { postValue(false) }

    init {
        getBanners()
        getCatalog()
    }


    fun getBanners() {
        getBannersUseCase.createObservable(GetBannersUseCase.Params())
            .compose(RxUtils.applySingleScheduler(loading))
            .doFinally { loading.value = false }
            .subscribe({ bannersData.value = it }, {
                setThrowable(it)
            }).add(this)

    }

    fun getCatalog() {
        getCatalogUseCase.createObservable(GetCatalogUseCase.Params())
            .compose(RxUtils.applySingleScheduler(loading))
            .doFinally { loading.value = false }
            .subscribe({ catalogData.value = it }, {
                 setThrowable(it)
            }).add(this)

    }


}