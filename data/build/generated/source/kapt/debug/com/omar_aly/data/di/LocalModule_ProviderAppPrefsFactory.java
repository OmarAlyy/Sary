// Generated by Dagger (https://dagger.dev).
package com.omar_aly.data.di;

import android.content.Context;
import com.omar_aly.data.local.pref.AppPrefs;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalModule_ProviderAppPrefsFactory implements Factory<AppPrefs> {
  private final LocalModule module;

  private final Provider<Context> contextProvider;

  public LocalModule_ProviderAppPrefsFactory(LocalModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppPrefs get() {
    return providerAppPrefs(module, contextProvider.get());
  }

  public static LocalModule_ProviderAppPrefsFactory create(LocalModule module,
      Provider<Context> contextProvider) {
    return new LocalModule_ProviderAppPrefsFactory(module, contextProvider);
  }

  public static AppPrefs providerAppPrefs(LocalModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providerAppPrefs(context));
  }
}
