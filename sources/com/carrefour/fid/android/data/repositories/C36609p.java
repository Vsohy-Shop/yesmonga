package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.datasource.C36388a;
import com.carrefour.fid.android.data.entities.mapper.C36488g0;
import com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.p */
public final class C36609p implements C10324h<OrderFeedbackRepository> {

    /* renamed from: a */
    public final Provider<LoginRepository> f90506a;

    /* renamed from: b */
    public final Provider<AccountRepository> f90507b;

    /* renamed from: c */
    public final Provider<OrderGetCustomerStatusUseCase> f90508c;

    /* renamed from: d */
    public final Provider<C36488g0> f90509d;

    /* renamed from: e */
    public final Provider<C36388a> f90510e;

    public C36609p(Provider<LoginRepository> provider, Provider<AccountRepository> provider2, Provider<OrderGetCustomerStatusUseCase> provider3, Provider<C36488g0> provider4, Provider<C36388a> provider5) {
        this.f90506a = provider;
        this.f90507b = provider2;
        this.f90508c = provider3;
        this.f90509d = provider4;
        this.f90510e = provider5;
    }

    /* renamed from: a */
    public static C36609p m150207a(Provider<LoginRepository> provider, Provider<AccountRepository> provider2, Provider<OrderGetCustomerStatusUseCase> provider3, Provider<C36488g0> provider4, Provider<C36388a> provider5) {
        return new C36609p(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static OrderFeedbackRepository m150208c(LoginRepository loginRepository, AccountRepository accountRepository, OrderGetCustomerStatusUseCase orderGetCustomerStatusUseCase, C36488g0 g0Var, C36388a aVar) {
        return new OrderFeedbackRepository(loginRepository, accountRepository, orderGetCustomerStatusUseCase, g0Var, aVar);
    }

    /* renamed from: b */
    public OrderFeedbackRepository get() {
        return m150208c(this.f90506a.get(), this.f90507b.get(), this.f90508c.get(), this.f90509d.get(), this.f90510e.get());
    }
}
