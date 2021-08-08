// Generated by Dagger (https://dagger.dev).
package com.omar_aly.data;

import com.omar_aly.data.remote.api.ItemsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CatalogRepositoryImpl_Factory implements Factory<CatalogRepositoryImpl> {
  private final Provider<ItemsApi> itemsApiProvider;

  public CatalogRepositoryImpl_Factory(Provider<ItemsApi> itemsApiProvider) {
    this.itemsApiProvider = itemsApiProvider;
  }

  @Override
  public CatalogRepositoryImpl get() {
    return newInstance(itemsApiProvider.get());
  }

  public static CatalogRepositoryImpl_Factory create(Provider<ItemsApi> itemsApiProvider) {
    return new CatalogRepositoryImpl_Factory(itemsApiProvider);
  }

  public static CatalogRepositoryImpl newInstance(ItemsApi itemsApi) {
    return new CatalogRepositoryImpl(itemsApi);
  }
}