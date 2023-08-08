package com.carrefour.fid.android.domain.interactors.luckycart;

import com.carrefour.fid.android.data.datasource.LuckyCartGateway;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.g */
public final class C37714g implements C10324h<LuckyCartGetLuckyCartBannersUseCase> {

    /* renamed from: a */
    public final Provider<LuckyCartGateway> f94600a;

    /* renamed from: b */
    public final Provider<C37807b> f94601b;

    /* renamed from: c */
    public final Provider<C37823k> f94602c;

    public C37714g(Provider<LuckyCartGateway> provider, Provider<C37807b> provider2, Provider<C37823k> provider3) {
        this.f94600a = provider;
        this.f94601b = provider2;
        this.f94602c = provider3;
    }

    /* renamed from: a */
    public static C37714g m154527a(Provider<LuckyCartGateway> provider, Provider<C37807b> provider2, Provider<C37823k> provider3) {
        return new C37714g(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static LuckyCartGetLuckyCartBannersUseCase m154528c(LuckyCartGateway luckyCartGateway, C37807b bVar, C37823k kVar) {
        return new LuckyCartGetLuckyCartBannersUseCase(luckyCartGateway, bVar, kVar);
    }

    /* renamed from: b */
    public LuckyCartGetLuckyCartBannersUseCase get() {
        return m154528c(this.f94600a.get(), this.f94601b.get(), this.f94602c.get());
    }
}
