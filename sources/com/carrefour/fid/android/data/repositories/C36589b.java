package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.mapper.C36458a0;
import com.carrefour.fid.android.data.entities.mapper.C36537w;
import com.carrefour.fid.android.data.entities.mapper.C36544y;
import com.carrefour.fid.android.data.provider.headers.C36577s;
import com.carrefour.fid.android.data.service.C36621b;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.b */
public final class C36589b implements C10324h<APIMProductsRepository> {

    /* renamed from: a */
    public final Provider<C36621b> f90453a;

    /* renamed from: b */
    public final Provider<C36544y> f90454b;

    /* renamed from: c */
    public final Provider<C36537w> f90455c;

    /* renamed from: d */
    public final Provider<C36458a0> f90456d;

    /* renamed from: e */
    public final Provider<C36577s> f90457e;

    /* renamed from: f */
    public final Provider<C37694a> f90458f;

    public C36589b(Provider<C36621b> provider, Provider<C36544y> provider2, Provider<C36537w> provider3, Provider<C36458a0> provider4, Provider<C36577s> provider5, Provider<C37694a> provider6) {
        this.f90453a = provider;
        this.f90454b = provider2;
        this.f90455c = provider3;
        this.f90456d = provider4;
        this.f90457e = provider5;
        this.f90458f = provider6;
    }

    /* renamed from: a */
    public static C36589b m150119a(Provider<C36621b> provider, Provider<C36544y> provider2, Provider<C36537w> provider3, Provider<C36458a0> provider4, Provider<C36577s> provider5, Provider<C37694a> provider6) {
        return new C36589b(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static APIMProductsRepository m150120c(C36621b bVar, C36544y yVar, C36537w wVar, C36458a0 a0Var, C36577s sVar, C37694a aVar) {
        return new APIMProductsRepository(bVar, yVar, wVar, a0Var, sVar, aVar);
    }

    /* renamed from: b */
    public APIMProductsRepository get() {
        return m150120c(this.f90453a.get(), this.f90454b.get(), this.f90455c.get(), this.f90456d.get(), this.f90457e.get(), this.f90458f.get());
    }
}
