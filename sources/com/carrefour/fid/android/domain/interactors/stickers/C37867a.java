package com.carrefour.fid.android.domain.interactors.stickers;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.StickersRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.stickers.a */
public final class C37867a implements C10324h<GetStickersContentUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94964a;

    /* renamed from: b */
    public final Provider<StickersRepository> f94965b;

    /* renamed from: c */
    public final Provider<LoginRepository> f94966c;

    public C37867a(Provider<C37807b> provider, Provider<StickersRepository> provider2, Provider<LoginRepository> provider3) {
        this.f94964a = provider;
        this.f94965b = provider2;
        this.f94966c = provider3;
    }

    /* renamed from: a */
    public static C37867a m155095a(Provider<C37807b> provider, Provider<StickersRepository> provider2, Provider<LoginRepository> provider3) {
        return new C37867a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static GetStickersContentUseCase m155096c(C37807b bVar, StickersRepository stickersRepository, LoginRepository loginRepository) {
        return new GetStickersContentUseCase(bVar, stickersRepository, loginRepository);
    }

    /* renamed from: b */
    public GetStickersContentUseCase get() {
        return m155096c(this.f94964a.get(), this.f94965b.get(), this.f94966c.get());
    }
}
