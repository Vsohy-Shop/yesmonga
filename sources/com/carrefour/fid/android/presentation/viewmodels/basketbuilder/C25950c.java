package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.c */
public final class C25950c implements C10324h<BasketBuilderDepartmentViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f63481a;

    /* renamed from: b */
    public final Provider<C37807b> f63482b;

    public C25950c(Provider<C37716b> provider, Provider<C37807b> provider2) {
        this.f63481a = provider;
        this.f63482b = provider2;
    }

    /* renamed from: a */
    public static C25950c m111116a(Provider<C37716b> provider, Provider<C37807b> provider2) {
        return new C25950c(provider, provider2);
    }

    /* renamed from: c */
    public static BasketBuilderDepartmentViewModel m111117c(C37716b bVar, C37807b bVar2) {
        return new BasketBuilderDepartmentViewModel(bVar, bVar2);
    }

    /* renamed from: b */
    public BasketBuilderDepartmentViewModel get() {
        return m111117c(this.f63481a.get(), this.f63482b.get());
    }
}
