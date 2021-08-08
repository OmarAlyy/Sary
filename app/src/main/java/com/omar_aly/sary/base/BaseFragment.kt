package com.omar_aly.sary.base

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import com.google.android.material.snackbar.Snackbar
import com.omar_aly.domain.annotation.Action
import com.omar_aly.domain.annotation.Redirect
import com.omar_aly.sary.extension.showDialog
import com.omar_aly.sary.util.autoCleared



abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel> : Fragment(){

    abstract val bindingVariable: Int

    abstract val viewModel: V

    @get:LayoutRes
    abstract val layoutId: Int

    var viewDataBinding by autoCleared<T>()

    private var toast: Toast? = null
    private var snackBar: Snackbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewDataBinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding.apply {
            setVariable(bindingVariable, viewModel)
            executePendingBindings()
            lifecycleOwner = this@BaseFragment
        }
        subscriberException()
    }

    override fun onStop() {
        super.onStop()
        toast?.cancel()
        snackBar?.dismiss()
    }




    @SuppressLint("ShowToast")
    private fun subscriberException() {
        viewModel.run {
            snackBarMessage.observe(viewLifecycleOwner) { message ->
                view?.let { snackBar = Snackbar.make(it, message, Snackbar.LENGTH_SHORT) }
                snackBar?.show()
            }

            toastMessage.observe(viewLifecycleOwner) { message ->
                context?.let { toast = Toast.makeText(it, message, Toast.LENGTH_SHORT) }
                toast?.show()
            }



            dialogException.observe(viewLifecycleOwner) { dialog ->
                context?.showDialog(
                    title = dialog.title,
                    message = dialog.message,
                    positiveMessage = dialog.positiveMessage,
                    negativeMessage = dialog.negativeMessage,
                    positiveAction = { positiveAction(dialog.positiveAction, dialog.positiveObject) },
                    negativeAction = { negativeAction(dialog.negativeAction, dialog.negativeObject) }
                )
            }


            redirectException.observe(viewLifecycleOwner, Observer {
                redirectAction(it.redirect, it.redirectObject)
            })
        }
    }

    open fun positiveAction(@Action action: Int?, data: Any? = null) {}

    open fun negativeAction(@Action action: Int?, data: Any? = null) {}

    open fun redirectAction(@Redirect redirect: Int?, data: Any? = null) {}

    open fun onBackPressed() {}


}