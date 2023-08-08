package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.standard.e */
public final class C13957e implements C10324h<StdUpdateBasketContentUseCase> {

    /* renamed from: a */
    public final Provider<StdCheckBasketPermissionsUseCase> f34073a;

    /* renamed from: b */
    public final Provider<RemoveOfferFromBasketUseCase> f34074b;

    /* renamed from: c */
    public final Provider<UpdateBasketOfferQuantityUseCase> f34075c;

    public C13957e(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<RemoveOfferFromBasketUseCase> provider2, Provider<UpdateBasketOfferQuantityUseCase> provider3) {
        this.f34073a = provider;
        this.f34074b = provider2;
        this.f34075c = provider3;
    }

    /* renamed from: a */
    public static C13957e m59153a(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<RemoveOfferFromBasketUseCase> provider2, Provider<UpdateBasketOfferQuantityUseCase> provider3) {
        return new C13957e(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static StdUpdateBasketContentUseCase m59154c(StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, RemoveOfferFromBasketUseCase removeOfferFromBasketUseCase, UpdateBasketOfferQuantityUseCase updateBasketOfferQuantityUseCase) {
        return new StdUpdateBasketContentUseCase(stdCheckBasketPermissionsUseCase, removeOfferFromBasketUseCase, updateBasketOfferQuantityUseCase);
    }

    /* renamed from: b */
    public StdUpdateBasketContentUseCase get() {
        return m59154c(this.f34073a.get(), this.f34074b.get(), this.f34075c.get());
    }
}
