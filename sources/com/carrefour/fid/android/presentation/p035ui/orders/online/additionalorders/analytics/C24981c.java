package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.analytics.c */
public final class C24981c implements C10324h<C24980b> {

    /* renamed from: a */
    public final Provider<C13783a> f61788a;

    public C24981c(Provider<C13783a> provider) {
        this.f61788a = provider;
    }

    /* renamed from: a */
    public static C24981c m108451a(Provider<C13783a> provider) {
        return new C24981c(provider);
    }

    /* renamed from: c */
    public static C24980b m108452c(C13783a aVar) {
        return new C24980b(aVar);
    }

    /* renamed from: b */
    public C24980b get() {
        return m108452c(this.f61788a.get());
    }
}
