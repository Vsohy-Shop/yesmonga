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
/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.i */
public final class C39447i implements C10324h<C39446h> {

    /* renamed from: a */
    public final Provider<C13783a> f100929a;

    public C39447i(Provider<C13783a> provider) {
        this.f100929a = provider;
    }

    /* renamed from: a */
    public static C39447i m161654a(Provider<C13783a> provider) {
        return new C39447i(provider);
    }

    /* renamed from: c */
    public static C39446h m161655c(C13783a aVar) {
        return new C39446h(aVar);
    }

    /* renamed from: b */
    public C39446h get() {
        return m161655c(this.f100929a.get());
    }
}
