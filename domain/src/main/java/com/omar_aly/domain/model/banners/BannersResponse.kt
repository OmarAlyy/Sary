package com.omar_aly.domain.model.banners

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BannersResponse(
    @SerializedName("result") val bannerModel: List<BannerModel>,
    @SerializedName("status") val status: Boolean
) : Parcelable