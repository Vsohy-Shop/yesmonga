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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.v */
public final class C13309v implements C10324h<C13308u> {

    /* renamed from: a */
    public final Provider<C13783a> f32703a;

    public C13309v(Provider<C13783a> provider) {
        this.f32703a = provider;
    }

    /* renamed from: a */
    public static C13309v m57612a(Provider<C13783a> provider) {
        return new C13309v(provider);
    }

    /* renamed from: c */
    public static C13308u m57613c(C13783a aVar) {
        return new C13308u(aVar);
    }

    /* renamed from: b */
    public C13308u get() {
        return m57613c(this.f32703a.get());
    }
}
