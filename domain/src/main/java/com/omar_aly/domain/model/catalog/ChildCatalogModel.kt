package com.omar_aly.domain.model.catalog

data class ChildCatalogModel(
    val cover: Any,
    val deep_link: String,
    val filters: List<Filter>,
    val group_id: Int,
    val image: String,
    val name: String
)