package com.omar_aly.sary.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.omar_aly.domain.model.banners.BannerModel
import com.omar_aly.sary.R
import com.omar_aly.sary.base.BaseRecyclerAdapter
import com.omar_aly.sary.databinding.ItemBannerBinding
import com.omar_aly.sary.extension.load

class ImageSliderPagerAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val callback: ((BannerModel) -> Unit)?) : BaseRecyclerAdapter<BannerModel>(


    callBack = object : DiffUtil.ItemCallback<BannerModel>() {
        override fun areItemsTheSame(oldItem: BannerModel, newItem: BannerModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: BannerModel, newItem: BannerModel): Boolean {
            return oldItem.title == newItem.title && oldItem.description == newItem.description
        }
    }) {


    override fun createBinding(parent: ViewGroup, viewType: Int?): ViewDataBinding =
        DataBindingUtil.inflate<ItemBannerBinding>(
            LayoutInflater.from(parent.context), R.layout.item_banner,
            parent, false, dataBindingComponent
        )

    override fun bind(binding: ViewDataBinding, item: BannerModel) {
        if (binding is ItemBannerBinding) {
            binding.image.load(item.image)
            binding.image.apply {
                load(item.image)
                setOnClickListener {
                    callback?.invoke(item)
                }
            }
        }

    }
}
