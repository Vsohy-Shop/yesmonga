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
/* renamed from: com.carrefour.fid.android.performance.c */
public final class C38327c implements C10324h<C38326b> {

    /* renamed from: a */
    public final Provider<C33314e> f97078a;

    public C38327c(Provider<C33314e> provider) {
        this.f97078a = provider;
    }

    /* renamed from: a */
    public static C38327c m158786a(Provider<C33314e> provider) {
        return new C38327c(provider);
    }

    /* renamed from: c */
    public static C38326b m158787c(C33314e eVar) {
        return new C38326b(eVar);
    }

    /* renamed from: b */
    public C38326b get() {
        return m158787c(this.f97078a.get());
    }
}
