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
/* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.e */
public final class C37533e implements C10324h<UpdateMemoListUseCase> {

    /* renamed from: a */
    public final Provider<C38197f> f94281a;

    public C37533e(Provider<C38197f> provider) {
        this.f94281a = provider;
    }

    /* renamed from: a */
    public static C37533e m154037a(Provider<C38197f> provider) {
        return new C37533e(provider);
    }

    /* renamed from: c */
    public static UpdateMemoListUseCase m154038c(C38197f fVar) {
        return new UpdateMemoListUseCase(fVar);
    }

    /* renamed from: b */
    public UpdateMemoListUseCase get() {
        return m154038c(this.f94281a.get());
    }
}
