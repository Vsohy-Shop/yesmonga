package com.carrefour.fid.android.utils.initializer;

import androidx.core.app.C17180n4;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope"})
/* renamed from: com.carrefour.fid.android.utils.initializer.a */
public final class C22708a implements C10158g<AnalyticsInitializer> {

    /* renamed from: a */
    public final Provider<C12074o0> f58186a;

    /* renamed from: b */
    public final Provider<C13783a> f58187b;

    /* renamed from: c */
    public final Provider<C37832c> f58188c;

    /* renamed from: d */
    public final Provider<AccountRepository> f58189d;

    /* renamed from: e */
    public final Provider<LoginRepository> f58190e;

    /* renamed from: f */
    public final Provider<AppEnvironment> f58191f;

    /* renamed from: g */
    public final Provider<C17180n4> f58192g;

    public C22708a(Provider<C12074o0> provider, Provider<C13783a> provider2, Provider<C37832c> provider3, Provider<AccountRepository> provider4, Provider<LoginRepository> provider5, Provider<AppEnvironment> provider6, Provider<C17180n4> provider7) {
        this.f58186a = provider;
        this.f58187b = provider2;
        this.f58188c = provider3;
        this.f58189d = provider4;
        this.f58190e = provider5;
        this.f58191f = provider6;
        this.f58192g = provider7;
    }

    /* renamed from: a */
    public static C10158g<AnalyticsInitializer> m102857a(Provider<C12074o0> provider, Provider<C13783a> provider2, Provider<C37832c> provider3, Provider<AccountRepository> provider4, Provider<LoginRepository> provider5, Provider<AppEnvironment> provider6, Provider<C17180n4> provider7) {
        return new C22708a(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.accountRepository")
    /* renamed from: b */
    public static void m102858b(AnalyticsInitializer analyticsInitializer, AccountRepository accountRepository) {
        analyticsInitializer.f58171e = accountRepository;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.analyticManager")
    /* renamed from: c */
    public static void m102859c(AnalyticsInitializer analyticsInitializer, C13783a aVar) {
        analyticsInitializer.f58169c = aVar;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.appEnvironment")
    /* renamed from: d */
    public static void m102860d(AnalyticsInitializer analyticsInitializer, AppEnvironment appEnvironment) {
        analyticsInitializer.f58173g = appEnvironment;
    }

    @C28659c
    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.appScope")
    /* renamed from: e */
    public static void m102861e(AnalyticsInitializer analyticsInitializer, C12074o0 o0Var) {
        analyticsInitializer.f58168b = o0Var;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.getFavoritePhysicalStoreUseCase")
    /* renamed from: f */
    public static void m102862f(AnalyticsInitializer analyticsInitializer, C37832c cVar) {
        analyticsInitializer.f58170d = cVar;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.loginRepository")
    /* renamed from: g */
    public static void m102863g(AnalyticsInitializer analyticsInitializer, LoginRepository loginRepository) {
        analyticsInitializer.f58172f = loginRepository;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.notificationManager")
    /* renamed from: i */
    public static void m102864i(AnalyticsInitializer analyticsInitializer, C17180n4 n4Var) {
        analyticsInitializer.f58174h = n4Var;
    }

    /* renamed from: h */
    public void injectMembers(AnalyticsInitializer analyticsInitializer) {
        m102861e(analyticsInitializer, this.f58186a.get());
        m102859c(analyticsInitializer, this.f58187b.get());
        m102862f(analyticsInitializer, this.f58188c.get());
        m102858b(analyticsInitializer, this.f58189d.get());
        m102863g(analyticsInitializer, this.f58190e.get());
        m102860d(analyticsInitializer, this.f58191f.get());
        m102864i(analyticsInitializer, this.f58192g.get());
    }
}
