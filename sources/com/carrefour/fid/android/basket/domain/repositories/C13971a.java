package com.carrefour.fid.android.basket.domain.repositories;

import com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.slot.C37854a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.basket.domain.repositories.a */
public final class C13971a implements C10324h<BasketRepository> {

    /* renamed from: a */
    public final Provider<BasketApiDataSource> f34111a;

    /* renamed from: b */
    public final Provider<C37697b> f34112b;

    /* renamed from: c */
    public final Provider<C37854a> f34113c;

    public C13971a(Provider<BasketApiDataSource> provider, Provider<C37697b> provider2, Provider<C37854a> provider3) {
        this.f34111a = provider;
        this.f34112b = provider2;
        this.f34113c = provider3;
    }

    /* renamed from: a */
    public static C13971a m59222a(Provider<BasketApiDataSource> provider, Provider<C37697b> provider2, Provider<C37854a> provider3) {
        return new C13971a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketRepository m59223c(BasketApiDataSource basketApiDataSource, C37697b bVar, C37854a aVar) {
        return new BasketRepository(basketApiDataSource, bVar, aVar);
    }

    /* renamed from: b */
    public BasketRepository get() {
        return m59223c(this.f34111a.get(), this.f34112b.get(), this.f34113c.get());
    }
}
