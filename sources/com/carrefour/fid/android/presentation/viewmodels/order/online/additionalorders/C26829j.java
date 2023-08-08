package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.j */
public final class C26829j implements C10324h<AdditionalOrderSearchViewModel> {

    /* renamed from: a */
    public final Provider<C37606z> f65420a;

    public C26829j(Provider<C37606z> provider) {
        this.f65420a = provider;
    }

    /* renamed from: a */
    public static C26829j m113830a(Provider<C37606z> provider) {
        return new C26829j(provider);
    }

    /* renamed from: c */
    public static AdditionalOrderSearchViewModel m113831c(C37606z zVar) {
        return new AdditionalOrderSearchViewModel(zVar);
    }

    /* renamed from: b */
    public AdditionalOrderSearchViewModel get() {
        return m113831c(this.f65420a.get());
    }
}
