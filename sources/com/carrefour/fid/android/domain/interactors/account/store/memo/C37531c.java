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
/* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.c */
public final class C37531c implements C10324h<DeleteMemoListUseCase> {

    /* renamed from: a */
    public final Provider<C38197f> f94278a;

    public C37531c(Provider<C38197f> provider) {
        this.f94278a = provider;
    }

    /* renamed from: a */
    public static C37531c m154031a(Provider<C38197f> provider) {
        return new C37531c(provider);
    }

    /* renamed from: c */
    public static DeleteMemoListUseCase m154032c(C38197f fVar) {
        return new DeleteMemoListUseCase(fVar);
    }

    /* renamed from: b */
    public DeleteMemoListUseCase get() {
        return m154032c(this.f94278a.get());
    }
}
