package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.g */
public final class C27273g implements C10324h<C27272f> {

    /* renamed from: a */
    public final Provider<C13783a> f66257a;

    public C27273g(Provider<C13783a> provider) {
        this.f66257a = provider;
    }

    /* renamed from: a */
    public static C27273g m115086a(Provider<C13783a> provider) {
        return new C27273g(provider);
    }

    /* renamed from: c */
    public static C27272f m115087c(C13783a aVar) {
        return new C27272f(aVar);
    }

    /* renamed from: b */
    public C27272f get() {
        return m115087c(this.f66257a.get());
    }
}
