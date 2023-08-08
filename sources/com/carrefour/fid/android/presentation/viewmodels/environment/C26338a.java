package com.carrefour.fid.android.presentation.viewmodels.environment;

import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.domain.interactors.C37607c;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.environment.a */
public final class C26338a implements C10324h<AppEnvironmentSelectionViewModel> {

    /* renamed from: a */
    public final Provider<C37607c> f64358a;

    /* renamed from: b */
    public final Provider<C37811a> f64359b;

    /* renamed from: c */
    public final Provider<ClearAppManager> f64360c;

    public C26338a(Provider<C37607c> provider, Provider<C37811a> provider2, Provider<ClearAppManager> provider3) {
        this.f64358a = provider;
        this.f64359b = provider2;
        this.f64360c = provider3;
    }

    /* renamed from: a */
    public static C26338a m112421a(Provider<C37607c> provider, Provider<C37811a> provider2, Provider<ClearAppManager> provider3) {
        return new C26338a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static AppEnvironmentSelectionViewModel m112422c(C37607c cVar, C37811a aVar, ClearAppManager clearAppManager) {
        return new AppEnvironmentSelectionViewModel(cVar, aVar, clearAppManager);
    }

    /* renamed from: b */
    public AppEnvironmentSelectionViewModel get() {
        return m112422c(this.f64358a.get(), this.f64359b.get(), this.f64360c.get());
    }
}
