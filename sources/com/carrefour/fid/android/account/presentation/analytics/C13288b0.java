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
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.b0 */
public final class C13288b0 implements C10324h<C13286a0> {

    /* renamed from: a */
    public final Provider<C13783a> f32684a;

    public C13288b0(Provider<C13783a> provider) {
        this.f32684a = provider;
    }

    /* renamed from: a */
    public static C13288b0 m57566a(Provider<C13783a> provider) {
        return new C13288b0(provider);
    }

    /* renamed from: c */
    public static C13286a0 m57567c(C13783a aVar) {
        return new C13286a0(aVar);
    }

    /* renamed from: b */
    public C13286a0 get() {
        return m57567c(this.f32684a.get());
    }
}
