package com.carrefour.fid.android.categories.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.categories.presentation.analytics.b */
public final class C39753b implements C10324h<C39752a> {

    /* renamed from: a */
    public final Provider<C13783a> f101472a;

    public C39753b(Provider<C13783a> provider) {
        this.f101472a = provider;
    }

    /* renamed from: a */
    public static C39753b m162235a(Provider<C13783a> provider) {
        return new C39753b(provider);
    }

    /* renamed from: c */
    public static C39752a m162236c(C13783a aVar) {
        return new C39752a(aVar);
    }

    /* renamed from: b */
    public C39752a get() {
        return m162236c(this.f101472a.get());
    }
}
