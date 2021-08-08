// Generated by Dagger (https://dagger.dev).
package com.omar_aly.domain.usecase.item;

import com.omar_aly.domain.repository.CatalogRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetCatalogUseCase_Factory implements Factory<GetCatalogUseCase> {
  private final Provider<CatalogRepository> catalogRepositoryProvider;

  public GetCatalogUseCase_Factory(Provider<CatalogRepository> catalogRepositoryProvider) {
    this.catalogRepositoryProvider = catalogRepositoryProvider;
  }

  @Override
  public GetCatalogUseCase get() {
    return newInstance(catalogRepositoryProvider.get());
  }

  public static GetCatalogUseCase_Factory create(
      Provider<CatalogRepository> catalogRepositoryProvider) {
    return new GetCatalogUseCase_Factory(catalogRepositoryProvider);
  }

  public static GetCatalogUseCase newInstance(CatalogRepository catalogRepository) {
    return new GetCatalogUseCase(catalogRepository);
  }
}
