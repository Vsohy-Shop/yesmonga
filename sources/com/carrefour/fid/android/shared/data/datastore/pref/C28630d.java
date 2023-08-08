package com.carrefour.fid.android.shared.data.datastore.pref;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.data.datastore.pref.d */
public final class C28630d implements C10324h<BaseAppPreferencesStorage> {

    /* renamed from: a */
    public final Provider<Context> f70209a;

    public C28630d(Provider<Context> provider) {
        this.f70209a = provider;
    }

    /* renamed from: a */
    public static C28630d m118540a(Provider<Context> provider) {
        return new C28630d(provider);
    }

    /* renamed from: c */
    public static BaseAppPreferencesStorage m118541c(Context context) {
        return new BaseAppPreferencesStorage(context);
    }

    /* renamed from: b */
    public BaseAppPreferencesStorage get() {
        return m118541c(this.f70209a.get());
    }
}
