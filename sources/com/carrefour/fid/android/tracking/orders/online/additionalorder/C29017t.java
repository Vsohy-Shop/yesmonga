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
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.t */
public final class C29017t implements C10324h<C29016s> {

    /* renamed from: a */
    public final Provider<C13783a> f71113a;

    public C29017t(Provider<C13783a> provider) {
        this.f71113a = provider;
    }

    /* renamed from: a */
    public static C29017t m120026a(Provider<C13783a> provider) {
        return new C29017t(provider);
    }

    /* renamed from: c */
    public static C29016s m120027c(C13783a aVar) {
        return new C29016s(aVar);
    }

    /* renamed from: b */
    public C29016s get() {
        return m120027c(this.f71113a.get());
    }
}
