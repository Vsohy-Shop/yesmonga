package com.carrefour.fid.android.data.provider.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.provider.headers.t */
public final class C36578t implements C10324h<C36577s> {

    /* renamed from: a */
    public final Provider<C28640a> f90314a;

    public C36578t(Provider<C28640a> provider) {
        this.f90314a = provider;
    }

    /* renamed from: a */
    public static C36578t m149937a(Provider<C28640a> provider) {
        return new C36578t(provider);
    }

    /* renamed from: c */
    public static C36577s m149938c(C28640a aVar) {
        return new C36577s(aVar);
    }

    /* renamed from: b */
    public C36577s get() {
        return m149938c(this.f90314a.get());
    }
}
