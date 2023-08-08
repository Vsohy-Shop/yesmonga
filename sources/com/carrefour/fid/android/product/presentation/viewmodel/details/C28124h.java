package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.h */
public final class C28124h implements C10324h<C28123g> {

    /* renamed from: a */
    public final Provider<C13783a> f68116a;

    public C28124h(Provider<C13783a> provider) {
        this.f68116a = provider;
    }

    /* renamed from: a */
    public static C28124h m117752a(Provider<C13783a> provider) {
        return new C28124h(provider);
    }

    /* renamed from: c */
    public static C28123g m117753c(C13783a aVar) {
        return new C28123g(aVar);
    }

    /* renamed from: b */
    public C28123g get() {
        return m117753c(this.f68116a.get());
    }
}
