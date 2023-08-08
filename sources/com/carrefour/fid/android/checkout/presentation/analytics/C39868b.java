package com.carrefour.fid.android.checkout.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.presentation.analytics.b */
public final class C39868b implements C10324h<C39866a> {

    /* renamed from: a */
    public final Provider<C13783a> f101697a;

    public C39868b(Provider<C13783a> provider) {
        this.f101697a = provider;
    }

    /* renamed from: a */
    public static C39868b m162536a(Provider<C13783a> provider) {
        return new C39868b(provider);
    }

    /* renamed from: c */
    public static C39866a m162537c(C13783a aVar) {
        return new C39866a(aVar);
    }

    /* renamed from: b */
    public C39866a get() {
        return m162537c(this.f101697a.get());
    }
}
