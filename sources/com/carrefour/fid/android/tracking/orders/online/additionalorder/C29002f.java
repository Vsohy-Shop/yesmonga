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
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.f */
public final class C29002f implements C10324h<C29001e> {

    /* renamed from: a */
    public final Provider<C13783a> f71098a;

    public C29002f(Provider<C13783a> provider) {
        this.f71098a = provider;
    }

    /* renamed from: a */
    public static C29002f m119983a(Provider<C13783a> provider) {
        return new C29002f(provider);
    }

    /* renamed from: c */
    public static C29001e m119984c(C13783a aVar) {
        return new C29001e(aVar);
    }

    /* renamed from: b */
    public C29001e get() {
        return m119984c(this.f71098a.get());
    }
}
