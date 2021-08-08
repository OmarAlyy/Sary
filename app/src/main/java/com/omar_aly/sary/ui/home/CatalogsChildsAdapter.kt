package com.omar_aly.sary.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.omar_aly.domain.model.catalog.ChildCatalogModel
import com.omar_aly.domain.model.catalog.TypeView
import com.omar_aly.sary.R
import com.omar_aly.sary.base.BaseRecyclerAdapter
import com.omar_aly.sary.databinding.ItemCatalogBannerBinding
import com.omar_aly.sary.databinding.ItemCatalogGroupBinding
import com.omar_aly.sary.databinding.ItemCatalogSmartBinding
import com.omar_aly.sary.extension.load

class CatalogsChildsAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val viewType: String,
    private val callback: ((ChildCatalogModel) -> Unit)?
) : BaseRecyclerAdapter<ChildCatalogModel>(


    callBack = object : DiffUtil.ItemCallback<ChildCatalogModel>() {
        override fun areItemsTheSame(
            oldItem: ChildCatalogModel,
            newItem: ChildCatalogModel
        ): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(
            oldItem: ChildCatalogModel,
            newItem: ChildCatalogModel
        ): Boolean {
            return oldItem.group_id == newItem.group_id && oldItem.name == newItem.name
        }
    }) {


    override fun createBinding(parent: ViewGroup, viewType: Int?): ViewDataBinding =
        when (this.viewType) {
            TypeView.ui_data_type_smart -> {
                DataBindingUtil.inflate<ItemCatalogSmartBinding>(
                    LayoutInflater.from(parent.context), R.layout.item_catalog_smart,
                    parent, false, dataBindingComponent
                )
            }
            TypeView.ui_data_type_group -> {
                DataBindingUtil.inflate<ItemCatalogGroupBinding>(
                    LayoutInflater.from(parent.context), R.layout.item_catalog_group,
                    parent, false, dataBindingComponent
                )
            }

            else -> {
                DataBindingUtil.inflate<ItemCatalogBannerBinding>(
                    LayoutInflater.from(parent.context), R.layout.item_catalog_banner,
                    parent, false, dataBindingComponent
                )
            }
        }


    override fun bind(binding: ViewDataBinding, item: ChildCatalogModel) {

        when (binding) {
            is ItemCatalogSmartBinding -> {
                binding.image.load(item.image)
                binding.title.text = item.name
            }
            is ItemCatalogBannerBinding -> {
                binding.image.load(item.image)
            }
            is ItemCatalogGroupBinding -> {
                binding.image.load(item.image)
            }

        }
        binding.root.setOnClickListener {
            callback?.invoke(item)
        }
    }

}
