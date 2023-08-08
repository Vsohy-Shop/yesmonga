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
/* renamed from: com.carrefour.fid.android.shared.data.headers.d */
public final class C28643d implements C10324h<BaseHeaders> {

    /* renamed from: a */
    public final Provider<BaseAppPreferencesStorage> f70238a;

    /* renamed from: b */
    public final Provider<AppEnvironment> f70239b;

    /* renamed from: c */
    public final Provider<C28909d> f70240c;

    public C28643d(Provider<BaseAppPreferencesStorage> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3) {
        this.f70238a = provider;
        this.f70239b = provider2;
        this.f70240c = provider3;
    }

    /* renamed from: a */
    public static C28643d m118606a(Provider<BaseAppPreferencesStorage> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3) {
        return new C28643d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BaseHeaders m118607c(BaseAppPreferencesStorage baseAppPreferencesStorage, AppEnvironment appEnvironment, C28909d dVar) {
        return new BaseHeaders(baseAppPreferencesStorage, appEnvironment, dVar);
    }

    /* renamed from: b */
    public BaseHeaders get() {
        return m118607c(this.f70238a.get(), this.f70239b.get(), this.f70240c.get());
    }
}
