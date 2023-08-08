package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.g */
public final class C26690g implements C10324h<C26689f> {

    /* renamed from: a */
    public final Provider<C13783a> f65144a;

    public C26690g(Provider<C13783a> provider) {
        this.f65144a = provider;
    }

    /* renamed from: a */
    public static C26690g m113386a(Provider<C13783a> provider) {
        return new C26690g(provider);
    }

    /* renamed from: c */
    public static C26689f m113387c(C13783a aVar) {
        return new C26689f(aVar);
    }

    /* renamed from: b */
    public C26689f get() {
        return m113387c(this.f65144a.get());
    }
}
