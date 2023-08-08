package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.provider.headers.C36575q;
import com.carrefour.fid.android.data.service.C36636o;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.repositories.w */
public final class C36616w implements C10324h<RecommendedNeedsRepository> {

    /* renamed from: a */
    public final Provider<C36636o> f90528a;

    /* renamed from: b */
    public final Provider<C36575q> f90529b;

    public C36616w(Provider<C36636o> provider, Provider<C36575q> provider2) {
        this.f90528a = provider;
        this.f90529b = provider2;
    }

    /* renamed from: a */
    public static C36616w m150226a(Provider<C36636o> provider, Provider<C36575q> provider2) {
        return new C36616w(provider, provider2);
    }

    /* renamed from: c */
    public static RecommendedNeedsRepository m150227c(C36636o oVar, C36575q qVar) {
        return new RecommendedNeedsRepository(oVar, qVar);
    }

    /* renamed from: b */
    public RecommendedNeedsRepository get() {
        return m150227c(this.f90528a.get(), this.f90529b.get());
    }
}
