package com.carrefour.fid.android.product.presentation.analytics;

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
/* renamed from: com.carrefour.fid.android.product.presentation.analytics.e */
public final class C27635e implements C10324h<PlpProductAnalytics> {

    /* renamed from: a */
    public final Provider<Context> f67139a;

    /* renamed from: b */
    public final Provider<C13783a> f67140b;

    /* renamed from: c */
    public final Provider<C13814a> f67141c;

    public C27635e(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        this.f67139a = provider;
        this.f67140b = provider2;
        this.f67141c = provider3;
    }

    /* renamed from: a */
    public static C27635e m116250a(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        return new C27635e(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static PlpProductAnalytics m116251c(Context context, C13783a aVar, C13814a aVar2) {
        return new PlpProductAnalytics(context, aVar, aVar2);
    }

    /* renamed from: b */
    public PlpProductAnalytics get() {
        return m116251c(this.f67139a.get(), this.f67140b.get(), this.f67141c.get());
    }
}
