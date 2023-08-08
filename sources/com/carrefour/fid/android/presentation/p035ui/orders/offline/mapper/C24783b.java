package com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.mapper.b */
public final class C24783b implements C10324h<C24782a> {

    /* renamed from: a */
    public final Provider<C24787e> f61475a;

    /* renamed from: b */
    public final Provider<C24784c> f61476b;

    public C24783b(Provider<C24787e> provider, Provider<C24784c> provider2) {
        this.f61475a = provider;
        this.f61476b = provider2;
    }

    /* renamed from: a */
    public static C24783b m107995a(Provider<C24787e> provider, Provider<C24784c> provider2) {
        return new C24783b(provider, provider2);
    }

    /* renamed from: c */
    public static C24782a m107996c(C24787e eVar, C24784c cVar) {
        return new C24782a(eVar, cVar);
    }

    /* renamed from: b */
    public C24782a get() {
        return m107996c(this.f61475a.get(), this.f61476b.get());
    }
}
