package com.carrefour.fid.android.data.entities.mapper;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.entities.mapper.l */
public final class C36505l implements C10324h<C36501k> {

    /* renamed from: a */
    public final Provider<C36457a> f90196a;

    /* renamed from: b */
    public final Provider<C36494i> f90197b;

    public C36505l(Provider<C36457a> provider, Provider<C36494i> provider2) {
        this.f90196a = provider;
        this.f90197b = provider2;
    }

    /* renamed from: a */
    public static C36505l m149706a(Provider<C36457a> provider, Provider<C36494i> provider2) {
        return new C36505l(provider, provider2);
    }

    /* renamed from: c */
    public static C36501k m149707c(C36457a aVar, C36494i iVar) {
        return new C36501k(aVar, iVar);
    }

    /* renamed from: b */
    public C36501k get() {
        return m149707c(this.f90196a.get(), this.f90197b.get());
    }
}
