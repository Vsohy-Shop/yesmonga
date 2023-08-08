package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.list.d */
public final class C37772d implements C10324h<UpdateOfferListUseCase> {

    /* renamed from: a */
    public final Provider<C37681b> f94811a;

    /* renamed from: b */
    public final Provider<C37566e0> f94812b;

    public C37772d(Provider<C37681b> provider, Provider<C37566e0> provider2) {
        this.f94811a = provider;
        this.f94812b = provider2;
    }

    /* renamed from: a */
    public static C37772d m154853a(Provider<C37681b> provider, Provider<C37566e0> provider2) {
        return new C37772d(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateOfferListUseCase m154854c(C37681b bVar, C37566e0 e0Var) {
        return new UpdateOfferListUseCase(bVar, e0Var);
    }

    /* renamed from: b */
    public UpdateOfferListUseCase get() {
        return m154854c(this.f94811a.get(), this.f94812b.get());
    }
}
