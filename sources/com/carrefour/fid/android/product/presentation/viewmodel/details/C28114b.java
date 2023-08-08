package com.carrefour.fid.android.product.presentation.viewmodel.details;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.basket.C37591o0;
import com.carrefour.fid.android.domain.interactors.basket.C37605y;
import com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.b */
public final class C28114b implements C10324h<NonFoodProductDetailsViewModel> {

    /* renamed from: a */
    public final Provider<GetProductDetailsNalUseCase> f68108a;

    /* renamed from: b */
    public final Provider<C37835r> f68109b;

    /* renamed from: c */
    public final Provider<C37605y> f68110c;

    /* renamed from: d */
    public final Provider<C37591o0> f68111d;

    /* renamed from: e */
    public final Provider<C19456p0> f68112e;

    public C28114b(Provider<GetProductDetailsNalUseCase> provider, Provider<C37835r> provider2, Provider<C37605y> provider3, Provider<C37591o0> provider4, Provider<C19456p0> provider5) {
        this.f68108a = provider;
        this.f68109b = provider2;
        this.f68110c = provider3;
        this.f68111d = provider4;
        this.f68112e = provider5;
    }

    /* renamed from: a */
    public static C28114b m117738a(Provider<GetProductDetailsNalUseCase> provider, Provider<C37835r> provider2, Provider<C37605y> provider3, Provider<C37591o0> provider4, Provider<C19456p0> provider5) {
        return new C28114b(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static NonFoodProductDetailsViewModel m117739c(GetProductDetailsNalUseCase getProductDetailsNalUseCase, C37835r rVar, C37605y yVar, C37591o0 o0Var, C19456p0 p0Var) {
        return new NonFoodProductDetailsViewModel(getProductDetailsNalUseCase, rVar, yVar, o0Var, p0Var);
    }

    /* renamed from: b */
    public NonFoodProductDetailsViewModel get() {
        return m117739c(this.f68108a.get(), this.f68109b.get(), this.f68110c.get(), this.f68111d.get(), this.f68112e.get());
    }
}
