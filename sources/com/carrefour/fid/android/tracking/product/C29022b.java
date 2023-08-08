package com.carrefour.fid.android.tracking.product;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.tracking.product.b */
public final class C29022b implements C10324h<C29021a> {

    /* renamed from: a */
    public final Provider<C13783a> f71121a;

    public C29022b(Provider<C13783a> provider) {
        this.f71121a = provider;
    }

    /* renamed from: a */
    public static C29022b m120077a(Provider<C13783a> provider) {
        return new C29022b(provider);
    }

    /* renamed from: c */
    public static C29021a m120078c(C13783a aVar) {
        return new C29021a(aVar);
    }

    /* renamed from: b */
    public C29021a get() {
        return m120078c(this.f71121a.get());
    }
}
