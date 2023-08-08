package com.carrefour.fid.android.account.data.headers;

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
/* renamed from: com.carrefour.fid.android.account.data.headers.f */
public final class C13201f implements C10324h<C13200e> {

    /* renamed from: a */
    public final Provider<BaseAppPreferencesStorage> f32370a;

    /* renamed from: b */
    public final Provider<AppEnvironment> f32371b;

    /* renamed from: c */
    public final Provider<C28909d> f32372c;

    public C13201f(Provider<BaseAppPreferencesStorage> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3) {
        this.f32370a = provider;
        this.f32371b = provider2;
        this.f32372c = provider3;
    }

    /* renamed from: a */
    public static C13201f m57193a(Provider<BaseAppPreferencesStorage> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3) {
        return new C13201f(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13200e m57194c(BaseAppPreferencesStorage baseAppPreferencesStorage, AppEnvironment appEnvironment, C28909d dVar) {
        return new C13200e(baseAppPreferencesStorage, appEnvironment, dVar);
    }

    /* renamed from: b */
    public C13200e get() {
        return m57194c(this.f32370a.get(), this.f32371b.get(), this.f32372c.get());
    }
}
