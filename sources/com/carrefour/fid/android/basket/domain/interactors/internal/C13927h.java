package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.h */
public final class C13927h implements C10324h<HandleBasketExpiredFacilityStoreUseCase> {

    /* renamed from: a */
    public final Provider<C37816e> f33994a;

    /* renamed from: b */
    public final Provider<C37823k> f33995b;

    /* renamed from: c */
    public final Provider<C37841v> f33996c;

    /* renamed from: d */
    public final Provider<C37578j0> f33997d;

    public C13927h(Provider<C37816e> provider, Provider<C37823k> provider2, Provider<C37841v> provider3, Provider<C37578j0> provider4) {
        this.f33994a = provider;
        this.f33995b = provider2;
        this.f33996c = provider3;
        this.f33997d = provider4;
    }

    /* renamed from: a */
    public static C13927h m59069a(Provider<C37816e> provider, Provider<C37823k> provider2, Provider<C37841v> provider3, Provider<C37578j0> provider4) {
        return new C13927h(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static HandleBasketExpiredFacilityStoreUseCase m59070c(C37816e eVar, C37823k kVar, C37841v vVar, C37578j0 j0Var) {
        return new HandleBasketExpiredFacilityStoreUseCase(eVar, kVar, vVar, j0Var);
    }

    /* renamed from: b */
    public HandleBasketExpiredFacilityStoreUseCase get() {
        return m59070c(this.f33994a.get(), this.f33995b.get(), this.f33996c.get(), this.f33997d.get());
    }
}
