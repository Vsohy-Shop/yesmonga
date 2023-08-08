package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.events.checkout.C37497c;
import com.carrefour.fid.android.domain.interactors.basket.C37557b;
import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import com.carrefour.fid.android.domain.interactors.basket.C37571g0;
import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import com.carrefour.fid.android.domain.interactors.basket.C37583l;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.delivery.C37676b;
import com.carrefour.fid.android.domain.interactors.loyalty.C37696a;
import com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37875c;
import com.carrefour.fid.android.domain.interactors.user.C37884g;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.b */
public final class C26170b implements C10324h<NonFoodCheckoutStep2ViewModel> {

    /* renamed from: a */
    public final Provider<C37676b> f63999a;

    /* renamed from: b */
    public final Provider<C37571g0> f64000b;

    /* renamed from: c */
    public final Provider<C37497c> f64001c;

    /* renamed from: d */
    public final Provider<C37875c> f64002d;

    /* renamed from: e */
    public final Provider<C37884g> f64003e;

    /* renamed from: f */
    public final Provider<C37581k0> f64004f;

    /* renamed from: g */
    public final Provider<C37493a> f64005g;

    /* renamed from: h */
    public final Provider<NonFoodValidatePaymentUseCase> f64006h;

    /* renamed from: i */
    public final Provider<C37596r> f64007i;

    /* renamed from: j */
    public final Provider<C37583l> f64008j;

    /* renamed from: k */
    public final Provider<C37696a> f64009k;

    /* renamed from: l */
    public final Provider<C37557b> f64010l;

    /* renamed from: m */
    public final Provider<C37561c0> f64011m;

    /* renamed from: n */
    public final Provider<LoyaltyAuthenticationUseCase> f64012n;

    /* renamed from: o */
    public final Provider<GetOfferDetailsInBasketUseCase> f64013o;

    /* renamed from: p */
    public final Provider<C23614a> f64014p;

    /* renamed from: q */
    public final Provider<C19456p0> f64015q;

    public C26170b(Provider<C37676b> provider, Provider<C37571g0> provider2, Provider<C37497c> provider3, Provider<C37875c> provider4, Provider<C37884g> provider5, Provider<C37581k0> provider6, Provider<C37493a> provider7, Provider<NonFoodValidatePaymentUseCase> provider8, Provider<C37596r> provider9, Provider<C37583l> provider10, Provider<C37696a> provider11, Provider<C37557b> provider12, Provider<C37561c0> provider13, Provider<LoyaltyAuthenticationUseCase> provider14, Provider<GetOfferDetailsInBasketUseCase> provider15, Provider<C23614a> provider16, Provider<C19456p0> provider17) {
        this.f63999a = provider;
        this.f64000b = provider2;
        this.f64001c = provider3;
        this.f64002d = provider4;
        this.f64003e = provider5;
        this.f64004f = provider6;
        this.f64005g = provider7;
        this.f64006h = provider8;
        this.f64007i = provider9;
        this.f64008j = provider10;
        this.f64009k = provider11;
        this.f64010l = provider12;
        this.f64011m = provider13;
        this.f64012n = provider14;
        this.f64013o = provider15;
        this.f64014p = provider16;
        this.f64015q = provider17;
    }

    /* renamed from: a */
    public static C26170b m111877a(Provider<C37676b> provider, Provider<C37571g0> provider2, Provider<C37497c> provider3, Provider<C37875c> provider4, Provider<C37884g> provider5, Provider<C37581k0> provider6, Provider<C37493a> provider7, Provider<NonFoodValidatePaymentUseCase> provider8, Provider<C37596r> provider9, Provider<C37583l> provider10, Provider<C37696a> provider11, Provider<C37557b> provider12, Provider<C37561c0> provider13, Provider<LoyaltyAuthenticationUseCase> provider14, Provider<GetOfferDetailsInBasketUseCase> provider15, Provider<C23614a> provider16, Provider<C19456p0> provider17) {
        return new C26170b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    /* renamed from: c */
    public static NonFoodCheckoutStep2ViewModel m111878c(C37676b bVar, C37571g0 g0Var, C37497c cVar, C37875c cVar2, C37884g gVar, C37581k0 k0Var, C37493a aVar, NonFoodValidatePaymentUseCase nonFoodValidatePaymentUseCase, C37596r rVar, C37583l lVar, C37696a aVar2, C37557b bVar2, C37561c0 c0Var, LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase, GetOfferDetailsInBasketUseCase getOfferDetailsInBasketUseCase, C23614a aVar3, C19456p0 p0Var) {
        return new NonFoodCheckoutStep2ViewModel(bVar, g0Var, cVar, cVar2, gVar, k0Var, aVar, nonFoodValidatePaymentUseCase, rVar, lVar, aVar2, bVar2, c0Var, loyaltyAuthenticationUseCase, getOfferDetailsInBasketUseCase, aVar3, p0Var);
    }

    /* renamed from: b */
    public NonFoodCheckoutStep2ViewModel get() {
        return m111878c(this.f63999a.get(), this.f64000b.get(), this.f64001c.get(), this.f64002d.get(), this.f64003e.get(), this.f64004f.get(), this.f64005g.get(), this.f64006h.get(), this.f64007i.get(), this.f64008j.get(), this.f64009k.get(), this.f64010l.get(), this.f64011m.get(), this.f64012n.get(), this.f64013o.get(), this.f64014p.get(), this.f64015q.get());
    }
}
