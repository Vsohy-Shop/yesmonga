package com.carrefour.fid.android.performance.p063di;

import com.carrefour.fid.android.performance.C38326b;
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
/* renamed from: com.carrefour.fid.android.performance.di.c */
public final class C38331c implements C10324h<C38326b> {

    /* renamed from: a */
    public final C38329a f97081a;

    /* renamed from: b */
    public final Provider<C33314e> f97082b;

    public C38331c(C38329a aVar, Provider<C33314e> provider) {
        this.f97081a = aVar;
        this.f97082b = provider;
    }

    /* renamed from: a */
    public static C38331c m158796a(C38329a aVar, Provider<C33314e> provider) {
        return new C38331c(aVar, provider);
    }

    /* renamed from: c */
    public static C38326b m158797c(C38329a aVar, C33314e eVar) {
        return (C38326b) C10335o.m38554f(aVar.mo121187b(eVar));
    }

    /* renamed from: b */
    public C38326b get() {
        return m158797c(this.f97081a, this.f97082b.get());
    }
}
