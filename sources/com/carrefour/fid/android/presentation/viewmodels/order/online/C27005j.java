package com.carrefour.fid.android.presentation.viewmodels.order.online;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.j */
public final class C27005j implements C10324h<C27004i> {

    /* renamed from: a */
    public final Provider<C13783a> f65692a;

    public C27005j(Provider<C13783a> provider) {
        this.f65692a = provider;
    }

    /* renamed from: a */
    public static C27005j m114233a(Provider<C13783a> provider) {
        return new C27005j(provider);
    }

    /* renamed from: c */
    public static C27004i m114234c(C13783a aVar) {
        return new C27004i(aVar);
    }

    /* renamed from: b */
    public C27004i get() {
        return m114234c(this.f65692a.get());
    }
}
