package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import com.CritizrSDK.C21424c;
import com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37815d;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.d */
public final class C27146d implements C10324h<PhysicalStoreInfoViewModel> {

    /* renamed from: a */
    public final Provider<C37832c> f66015a;

    /* renamed from: b */
    public final Provider<C37815d> f66016b;

    /* renamed from: c */
    public final Provider<GetStorePetrolInfoUseCase> f66017c;

    /* renamed from: d */
    public final Provider<C21424c> f66018d;

    public C27146d(Provider<C37832c> provider, Provider<C37815d> provider2, Provider<GetStorePetrolInfoUseCase> provider3, Provider<C21424c> provider4) {
        this.f66015a = provider;
        this.f66016b = provider2;
        this.f66017c = provider3;
        this.f66018d = provider4;
    }

    /* renamed from: a */
    public static C27146d m114715a(Provider<C37832c> provider, Provider<C37815d> provider2, Provider<GetStorePetrolInfoUseCase> provider3, Provider<C21424c> provider4) {
        return new C27146d(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static PhysicalStoreInfoViewModel m114716c(C37832c cVar, C37815d dVar, GetStorePetrolInfoUseCase getStorePetrolInfoUseCase, C21424c cVar2) {
        return new PhysicalStoreInfoViewModel(cVar, dVar, getStorePetrolInfoUseCase, cVar2);
    }

    /* renamed from: b */
    public PhysicalStoreInfoViewModel get() {
        return m114716c(this.f66015a.get(), this.f66016b.get(), this.f66017c.get(), this.f66018d.get());
    }
}
