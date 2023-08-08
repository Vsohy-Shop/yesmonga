package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.datasource.memos.b */
public final class C36596b implements C10324h<MemoLocalDatasource> {

    /* renamed from: a */
    public final Provider<AppPreferencesStorage> f90472a;

    public C36596b(Provider<AppPreferencesStorage> provider) {
        this.f90472a = provider;
    }

    /* renamed from: a */
    public static C36596b m150167a(Provider<AppPreferencesStorage> provider) {
        return new C36596b(provider);
    }

    /* renamed from: c */
    public static MemoLocalDatasource m150168c(AppPreferencesStorage appPreferencesStorage) {
        return new MemoLocalDatasource(appPreferencesStorage);
    }

    /* renamed from: b */
    public MemoLocalDatasource get() {
        return m150168c(this.f90472a.get());
    }
}
