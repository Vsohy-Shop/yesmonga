package com.carrefour.fid.android.data.entities.mapper;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.entities.mapper.x */
public final class C36541x implements C10324h<C36537w> {

    /* renamed from: a */
    public final Provider<C36487g> f90242a;

    /* renamed from: b */
    public final Provider<C36494i> f90243b;

    /* renamed from: c */
    public final Provider<C36529u> f90244c;

    public C36541x(Provider<C36487g> provider, Provider<C36494i> provider2, Provider<C36529u> provider3) {
        this.f90242a = provider;
        this.f90243b = provider2;
        this.f90244c = provider3;
    }

    /* renamed from: a */
    public static C36541x m149808a(Provider<C36487g> provider, Provider<C36494i> provider2, Provider<C36529u> provider3) {
        return new C36541x(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C36537w m149809c(C36487g gVar, C36494i iVar, C36529u uVar) {
        return new C36537w(gVar, iVar, uVar);
    }

    /* renamed from: b */
    public C36537w get() {
        return m149809c(this.f90242a.get(), this.f90243b.get(), this.f90244c.get());
    }
}
