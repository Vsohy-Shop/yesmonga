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
/* renamed from: com.carrefour.fid.android.domain.interactors.arsenal.a */
public final class C37548a implements C10324h<GetArsenalBannersUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94304a;

    /* renamed from: b */
    public final Provider<ArsenalGameRepository> f94305b;

    /* renamed from: c */
    public final Provider<LoginRepository> f94306c;

    public C37548a(Provider<C37807b> provider, Provider<ArsenalGameRepository> provider2, Provider<LoginRepository> provider3) {
        this.f94304a = provider;
        this.f94305b = provider2;
        this.f94306c = provider3;
    }

    /* renamed from: a */
    public static C37548a m154066a(Provider<C37807b> provider, Provider<ArsenalGameRepository> provider2, Provider<LoginRepository> provider3) {
        return new C37548a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static GetArsenalBannersUseCase m154067c(C37807b bVar, ArsenalGameRepository arsenalGameRepository, LoginRepository loginRepository) {
        return new GetArsenalBannersUseCase(bVar, arsenalGameRepository, loginRepository);
    }

    /* renamed from: b */
    public GetArsenalBannersUseCase get() {
        return m154067c(this.f94304a.get(), this.f94305b.get(), this.f94306c.get());
    }
}
