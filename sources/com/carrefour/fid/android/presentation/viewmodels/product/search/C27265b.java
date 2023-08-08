package com.carrefour.fid.android.presentation.viewmodels.product.search;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.b */
public final class C27265b implements C10324h<C27264a> {

    /* renamed from: a */
    public final Provider<Context> f66243a;

    /* renamed from: b */
    public final Provider<C13783a> f66244b;

    /* renamed from: c */
    public final Provider<C13814a> f66245c;

    public C27265b(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        this.f66243a = provider;
        this.f66244b = provider2;
        this.f66245c = provider3;
    }

    /* renamed from: a */
    public static C27265b m115067a(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        return new C27265b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C27264a m115068c(Context context, C13783a aVar, C13814a aVar2) {
        return new C27264a(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C27264a get() {
        return m115068c(this.f66243a.get(), this.f66244b.get(), this.f66245c.get());
    }
}
