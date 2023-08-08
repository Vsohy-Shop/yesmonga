package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics;

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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.analytics.b */
public final class C26093b implements C10324h<C26092a> {

    /* renamed from: a */
    public final Provider<C13783a> f63778a;

    /* renamed from: b */
    public final Provider<C28994a> f63779b;

    public C26093b(Provider<C13783a> provider, Provider<C28994a> provider2) {
        this.f63778a = provider;
        this.f63779b = provider2;
    }

    /* renamed from: a */
    public static C26093b m111578a(Provider<C13783a> provider, Provider<C28994a> provider2) {
        return new C26093b(provider, provider2);
    }

    /* renamed from: c */
    public static C26092a m111579c(C13783a aVar, C28994a aVar2) {
        return new C26092a(aVar, aVar2);
    }

    /* renamed from: b */
    public C26092a get() {
        return m111579c(this.f63778a.get(), this.f63779b.get());
    }
}
