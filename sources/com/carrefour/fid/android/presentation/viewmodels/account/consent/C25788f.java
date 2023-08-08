package com.carrefour.fid.android.presentation.viewmodels.account.consent;

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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.f */
public final class C25788f implements C10324h<C25786e> {

    /* renamed from: a */
    public final Provider<C28994a> f63155a;

    /* renamed from: b */
    public final Provider<C13783a> f63156b;

    public C25788f(Provider<C28994a> provider, Provider<C13783a> provider2) {
        this.f63155a = provider;
        this.f63156b = provider2;
    }

    /* renamed from: a */
    public static C25788f m110601a(Provider<C28994a> provider, Provider<C13783a> provider2) {
        return new C25788f(provider, provider2);
    }

    /* renamed from: c */
    public static C25786e m110602c(C28994a aVar, C13783a aVar2) {
        return new C25786e(aVar, aVar2);
    }

    /* renamed from: b */
    public C25786e get() {
        return m110602c(this.f63155a.get(), this.f63156b.get());
    }
}
