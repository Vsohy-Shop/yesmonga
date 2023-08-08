package com.carrefour.fid.android.analytics.data.analytics;

import com.carrefour.fid.android.tracking.C28995b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.analytics.data.analytics.b */
public final class C13784b implements C10324h<C13783a> {

    /* renamed from: a */
    public final Provider<FirebaseAnalyticsDispatcher> f33547a;

    /* renamed from: b */
    public final Provider<C28995b> f33548b;

    public C13784b(Provider<FirebaseAnalyticsDispatcher> provider, Provider<C28995b> provider2) {
        this.f33547a = provider;
        this.f33548b = provider2;
    }

    /* renamed from: a */
    public static C13784b m58683a(Provider<FirebaseAnalyticsDispatcher> provider, Provider<C28995b> provider2) {
        return new C13784b(provider, provider2);
    }

    /* renamed from: c */
    public static C13783a m58684c(FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, C28995b bVar) {
        return new C13783a(firebaseAnalyticsDispatcher, bVar);
    }

    /* renamed from: b */
    public C13783a get() {
        return m58684c(this.f33547a.get(), this.f33548b.get());
    }
}
