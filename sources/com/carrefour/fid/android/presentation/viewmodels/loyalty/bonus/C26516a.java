package com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidListUseCase;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.IsFirstVisitPrimesFidelityUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyBonusAnalyticsInterfaceDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.a */
public final class C26516a implements C10324h<PrimeFidListViewModel> {

    /* renamed from: a */
    public final Provider<UpdateMidFidClubUseCase> f64809a;

    /* renamed from: b */
    public final Provider<GetCmsPrimeFidListUseCase> f64810b;

    /* renamed from: c */
    public final Provider<GetLoyaltyClubsUseCase> f64811c;

    /* renamed from: d */
    public final Provider<C37631c> f64812d;

    /* renamed from: e */
    public final Provider<LoginRepository> f64813e;

    /* renamed from: f */
    public final Provider<FidelityHasCardFidUseCase> f64814f;

    /* renamed from: g */
    public final Provider<SaveHasPrimeFidUseCase> f64815g;

    /* renamed from: h */
    public final Provider<C37878e> f64816h;

    /* renamed from: i */
    public final Provider<IsFirstVisitPrimesFidelityUseCase> f64817i;

    /* renamed from: j */
    public final Provider<SetFirstVisitPrimesFidelityUseCase> f64818j;

    /* renamed from: k */
    public final Provider<LoyaltyBonusAnalyticsInterfaceDelegate> f64819k;

    public C26516a(Provider<UpdateMidFidClubUseCase> provider, Provider<GetCmsPrimeFidListUseCase> provider2, Provider<GetLoyaltyClubsUseCase> provider3, Provider<C37631c> provider4, Provider<LoginRepository> provider5, Provider<FidelityHasCardFidUseCase> provider6, Provider<SaveHasPrimeFidUseCase> provider7, Provider<C37878e> provider8, Provider<IsFirstVisitPrimesFidelityUseCase> provider9, Provider<SetFirstVisitPrimesFidelityUseCase> provider10, Provider<LoyaltyBonusAnalyticsInterfaceDelegate> provider11) {
        this.f64809a = provider;
        this.f64810b = provider2;
        this.f64811c = provider3;
        this.f64812d = provider4;
        this.f64813e = provider5;
        this.f64814f = provider6;
        this.f64815g = provider7;
        this.f64816h = provider8;
        this.f64817i = provider9;
        this.f64818j = provider10;
        this.f64819k = provider11;
    }

    /* renamed from: a */
    public static C26516a m112978a(Provider<UpdateMidFidClubUseCase> provider, Provider<GetCmsPrimeFidListUseCase> provider2, Provider<GetLoyaltyClubsUseCase> provider3, Provider<C37631c> provider4, Provider<LoginRepository> provider5, Provider<FidelityHasCardFidUseCase> provider6, Provider<SaveHasPrimeFidUseCase> provider7, Provider<C37878e> provider8, Provider<IsFirstVisitPrimesFidelityUseCase> provider9, Provider<SetFirstVisitPrimesFidelityUseCase> provider10, Provider<LoyaltyBonusAnalyticsInterfaceDelegate> provider11) {
        return new C26516a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    /* renamed from: c */
    public static PrimeFidListViewModel m112979c(UpdateMidFidClubUseCase updateMidFidClubUseCase, GetCmsPrimeFidListUseCase getCmsPrimeFidListUseCase, GetLoyaltyClubsUseCase getLoyaltyClubsUseCase, C37631c cVar, LoginRepository loginRepository, FidelityHasCardFidUseCase fidelityHasCardFidUseCase, SaveHasPrimeFidUseCase saveHasPrimeFidUseCase, C37878e eVar, IsFirstVisitPrimesFidelityUseCase isFirstVisitPrimesFidelityUseCase, SetFirstVisitPrimesFidelityUseCase setFirstVisitPrimesFidelityUseCase, LoyaltyBonusAnalyticsInterfaceDelegate loyaltyBonusAnalyticsInterfaceDelegate) {
        return new PrimeFidListViewModel(updateMidFidClubUseCase, getCmsPrimeFidListUseCase, getLoyaltyClubsUseCase, cVar, loginRepository, fidelityHasCardFidUseCase, saveHasPrimeFidUseCase, eVar, isFirstVisitPrimesFidelityUseCase, setFirstVisitPrimesFidelityUseCase, loyaltyBonusAnalyticsInterfaceDelegate);
    }

    /* renamed from: b */
    public PrimeFidListViewModel get() {
        return m112979c(this.f64809a.get(), this.f64810b.get(), this.f64811c.get(), this.f64812d.get(), this.f64813e.get(), this.f64814f.get(), this.f64815g.get(), this.f64816h.get(), this.f64817i.get(), this.f64818j.get(), this.f64819k.get());
    }
}
