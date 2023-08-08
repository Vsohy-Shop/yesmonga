package com.carrefour.fid.android.core.interceptors;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.core.interceptors.a */
public final class C36315a implements C10324h<LogMInterceptor> {

    /* renamed from: a */
    public final Provider<C37694a> f89646a;

    /* renamed from: b */
    public final Provider<BaseAppPreferencesStorage> f89647b;

    /* renamed from: c */
    public final Provider<C28909d> f89648c;

    public C36315a(Provider<C37694a> provider, Provider<BaseAppPreferencesStorage> provider2, Provider<C28909d> provider3) {
        this.f89646a = provider;
        this.f89647b = provider2;
        this.f89648c = provider3;
    }

    /* renamed from: a */
    public static C36315a m148979a(Provider<C37694a> provider, Provider<BaseAppPreferencesStorage> provider2, Provider<C28909d> provider3) {
        return new C36315a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static LogMInterceptor m148980c(C37694a aVar, BaseAppPreferencesStorage baseAppPreferencesStorage, C28909d dVar) {
        return new LogMInterceptor(aVar, baseAppPreferencesStorage, dVar);
    }

    /* renamed from: b */
    public LogMInterceptor get() {
        return m148980c(this.f89646a.get(), this.f89647b.get(), this.f89648c.get());
    }
}
