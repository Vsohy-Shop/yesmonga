package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.standard.d */
public final class C13956d implements C10324h<StdSynchronizeCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<StdCheckBasketPermissionsUseCase> f34070a;

    /* renamed from: b */
    public final Provider<HandleBasketExceptionUseCase> f34071b;

    /* renamed from: c */
    public final Provider<BasketRepository> f34072c;

    public C13956d(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<HandleBasketExceptionUseCase> provider2, Provider<BasketRepository> provider3) {
        this.f34070a = provider;
        this.f34071b = provider2;
        this.f34072c = provider3;
    }

    /* renamed from: a */
    public static C13956d m59150a(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<HandleBasketExceptionUseCase> provider2, Provider<BasketRepository> provider3) {
        return new C13956d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static StdSynchronizeCurrentBasketUseCase m59151c(StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, HandleBasketExceptionUseCase handleBasketExceptionUseCase, BasketRepository basketRepository) {
        return new StdSynchronizeCurrentBasketUseCase(stdCheckBasketPermissionsUseCase, handleBasketExceptionUseCase, basketRepository);
    }

    /* renamed from: b */
    public StdSynchronizeCurrentBasketUseCase get() {
        return m59151c(this.f34070a.get(), this.f34071b.get(), this.f34072c.get());
    }
}
