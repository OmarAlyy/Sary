// Generated by Dagger (https://dagger.dev).
package com.omar_aly.domain.usecase.item;

import com.omar_aly.domain.repository.BannersRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetBannersUseCase_Factory implements Factory<GetBannersUseCase> {
  private final Provider<BannersRepository> bannersRepositoryProvider;

  public GetBannersUseCase_Factory(Provider<BannersRepository> bannersRepositoryProvider) {
    this.bannersRepositoryProvider = bannersRepositoryProvider;
  }

  @Override
  public GetBannersUseCase get() {
    return newInstance(bannersRepositoryProvider.get());
  }

  public static GetBannersUseCase_Factory create(
      Provider<BannersRepository> bannersRepositoryProvider) {
    return new GetBannersUseCase_Factory(bannersRepositoryProvider);
  }

  public static GetBannersUseCase newInstance(BannersRepository bannersRepository) {
    return new GetBannersUseCase(bannersRepository);
  }
}