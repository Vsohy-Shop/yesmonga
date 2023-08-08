package com.carrefour.fid.android.analytics.data.analytics;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.account.C37519e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.C33314e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.e */
public final class C13787e implements C10324h<FirebaseAnalyticsDispatcher> {

    /* renamed from: a */
    public final Provider<FirebaseAnalytics> f33553a;

    /* renamed from: b */
    public final Provider<C33314e> f33554b;

    /* renamed from: c */
    public final Provider<C37519e> f33555c;

    /* renamed from: d */
    public final Provider<C37823k> f33556d;

    /* renamed from: e */
    public final Provider<Context> f33557e;

    public C13787e(Provider<FirebaseAnalytics> provider, Provider<C33314e> provider2, Provider<C37519e> provider3, Provider<C37823k> provider4, Provider<Context> provider5) {
        this.f33553a = provider;
        this.f33554b = provider2;
        this.f33555c = provider3;
        this.f33556d = provider4;
        this.f33557e = provider5;
    }

    /* renamed from: a */
    public static C13787e m58690a(Provider<FirebaseAnalytics> provider, Provider<C33314e> provider2, Provider<C37519e> provider3, Provider<C37823k> provider4, Provider<Context> provider5) {
        return new C13787e(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static FirebaseAnalyticsDispatcher m58691c(FirebaseAnalytics firebaseAnalytics, C33314e eVar, C37519e eVar2, C37823k kVar, Context context) {
        return new FirebaseAnalyticsDispatcher(firebaseAnalytics, eVar, eVar2, kVar, context);
    }

    /* renamed from: b */
    public FirebaseAnalyticsDispatcher get() {
        return m58691c(this.f33553a.get(), this.f33554b.get(), this.f33555c.get(), this.f33556d.get(), this.f33557e.get());
    }
}
