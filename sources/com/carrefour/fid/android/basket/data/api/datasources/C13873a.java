package com.carrefour.fid.android.basket.data.api.datasources;

import com.carrefour.fid.android.basket.data.api.services.C13881a;
import com.carrefour.fid.android.shared.network.C28801b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.data.api.datasources.a */
public final class C13873a implements C10324h<BasketApiDataSource> {

    /* renamed from: a */
    public final Provider<C13881a> f33832a;

    /* renamed from: b */
    public final Provider<C28801b> f33833b;

    public C13873a(Provider<C13881a> provider, Provider<C28801b> provider2) {
        this.f33832a = provider;
        this.f33833b = provider2;
    }

    /* renamed from: a */
    public static C13873a m58854a(Provider<C13881a> provider, Provider<C28801b> provider2) {
        return new C13873a(provider, provider2);
    }

    /* renamed from: c */
    public static BasketApiDataSource m58855c(C13881a aVar, C28801b bVar) {
        return new BasketApiDataSource(aVar, bVar);
    }

    /* renamed from: b */
    public BasketApiDataSource get() {
        return m58855c(this.f33832a.get(), this.f33833b.get());
    }
}
