package com.omar_aly.sary.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.omar_aly.domain.model.banners.BannerModel
import com.omar_aly.sary.BR
import com.omar_aly.sary.R
import com.omar_aly.sary.base.BaseFragment
import com.omar_aly.sary.binding.FragmentDataBindingComponent
import com.omar_aly.sary.databinding.FragmentMainBinding
import com.omar_aly.sary.extension.setVisible
import com.omar_aly.sary.extension.slide
import com.omar_aly.sary.extension.toast
import com.omar_aly.sary.ui.custom.ZoomOutPageTransformer
import com.omar_aly.sary.util.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentMainBinding, HomeViewModel>() {

    override val bindingVariable: Int
        get() = BR.viewModel

    override val layoutId: Int
        get() = R.layout.fragment_main

    override val viewModel: HomeViewModel by viewModels()

    private var pagerAdapter by autoCleared<ImageSliderPagerAdapter>()
    private var catalogParentAdapter by autoCleared<CatalogParentAdapter>()

    private var bindingComponent = FragmentDataBindingComponent(this)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        subscribeUI()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        pagerAdapter =
            ImageSliderPagerAdapter(bindingComponent) { item -> this.toast(item.title + " \n " + item.link) }
        catalogParentAdapter =
            CatalogParentAdapter(bindingComponent) { item ->
                this.toast(
                    item.image
                )
            }

        with(viewDataBinding) {
            listCatalog.adapter = catalogParentAdapter
            viewPager.adapter = pagerAdapter
            viewPager.setPageTransformer(ZoomOutPageTransformer())

        }
    }

    companion object {
        const val INTERVAL_DURATION: Long = 3000
    }

    private fun setUpViewpager() {
        viewDataBinding.apply {
            dotsIndicator.setViewPager2(viewPager)
            viewPager.slide(INTERVAL_DURATION)

        }
    }

    private fun subscribeUI() = with(viewModel) {

        bannersData.observe(viewLifecycleOwner) {
            val list: MutableList<BannerModel> = it as MutableList<BannerModel>
            list.addAll(list)
            pagerAdapter.submitList(list)
            setUpViewpager()
        }

        catalogData.observe(viewLifecycleOwner) {
            it.apply {
                catalogParentAdapter.submitList(result)
                if (other.show_special_order_view)
                    viewDataBinding.linSpecialOrder.setVisible(true)
            }

        }

        loading.observe(viewLifecycleOwner) { loading ->
            viewDataBinding.loading.visibility = if (loading) View.VISIBLE else View.GONE
        }
    }
}
