package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.c */
public final class C28998c implements C10324h<C28997b> {

    /* renamed from: a */
    public final Provider<C13783a> f71094a;

    public C28998c(Provider<C13783a> provider) {
        this.f71094a = provider;
    }

    /* renamed from: a */
    public static C28998c m119971a(Provider<C13783a> provider) {
        return new C28998c(provider);
    }

    /* renamed from: c */
    public static C28997b m119972c(C13783a aVar) {
        return new C28997b(aVar);
    }

    /* renamed from: b */
    public C28997b get() {
        return m119972c(this.f71094a.get());
    }
}
