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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.f */
public final class C13292f implements C10324h<C13291e> {

    /* renamed from: a */
    public final Provider<C13783a> f32687a;

    public C13292f(Provider<C13783a> provider) {
        this.f32687a = provider;
    }

    /* renamed from: a */
    public static C13292f m57572a(Provider<C13783a> provider) {
        return new C13292f(provider);
    }

    /* renamed from: c */
    public static C13291e m57573c(C13783a aVar) {
        return new C13291e(aVar);
    }

    /* renamed from: b */
    public C13291e get() {
        return m57573c(this.f32687a.get());
    }
}
