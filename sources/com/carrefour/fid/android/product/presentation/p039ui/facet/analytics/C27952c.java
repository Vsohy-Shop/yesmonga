package com.carrefour.fid.android.product.presentation.p039ui.facet.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.analytics.c */
public final class C27952c implements C10324h<C27951b> {

    /* renamed from: a */
    public final Provider<C13783a> f67787a;

    public C27952c(Provider<C13783a> provider) {
        this.f67787a = provider;
    }

    /* renamed from: a */
    public static C27952c m117329a(Provider<C13783a> provider) {
        return new C27952c(provider);
    }

    /* renamed from: c */
    public static C27951b m117330c(C13783a aVar) {
        return new C27951b(aVar);
    }

    /* renamed from: b */
    public C27951b get() {
        return m117330c(this.f67787a.get());
    }
}
