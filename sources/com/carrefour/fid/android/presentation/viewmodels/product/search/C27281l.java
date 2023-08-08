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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.l */
public final class C27281l implements C10324h<C27280k> {

    /* renamed from: a */
    public final Provider<C13783a> f66266a;

    public C27281l(Provider<C13783a> provider) {
        this.f66266a = provider;
    }

    /* renamed from: a */
    public static C27281l m115107a(Provider<C13783a> provider) {
        return new C27281l(provider);
    }

    /* renamed from: c */
    public static C27280k m115108c(C13783a aVar) {
        return new C27280k(aVar);
    }

    /* renamed from: b */
    public C27280k get() {
        return m115108c(this.f66266a.get());
    }
}
