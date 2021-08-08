// Generated by data binding compiler. Do not edit!
package com.omar_aly.sary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.omar_aly.sary.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemBannerBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  protected ItemBannerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
  }

  @NonNull
  public static ItemBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_banner, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemBannerBinding>inflateInternal(inflater, R.layout.item_banner, root, attachToRoot, component);
  }

  @NonNull
  public static ItemBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_banner, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemBannerBinding>inflateInternal(inflater, R.layout.item_banner, null, false, component);
  }

  public static ItemBannerBinding bind(@NonNull View view) {
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
  public static ItemBannerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemBannerBinding)bind(component, view, R.layout.item_banner);
  }
}