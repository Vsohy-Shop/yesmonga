package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C28997b;
import com.carrefour.fid.android.tracking.product.C29021a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.m */
public final class C26835m implements C10324h<AdditionalOrderViewModel> {

    /* renamed from: a */
    public final Provider<LoadBasketBuilderUseCase> f65422a;

    /* renamed from: b */
    public final Provider<C37716b> f65423b;

    /* renamed from: c */
    public final Provider<C37576i0> f65424c;

    /* renamed from: d */
    public final Provider<GetOnlineOrderByIdUseCase> f65425d;

    /* renamed from: e */
    public final Provider<C37540a> f65426e;

    /* renamed from: f */
    public final Provider<C37566e0> f65427f;

    /* renamed from: g */
    public final Provider<LoyaltyPreferencesStorage> f65428g;

    /* renamed from: h */
    public final Provider<C37807b> f65429h;

    /* renamed from: i */
    public final Provider<C29021a> f65430i;

    /* renamed from: j */
    public final Provider<C28997b> f65431j;

    public C26835m(Provider<LoadBasketBuilderUseCase> provider, Provider<C37716b> provider2, Provider<C37576i0> provider3, Provider<GetOnlineOrderByIdUseCase> provider4, Provider<C37540a> provider5, Provider<C37566e0> provider6, Provider<LoyaltyPreferencesStorage> provider7, Provider<C37807b> provider8, Provider<C29021a> provider9, Provider<C28997b> provider10) {
        this.f65422a = provider;
        this.f65423b = provider2;
        this.f65424c = provider3;
        this.f65425d = provider4;
        this.f65426e = provider5;
        this.f65427f = provider6;
        this.f65428g = provider7;
        this.f65429h = provider8;
        this.f65430i = provider9;
        this.f65431j = provider10;
    }

    /* renamed from: a */
    public static C26835m m113839a(Provider<LoadBasketBuilderUseCase> provider, Provider<C37716b> provider2, Provider<C37576i0> provider3, Provider<GetOnlineOrderByIdUseCase> provider4, Provider<C37540a> provider5, Provider<C37566e0> provider6, Provider<LoyaltyPreferencesStorage> provider7, Provider<C37807b> provider8, Provider<C29021a> provider9, Provider<C28997b> provider10) {
        return new C26835m(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    /* renamed from: c */
    public static AdditionalOrderViewModel m113840c(LoadBasketBuilderUseCase loadBasketBuilderUseCase, C37716b bVar, C37576i0 i0Var, GetOnlineOrderByIdUseCase getOnlineOrderByIdUseCase, C37540a aVar, C37566e0 e0Var, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37807b bVar2, C29021a aVar2, C28997b bVar3) {
        return new AdditionalOrderViewModel(loadBasketBuilderUseCase, bVar, i0Var, getOnlineOrderByIdUseCase, aVar, e0Var, loyaltyPreferencesStorage, bVar2, aVar2, bVar3);
    }

    /* renamed from: b */
    public AdditionalOrderViewModel get() {
        return m113840c(this.f65422a.get(), this.f65423b.get(), this.f65424c.get(), this.f65425d.get(), this.f65426e.get(), this.f65427f.get(), this.f65428g.get(), this.f65429h.get(), this.f65430i.get(), this.f65431j.get());
    }
}
