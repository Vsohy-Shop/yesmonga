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
/* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.a */
public final class C37529a implements C10324h<AddMemoListUseCase> {

    /* renamed from: a */
    public final Provider<C38197f> f94276a;

    public C37529a(Provider<C38197f> provider) {
        this.f94276a = provider;
    }

    /* renamed from: a */
    public static C37529a m154025a(Provider<C38197f> provider) {
        return new C37529a(provider);
    }

    /* renamed from: c */
    public static AddMemoListUseCase m154026c(C38197f fVar) {
        return new AddMemoListUseCase(fVar);
    }

    /* renamed from: b */
    public AddMemoListUseCase get() {
        return m154026c(this.f94276a.get());
    }
}
