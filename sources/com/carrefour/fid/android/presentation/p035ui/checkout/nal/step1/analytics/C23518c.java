package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.analytics.c */
public final class C23518c implements C10324h<C23517b> {

    /* renamed from: a */
    public final Provider<C13783a> f59435a;

    public C23518c(Provider<C13783a> provider) {
        this.f59435a = provider;
    }

    /* renamed from: a */
    public static C23518c m104705a(Provider<C13783a> provider) {
        return new C23518c(provider);
    }

    /* renamed from: c */
    public static C23517b m104706c(C13783a aVar) {
        return new C23517b(aVar);
    }

    /* renamed from: b */
    public C23517b get() {
        return m104706c(this.f59435a.get());
    }
}
