package com.carrefour.fid.android.domain.interactors.luckycart;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.c */
public final class C37709c implements C10324h<GetLuckyCartGameBannerUseCase> {

    /* renamed from: a */
    public final Provider<Context> f94588a;

    /* renamed from: b */
    public final Provider<C37807b> f94589b;

    /* renamed from: c */
    public final Provider<LuckyCartBannerRepository> f94590c;

    /* renamed from: d */
    public final Provider<LoginRepository> f94591d;

    /* renamed from: e */
    public final Provider<AppEnvironment> f94592e;

    public C37709c(Provider<Context> provider, Provider<C37807b> provider2, Provider<LuckyCartBannerRepository> provider3, Provider<LoginRepository> provider4, Provider<AppEnvironment> provider5) {
        this.f94588a = provider;
        this.f94589b = provider2;
        this.f94590c = provider3;
        this.f94591d = provider4;
        this.f94592e = provider5;
    }

    /* renamed from: a */
    public static C37709c m154514a(Provider<Context> provider, Provider<C37807b> provider2, Provider<LuckyCartBannerRepository> provider3, Provider<LoginRepository> provider4, Provider<AppEnvironment> provider5) {
        return new C37709c(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static GetLuckyCartGameBannerUseCase m154515c(Context context, C37807b bVar, LuckyCartBannerRepository luckyCartBannerRepository, LoginRepository loginRepository, AppEnvironment appEnvironment) {
        return new GetLuckyCartGameBannerUseCase(context, bVar, luckyCartBannerRepository, loginRepository, appEnvironment);
    }

    /* renamed from: b */
    public GetLuckyCartGameBannerUseCase get() {
        return m154515c(this.f94588a.get(), this.f94589b.get(), this.f94590c.get(), this.f94591d.get(), this.f94592e.get());
    }
}
