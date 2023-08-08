package com.carrefour.fid.android.data.provider.parameters;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.provider.parameters.a */
public final class C36585a implements C10324h<CriteoParametersProvider> {

    /* renamed from: a */
    public final Provider<Context> f90339a;

    /* renamed from: b */
    public final Provider<AppEnvironment> f90340b;

    /* renamed from: c */
    public final Provider<LoginRepository> f90341c;

    /* renamed from: d */
    public final Provider<AccountRepository> f90342d;

    /* renamed from: e */
    public final Provider<C37824l> f90343e;

    public C36585a(Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<LoginRepository> provider3, Provider<AccountRepository> provider4, Provider<C37824l> provider5) {
        this.f90339a = provider;
        this.f90340b = provider2;
        this.f90341c = provider3;
        this.f90342d = provider4;
        this.f90343e = provider5;
    }

    /* renamed from: a */
    public static C36585a m149975a(Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<LoginRepository> provider3, Provider<AccountRepository> provider4, Provider<C37824l> provider5) {
        return new C36585a(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static CriteoParametersProvider m149976c(Context context, AppEnvironment appEnvironment, LoginRepository loginRepository, AccountRepository accountRepository, C37824l lVar) {
        return new CriteoParametersProvider(context, appEnvironment, loginRepository, accountRepository, lVar);
    }

    /* renamed from: b */
    public CriteoParametersProvider get() {
        return m149976c(this.f90339a.get(), this.f90340b.get(), this.f90341c.get(), this.f90342d.get(), this.f90343e.get());
    }
}
