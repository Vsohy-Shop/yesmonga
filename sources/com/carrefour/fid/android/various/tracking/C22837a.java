package com.carrefour.fid.android.various.tracking;

import android.content.Context;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.various.tracking.a */
public final class C22837a implements C10324h<ThirdPartyUsabillaEventDispatcher> {

    /* renamed from: a */
    public final Provider<Context> f58403a;

    /* renamed from: b */
    public final Provider<BaseAppPreferencesStorage> f58404b;

    public C22837a(Provider<Context> provider, Provider<BaseAppPreferencesStorage> provider2) {
        this.f58403a = provider;
        this.f58404b = provider2;
    }

    /* renamed from: a */
    public static C22837a m103103a(Provider<Context> provider, Provider<BaseAppPreferencesStorage> provider2) {
        return new C22837a(provider, provider2);
    }

    /* renamed from: c */
    public static ThirdPartyUsabillaEventDispatcher m103104c(Context context, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        return new ThirdPartyUsabillaEventDispatcher(context, baseAppPreferencesStorage);
    }

    /* renamed from: b */
    public ThirdPartyUsabillaEventDispatcher get() {
        return m103104c(this.f58403a.get(), this.f58404b.get());
    }
}
