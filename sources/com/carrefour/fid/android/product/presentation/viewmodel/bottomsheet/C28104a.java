package com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37753d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.a */
public final class C28104a implements C10324h<AlternativeProductsBottomSheetViewModel> {

    /* renamed from: a */
    public final Provider<C37753d> f68075a;

    /* renamed from: b */
    public final Provider<C37680a> f68076b;

    /* renamed from: c */
    public final Provider<C37684e> f68077c;

    /* renamed from: d */
    public final Provider<C37588n0> f68078d;

    public C28104a(Provider<C37753d> provider, Provider<C37680a> provider2, Provider<C37684e> provider3, Provider<C37588n0> provider4) {
        this.f68075a = provider;
        this.f68076b = provider2;
        this.f68077c = provider3;
        this.f68078d = provider4;
    }

    /* renamed from: a */
    public static C28104a m117672a(Provider<C37753d> provider, Provider<C37680a> provider2, Provider<C37684e> provider3, Provider<C37588n0> provider4) {
        return new C28104a(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static AlternativeProductsBottomSheetViewModel m117673c(C37753d dVar, C37680a aVar, C37684e eVar, C37588n0 n0Var) {
        return new AlternativeProductsBottomSheetViewModel(dVar, aVar, eVar, n0Var);
    }

    /* renamed from: b */
    public AlternativeProductsBottomSheetViewModel get() {
        return m117673c(this.f68075a.get(), this.f68076b.get(), this.f68077c.get(), this.f68078d.get());
    }
}
