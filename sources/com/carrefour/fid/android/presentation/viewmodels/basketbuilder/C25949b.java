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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.b */
public final class C25949b implements C10324h<C25948a> {

    /* renamed from: a */
    public final Provider<C13783a> f63480a;

    public C25949b(Provider<C13783a> provider) {
        this.f63480a = provider;
    }

    /* renamed from: a */
    public static C25949b m111113a(Provider<C13783a> provider) {
        return new C25949b(provider);
    }

    /* renamed from: c */
    public static C25948a m111114c(C13783a aVar) {
        return new C25948a(aVar);
    }

    /* renamed from: b */
    public C25948a get() {
        return m111114c(this.f63480a.get());
    }
}
