package com.carrefour.fid.android.presentation.viewmodels.account;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.a */
public final class C25754a implements C10324h<BaseAccountViewModel> {

    /* renamed from: a */
    public final Provider<LoginRepository> f63093a;

    public C25754a(Provider<LoginRepository> provider) {
        this.f63093a = provider;
    }

    /* renamed from: a */
    public static C25754a m110516a(Provider<LoginRepository> provider) {
        return new C25754a(provider);
    }

    /* renamed from: c */
    public static BaseAccountViewModel m110517c(LoginRepository loginRepository) {
        return new BaseAccountViewModel(loginRepository);
    }

    /* renamed from: b */
    public BaseAccountViewModel get() {
        return m110517c(this.f63093a.get());
    }
}
