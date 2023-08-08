package com.carrefour.fid.android.scan.data.repositories;

import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.scan.data.repositories.b */
public final class C28268b implements C10324h<ScanPreferencesRepositoryImpl> {

    /* renamed from: a */
    public final Provider<ScanPreferencesStorage> f68420a;

    public C28268b(Provider<ScanPreferencesStorage> provider) {
        this.f68420a = provider;
    }

    /* renamed from: a */
    public static C28268b m118200a(Provider<ScanPreferencesStorage> provider) {
        return new C28268b(provider);
    }

    /* renamed from: c */
    public static ScanPreferencesRepositoryImpl m118201c(ScanPreferencesStorage scanPreferencesStorage) {
        return new ScanPreferencesRepositoryImpl(scanPreferencesStorage);
    }

    /* renamed from: b */
    public ScanPreferencesRepositoryImpl get() {
        return m118201c(this.f68420a.get());
    }
}
