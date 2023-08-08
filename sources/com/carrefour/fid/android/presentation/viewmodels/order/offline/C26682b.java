package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.b */
public final class C26682b implements C10324h<C26681a> {

    /* renamed from: a */
    public final Provider<C13783a> f65136a;

    public C26682b(Provider<C13783a> provider) {
        this.f65136a = provider;
    }

    /* renamed from: a */
    public static C26682b m113372a(Provider<C13783a> provider) {
        return new C26682b(provider);
    }

    /* renamed from: c */
    public static C26681a m113373c(C13783a aVar) {
        return new C26681a(aVar);
    }

    /* renamed from: b */
    public C26681a get() {
        return m113373c(this.f65136a.get());
    }
}
