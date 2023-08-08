package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.l */
public final class C13299l implements C10324h<C13298k> {

    /* renamed from: a */
    public final Provider<C13783a> f32691a;

    public C13299l(Provider<C13783a> provider) {
        this.f32691a = provider;
    }

    /* renamed from: a */
    public static C13299l m57586a(Provider<C13783a> provider) {
        return new C13299l(provider);
    }

    /* renamed from: c */
    public static C13298k m57587c(C13783a aVar) {
        return new C13298k(aVar);
    }

    /* renamed from: b */
    public C13298k get() {
        return m57587c(this.f32691a.get());
    }
}
