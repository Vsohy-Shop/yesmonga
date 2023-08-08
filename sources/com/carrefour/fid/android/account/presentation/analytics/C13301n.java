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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.n */
public final class C13301n implements C10324h<C13300m> {

    /* renamed from: a */
    public final Provider<C13783a> f32693a;

    public C13301n(Provider<C13783a> provider) {
        this.f32693a = provider;
    }

    /* renamed from: a */
    public static C13301n m57593a(Provider<C13783a> provider) {
        return new C13301n(provider);
    }

    /* renamed from: c */
    public static C13300m m57594c(C13783a aVar) {
        return new C13300m(aVar);
    }

    /* renamed from: b */
    public C13300m get() {
        return m57594c(this.f32693a.get());
    }
}
