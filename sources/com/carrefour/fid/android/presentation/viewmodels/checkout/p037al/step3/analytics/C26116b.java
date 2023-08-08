package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.analytics.b */
public final class C26116b implements C10324h<C26115a> {

    /* renamed from: a */
    public final Provider<C13783a> f63860a;

    /* renamed from: b */
    public final Provider<C28994a> f63861b;

    public C26116b(Provider<C13783a> provider, Provider<C28994a> provider2) {
        this.f63860a = provider;
        this.f63861b = provider2;
    }

    /* renamed from: a */
    public static C26116b m111675a(Provider<C13783a> provider, Provider<C28994a> provider2) {
        return new C26116b(provider, provider2);
    }

    /* renamed from: c */
    public static C26115a m111676c(C13783a aVar, C28994a aVar2) {
        return new C26115a(aVar, aVar2);
    }

    /* renamed from: b */
    public C26115a get() {
        return m111676c(this.f63860a.get(), this.f63861b.get());
    }
}
