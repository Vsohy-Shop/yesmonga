package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.service.C36631j;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.l */
public final class C36605l implements C10324h<LuckyCartBannerRepository> {

    /* renamed from: a */
    public final Provider<Context> f90494a;

    /* renamed from: b */
    public final Provider<C36631j> f90495b;

    /* renamed from: c */
    public final Provider<LoginRepository> f90496c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f90497d;

    public C36605l(Provider<Context> provider, Provider<C36631j> provider2, Provider<LoginRepository> provider3, Provider<AppEnvironment> provider4) {
        this.f90494a = provider;
        this.f90495b = provider2;
        this.f90496c = provider3;
        this.f90497d = provider4;
    }

    /* renamed from: a */
    public static C36605l m150195a(Provider<Context> provider, Provider<C36631j> provider2, Provider<LoginRepository> provider3, Provider<AppEnvironment> provider4) {
        return new C36605l(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static LuckyCartBannerRepository m150196c(Context context, C36631j jVar, LoginRepository loginRepository, AppEnvironment appEnvironment) {
        return new LuckyCartBannerRepository(context, jVar, loginRepository, appEnvironment);
    }

    /* renamed from: b */
    public LuckyCartBannerRepository get() {
        return m150196c(this.f90494a.get(), this.f90495b.get(), this.f90496c.get(), this.f90497d.get());
    }
}
