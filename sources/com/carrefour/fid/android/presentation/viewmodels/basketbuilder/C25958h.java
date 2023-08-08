package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.h */
public final class C25958h implements C10324h<BasketBuilderMyListViewModel> {

    /* renamed from: a */
    public final Provider<LoginRepository> f63488a;

    public C25958h(Provider<LoginRepository> provider) {
        this.f63488a = provider;
    }

    /* renamed from: a */
    public static C25958h m111138a(Provider<LoginRepository> provider) {
        return new C25958h(provider);
    }

    /* renamed from: c */
    public static BasketBuilderMyListViewModel m111139c(LoginRepository loginRepository) {
        return new BasketBuilderMyListViewModel(loginRepository);
    }

    /* renamed from: b */
    public BasketBuilderMyListViewModel get() {
        return m111139c(this.f63488a.get());
    }
}
