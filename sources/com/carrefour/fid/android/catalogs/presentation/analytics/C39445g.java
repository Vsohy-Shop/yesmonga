package com.carrefour.fid.android.catalogs.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.g */
public final class C39445g implements C10324h<C39443f> {

    /* renamed from: a */
    public final Provider<C13783a> f100927a;

    public C39445g(Provider<C13783a> provider) {
        this.f100927a = provider;
    }

    /* renamed from: a */
    public static C39445g m161650a(Provider<C13783a> provider) {
        return new C39445g(provider);
    }

    /* renamed from: c */
    public static C39443f m161651c(C13783a aVar) {
        return new C39443f(aVar);
    }

    /* renamed from: b */
    public C39443f get() {
        return m161651c(this.f100927a.get());
    }
}
