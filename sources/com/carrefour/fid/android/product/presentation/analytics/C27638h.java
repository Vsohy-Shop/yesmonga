package com.carrefour.fid.android.product.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.analytics.h */
public final class C27638h implements C10324h<C27637g> {

    /* renamed from: a */
    public final Provider<C13783a> f67143a;

    public C27638h(Provider<C13783a> provider) {
        this.f67143a = provider;
    }

    /* renamed from: a */
    public static C27638h m116267a(Provider<C13783a> provider) {
        return new C27638h(provider);
    }

    /* renamed from: c */
    public static C27637g m116268c(C13783a aVar) {
        return new C27637g(aVar);
    }

    /* renamed from: b */
    public C27637g get() {
        return m116268c(this.f67143a.get());
    }
}
