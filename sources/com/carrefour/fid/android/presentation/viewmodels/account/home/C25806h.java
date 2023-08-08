package com.carrefour.fid.android.presentation.viewmodels.account.home;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.home.h */
public final class C25806h implements C10324h<C25805g> {

    /* renamed from: a */
    public final Provider<C13783a> f63209a;

    public C25806h(Provider<C13783a> provider) {
        this.f63209a = provider;
    }

    /* renamed from: a */
    public static C25806h m110677a(Provider<C13783a> provider) {
        return new C25806h(provider);
    }

    /* renamed from: c */
    public static C25805g m110678c(C13783a aVar) {
        return new C25805g(aVar);
    }

    /* renamed from: b */
    public C25805g get() {
        return m110678c(this.f63209a.get());
    }
}
