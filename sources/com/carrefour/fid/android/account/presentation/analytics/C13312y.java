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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.y */
public final class C13312y implements C10324h<C13311x> {

    /* renamed from: a */
    public final Provider<C13783a> f32705a;

    public C13312y(Provider<C13783a> provider) {
        this.f32705a = provider;
    }

    /* renamed from: a */
    public static C13312y m57617a(Provider<C13783a> provider) {
        return new C13312y(provider);
    }

    /* renamed from: c */
    public static C13311x m57618c(C13783a aVar) {
        return new C13311x(aVar);
    }

    /* renamed from: b */
    public C13311x get() {
        return m57618c(this.f32705a.get());
    }
}
