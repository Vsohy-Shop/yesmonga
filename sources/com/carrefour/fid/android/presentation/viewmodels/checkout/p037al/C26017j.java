package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.j */
public final class C26017j implements C10324h<C26016i> {

    /* renamed from: a */
    public final Provider<C13783a> f63609a;

    public C26017j(Provider<C13783a> provider) {
        this.f63609a = provider;
    }

    /* renamed from: a */
    public static C26017j m111354a(Provider<C13783a> provider) {
        return new C26017j(provider);
    }

    /* renamed from: c */
    public static C26016i m111355c(C13783a aVar) {
        return new C26016i(aVar);
    }

    /* renamed from: b */
    public C26016i get() {
        return m111355c(this.f63609a.get());
    }
}
