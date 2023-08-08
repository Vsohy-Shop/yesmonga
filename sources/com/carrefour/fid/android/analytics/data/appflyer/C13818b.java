package com.carrefour.fid.android.analytics.data.appflyer;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope", "dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.analytics.data.appflyer.b */
public final class C13818b implements C10324h<C13814a> {

    /* renamed from: a */
    public final Provider<C12074o0> f33719a;

    /* renamed from: b */
    public final Provider<AppsFlyerLib> f33720b;

    /* renamed from: c */
    public final Provider<C13783a> f33721c;

    /* renamed from: d */
    public final Provider<C37518d> f33722d;

    /* renamed from: e */
    public final Provider<Context> f33723e;

    public C13818b(Provider<C12074o0> provider, Provider<AppsFlyerLib> provider2, Provider<C13783a> provider3, Provider<C37518d> provider4, Provider<Context> provider5) {
        this.f33719a = provider;
        this.f33720b = provider2;
        this.f33721c = provider3;
        this.f33722d = provider4;
        this.f33723e = provider5;
    }

    /* renamed from: a */
    public static C13818b m58736a(Provider<C12074o0> provider, Provider<AppsFlyerLib> provider2, Provider<C13783a> provider3, Provider<C37518d> provider4, Provider<Context> provider5) {
        return new C13818b(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C13814a m58737c(C12074o0 o0Var, AppsFlyerLib appsFlyerLib, C13783a aVar, C37518d dVar, Context context) {
        return new C13814a(o0Var, appsFlyerLib, aVar, dVar, context);
    }

    /* renamed from: b */
    public C13814a get() {
        return m58737c(this.f33719a.get(), this.f33720b.get(), this.f33721c.get(), this.f33722d.get(), this.f33723e.get());
    }
}
