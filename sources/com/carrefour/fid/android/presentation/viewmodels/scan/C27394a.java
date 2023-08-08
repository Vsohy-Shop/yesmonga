package com.carrefour.fid.android.presentation.viewmodels.scan;

import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.scan.domain.interactors.GetScanTutorialHasBeenShownUseCase;
import com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.a */
public final class C27394a implements C10324h<BarcodeScannerViewModel> {

    /* renamed from: a */
    public final Provider<GetOfferProductListUseCase> f66470a;

    /* renamed from: b */
    public final Provider<LoyaltyPreferencesStorage> f66471b;

    /* renamed from: c */
    public final Provider<UpdateScanTutorialHasBeenShownUseCase> f66472c;

    /* renamed from: d */
    public final Provider<GetScanTutorialHasBeenShownUseCase> f66473d;

    /* renamed from: e */
    public final Provider<C37540a> f66474e;

    /* renamed from: f */
    public final Provider<C37807b> f66475f;

    public C27394a(Provider<GetOfferProductListUseCase> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<UpdateScanTutorialHasBeenShownUseCase> provider3, Provider<GetScanTutorialHasBeenShownUseCase> provider4, Provider<C37540a> provider5, Provider<C37807b> provider6) {
        this.f66470a = provider;
        this.f66471b = provider2;
        this.f66472c = provider3;
        this.f66473d = provider4;
        this.f66474e = provider5;
        this.f66475f = provider6;
    }

    /* renamed from: a */
    public static C27394a m115405a(Provider<GetOfferProductListUseCase> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<UpdateScanTutorialHasBeenShownUseCase> provider3, Provider<GetScanTutorialHasBeenShownUseCase> provider4, Provider<C37540a> provider5, Provider<C37807b> provider6) {
        return new C27394a(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static BarcodeScannerViewModel m115406c(GetOfferProductListUseCase getOfferProductListUseCase, LoyaltyPreferencesStorage loyaltyPreferencesStorage, UpdateScanTutorialHasBeenShownUseCase updateScanTutorialHasBeenShownUseCase, GetScanTutorialHasBeenShownUseCase getScanTutorialHasBeenShownUseCase, C37540a aVar, C37807b bVar) {
        return new BarcodeScannerViewModel(getOfferProductListUseCase, loyaltyPreferencesStorage, updateScanTutorialHasBeenShownUseCase, getScanTutorialHasBeenShownUseCase, aVar, bVar);
    }

    /* renamed from: b */
    public BarcodeScannerViewModel get() {
        return m115406c(this.f66470a.get(), this.f66471b.get(), this.f66472c.get(), this.f66473d.get(), this.f66474e.get(), this.f66475f.get());
    }
}
