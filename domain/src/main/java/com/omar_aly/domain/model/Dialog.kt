package com.omar_aly.domain.model

import com.omar_aly.domain.annotation.Action

data class Dialog(
    val title: String? = null,
    val message: String? = null,
    val positiveMessage: String? = null,
    @Action val positiveAction: Int? = null,
    val positiveObject: Any? = null,
    val negativeMessage: String? = null,
    @Action val negativeAction: Int? = null,
    val negativeObject: Any? = null
)