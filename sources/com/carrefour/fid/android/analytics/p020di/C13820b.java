package com.carrefour.fid.android.analytics.p020di;

import com.appsflyer.AppsFlyerLib;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.analytics.di.b */
public final class C13820b implements C10324h<AppsFlyerLib> {

    /* renamed from: a */
    public final C13819a f33724a;

    public C13820b(C13819a aVar) {
        this.f33724a = aVar;
    }

    /* renamed from: a */
    public static C13820b m58740a(C13819a aVar) {
        return new C13820b(aVar);
    }

    /* renamed from: c */
    public static AppsFlyerLib m58741c(C13819a aVar) {
        return (AppsFlyerLib) C10335o.m38554f(aVar.mo32743a());
    }

    /* renamed from: b */
    public AppsFlyerLib get() {
        return m58741c(this.f33724a);
    }
}
