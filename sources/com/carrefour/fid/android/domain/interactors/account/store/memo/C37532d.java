package com.carrefour.fid.android.domain.interactors.account.store.memo;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.repositories.C38197f;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.d */
public final class C37532d implements C10324h<GetMemoListUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f94279a;

    /* renamed from: b */
    public final Provider<C38197f> f94280b;

    public C37532d(Provider<LoginRepository> provider, Provider<C38197f> provider2) {
        this.f94279a = provider;
        this.f94280b = provider2;
    }

    /* renamed from: a */
    public static C37532d m154034a(Provider<LoginRepository> provider, Provider<C38197f> provider2) {
        return new C37532d(provider, provider2);
    }

    /* renamed from: c */
    public static GetMemoListUseCase m154035c(LoginRepository loginRepository, C38197f fVar) {
        return new GetMemoListUseCase(loginRepository, fVar);
    }

    /* renamed from: b */
    public GetMemoListUseCase get() {
        return m154035c(this.f94279a.get(), this.f94280b.get());
    }
}
