package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.repositories.C38199h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.basket.w */
public final class C37602w implements C10324h<ObserveBasketAndOffersUseCase> {

    /* renamed from: a */
    public final Provider<C37603x> f94355a;

    /* renamed from: b */
    public final Provider<C38199h> f94356b;

    /* renamed from: c */
    public final Provider<C37585m> f94357c;

    public C37602w(Provider<C37603x> provider, Provider<C38199h> provider2, Provider<C37585m> provider3) {
        this.f94355a = provider;
        this.f94356b = provider2;
        this.f94357c = provider3;
    }

    /* renamed from: a */
    public static C37602w m154175a(Provider<C37603x> provider, Provider<C38199h> provider2, Provider<C37585m> provider3) {
        return new C37602w(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ObserveBasketAndOffersUseCase m154176c(C37603x xVar, C38199h hVar, C37585m mVar) {
        return new ObserveBasketAndOffersUseCase(xVar, hVar, mVar);
    }

    /* renamed from: b */
    public ObserveBasketAndOffersUseCase get() {
        return m154176c(this.f94355a.get(), this.f94356b.get(), this.f94357c.get());
    }
}
