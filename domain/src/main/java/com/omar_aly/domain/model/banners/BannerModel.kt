package com.omar_aly.domain.model.banners

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BannerModel(
    val branches: List<Int>,
    val button_text: String,
    val cities: List<String>,
    val created_at: String,
    val description: String,
    val expiry_date: String,
    val expiry_status: Boolean,
    val id: Int,
    val image: String,
    val is_available: Boolean,
    val level: String,
    val link: String,
    val photo: String,
    val priority: Int,
    val promo_code: String,
    val start_date: String,
    val title: String
) : Parcelable