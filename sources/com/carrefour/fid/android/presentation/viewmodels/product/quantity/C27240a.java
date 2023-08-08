package com.carrefour.fid.android.presentation.viewmodels.product.quantity;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.a */
public final class C27240a implements C10324h<QuantityBottomSheetViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f66199a;

    public C27240a(Provider<C37716b> provider) {
        this.f66199a = provider;
    }

    /* renamed from: a */
    public static C27240a m114977a(Provider<C37716b> provider) {
        return new C27240a(provider);
    }

    /* renamed from: c */
    public static QuantityBottomSheetViewModel m114978c(C37716b bVar) {
        return new QuantityBottomSheetViewModel(bVar);
    }

    /* renamed from: b */
    public QuantityBottomSheetViewModel get() {
        return m114978c(this.f66199a.get());
    }
}
