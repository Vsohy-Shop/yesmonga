package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.basket.v */
public final class C37601v implements C10324h<MixingProductsRemoteConfigUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94354a;

    public C37601v(Provider<C37807b> provider) {
        this.f94354a = provider;
    }

    /* renamed from: a */
    public static C37601v m154172a(Provider<C37807b> provider) {
        return new C37601v(provider);
    }

    /* renamed from: c */
    public static MixingProductsRemoteConfigUseCase m154173c(C37807b bVar) {
        return new MixingProductsRemoteConfigUseCase(bVar);
    }

    /* renamed from: b */
    public MixingProductsRemoteConfigUseCase get() {
        return m154173c(this.f94354a.get());
    }
}
