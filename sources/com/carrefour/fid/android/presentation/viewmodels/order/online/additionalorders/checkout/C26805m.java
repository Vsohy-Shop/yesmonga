package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29016s;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.m */
public final class C26805m implements C10324h<CheckoutStepTwoAdditionalOderViewModel> {

    /* renamed from: a */
    public final Provider<C37878e> f65393a;

    /* renamed from: b */
    public final Provider<LoyaltyPreferencesStorage> f65394b;

    /* renamed from: c */
    public final Provider<C37569f0> f65395c;

    /* renamed from: d */
    public final Provider<GetLoyaltyBalanceUseCase> f65396d;

    /* renamed from: e */
    public final Provider<C37697b> f65397e;

    /* renamed from: f */
    public final Provider<LoyaltyAuthenticationUseCase> f65398f;

    /* renamed from: g */
    public final Provider<C37816e> f65399g;

    /* renamed from: h */
    public final Provider<ValidatePaymentUseCase> f65400h;

    /* renamed from: i */
    public final Provider<C19456p0> f65401i;

    /* renamed from: j */
    public final Provider<C29016s> f65402j;

    public C26805m(Provider<C37878e> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C37569f0> provider3, Provider<GetLoyaltyBalanceUseCase> provider4, Provider<C37697b> provider5, Provider<LoyaltyAuthenticationUseCase> provider6, Provider<C37816e> provider7, Provider<ValidatePaymentUseCase> provider8, Provider<C19456p0> provider9, Provider<C29016s> provider10) {
        this.f65393a = provider;
        this.f65394b = provider2;
        this.f65395c = provider3;
        this.f65396d = provider4;
        this.f65397e = provider5;
        this.f65398f = provider6;
        this.f65399g = provider7;
        this.f65400h = provider8;
        this.f65401i = provider9;
        this.f65402j = provider10;
    }

    /* renamed from: a */
    public static C26805m m113794a(Provider<C37878e> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C37569f0> provider3, Provider<GetLoyaltyBalanceUseCase> provider4, Provider<C37697b> provider5, Provider<LoyaltyAuthenticationUseCase> provider6, Provider<C37816e> provider7, Provider<ValidatePaymentUseCase> provider8, Provider<C19456p0> provider9, Provider<C29016s> provider10) {
        return new C26805m(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    /* renamed from: c */
    public static CheckoutStepTwoAdditionalOderViewModel m113795c(C37878e eVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37569f0 f0Var, GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, C37697b bVar, LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase, C37816e eVar2, ValidatePaymentUseCase validatePaymentUseCase, C19456p0 p0Var, C29016s sVar) {
        return new CheckoutStepTwoAdditionalOderViewModel(eVar, loyaltyPreferencesStorage, f0Var, getLoyaltyBalanceUseCase, bVar, loyaltyAuthenticationUseCase, eVar2, validatePaymentUseCase, p0Var, sVar);
    }

    /* renamed from: b */
    public CheckoutStepTwoAdditionalOderViewModel get() {
        return m113795c(this.f65393a.get(), this.f65394b.get(), this.f65395c.get(), this.f65396d.get(), this.f65397e.get(), this.f65398f.get(), this.f65399g.get(), this.f65400h.get(), this.f65401i.get(), this.f65402j.get());
    }
}
