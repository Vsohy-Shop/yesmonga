package com.carrefour.fid.android.data.entities.mapper;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.entities.mapper.n */
public final class C36509n implements C10324h<C36507m> {

    /* renamed from: a */
    public final Provider<C36518q> f90202a;

    /* renamed from: b */
    public final Provider<C36512o> f90203b;

    public C36509n(Provider<C36518q> provider, Provider<C36512o> provider2) {
        this.f90202a = provider;
        this.f90203b = provider2;
    }

    /* renamed from: a */
    public static C36509n m149714a(Provider<C36518q> provider, Provider<C36512o> provider2) {
        return new C36509n(provider, provider2);
    }

    /* renamed from: c */
    public static C36507m m149715c(C36518q qVar, C36512o oVar) {
        return new C36507m(qVar, oVar);
    }

    /* renamed from: b */
    public C36507m get() {
        return m149715c(this.f90202a.get(), this.f90203b.get());
    }
}
