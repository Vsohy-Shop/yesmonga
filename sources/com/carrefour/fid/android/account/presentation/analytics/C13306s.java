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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.s */
public final class C13306s implements C10324h<C13305r> {

    /* renamed from: a */
    public final Provider<C13783a> f32701a;

    public C13306s(Provider<C13783a> provider) {
        this.f32701a = provider;
    }

    /* renamed from: a */
    public static C13306s m57607a(Provider<C13783a> provider) {
        return new C13306s(provider);
    }

    /* renamed from: c */
    public static C13305r m57608c(C13783a aVar) {
        return new C13305r(aVar);
    }

    /* renamed from: b */
    public C13305r get() {
        return m57608c(this.f32701a.get());
    }
}
