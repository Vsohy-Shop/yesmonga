package com.carrefour.fid.android.domain.interactors.arsenal;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.ArsenalGameRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.arsenal.b */
public final class C37549b implements C10324h<GetArsenalJOBannerUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94307a;

    /* renamed from: b */
    public final Provider<ArsenalGameRepository> f94308b;

    /* renamed from: c */
    public final Provider<LoginRepository> f94309c;

    public C37549b(Provider<C37807b> provider, Provider<ArsenalGameRepository> provider2, Provider<LoginRepository> provider3) {
        this.f94307a = provider;
        this.f94308b = provider2;
        this.f94309c = provider3;
    }

    /* renamed from: a */
    public static C37549b m154069a(Provider<C37807b> provider, Provider<ArsenalGameRepository> provider2, Provider<LoginRepository> provider3) {
        return new C37549b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static GetArsenalJOBannerUseCase m154070c(C37807b bVar, ArsenalGameRepository arsenalGameRepository, LoginRepository loginRepository) {
        return new GetArsenalJOBannerUseCase(bVar, arsenalGameRepository, loginRepository);
    }

    /* renamed from: b */
    public GetArsenalJOBannerUseCase get() {
        return m154070c(this.f94307a.get(), this.f94308b.get(), this.f94309c.get());
    }
}
