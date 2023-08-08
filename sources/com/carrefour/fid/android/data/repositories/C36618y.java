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
/* renamed from: com.carrefour.fid.android.data.repositories.y */
public final class C36618y implements C10324h<SearchWithListHistoryPreferencesRepository> {

    /* renamed from: a */
    public final Provider<AppPreferencesStorage> f90531a;

    public C36618y(Provider<AppPreferencesStorage> provider) {
        this.f90531a = provider;
    }

    /* renamed from: a */
    public static C36618y m150232a(Provider<AppPreferencesStorage> provider) {
        return new C36618y(provider);
    }

    /* renamed from: c */
    public static SearchWithListHistoryPreferencesRepository m150233c(AppPreferencesStorage appPreferencesStorage) {
        return new SearchWithListHistoryPreferencesRepository(appPreferencesStorage);
    }

    /* renamed from: b */
    public SearchWithListHistoryPreferencesRepository get() {
        return m150233c(this.f90531a.get());
    }
}
