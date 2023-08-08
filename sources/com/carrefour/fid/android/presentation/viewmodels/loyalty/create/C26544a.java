package com.carrefour.fid.android.presentation.viewmodels.loyalty.create;

import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.AcceptLoyaltyCguAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.a */
public final class C26544a implements C10324h<AcceptLoyaltyCguViewModel> {

    /* renamed from: a */
    public final Provider<GetCmsPrimeFidUseCase> f64862a;

    /* renamed from: b */
    public final Provider<AcceptLoyaltyCguAnalyticsDelegate> f64863b;

    public C26544a(Provider<GetCmsPrimeFidUseCase> provider, Provider<AcceptLoyaltyCguAnalyticsDelegate> provider2) {
        this.f64862a = provider;
        this.f64863b = provider2;
    }

    /* renamed from: a */
    public static C26544a m113041a(Provider<GetCmsPrimeFidUseCase> provider, Provider<AcceptLoyaltyCguAnalyticsDelegate> provider2) {
        return new C26544a(provider, provider2);
    }

    /* renamed from: c */
    public static AcceptLoyaltyCguViewModel m113042c(GetCmsPrimeFidUseCase getCmsPrimeFidUseCase, AcceptLoyaltyCguAnalyticsDelegate acceptLoyaltyCguAnalyticsDelegate) {
        return new AcceptLoyaltyCguViewModel(getCmsPrimeFidUseCase, acceptLoyaltyCguAnalyticsDelegate);
    }

    /* renamed from: b */
    public AcceptLoyaltyCguViewModel get() {
        return m113042c(this.f64862a.get(), this.f64863b.get());
    }
}
