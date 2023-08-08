package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.data.entities.mapper.C36496i0;
import com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.feedback.C37686a;
import com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase;
import com.carrefour.fid.android.ecommerce.checkout.manager.C38208a;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29005h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.a */
public final class C26781a implements C10324h<CheckoutConfirmationViewModel> {

    /* renamed from: a */
    public final Provider<C37569f0> f65358a;

    /* renamed from: b */
    public final Provider<C37576i0> f65359b;

    /* renamed from: c */
    public final Provider<C37670i> f65360c;

    /* renamed from: d */
    public final Provider<C38208a> f65361d;

    /* renamed from: e */
    public final Provider<GetOfferProductListUseCase> f65362e;

    /* renamed from: f */
    public final Provider<AccountRepository> f65363f;

    /* renamed from: g */
    public final Provider<LoyaltyPreferencesStorage> f65364g;

    /* renamed from: h */
    public final Provider<OrderFeedbackUseCase> f65365h;

    /* renamed from: i */
    public final Provider<C37686a> f65366i;

    /* renamed from: j */
    public final Provider<C36496i0> f65367j;

    /* renamed from: k */
    public final Provider<C28994a> f65368k;

    /* renamed from: l */
    public final Provider<GetOnlineOrderByIdUseCase> f65369l;

    /* renamed from: m */
    public final Provider<GetDeliveryStoreUseCase> f65370m;

    /* renamed from: n */
    public final Provider<C29005h> f65371n;

    public C26781a(Provider<C37569f0> provider, Provider<C37576i0> provider2, Provider<C37670i> provider3, Provider<C38208a> provider4, Provider<GetOfferProductListUseCase> provider5, Provider<AccountRepository> provider6, Provider<LoyaltyPreferencesStorage> provider7, Provider<OrderFeedbackUseCase> provider8, Provider<C37686a> provider9, Provider<C36496i0> provider10, Provider<C28994a> provider11, Provider<GetOnlineOrderByIdUseCase> provider12, Provider<GetDeliveryStoreUseCase> provider13, Provider<C29005h> provider14) {
        this.f65358a = provider;
        this.f65359b = provider2;
        this.f65360c = provider3;
        this.f65361d = provider4;
        this.f65362e = provider5;
        this.f65363f = provider6;
        this.f65364g = provider7;
        this.f65365h = provider8;
        this.f65366i = provider9;
        this.f65367j = provider10;
        this.f65368k = provider11;
        this.f65369l = provider12;
        this.f65370m = provider13;
        this.f65371n = provider14;
    }

    /* renamed from: a */
    public static C26781a m113758a(Provider<C37569f0> provider, Provider<C37576i0> provider2, Provider<C37670i> provider3, Provider<C38208a> provider4, Provider<GetOfferProductListUseCase> provider5, Provider<AccountRepository> provider6, Provider<LoyaltyPreferencesStorage> provider7, Provider<OrderFeedbackUseCase> provider8, Provider<C37686a> provider9, Provider<C36496i0> provider10, Provider<C28994a> provider11, Provider<GetOnlineOrderByIdUseCase> provider12, Provider<GetDeliveryStoreUseCase> provider13, Provider<C29005h> provider14) {
        return new C26781a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    /* renamed from: c */
    public static CheckoutConfirmationViewModel m113759c(C37569f0 f0Var, C37576i0 i0Var, C37670i iVar, C38208a aVar, GetOfferProductListUseCase getOfferProductListUseCase, AccountRepository accountRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, OrderFeedbackUseCase orderFeedbackUseCase, C37686a aVar2, C36496i0 i0Var2, C28994a aVar3, GetOnlineOrderByIdUseCase getOnlineOrderByIdUseCase, GetDeliveryStoreUseCase getDeliveryStoreUseCase, C29005h hVar) {
        return new CheckoutConfirmationViewModel(f0Var, i0Var, iVar, aVar, getOfferProductListUseCase, accountRepository, loyaltyPreferencesStorage, orderFeedbackUseCase, aVar2, i0Var2, aVar3, getOnlineOrderByIdUseCase, getDeliveryStoreUseCase, hVar);
    }

    /* renamed from: b */
    public CheckoutConfirmationViewModel get() {
        return m113759c(this.f65358a.get(), this.f65359b.get(), this.f65360c.get(), this.f65361d.get(), this.f65362e.get(), this.f65363f.get(), this.f65364g.get(), this.f65365h.get(), this.f65366i.get(), this.f65367j.get(), this.f65368k.get(), this.f65369l.get(), this.f65370m.get(), this.f65371n.get());
    }
}
