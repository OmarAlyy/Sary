package com.omar_aly.domain.model.catalog

data class CatalogResponse(
    val message: String,
    val other: Other,
    val result: List<CatalogModel>,
    val status: Boolean
)