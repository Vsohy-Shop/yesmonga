package com.carrefour.fid.android.product.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.analytics.b */
public final class C27632b implements C10324h<C27631a> {

    /* renamed from: a */
    public final Provider<C13783a> f67124a;

    public C27632b(Provider<C13783a> provider) {
        this.f67124a = provider;
    }

    /* renamed from: a */
    public static C27632b m116223a(Provider<C13783a> provider) {
        return new C27632b(provider);
    }

    /* renamed from: c */
    public static C27631a m116224c(C13783a aVar) {
        return new C27631a(aVar);
    }

    /* renamed from: b */
    public C27631a get() {
        return m116224c(this.f67124a.get());
    }
}
