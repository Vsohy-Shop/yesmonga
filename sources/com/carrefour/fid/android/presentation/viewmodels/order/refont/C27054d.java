package com.carrefour.fid.android.presentation.viewmodels.order.refont;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.d */
public final class C27054d implements C10324h<C27053c> {

    /* renamed from: a */
    public final Provider<C13783a> f65777a;

    public C27054d(Provider<C13783a> provider) {
        this.f65777a = provider;
    }

    /* renamed from: a */
    public static C27054d m114371a(Provider<C13783a> provider) {
        return new C27054d(provider);
    }

    /* renamed from: c */
    public static C27053c m114372c(C13783a aVar) {
        return new C27053c(aVar);
    }

    /* renamed from: b */
    public C27053c get() {
        return m114372c(this.f65777a.get());
    }
}
