package com.carrefour.fid.android.presentation.viewmodels.home;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.d */
public final class C26383d implements C10324h<HomeAnalyticsViewModel> {

    /* renamed from: a */
    public final Provider<LoginRepository> f64518a;

    /* renamed from: b */
    public final Provider<C28994a> f64519b;

    /* renamed from: c */
    public final Provider<C13814a> f64520c;

    /* renamed from: d */
    public final Provider<C13783a> f64521d;

    /* renamed from: e */
    public final Provider<AppEnvironment> f64522e;

    /* renamed from: f */
    public final Provider<Context> f64523f;

    public C26383d(Provider<LoginRepository> provider, Provider<C28994a> provider2, Provider<C13814a> provider3, Provider<C13783a> provider4, Provider<AppEnvironment> provider5, Provider<Context> provider6) {
        this.f64518a = provider;
        this.f64519b = provider2;
        this.f64520c = provider3;
        this.f64521d = provider4;
        this.f64522e = provider5;
        this.f64523f = provider6;
    }

    /* renamed from: a */
    public static C26383d m112726a(Provider<LoginRepository> provider, Provider<C28994a> provider2, Provider<C13814a> provider3, Provider<C13783a> provider4, Provider<AppEnvironment> provider5, Provider<Context> provider6) {
        return new C26383d(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static HomeAnalyticsViewModel m112727c(LoginRepository loginRepository, C28994a aVar, C13814a aVar2, C13783a aVar3, AppEnvironment appEnvironment, Context context) {
        return new HomeAnalyticsViewModel(loginRepository, aVar, aVar2, aVar3, appEnvironment, context);
    }

    /* renamed from: b */
    public HomeAnalyticsViewModel get() {
        return m112727c(this.f64518a.get(), this.f64519b.get(), this.f64520c.get(), this.f64521d.get(), this.f64522e.get(), this.f64523f.get());
    }
}
