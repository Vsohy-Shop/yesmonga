package com.carrefour.fid.android.presentation.viewmodels.criteo;

import com.carrefour.fid.android.domain.interactors.criteo.CriteoTrackingSyncUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.criteo.d */
public final class C26337d implements C10324h<CriteoTrackingViewModel> {

    /* renamed from: a */
    public final Provider<CriteoTrackingSyncUseCase> f64352a;

    public C26337d(Provider<CriteoTrackingSyncUseCase> provider) {
        this.f64352a = provider;
    }

    /* renamed from: a */
    public static C26337d m112411a(Provider<CriteoTrackingSyncUseCase> provider) {
        return new C26337d(provider);
    }

    /* renamed from: c */
    public static CriteoTrackingViewModel m112412c(CriteoTrackingSyncUseCase criteoTrackingSyncUseCase) {
        return new CriteoTrackingViewModel(criteoTrackingSyncUseCase);
    }

    /* renamed from: b */
    public CriteoTrackingViewModel get() {
        return m112412c(this.f64352a.get());
    }
}
