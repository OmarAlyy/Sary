package com.omar_aly.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/omar_aly/domain/repository/BannersRepository;", "Lcom/omar_aly/domain/repository/Repository;", "getItems", "Lio/reactivex/Single;", "", "Lcom/omar_aly/domain/model/banners/BannerModel;", "domain_debug"})
public abstract interface BannersRepository extends com.omar_aly.domain.repository.Repository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.omar_aly.domain.model.banners.BannerModel>> getItems();
}