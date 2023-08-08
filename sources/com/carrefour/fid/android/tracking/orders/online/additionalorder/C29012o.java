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
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.o */
public final class C29012o implements C10324h<C29011n> {

    /* renamed from: a */
    public final Provider<C13783a> f71107a;

    public C29012o(Provider<C13783a> provider) {
        this.f71107a = provider;
    }

    /* renamed from: a */
    public static C29012o m120011a(Provider<C13783a> provider) {
        return new C29012o(provider);
    }

    /* renamed from: c */
    public static C29011n m120012c(C13783a aVar) {
        return new C29011n(aVar);
    }

    /* renamed from: b */
    public C29011n get() {
        return m120012c(this.f71107a.get());
    }
}
