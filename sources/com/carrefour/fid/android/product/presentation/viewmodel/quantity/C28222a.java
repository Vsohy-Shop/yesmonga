package com.carrefour.fid.android.product.presentation.viewmodel.quantity;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.product.C37761i;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.a */
public final class C28222a implements C10324h<QuantityBackDropViewModel> {

    /* renamed from: a */
    public final Provider<C37823k> f68345a;

    /* renamed from: b */
    public final Provider<C37761i> f68346b;

    /* renamed from: c */
    public final Provider<C37588n0> f68347c;

    /* renamed from: d */
    public final Provider<C37672j> f68348d;

    public C28222a(Provider<C37823k> provider, Provider<C37761i> provider2, Provider<C37588n0> provider3, Provider<C37672j> provider4) {
        this.f68345a = provider;
        this.f68346b = provider2;
        this.f68347c = provider3;
        this.f68348d = provider4;
    }

    /* renamed from: a */
    public static C28222a m118144a(Provider<C37823k> provider, Provider<C37761i> provider2, Provider<C37588n0> provider3, Provider<C37672j> provider4) {
        return new C28222a(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static QuantityBackDropViewModel m118145c(C37823k kVar, C37761i iVar, C37588n0 n0Var, C37672j jVar) {
        return new QuantityBackDropViewModel(kVar, iVar, n0Var, jVar);
    }

    /* renamed from: b */
    public QuantityBackDropViewModel get() {
        return m118145c(this.f68345a.get(), this.f68346b.get(), this.f68347c.get(), this.f68348d.get());
    }
}
