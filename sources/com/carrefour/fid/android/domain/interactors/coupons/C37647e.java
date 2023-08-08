package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37820h;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.e */
public final class C37647e implements C10324h<GetAvailableCouponsUseCase> {

    /* renamed from: a */
    public final Provider<C37878e> f94473a;

    /* renamed from: b */
    public final Provider<CouponsRepository> f94474b;

    /* renamed from: c */
    public final Provider<C37816e> f94475c;

    /* renamed from: d */
    public final Provider<C37820h> f94476d;

    /* renamed from: e */
    public final Provider<C38328d> f94477e;

    public C37647e(Provider<C37878e> provider, Provider<CouponsRepository> provider2, Provider<C37816e> provider3, Provider<C37820h> provider4, Provider<C38328d> provider5) {
        this.f94473a = provider;
        this.f94474b = provider2;
        this.f94475c = provider3;
        this.f94476d = provider4;
        this.f94477e = provider5;
    }

    /* renamed from: a */
    public static C37647e m154346a(Provider<C37878e> provider, Provider<CouponsRepository> provider2, Provider<C37816e> provider3, Provider<C37820h> provider4, Provider<C38328d> provider5) {
        return new C37647e(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static GetAvailableCouponsUseCase m154347c(C37878e eVar, CouponsRepository couponsRepository, C37816e eVar2, C37820h hVar, C38328d dVar) {
        return new GetAvailableCouponsUseCase(eVar, couponsRepository, eVar2, hVar, dVar);
    }

    /* renamed from: b */
    public GetAvailableCouponsUseCase get() {
        return m154347c(this.f94473a.get(), this.f94474b.get(), this.f94475c.get(), this.f94476d.get(), this.f94477e.get());
    }
}
