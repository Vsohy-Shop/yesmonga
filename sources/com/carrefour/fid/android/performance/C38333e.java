package com.carrefour.fid.android.performance;

import com.google.firebase.perf.C33314e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.performance.e */
public final class C38333e implements C10324h<C38328d> {

    /* renamed from: a */
    public final Provider<C33314e> f97085a;

    public C38333e(Provider<C33314e> provider) {
        this.f97085a = provider;
    }

    /* renamed from: a */
    public static C38333e m158802a(Provider<C33314e> provider) {
        return new C38333e(provider);
    }

    /* renamed from: c */
    public static C38328d m158803c(C33314e eVar) {
        return new C38328d(eVar);
    }

    /* renamed from: b */
    public C38328d get() {
        return m158803c(this.f97085a.get());
    }
}
