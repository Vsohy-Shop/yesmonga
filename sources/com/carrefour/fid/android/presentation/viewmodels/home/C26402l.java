package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.domain.interactors.basket.C37556a0;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.catalog.C37612d;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.domain.interactors.product.C37779q;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.l */
public final class C26402l implements C10324h<HomeViewModel> {

    /* renamed from: a */
    public final Provider<C37688c> f64588a;

    /* renamed from: b */
    public final Provider<C37878e> f64589b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f64590c;

    /* renamed from: d */
    public final Provider<C37612d> f64591d;

    /* renamed from: e */
    public final Provider<C28994a> f64592e;

    /* renamed from: f */
    public final Provider<C37566e0> f64593f;

    /* renamed from: g */
    public final Provider<C37556a0> f64594g;

    /* renamed from: h */
    public final Provider<C37619a> f64595h;

    /* renamed from: i */
    public final Provider<C37610b> f64596i;

    /* renamed from: j */
    public final Provider<C37779q> f64597j;

    /* renamed from: k */
    public final Provider<CoroutineDispatcher> f64598k;

    public C26402l(Provider<C37688c> provider, Provider<C37878e> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37612d> provider4, Provider<C28994a> provider5, Provider<C37566e0> provider6, Provider<C37556a0> provider7, Provider<C37619a> provider8, Provider<C37610b> provider9, Provider<C37779q> provider10, Provider<CoroutineDispatcher> provider11) {
        this.f64588a = provider;
        this.f64589b = provider2;
        this.f64590c = provider3;
        this.f64591d = provider4;
        this.f64592e = provider5;
        this.f64593f = provider6;
        this.f64594g = provider7;
        this.f64595h = provider8;
        this.f64596i = provider9;
        this.f64597j = provider10;
        this.f64598k = provider11;
    }

    /* renamed from: a */
    public static C26402l m112759a(Provider<C37688c> provider, Provider<C37878e> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37612d> provider4, Provider<C28994a> provider5, Provider<C37566e0> provider6, Provider<C37556a0> provider7, Provider<C37619a> provider8, Provider<C37610b> provider9, Provider<C37779q> provider10, Provider<CoroutineDispatcher> provider11) {
        return new C26402l(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    /* renamed from: c */
    public static HomeViewModel m112760c(C37688c cVar, C37878e eVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37612d dVar, C28994a aVar, C37566e0 e0Var, C37556a0 a0Var, C37619a aVar2, C37610b bVar, C37779q qVar, CoroutineDispatcher coroutineDispatcher) {
        return new HomeViewModel(cVar, eVar, loyaltyPreferencesStorage, dVar, aVar, e0Var, a0Var, aVar2, bVar, qVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public HomeViewModel get() {
        return m112760c(this.f64588a.get(), this.f64589b.get(), this.f64590c.get(), this.f64591d.get(), this.f64592e.get(), this.f64593f.get(), this.f64594g.get(), this.f64595h.get(), this.f64596i.get(), this.f64597j.get(), this.f64598k.get());
    }
}
