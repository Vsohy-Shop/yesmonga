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
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.i */
public final class C29006i implements C10324h<C29005h> {

    /* renamed from: a */
    public final Provider<C13783a> f71101a;

    public C29006i(Provider<C13783a> provider) {
        this.f71101a = provider;
    }

    /* renamed from: a */
    public static C29006i m120001a(Provider<C13783a> provider) {
        return new C29006i(provider);
    }

    /* renamed from: c */
    public static C29005h m120002c(C13783a aVar) {
        return new C29005h(aVar);
    }

    /* renamed from: b */
    public C29005h get() {
        return m120002c(this.f71101a.get());
    }
}
