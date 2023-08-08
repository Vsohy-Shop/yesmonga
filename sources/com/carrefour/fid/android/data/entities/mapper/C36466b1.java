package com.carrefour.fid.android.data.entities.mapper;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.entities.mapper.b1 */
public final class C36466b1 implements C10324h<C36459a1> {

    /* renamed from: a */
    public final Provider<C36531u0> f90155a;

    /* renamed from: b */
    public final Provider<C36540w0> f90156b;

    /* renamed from: c */
    public final Provider<C36546y0> f90157c;

    /* renamed from: d */
    public final Provider<C36465b0> f90158d;

    public C36466b1(Provider<C36531u0> provider, Provider<C36540w0> provider2, Provider<C36546y0> provider3, Provider<C36465b0> provider4) {
        this.f90155a = provider;
        this.f90156b = provider2;
        this.f90157c = provider3;
        this.f90158d = provider4;
    }

    /* renamed from: a */
    public static C36466b1 m149588a(Provider<C36531u0> provider, Provider<C36540w0> provider2, Provider<C36546y0> provider3, Provider<C36465b0> provider4) {
        return new C36466b1(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C36459a1 m149589c(C36531u0 u0Var, C36540w0 w0Var, C36546y0 y0Var, C36465b0 b0Var) {
        return new C36459a1(u0Var, w0Var, y0Var, b0Var);
    }

    /* renamed from: b */
    public C36459a1 get() {
        return m149589c(this.f90155a.get(), this.f90156b.get(), this.f90157c.get(), this.f90158d.get());
    }
}
