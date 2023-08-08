package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.j0 */
public final class C13934j0 implements C10324h<BasketRemovePromotionFromCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<StdCheckBasketPermissionsUseCase> f34015a;

    /* renamed from: b */
    public final Provider<BasketRepository> f34016b;

    public C13934j0(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<BasketRepository> provider2) {
        this.f34015a = provider;
        this.f34016b = provider2;
    }

    /* renamed from: a */
    public static C13934j0 m59090a(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<BasketRepository> provider2) {
        return new C13934j0(provider, provider2);
    }

    /* renamed from: c */
    public static BasketRemovePromotionFromCurrentBasketUseCase m59091c(StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, BasketRepository basketRepository) {
        return new BasketRemovePromotionFromCurrentBasketUseCase(stdCheckBasketPermissionsUseCase, basketRepository);
    }

    /* renamed from: b */
    public BasketRemovePromotionFromCurrentBasketUseCase get() {
        return m59091c(this.f34015a.get(), this.f34016b.get());
    }
}
