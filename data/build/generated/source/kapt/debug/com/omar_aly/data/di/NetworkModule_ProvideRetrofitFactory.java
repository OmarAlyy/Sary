// Generated by Dagger (https://dagger.dev).
package com.omar_aly.data.di;

import com.omar_aly.data.remote.builder.RetrofitBuilder;
import com.omar_aly.data.remote.interceptor.HeaderInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<RetrofitBuilder> retrofitBuilderProvider;

  private final Provider<HeaderInterceptor> headerInterceptorProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module,
      Provider<RetrofitBuilder> retrofitBuilderProvider,
      Provider<HeaderInterceptor> headerInterceptorProvider) {
    this.module = module;
    this.retrofitBuilderProvider = retrofitBuilderProvider;
    this.headerInterceptorProvider = headerInterceptorProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, retrofitBuilderProvider.get(), headerInterceptorProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<RetrofitBuilder> retrofitBuilderProvider,
      Provider<HeaderInterceptor> headerInterceptorProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, retrofitBuilderProvider, headerInterceptorProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, RetrofitBuilder retrofitBuilder,
      HeaderInterceptor headerInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(retrofitBuilder, headerInterceptor));
  }
}
