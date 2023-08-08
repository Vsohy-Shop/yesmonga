package com.carrefour.fid.android.presentation.viewmodels.order.online;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.e */
public final class C26997e implements C10324h<C26996d> {

    /* renamed from: a */
    public final Provider<C13783a> f65683a;

    public C26997e(Provider<C13783a> provider) {
        this.f65683a = provider;
    }

    /* renamed from: a */
    public static C26997e m114213a(Provider<C13783a> provider) {
        return new C26997e(provider);
    }

    /* renamed from: c */
    public static C26996d m114214c(C13783a aVar) {
        return new C26996d(aVar);
    }

    /* renamed from: b */
    public C26996d get() {
        return m114214c(this.f65683a.get());
    }
}
