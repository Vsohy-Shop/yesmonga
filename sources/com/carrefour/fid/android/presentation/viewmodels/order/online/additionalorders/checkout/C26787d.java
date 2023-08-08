package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29008k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.d */
public final class C26787d implements C10324h<CheckoutPaymentErrorViewModel> {

    /* renamed from: a */
    public final Provider<AccountRepository> f65373a;

    /* renamed from: b */
    public final Provider<C37823k> f65374b;

    /* renamed from: c */
    public final Provider<C29008k> f65375c;

    public C26787d(Provider<AccountRepository> provider, Provider<C37823k> provider2, Provider<C29008k> provider3) {
        this.f65373a = provider;
        this.f65374b = provider2;
        this.f65375c = provider3;
    }

    /* renamed from: a */
    public static C26787d m113767a(Provider<AccountRepository> provider, Provider<C37823k> provider2, Provider<C29008k> provider3) {
        return new C26787d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CheckoutPaymentErrorViewModel m113768c(AccountRepository accountRepository, C37823k kVar, C29008k kVar2) {
        return new CheckoutPaymentErrorViewModel(accountRepository, kVar, kVar2);
    }

    /* renamed from: b */
    public CheckoutPaymentErrorViewModel get() {
        return m113768c(this.f65373a.get(), this.f65374b.get(), this.f65375c.get());
    }
}
