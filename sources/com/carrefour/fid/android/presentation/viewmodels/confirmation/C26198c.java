package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.data.entities.mapper.C36496i0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase;
import com.carrefour.fid.android.domain.interactors.product.C37748a;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37838t;
import com.carrefour.fid.android.ecommerce.checkout.manager.C38208a;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.confirmation.c */
public final class C26198c implements C10324h<CheckoutConfirmationViewModel> {

    /* renamed from: a */
    public final Provider<C37569f0> f64093a;

    /* renamed from: b */
    public final Provider<C37748a> f64094b;

    /* renamed from: c */
    public final Provider<C37838t> f64095c;

    /* renamed from: d */
    public final Provider<C37670i> f64096d;

    /* renamed from: e */
    public final Provider<C38208a> f64097e;

    /* renamed from: f */
    public final Provider<GetOfferProductListUseCase> f64098f;

    /* renamed from: g */
    public final Provider<C37823k> f64099g;

    /* renamed from: h */
    public final Provider<AccountRepository> f64100h;

    /* renamed from: i */
    public final Provider<LoyaltyPreferencesStorage> f64101i;

    /* renamed from: j */
    public final Provider<OrderFeedbackUseCase> f64102j;

    /* renamed from: k */
    public final Provider<C36496i0> f64103k;

    /* renamed from: l */
    public final Provider<C28994a> f64104l;

    /* renamed from: m */
    public final Provider<C37596r> f64105m;

    /* renamed from: n */
    public final Provider<CoroutineDispatcher> f64106n;

    /* renamed from: o */
    public final Provider<C26196a> f64107o;

    public C26198c(Provider<C37569f0> provider, Provider<C37748a> provider2, Provider<C37838t> provider3, Provider<C37670i> provider4, Provider<C38208a> provider5, Provider<GetOfferProductListUseCase> provider6, Provider<C37823k> provider7, Provider<AccountRepository> provider8, Provider<LoyaltyPreferencesStorage> provider9, Provider<OrderFeedbackUseCase> provider10, Provider<C36496i0> provider11, Provider<C28994a> provider12, Provider<C37596r> provider13, Provider<CoroutineDispatcher> provider14, Provider<C26196a> provider15) {
        this.f64093a = provider;
        this.f64094b = provider2;
        this.f64095c = provider3;
        this.f64096d = provider4;
        this.f64097e = provider5;
        this.f64098f = provider6;
        this.f64099g = provider7;
        this.f64100h = provider8;
        this.f64101i = provider9;
        this.f64102j = provider10;
        this.f64103k = provider11;
        this.f64104l = provider12;
        this.f64105m = provider13;
        this.f64106n = provider14;
        this.f64107o = provider15;
    }

    /* renamed from: a */
    public static C26198c m112021a(Provider<C37569f0> provider, Provider<C37748a> provider2, Provider<C37838t> provider3, Provider<C37670i> provider4, Provider<C38208a> provider5, Provider<GetOfferProductListUseCase> provider6, Provider<C37823k> provider7, Provider<AccountRepository> provider8, Provider<LoyaltyPreferencesStorage> provider9, Provider<OrderFeedbackUseCase> provider10, Provider<C36496i0> provider11, Provider<C28994a> provider12, Provider<C37596r> provider13, Provider<CoroutineDispatcher> provider14, Provider<C26196a> provider15) {
        return new C26198c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    /* renamed from: c */
    public static CheckoutConfirmationViewModel m112022c(C37569f0 f0Var, C37748a aVar, C37838t tVar, C37670i iVar, C38208a aVar2, GetOfferProductListUseCase getOfferProductListUseCase, C37823k kVar, AccountRepository accountRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, OrderFeedbackUseCase orderFeedbackUseCase, C36496i0 i0Var, C28994a aVar3, C37596r rVar, CoroutineDispatcher coroutineDispatcher) {
        return new CheckoutConfirmationViewModel(f0Var, aVar, tVar, iVar, aVar2, getOfferProductListUseCase, kVar, accountRepository, loyaltyPreferencesStorage, orderFeedbackUseCase, i0Var, aVar3, rVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public CheckoutConfirmationViewModel get() {
        CheckoutConfirmationViewModel c = m112022c(this.f64093a.get(), this.f64094b.get(), this.f64095c.get(), this.f64096d.get(), this.f64097e.get(), this.f64098f.get(), this.f64099g.get(), this.f64100h.get(), this.f64101i.get(), this.f64102j.get(), this.f64103k.get(), this.f64104l.get(), this.f64105m.get(), this.f64106n.get());
        C26204f.m112031b(c, this.f64107o.get());
        return c;
    }
}
