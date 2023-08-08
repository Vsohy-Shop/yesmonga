package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.gazStation.i */
public final class C26364i implements C10324h<ServiceStationsViewModel> {

    /* renamed from: a */
    public final Provider<AppPreferencesStorage> f64396a;

    public C26364i(Provider<AppPreferencesStorage> provider) {
        this.f64396a = provider;
    }

    /* renamed from: a */
    public static C26364i m112515a(Provider<AppPreferencesStorage> provider) {
        return new C26364i(provider);
    }

    /* renamed from: c */
    public static ServiceStationsViewModel m112516c(AppPreferencesStorage appPreferencesStorage) {
        return new ServiceStationsViewModel(appPreferencesStorage);
    }

    /* renamed from: b */
    public ServiceStationsViewModel get() {
        return m112516c(this.f64396a.get());
    }
}
