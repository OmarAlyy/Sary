package com.omar_aly.domain.model.catalog

data class CatalogModel(
    val `data`: List<ChildCatalogModel>,
    val data_type: String,
    val id: Int,
    val row_count: Int,
    val show_more_enabled: Boolean,
    val show_title: Boolean,
    val subtitle: String,
    val title: String,
    val ui_type: String
)

class TypeView {


    companion object {
        const val ui_data_type_banner = "banner"
        const val ui_data_type_smart = "smart"
        const val ui_data_type_group = "group"

        const val ui_type_grid = "grid"
        const val ui_type_slider = "slider"
        const val ui_type_linear = "linear"

        const val ui_type_slider_int = 1
        const val ui_type_linear_int = 2
        const val ui_type_grid_int = 3
    }

}