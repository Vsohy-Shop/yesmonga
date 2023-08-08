package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import com.carrefour.fid.android.data.entities.mapper.C36474d0;
import com.carrefour.fid.android.data.provider.headers.C36562e;
import com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider;
import com.carrefour.fid.android.data.service.C36627f;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.repositories.g */
public final class C36600g implements C10324h<CriteoRepository> {

    /* renamed from: a */
    public final Provider<C36627f> f90480a;

    /* renamed from: b */
    public final Provider<C36474d0> f90481b;

    /* renamed from: c */
    public final Provider<C36562e> f90482c;

    /* renamed from: d */
    public final Provider<CriteoParametersProvider> f90483d;

    /* renamed from: e */
    public final Provider<Context> f90484e;

    public C36600g(Provider<C36627f> provider, Provider<C36474d0> provider2, Provider<C36562e> provider3, Provider<CriteoParametersProvider> provider4, Provider<Context> provider5) {
        this.f90480a = provider;
        this.f90481b = provider2;
        this.f90482c = provider3;
        this.f90483d = provider4;
        this.f90484e = provider5;
    }

    /* renamed from: a */
    public static C36600g m150179a(Provider<C36627f> provider, Provider<C36474d0> provider2, Provider<C36562e> provider3, Provider<CriteoParametersProvider> provider4, Provider<Context> provider5) {
        return new C36600g(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static CriteoRepository m150180c(C36627f fVar, C36474d0 d0Var, C36562e eVar, CriteoParametersProvider criteoParametersProvider, Context context) {
        return new CriteoRepository(fVar, d0Var, eVar, criteoParametersProvider, context);
    }

    /* renamed from: b */
    public CriteoRepository get() {
        return m150180c(this.f90480a.get(), this.f90481b.get(), this.f90482c.get(), this.f90483d.get(), this.f90484e.get());
    }
}
