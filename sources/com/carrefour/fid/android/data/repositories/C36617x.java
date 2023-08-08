package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.repositories.x */
public final class C36617x implements C10324h<SearchHistoryPreferencesRepository> {

    /* renamed from: a */
    public final Provider<AppPreferencesStorage> f90530a;

    public C36617x(Provider<AppPreferencesStorage> provider) {
        this.f90530a = provider;
    }

    /* renamed from: a */
    public static C36617x m150229a(Provider<AppPreferencesStorage> provider) {
        return new C36617x(provider);
    }

    /* renamed from: c */
    public static SearchHistoryPreferencesRepository m150230c(AppPreferencesStorage appPreferencesStorage) {
        return new SearchHistoryPreferencesRepository(appPreferencesStorage);
    }

    /* renamed from: b */
    public SearchHistoryPreferencesRepository get() {
        return m150230c(this.f90530a.get());
    }
}
