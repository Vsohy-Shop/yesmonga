package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.basket.domain.interactors.internal.DeleteBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.additionalorder.a */
public final class C13898a implements C10324h<AdditionalOrderDeleteCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<DeleteBasketUseCase> f33921a;

    public C13898a(Provider<DeleteBasketUseCase> provider) {
        this.f33921a = provider;
    }

    /* renamed from: a */
    public static C13898a m58987a(Provider<DeleteBasketUseCase> provider) {
        return new C13898a(provider);
    }

    /* renamed from: c */
    public static AdditionalOrderDeleteCurrentBasketUseCase m58988c(DeleteBasketUseCase deleteBasketUseCase) {
        return new AdditionalOrderDeleteCurrentBasketUseCase(deleteBasketUseCase);
    }

    /* renamed from: b */
    public AdditionalOrderDeleteCurrentBasketUseCase get() {
        return m58988c(this.f33921a.get());
    }
}
