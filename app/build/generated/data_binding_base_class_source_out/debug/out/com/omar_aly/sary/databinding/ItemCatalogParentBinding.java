// Generated by data binding compiler. Do not edit!
package com.omar_aly.sary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.omar_aly.domain.model.catalog.CatalogModel;
import com.omar_aly.sary.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCatalogParentBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout image;

  @NonNull
  public final RecyclerView listCatalog;

  @Bindable
  protected CatalogModel mCatalog;

  protected ItemCatalogParentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout image, RecyclerView listCatalog) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.listCatalog = listCatalog;
  }

  public abstract void setCatalog(@Nullable CatalogModel catalog);

  @Nullable
  public CatalogModel getCatalog() {
    return mCatalog;
  }

  @NonNull
  public static ItemCatalogParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_catalog_parent, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCatalogParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCatalogParentBinding>inflateInternal(inflater, R.layout.item_catalog_parent, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCatalogParentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_catalog_parent, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCatalogParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCatalogParentBinding>inflateInternal(inflater, R.layout.item_catalog_parent, null, false, component);
  }

  public static ItemCatalogParentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemCatalogParentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCatalogParentBinding)bind(component, view, R.layout.item_catalog_parent);
  }
}