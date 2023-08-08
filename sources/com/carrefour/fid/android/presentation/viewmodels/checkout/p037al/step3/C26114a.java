package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.basket.C37560c;
import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.order.IsEligibleToOnSitePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37865j;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.analytics.C26115a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.a */
public final class C26114a implements C10324h<CheckoutStep3ViewModel> {

    /* renamed from: a */
    public final Provider<IsEligibleToOnSitePaymentUseCase> f63840a;

    /* renamed from: b */
    public final Provider<C37569f0> f63841b;

    /* renamed from: c */
    public final Provider<C37606z> f63842c;

    /* renamed from: d */
    public final Provider<C37584l0> f63843d;

    /* renamed from: e */
    public final Provider<GetLoyaltyBalanceUseCase> f63844e;

    /* renamed from: f */
    public final Provider<C37697b> f63845f;

    /* renamed from: g */
    public final Provider<LoyaltyAuthenticationUseCase> f63846g;

    /* renamed from: h */
    public final Provider<ValidatePaymentUseCase> f63847h;

    /* renamed from: i */
    public final Provider<C37823k> f63848i;

    /* renamed from: j */
    public final Provider<C37865j> f63849j;

    /* renamed from: k */
    public final Provider<C37823k> f63850k;

    /* renamed from: l */
    public final Provider<C37560c> f63851l;

    /* renamed from: m */
    public final Provider<C37561c0> f63852m;

    /* renamed from: n */
    public final Provider<C26115a> f63853n;

    /* renamed from: o */
    public final Provider<C24603a> f63854o;

    /* renamed from: p */
    public final Provider<C19456p0> f63855p;

    public C26114a(Provider<IsEligibleToOnSitePaymentUseCase> provider, Provider<C37569f0> provider2, Provider<C37606z> provider3, Provider<C37584l0> provider4, Provider<GetLoyaltyBalanceUseCase> provider5, Provider<C37697b> provider6, Provider<LoyaltyAuthenticationUseCase> provider7, Provider<ValidatePaymentUseCase> provider8, Provider<C37823k> provider9, Provider<C37865j> provider10, Provider<C37823k> provider11, Provider<C37560c> provider12, Provider<C37561c0> provider13, Provider<C26115a> provider14, Provider<C24603a> provider15, Provider<C19456p0> provider16) {
        this.f63840a = provider;
        this.f63841b = provider2;
        this.f63842c = provider3;
        this.f63843d = provider4;
        this.f63844e = provider5;
        this.f63845f = provider6;
        this.f63846g = provider7;
        this.f63847h = provider8;
        this.f63848i = provider9;
        this.f63849j = provider10;
        this.f63850k = provider11;
        this.f63851l = provider12;
        this.f63852m = provider13;
        this.f63853n = provider14;
        this.f63854o = provider15;
        this.f63855p = provider16;
    }

    /* renamed from: a */
    public static C26114a m111657a(Provider<IsEligibleToOnSitePaymentUseCase> provider, Provider<C37569f0> provider2, Provider<C37606z> provider3, Provider<C37584l0> provider4, Provider<GetLoyaltyBalanceUseCase> provider5, Provider<C37697b> provider6, Provider<LoyaltyAuthenticationUseCase> provider7, Provider<ValidatePaymentUseCase> provider8, Provider<C37823k> provider9, Provider<C37865j> provider10, Provider<C37823k> provider11, Provider<C37560c> provider12, Provider<C37561c0> provider13, Provider<C26115a> provider14, Provider<C24603a> provider15, Provider<C19456p0> provider16) {
        return new C26114a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    /* renamed from: c */
    public static CheckoutStep3ViewModel m111658c(IsEligibleToOnSitePaymentUseCase isEligibleToOnSitePaymentUseCase, C37569f0 f0Var, C37606z zVar, C37584l0 l0Var, GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, C37697b bVar, LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase, ValidatePaymentUseCase validatePaymentUseCase, C37823k kVar, C37865j jVar, C37823k kVar2, C37560c cVar, C37561c0 c0Var, C26115a aVar, C24603a aVar2, C19456p0 p0Var) {
        return new CheckoutStep3ViewModel(isEligibleToOnSitePaymentUseCase, f0Var, zVar, l0Var, getLoyaltyBalanceUseCase, bVar, loyaltyAuthenticationUseCase, validatePaymentUseCase, kVar, jVar, kVar2, cVar, c0Var, aVar, aVar2, p0Var);
    }

    /* renamed from: b */
    public CheckoutStep3ViewModel get() {
        return m111658c(this.f63840a.get(), this.f63841b.get(), this.f63842c.get(), this.f63843d.get(), this.f63844e.get(), this.f63845f.get(), this.f63846g.get(), this.f63847h.get(), this.f63848i.get(), this.f63849j.get(), this.f63850k.get(), this.f63851l.get(), this.f63852m.get(), this.f63853n.get(), this.f63854o.get(), this.f63855p.get());
    }
}
