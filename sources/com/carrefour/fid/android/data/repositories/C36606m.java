package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.service.C36630i;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.m */
public final class C36606m implements C10324h<LuckyCartRepository> {

    /* renamed from: a */
    public final Provider<Context> f90498a;

    /* renamed from: b */
    public final Provider<C36630i> f90499b;

    /* renamed from: c */
    public final Provider<LoginRepository> f90500c;

    /* renamed from: d */
    public final Provider<AppEnvironment> f90501d;

    public C36606m(Provider<Context> provider, Provider<C36630i> provider2, Provider<LoginRepository> provider3, Provider<AppEnvironment> provider4) {
        this.f90498a = provider;
        this.f90499b = provider2;
        this.f90500c = provider3;
        this.f90501d = provider4;
    }

    /* renamed from: a */
    public static C36606m m150198a(Provider<Context> provider, Provider<C36630i> provider2, Provider<LoginRepository> provider3, Provider<AppEnvironment> provider4) {
        return new C36606m(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static LuckyCartRepository m150199c(Context context, C36630i iVar, LoginRepository loginRepository, AppEnvironment appEnvironment) {
        return new LuckyCartRepository(context, iVar, loginRepository, appEnvironment);
    }

    /* renamed from: b */
    public LuckyCartRepository get() {
        return m150199c(this.f90498a.get(), this.f90499b.get(), this.f90500c.get(), this.f90501d.get());
    }
}
