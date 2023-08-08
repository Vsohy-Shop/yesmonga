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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.c */
public final class C13289c implements C10324h<C13287b> {

    /* renamed from: a */
    public final Provider<C13783a> f32685a;

    public C13289c(Provider<C13783a> provider) {
        this.f32685a = provider;
    }

    /* renamed from: a */
    public static C13289c m57569a(Provider<C13783a> provider) {
        return new C13289c(provider);
    }

    /* renamed from: c */
    public static C13287b m57570c(C13783a aVar) {
        return new C13287b(aVar);
    }

    /* renamed from: b */
    public C13287b get() {
        return m57570c(this.f32685a.get());
    }
}
