package com.omar_aly.sary;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.omar_aly.sary.databinding.ActivityMainBindingImpl;
import com.omar_aly.sary.databinding.FragmentMainBindingImpl;
import com.omar_aly.sary.databinding.ItemBannerBindingImpl;
import com.omar_aly.sary.databinding.ItemCatalogBannerBindingImpl;
import com.omar_aly.sary.databinding.ItemCatalogGroupBindingImpl;
import com.omar_aly.sary.databinding.ItemCatalogParentBindingImpl;
import com.omar_aly.sary.databinding.ItemCatalogSmartBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTMAIN = 2;

  private static final int LAYOUT_ITEMBANNER = 3;

  private static final int LAYOUT_ITEMCATALOGBANNER = 4;

  private static final int LAYOUT_ITEMCATALOGGROUP = 5;

  private static final int LAYOUT_ITEMCATALOGPARENT = 6;

  private static final int LAYOUT_ITEMCATALOGSMART = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.item_banner, LAYOUT_ITEMBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.item_catalog_banner, LAYOUT_ITEMCATALOGBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.item_catalog_group, LAYOUT_ITEMCATALOGGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.item_catalog_parent, LAYOUT_ITEMCATALOGPARENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omar_aly.sary.R.layout.item_catalog_smart, LAYOUT_ITEMCATALOGSMART);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBANNER: {
          if ("layout/item_banner_0".equals(tag)) {
            return new ItemBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATALOGBANNER: {
          if ("layout/item_catalog_banner_0".equals(tag)) {
            return new ItemCatalogBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_catalog_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATALOGGROUP: {
          if ("layout/item_catalog_group_0".equals(tag)) {
            return new ItemCatalogGroupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_catalog_group is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATALOGPARENT: {
          if ("layout/item_catalog_parent_0".equals(tag)) {
            return new ItemCatalogParentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_catalog_parent is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATALOGSMART: {
          if ("layout/item_catalog_smart_0".equals(tag)) {
            return new ItemCatalogSmartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_catalog_smart is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "catalog");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.omar_aly.sary.R.layout.activity_main);
      sKeys.put("layout/fragment_main_0", com.omar_aly.sary.R.layout.fragment_main);
      sKeys.put("layout/item_banner_0", com.omar_aly.sary.R.layout.item_banner);
      sKeys.put("layout/item_catalog_banner_0", com.omar_aly.sary.R.layout.item_catalog_banner);
      sKeys.put("layout/item_catalog_group_0", com.omar_aly.sary.R.layout.item_catalog_group);
      sKeys.put("layout/item_catalog_parent_0", com.omar_aly.sary.R.layout.item_catalog_parent);
      sKeys.put("layout/item_catalog_smart_0", com.omar_aly.sary.R.layout.item_catalog_smart);
    }
  }
}
