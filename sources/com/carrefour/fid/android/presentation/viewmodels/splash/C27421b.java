package com.carrefour.fid.android.presentation.viewmodels.splash;

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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.b */
public final class C27421b implements C10324h<C27420a> {

    /* renamed from: a */
    public final Provider<C13783a> f66523a;

    /* renamed from: b */
    public final Provider<C28994a> f66524b;

    public C27421b(Provider<C13783a> provider, Provider<C28994a> provider2) {
        this.f66523a = provider;
        this.f66524b = provider2;
    }

    /* renamed from: a */
    public static C27421b m115474a(Provider<C13783a> provider, Provider<C28994a> provider2) {
        return new C27421b(provider, provider2);
    }

    /* renamed from: c */
    public static C27420a m115475c(C13783a aVar, C28994a aVar2) {
        return new C27420a(aVar, aVar2);
    }

    /* renamed from: b */
    public C27420a get() {
        return m115475c(this.f66523a.get(), this.f66524b.get());
    }
}
