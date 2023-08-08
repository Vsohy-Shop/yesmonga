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
/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.e */
public final class C39442e implements C10324h<C39441d> {

    /* renamed from: a */
    public final Provider<C13783a> f100922a;

    public C39442e(Provider<C13783a> provider) {
        this.f100922a = provider;
    }

    /* renamed from: a */
    public static C39442e m161645a(Provider<C13783a> provider) {
        return new C39442e(provider);
    }

    /* renamed from: c */
    public static C39441d m161646c(C13783a aVar) {
        return new C39441d(aVar);
    }

    /* renamed from: b */
    public C39441d get() {
        return m161646c(this.f100922a.get());
    }
}
