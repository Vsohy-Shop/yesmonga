package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.domain.repositories.C38199h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.list.a */
public final class C37769a implements C10324h<GetOfferProductListUseCase> {

    /* renamed from: a */
    public final Provider<C38199h> f94800a;

    public C37769a(Provider<C38199h> provider) {
        this.f94800a = provider;
    }

    /* renamed from: a */
    public static C37769a m154844a(Provider<C38199h> provider) {
        return new C37769a(provider);
    }

    /* renamed from: c */
    public static GetOfferProductListUseCase m154845c(C38199h hVar) {
        return new GetOfferProductListUseCase(hVar);
    }

    /* renamed from: b */
    public GetOfferProductListUseCase get() {
        return m154845c(this.f94800a.get());
    }
}
