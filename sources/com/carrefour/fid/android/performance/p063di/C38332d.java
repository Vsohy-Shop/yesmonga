package com.carrefour.fid.android.performance.p063di;

import com.carrefour.fid.android.performance.C38328d;
import com.google.firebase.perf.C33314e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.performance.di.d */
public final class C38332d implements C10324h<C38328d> {

    /* renamed from: a */
    public final C38329a f97083a;

    /* renamed from: b */
    public final Provider<C33314e> f97084b;

    public C38332d(C38329a aVar, Provider<C33314e> provider) {
        this.f97083a = aVar;
        this.f97084b = provider;
    }

    /* renamed from: a */
    public static C38332d m158799a(C38329a aVar, Provider<C33314e> provider) {
        return new C38332d(aVar, provider);
    }

    /* renamed from: c */
    public static C38328d m158800c(C38329a aVar, C33314e eVar) {
        return (C38328d) C10335o.m38554f(aVar.mo121188c(eVar));
    }

    /* renamed from: b */
    public C38328d get() {
        return m158800c(this.f97083a, this.f97084b.get());
    }
}
