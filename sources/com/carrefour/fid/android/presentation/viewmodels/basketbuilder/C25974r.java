package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.r */
public final class C25974r implements C10324h<BasketBuilderViewModel> {

    /* renamed from: a */
    public final Provider<LoginRepository> f63500a;

    /* renamed from: b */
    public final Provider<ClearAppManager> f63501b;

    /* renamed from: c */
    public final Provider<C19456p0> f63502c;

    public C25974r(Provider<LoginRepository> provider, Provider<ClearAppManager> provider2, Provider<C19456p0> provider3) {
        this.f63500a = provider;
        this.f63501b = provider2;
        this.f63502c = provider3;
    }

    /* renamed from: a */
    public static C25974r m111165a(Provider<LoginRepository> provider, Provider<ClearAppManager> provider2, Provider<C19456p0> provider3) {
        return new C25974r(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketBuilderViewModel m111166c(LoginRepository loginRepository, ClearAppManager clearAppManager, C19456p0 p0Var) {
        return new BasketBuilderViewModel(loginRepository, clearAppManager, p0Var);
    }

    /* renamed from: b */
    public BasketBuilderViewModel get() {
        return m111166c(this.f63500a.get(), this.f63501b.get(), this.f63502c.get());
    }
}
