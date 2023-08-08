package com.carrefour.fid.android.data.repositories.datasource.memos;

import com.carrefour.fid.android.data.provider.headers.C36581w;
import com.carrefour.fid.android.data.service.C36636o;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.datasource.memos.c */
public final class C36597c implements C10324h<MemoRemoteDatasource> {

    /* renamed from: a */
    public final Provider<C36636o> f90473a;

    /* renamed from: b */
    public final Provider<C36581w> f90474b;

    public C36597c(Provider<C36636o> provider, Provider<C36581w> provider2) {
        this.f90473a = provider;
        this.f90474b = provider2;
    }

    /* renamed from: a */
    public static C36597c m150170a(Provider<C36636o> provider, Provider<C36581w> provider2) {
        return new C36597c(provider, provider2);
    }

    /* renamed from: c */
    public static MemoRemoteDatasource m150171c(C36636o oVar, C36581w wVar) {
        return new MemoRemoteDatasource(oVar, wVar);
    }

    /* renamed from: b */
    public MemoRemoteDatasource get() {
        return m150171c(this.f90473a.get(), this.f90474b.get());
    }
}
