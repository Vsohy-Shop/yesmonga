package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.domain.repositories.C38199h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.offer.a */
public final class C37715a implements C10324h<GetOfferDetailsInBasketUseCase> {

    /* renamed from: a */
    public final Provider<C38199h> f94631a;

    public C37715a(Provider<C38199h> provider) {
        this.f94631a = provider;
    }

    /* renamed from: a */
    public static C37715a m154569a(Provider<C38199h> provider) {
        return new C37715a(provider);
    }

    /* renamed from: c */
    public static GetOfferDetailsInBasketUseCase m154570c(C38199h hVar) {
        return new GetOfferDetailsInBasketUseCase(hVar);
    }

    /* renamed from: b */
    public GetOfferDetailsInBasketUseCase get() {
        return m154570c(this.f94631a.get());
    }
}
