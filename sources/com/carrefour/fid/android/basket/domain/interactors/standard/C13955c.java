package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.FetchBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.standard.c */
public final class C13955c implements C10324h<StdRetrieveBasketUseCase> {

    /* renamed from: a */
    public final Provider<FetchBasketUseCase> f34066a;

    /* renamed from: b */
    public final Provider<InitializeBasketUseCase> f34067b;

    /* renamed from: c */
    public final Provider<C37823k> f34068c;

    /* renamed from: d */
    public final Provider<UpdateBasketTypeUseCase> f34069d;

    public C13955c(Provider<FetchBasketUseCase> provider, Provider<InitializeBasketUseCase> provider2, Provider<C37823k> provider3, Provider<UpdateBasketTypeUseCase> provider4) {
        this.f34066a = provider;
        this.f34067b = provider2;
        this.f34068c = provider3;
        this.f34069d = provider4;
    }

    /* renamed from: a */
    public static C13955c m59147a(Provider<FetchBasketUseCase> provider, Provider<InitializeBasketUseCase> provider2, Provider<C37823k> provider3, Provider<UpdateBasketTypeUseCase> provider4) {
        return new C13955c(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static StdRetrieveBasketUseCase m59148c(FetchBasketUseCase fetchBasketUseCase, InitializeBasketUseCase initializeBasketUseCase, C37823k kVar, UpdateBasketTypeUseCase updateBasketTypeUseCase) {
        return new StdRetrieveBasketUseCase(fetchBasketUseCase, initializeBasketUseCase, kVar, updateBasketTypeUseCase);
    }

    /* renamed from: b */
    public StdRetrieveBasketUseCase get() {
        return m59148c(this.f34066a.get(), this.f34067b.get(), this.f34068c.get(), this.f34069d.get());
    }
}
