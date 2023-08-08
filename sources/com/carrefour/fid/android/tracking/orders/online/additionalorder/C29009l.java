package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.l */
public final class C29009l implements C10324h<C29008k> {

    /* renamed from: a */
    public final Provider<C13783a> f71104a;

    public C29009l(Provider<C13783a> provider) {
        this.f71104a = provider;
    }

    /* renamed from: a */
    public static C29009l m120004a(Provider<C13783a> provider) {
        return new C29009l(provider);
    }

    /* renamed from: c */
    public static C29008k m120005c(C13783a aVar) {
        return new C29008k(aVar);
    }

    /* renamed from: b */
    public C29008k get() {
        return m120005c(this.f71104a.get());
    }
}
