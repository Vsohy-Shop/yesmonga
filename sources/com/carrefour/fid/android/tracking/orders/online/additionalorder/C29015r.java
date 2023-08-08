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
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.r */
public final class C29015r implements C10324h<C29014q> {

    /* renamed from: a */
    public final Provider<C13783a> f71110a;

    public C29015r(Provider<C13783a> provider) {
        this.f71110a = provider;
    }

    /* renamed from: a */
    public static C29015r m120020a(Provider<C13783a> provider) {
        return new C29015r(provider);
    }

    /* renamed from: c */
    public static C29014q m120021c(C13783a aVar) {
        return new C29014q(aVar);
    }

    /* renamed from: b */
    public C29014q get() {
        return m120021c(this.f71110a.get());
    }
}
