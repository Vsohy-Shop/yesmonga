package com.carrefour.fid.android.presentation.viewmodels.product.mixing;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.mixing.b */
public final class C27226b implements C10324h<C27224a> {

    /* renamed from: a */
    public final Provider<C13783a> f66179a;

    public C27226b(Provider<C13783a> provider) {
        this.f66179a = provider;
    }

    /* renamed from: a */
    public static C27226b m114950a(Provider<C13783a> provider) {
        return new C27226b(provider);
    }

    /* renamed from: c */
    public static C27224a m114951c(C13783a aVar) {
        return new C27224a(aVar);
    }

    /* renamed from: b */
    public C27224a get() {
        return m114951c(this.f66179a.get());
    }
}
