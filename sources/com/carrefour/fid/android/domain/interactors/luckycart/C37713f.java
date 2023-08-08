package com.carrefour.fid.android.domain.interactors.luckycart;

import com.carrefour.fid.android.data.datasource.LuckyCartGateway;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.repositories.C38195d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.f */
public final class C37713f implements C10324h<LuckyCartGetLuckyCartBannerDetailsUseCase> {

    /* renamed from: a */
    public final Provider<C38195d> f94597a;

    /* renamed from: b */
    public final Provider<LuckyCartGateway> f94598b;

    /* renamed from: c */
    public final Provider<C37807b> f94599c;

    public C37713f(Provider<C38195d> provider, Provider<LuckyCartGateway> provider2, Provider<C37807b> provider3) {
        this.f94597a = provider;
        this.f94598b = provider2;
        this.f94599c = provider3;
    }

    /* renamed from: a */
    public static C37713f m154524a(Provider<C38195d> provider, Provider<LuckyCartGateway> provider2, Provider<C37807b> provider3) {
        return new C37713f(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static LuckyCartGetLuckyCartBannerDetailsUseCase m154525c(C38195d dVar, LuckyCartGateway luckyCartGateway, C37807b bVar) {
        return new LuckyCartGetLuckyCartBannerDetailsUseCase(dVar, luckyCartGateway, bVar);
    }

    /* renamed from: b */
    public LuckyCartGetLuckyCartBannerDetailsUseCase get() {
        return m154525c(this.f94597a.get(), this.f94598b.get(), this.f94599c.get());
    }
}
