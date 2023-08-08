package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.i */
public final class C13296i implements C10324h<C13294h> {

    /* renamed from: a */
    public final Provider<C13783a> f32689a;

    public C13296i(Provider<C13783a> provider) {
        this.f32689a = provider;
    }

    /* renamed from: a */
    public static C13296i m57581a(Provider<C13783a> provider) {
        return new C13296i(provider);
    }

    /* renamed from: c */
    public static C13294h m57582c(C13783a aVar) {
        return new C13294h(aVar);
    }

    /* renamed from: b */
    public C13294h get() {
        return m57582c(this.f32689a.get());
    }
}
