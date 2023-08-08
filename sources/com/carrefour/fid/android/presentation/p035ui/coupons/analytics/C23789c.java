package com.carrefour.fid.android.presentation.p035ui.coupons.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.analytics.c */
public final class C23789c implements C10324h<C23788b> {

    /* renamed from: a */
    public final Provider<C13783a> f59883a;

    public C23789c(Provider<C13783a> provider) {
        this.f59883a = provider;
    }

    /* renamed from: a */
    public static C23789c m105459a(Provider<C13783a> provider) {
        return new C23789c(provider);
    }

    /* renamed from: c */
    public static C23788b m105460c(C13783a aVar) {
        return new C23788b(aVar);
    }

    /* renamed from: b */
    public C23788b get() {
        return m105460c(this.f59883a.get());
    }
}
