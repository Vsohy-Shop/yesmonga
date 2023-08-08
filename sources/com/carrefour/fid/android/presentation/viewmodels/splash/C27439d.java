package com.carrefour.fid.android.presentation.viewmodels.splash;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.airship.C37546c;
import com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37809c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.d */
public final class C27439d implements C10324h<SplashViewModel> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f66554a;

    /* renamed from: b */
    public final Provider<LoyaltyPreferencesStorage> f66555b;

    /* renamed from: c */
    public final Provider<C37809c> f66556c;

    /* renamed from: d */
    public final Provider<LoginRepository> f66557d;

    /* renamed from: e */
    public final Provider<C37878e> f66558e;

    /* renamed from: f */
    public final Provider<AppPreferencesStorage> f66559f;

    /* renamed from: g */
    public final Provider<C28909d> f66560g;

    /* renamed from: h */
    public final Provider<LuckyCartGetLuckyCartBannersUseCase> f66561h;

    /* renamed from: i */
    public final Provider<C37546c> f66562i;

    public C27439d(Provider<AppEnvironment> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C37809c> provider3, Provider<LoginRepository> provider4, Provider<C37878e> provider5, Provider<AppPreferencesStorage> provider6, Provider<C28909d> provider7, Provider<LuckyCartGetLuckyCartBannersUseCase> provider8, Provider<C37546c> provider9) {
        this.f66554a = provider;
        this.f66555b = provider2;
        this.f66556c = provider3;
        this.f66557d = provider4;
        this.f66558e = provider5;
        this.f66559f = provider6;
        this.f66560g = provider7;
        this.f66561h = provider8;
        this.f66562i = provider9;
    }

    /* renamed from: a */
    public static C27439d m115500a(Provider<AppEnvironment> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C37809c> provider3, Provider<LoginRepository> provider4, Provider<C37878e> provider5, Provider<AppPreferencesStorage> provider6, Provider<C28909d> provider7, Provider<LuckyCartGetLuckyCartBannersUseCase> provider8, Provider<C37546c> provider9) {
        return new C27439d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static SplashViewModel m115501c(AppEnvironment appEnvironment, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37809c cVar, LoginRepository loginRepository, C37878e eVar, AppPreferencesStorage appPreferencesStorage, C28909d dVar, LuckyCartGetLuckyCartBannersUseCase luckyCartGetLuckyCartBannersUseCase, C37546c cVar2) {
        return new SplashViewModel(appEnvironment, loyaltyPreferencesStorage, cVar, loginRepository, eVar, appPreferencesStorage, dVar, luckyCartGetLuckyCartBannersUseCase, cVar2);
    }

    /* renamed from: b */
    public SplashViewModel get() {
        return m115501c(this.f66554a.get(), this.f66555b.get(), this.f66556c.get(), this.f66557d.get(), this.f66558e.get(), this.f66559f.get(), this.f66560g.get(), this.f66561h.get(), this.f66562i.get());
    }
}
