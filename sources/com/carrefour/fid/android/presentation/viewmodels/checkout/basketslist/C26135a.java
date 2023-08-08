package com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist;

import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.service.C37825m;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.a */
public final class C26135a implements C10324h<CheckoutBasketsListViewModel> {

    /* renamed from: a */
    public final Provider<C37587n> f63900a;

    /* renamed from: b */
    public final Provider<C37596r> f63901b;

    /* renamed from: c */
    public final Provider<C37825m> f63902c;

    public C26135a(Provider<C37587n> provider, Provider<C37596r> provider2, Provider<C37825m> provider3) {
        this.f63900a = provider;
        this.f63901b = provider2;
        this.f63902c = provider3;
    }

    /* renamed from: a */
    public static C26135a m111724a(Provider<C37587n> provider, Provider<C37596r> provider2, Provider<C37825m> provider3) {
        return new C26135a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CheckoutBasketsListViewModel m111725c(C37587n nVar, C37596r rVar, C37825m mVar) {
        return new CheckoutBasketsListViewModel(nVar, rVar, mVar);
    }

    /* renamed from: b */
    public CheckoutBasketsListViewModel get() {
        return m111725c(this.f63900a.get(), this.f63901b.get(), this.f63902c.get());
    }
}
