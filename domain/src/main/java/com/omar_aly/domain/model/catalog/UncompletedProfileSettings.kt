package com.omar_aly.domain.model.catalog

data class UncompletedProfileSettings(
    val image: String,
    val is_completed_profile: Boolean,
    val message: String,
    val show_tag: Boolean
)