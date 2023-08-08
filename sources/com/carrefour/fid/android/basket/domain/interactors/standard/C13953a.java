package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.DeleteBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.standard.a */
public final class C13953a implements C10324h<StdBasketDeleteCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<StdCheckBasketPermissionsUseCase> f34062a;

    /* renamed from: b */
    public final Provider<DeleteBasketUseCase> f34063b;

    public C13953a(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<DeleteBasketUseCase> provider2) {
        this.f34062a = provider;
        this.f34063b = provider2;
    }

    /* renamed from: a */
    public static C13953a m59141a(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<DeleteBasketUseCase> provider2) {
        return new C13953a(provider, provider2);
    }

    /* renamed from: c */
    public static StdBasketDeleteCurrentBasketUseCase m59142c(StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, DeleteBasketUseCase deleteBasketUseCase) {
        return new StdBasketDeleteCurrentBasketUseCase(stdCheckBasketPermissionsUseCase, deleteBasketUseCase);
    }

    /* renamed from: b */
    public StdBasketDeleteCurrentBasketUseCase get() {
        return m59142c(this.f34062a.get(), this.f34063b.get());
    }
}
