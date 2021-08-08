package com.omar_aly.sary.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.omar_aly.domain.model.catalog.CatalogModel
import com.omar_aly.domain.model.catalog.ChildCatalogModel
import com.omar_aly.domain.model.catalog.TypeView
import com.omar_aly.sary.R
import com.omar_aly.sary.base.BaseRecyclerAdapter
import com.omar_aly.sary.databinding.ItemCatalogParentBinding

class CatalogParentAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val callback: ((ChildCatalogModel) -> Unit)?
) : BaseRecyclerAdapter<CatalogModel>(


    callBack = object : DiffUtil.ItemCallback<CatalogModel>() {
        override fun areItemsTheSame(oldItem: CatalogModel, newItem: CatalogModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CatalogModel, newItem: CatalogModel): Boolean {
            return oldItem.title == newItem.title && oldItem.data_type == newItem.data_type
        }
    }) {


    override fun createBinding(parent: ViewGroup, viewType: Int?): ViewDataBinding =
        DataBindingUtil.inflate<ItemCatalogParentBinding>(
            LayoutInflater.from(parent.context), R.layout.item_catalog_parent,
            parent, false, dataBindingComponent
        )

    override fun bind(binding: ViewDataBinding, item: CatalogModel) {

        if (binding is ItemCatalogParentBinding) {
            binding.catalog = item
            when (item.ui_type) {
                TypeView.ui_type_grid ->
                    binding.listCatalog.layoutManager =
                        GridLayoutManager(binding.listCatalog.context, item.row_count)

                TypeView.ui_type_linear, TypeView.ui_type_slider ->
                    binding.listCatalog.layoutManager =
                        GridLayoutManager(binding.listCatalog.context, item.row_count)
            }

            binding.listCatalog.adapter = CatalogsChildsAdapter(
                dataBindingComponent,
                item.data_type
            ) { item -> callback?.invoke(item) }.apply {
                submitList(item.data)
            }

        }
    }


}
