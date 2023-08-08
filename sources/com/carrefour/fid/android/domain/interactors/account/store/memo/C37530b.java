package com.carrefour.fid.android.domain.interactors.account.store.memo;

import com.carrefour.fid.android.domain.repositories.C38197f;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.b */
public final class C37530b implements C10324h<ClearMemoListUseCase> {

    /* renamed from: a */
    public final Provider<C38197f> f94277a;

    public C37530b(Provider<C38197f> provider) {
        this.f94277a = provider;
    }

    /* renamed from: a */
    public static C37530b m154028a(Provider<C38197f> provider) {
        return new C37530b(provider);
    }

    /* renamed from: c */
    public static ClearMemoListUseCase m154029c(C38197f fVar) {
        return new ClearMemoListUseCase(fVar);
    }

    /* renamed from: b */
    public ClearMemoListUseCase get() {
        return m154029c(this.f94277a.get());
    }
}
