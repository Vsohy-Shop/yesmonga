package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.domain.interactors.basket.C37570g;
import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.list.c */
public final class C37771c implements C10324h<UpdateBasketUseCase> {

    /* renamed from: a */
    public final Provider<C37581k0> f94809a;

    /* renamed from: b */
    public final Provider<C37570g> f94810b;

    public C37771c(Provider<C37581k0> provider, Provider<C37570g> provider2) {
        this.f94809a = provider;
        this.f94810b = provider2;
    }

    /* renamed from: a */
    public static C37771c m154850a(Provider<C37581k0> provider, Provider<C37570g> provider2) {
        return new C37771c(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateBasketUseCase m154851c(C37581k0 k0Var, C37570g gVar) {
        return new UpdateBasketUseCase(k0Var, gVar);
    }

    /* renamed from: b */
    public UpdateBasketUseCase get() {
        return m154851c(this.f94809a.get(), this.f94810b.get());
    }
}
