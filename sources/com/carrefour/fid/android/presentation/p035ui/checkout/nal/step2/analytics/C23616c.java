package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.analytics.c */
public final class C23616c implements C10324h<C23615b> {

    /* renamed from: a */
    public final Provider<C13783a> f59569a;

    public C23616c(Provider<C13783a> provider) {
        this.f59569a = provider;
    }

    /* renamed from: a */
    public static C23616c m104929a(Provider<C13783a> provider) {
        return new C23616c(provider);
    }

    /* renamed from: c */
    public static C23615b m104930c(C13783a aVar) {
        return new C23615b(aVar);
    }

    /* renamed from: b */
    public C23615b get() {
        return m104930c(this.f59569a.get());
    }
}
