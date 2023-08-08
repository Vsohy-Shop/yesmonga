package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.b */
public final class C37661b implements C10324h<CriteoGetCriteoProductsUseCase> {

    /* renamed from: a */
    public final Provider<CriteoRepository> f94512a;

    /* renamed from: b */
    public final Provider<APIMProductDetailsRepository> f94513b;

    /* renamed from: c */
    public final Provider<C37807b> f94514c;

    /* renamed from: d */
    public final Provider<C37681b> f94515d;

    /* renamed from: e */
    public final Provider<C37569f0> f94516e;

    public C37661b(Provider<CriteoRepository> provider, Provider<APIMProductDetailsRepository> provider2, Provider<C37807b> provider3, Provider<C37681b> provider4, Provider<C37569f0> provider5) {
        this.f94512a = provider;
        this.f94513b = provider2;
        this.f94514c = provider3;
        this.f94515d = provider4;
        this.f94516e = provider5;
    }

    /* renamed from: a */
    public static C37661b m154396a(Provider<CriteoRepository> provider, Provider<APIMProductDetailsRepository> provider2, Provider<C37807b> provider3, Provider<C37681b> provider4, Provider<C37569f0> provider5) {
        return new C37661b(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static CriteoGetCriteoProductsUseCase m154397c(CriteoRepository criteoRepository, APIMProductDetailsRepository aPIMProductDetailsRepository, C37807b bVar, C37681b bVar2, C37569f0 f0Var) {
        return new CriteoGetCriteoProductsUseCase(criteoRepository, aPIMProductDetailsRepository, bVar, bVar2, f0Var);
    }

    /* renamed from: b */
    public CriteoGetCriteoProductsUseCase get() {
        return m154397c(this.f94512a.get(), this.f94513b.get(), this.f94514c.get(), this.f94515d.get(), this.f94516e.get());
    }
}
