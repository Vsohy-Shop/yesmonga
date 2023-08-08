package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.gazStation.b */
public final class C26351b implements C10324h<C26350a> {

    /* renamed from: a */
    public final Provider<C13783a> f64386a;

    public C26351b(Provider<C13783a> provider) {
        this.f64386a = provider;
    }

    /* renamed from: a */
    public static C26351b m112494a(Provider<C13783a> provider) {
        return new C26351b(provider);
    }

    /* renamed from: c */
    public static C26350a m112495c(C13783a aVar) {
        return new C26350a(aVar);
    }

    /* renamed from: b */
    public C26350a get() {
        return m112495c(this.f64386a.get());
    }
}
