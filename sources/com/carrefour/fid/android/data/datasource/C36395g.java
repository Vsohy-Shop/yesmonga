package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.domain.repositories.C38195d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.datasource.g */
public final class C36395g implements C10324h<LuckyCartGateway> {

    /* renamed from: a */
    public final Provider<C38195d> f90039a;

    public C36395g(Provider<C38195d> provider) {
        this.f90039a = provider;
    }

    /* renamed from: a */
    public static C36395g m149317a(Provider<C38195d> provider) {
        return new C36395g(provider);
    }

    /* renamed from: c */
    public static LuckyCartGateway m149318c(C38195d dVar) {
        return new LuckyCartGateway(dVar);
    }

    /* renamed from: b */
    public LuckyCartGateway get() {
        return m149318c(this.f90039a.get());
    }
}
