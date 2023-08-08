package com.carrefour.fid.android.shared.data.headers;

import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.shared.data.headers.b */
public final class C28641b implements C10324h<C28640a> {

    /* renamed from: a */
    public final Provider<BaseAppPreferencesStorage> f70234a;

    /* renamed from: b */
    public final Provider<AppEnvironment> f70235b;

    /* renamed from: c */
    public final Provider<C28909d> f70236c;

    /* renamed from: d */
    public final Provider<C28642c> f70237d;

    public C28641b(Provider<BaseAppPreferencesStorage> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3, Provider<C28642c> provider4) {
        this.f70234a = provider;
        this.f70235b = provider2;
        this.f70236c = provider3;
        this.f70237d = provider4;
    }

    /* renamed from: a */
    public static C28641b m118600a(Provider<BaseAppPreferencesStorage> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3, Provider<C28642c> provider4) {
        return new C28641b(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C28640a m118601c(BaseAppPreferencesStorage baseAppPreferencesStorage, AppEnvironment appEnvironment, C28909d dVar, C28642c cVar) {
        return new C28640a(baseAppPreferencesStorage, appEnvironment, dVar, cVar);
    }

    /* renamed from: b */
    public C28640a get() {
        return m118601c(this.f70234a.get(), this.f70235b.get(), this.f70236c.get(), this.f70237d.get());
    }
}
