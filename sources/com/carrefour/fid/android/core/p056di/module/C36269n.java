package com.carrefour.fid.android.core.p056di.module;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.n */
public final class C36269n implements C10324h<FirebaseAnalytics> {

    /* renamed from: a */
    public final C36265j f89572a;

    public C36269n(C36265j jVar) {
        this.f89572a = jVar;
    }

    /* renamed from: a */
    public static C36269n m148836a(C36265j jVar) {
        return new C36269n(jVar);
    }

    /* renamed from: c */
    public static FirebaseAnalytics m148837c(C36265j jVar) {
        return (FirebaseAnalytics) C10335o.m38554f(jVar.mo108255d());
    }

    /* renamed from: b */
    public FirebaseAnalytics get() {
        return m148837c(this.f89572a);
    }
}
