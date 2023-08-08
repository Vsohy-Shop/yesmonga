package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.g */
public final class C25957g implements C10324h<C25956f> {

    /* renamed from: a */
    public final Provider<C13783a> f63487a;

    public C25957g(Provider<C13783a> provider) {
        this.f63487a = provider;
    }

    /* renamed from: a */
    public static C25957g m111135a(Provider<C13783a> provider) {
        return new C25957g(provider);
    }

    /* renamed from: c */
    public static C25956f m111136c(C13783a aVar) {
        return new C25956f(aVar);
    }

    /* renamed from: b */
    public C25956f get() {
        return m111136c(this.f63487a.get());
    }
}
