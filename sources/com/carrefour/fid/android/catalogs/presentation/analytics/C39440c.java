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
/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.c */
public final class C39440c implements C10324h<C39438b> {

    /* renamed from: a */
    public final Provider<C13783a> f100920a;

    public C39440c(Provider<C13783a> provider) {
        this.f100920a = provider;
    }

    /* renamed from: a */
    public static C39440c m161638a(Provider<C13783a> provider) {
        return new C39440c(provider);
    }

    /* renamed from: c */
    public static C39438b m161639c(C13783a aVar) {
        return new C39438b(aVar);
    }

    /* renamed from: b */
    public C39438b get() {
        return m161639c(this.f100920a.get());
    }
}
