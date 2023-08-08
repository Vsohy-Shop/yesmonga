package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.analytics.c */
public final class C23945c implements C10324h<C23944b> {

    /* renamed from: a */
    public final Provider<C13783a> f60114a;

    public C23945c(Provider<C13783a> provider) {
        this.f60114a = provider;
    }

    /* renamed from: a */
    public static C23945c m105814a(Provider<C13783a> provider) {
        return new C23945c(provider);
    }

    /* renamed from: c */
    public static C23944b m105815c(C13783a aVar) {
        return new C23944b(aVar);
    }

    /* renamed from: b */
    public C23944b get() {
        return m105815c(this.f60114a.get());
    }
}
