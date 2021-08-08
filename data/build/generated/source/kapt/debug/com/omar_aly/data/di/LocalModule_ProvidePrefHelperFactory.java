// Generated by Dagger (https://dagger.dev).
package com.omar_aly.data.di;

import com.omar_aly.data.local.pref.AppPrefs;
import com.omar_aly.data.local.pref.PrefHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalModule_ProvidePrefHelperFactory implements Factory<PrefHelper> {
  private final LocalModule module;

  private final Provider<AppPrefs> appPrefsProvider;

  public LocalModule_ProvidePrefHelperFactory(LocalModule module,
      Provider<AppPrefs> appPrefsProvider) {
    this.module = module;
    this.appPrefsProvider = appPrefsProvider;
  }

  @Override
  public PrefHelper get() {
    return providePrefHelper(module, appPrefsProvider.get());
  }

  public static LocalModule_ProvidePrefHelperFactory create(LocalModule module,
      Provider<AppPrefs> appPrefsProvider) {
    return new LocalModule_ProvidePrefHelperFactory(module, appPrefsProvider);
  }

  public static PrefHelper providePrefHelper(LocalModule instance, AppPrefs appPrefs) {
    return Preconditions.checkNotNullFromProvides(instance.providePrefHelper(appPrefs));
  }
}
