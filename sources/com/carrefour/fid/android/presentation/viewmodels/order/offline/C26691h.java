package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.loyalty.C37699c;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24790g;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.h */
public final class C26691h implements C10324h<OrderOfflineListViewModel> {

    /* renamed from: a */
    public final Provider<C37699c> f65145a;

    /* renamed from: b */
    public final Provider<GetOrderOfflineListUseCase> f65146b;

    /* renamed from: c */
    public final Provider<C24790g> f65147c;

    /* renamed from: d */
    public final Provider<LoyaltyPreferencesStorage> f65148d;

    /* renamed from: e */
    public final Provider<AccountRepository> f65149e;

    /* renamed from: f */
    public final Provider<CoroutineDispatcher> f65150f;

    public C26691h(Provider<C37699c> provider, Provider<GetOrderOfflineListUseCase> provider2, Provider<C24790g> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<AccountRepository> provider5, Provider<CoroutineDispatcher> provider6) {
        this.f65145a = provider;
        this.f65146b = provider2;
        this.f65147c = provider3;
        this.f65148d = provider4;
        this.f65149e = provider5;
        this.f65150f = provider6;
    }

    /* renamed from: a */
    public static C26691h m113389a(Provider<C37699c> provider, Provider<GetOrderOfflineListUseCase> provider2, Provider<C24790g> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<AccountRepository> provider5, Provider<CoroutineDispatcher> provider6) {
        return new C26691h(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static OrderOfflineListViewModel m113390c(C37699c cVar, GetOrderOfflineListUseCase getOrderOfflineListUseCase, C24790g gVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage, AccountRepository accountRepository, CoroutineDispatcher coroutineDispatcher) {
        return new OrderOfflineListViewModel(cVar, getOrderOfflineListUseCase, gVar, loyaltyPreferencesStorage, accountRepository, coroutineDispatcher);
    }

    /* renamed from: b */
    public OrderOfflineListViewModel get() {
        return m113390c(this.f65145a.get(), this.f65146b.get(), this.f65147c.get(), this.f65148d.get(), this.f65149e.get(), this.f65150f.get());
    }
}
