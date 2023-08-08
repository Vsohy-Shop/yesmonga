package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.provider.headers.C36560c;
import com.carrefour.fid.android.data.service.C36625e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.f */
public final class C36599f implements C10324h<CouponsRepository> {

    /* renamed from: a */
    public final Provider<C36625e> f90478a;

    /* renamed from: b */
    public final Provider<C36560c> f90479b;

    public C36599f(Provider<C36625e> provider, Provider<C36560c> provider2) {
        this.f90478a = provider;
        this.f90479b = provider2;
    }

    /* renamed from: a */
    public static C36599f m150176a(Provider<C36625e> provider, Provider<C36560c> provider2) {
        return new C36599f(provider, provider2);
    }

    /* renamed from: c */
    public static CouponsRepository m150177c(C36625e eVar, C36560c cVar) {
        return new CouponsRepository(eVar, cVar);
    }

    /* renamed from: b */
    public CouponsRepository get() {
        return m150177c(this.f90478a.get(), this.f90479b.get());
    }
}
