package com.carrefour.fid.android.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.analytics.f */
public final class C38365f implements C10324h<C38364e> {

    /* renamed from: a */
    public final Provider<C13783a> f97149a;

    public C38365f(Provider<C13783a> provider) {
        this.f97149a = provider;
    }

    /* renamed from: a */
    public static C38365f m158832a(Provider<C13783a> provider) {
        return new C38365f(provider);
    }

    /* renamed from: c */
    public static C38364e m158833c(C13783a aVar) {
        return new C38364e(aVar);
    }

    /* renamed from: b */
    public C38364e get() {
        return m158833c(this.f97149a.get());
    }
}
