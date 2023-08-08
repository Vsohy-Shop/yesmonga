package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.domain.interactors.GetLoyaltyBonusListUseCase;
import com.carrefour.fid.android.domain.interactors.account.C37515a;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37827o;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.loyalty.domain.interactors.ClearLoyaltyUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.a */
public final class C26556a implements C10324h<LoyaltyDetailViewModel> {

    /* renamed from: a */
    public final Provider<GetGazStationsCampaignUseCase> f64894a;

    /* renamed from: b */
    public final Provider<GetLoyaltyBalanceUseCase> f64895b;

    /* renamed from: c */
    public final Provider<GetLoyaltyClubsUseCase> f64896c;

    /* renamed from: d */
    public final Provider<GetLoyaltyBonusListUseCase> f64897d;

    /* renamed from: e */
    public final Provider<FidelityHasCardFidUseCase> f64898e;

    /* renamed from: f */
    public final Provider<SaveHasPrimeFidUseCase> f64899f;

    /* renamed from: g */
    public final Provider<ClearLoyaltyUseCase> f64900g;

    /* renamed from: h */
    public final Provider<GetLoyaltyChannelsUseCase> f64901h;

    /* renamed from: i */
    public final Provider<C37878e> f64902i;

    /* renamed from: j */
    public final Provider<FetchCouponsUseCase> f64903j;

    /* renamed from: k */
    public final Provider<LoginRepository> f64904k;

    /* renamed from: l */
    public final Provider<C37515a> f64905l;

    /* renamed from: m */
    public final Provider<C37823k> f64906m;

    /* renamed from: n */
    public final Provider<C37827o> f64907n;

    /* renamed from: o */
    public final Provider<C37888b> f64908o;

    /* renamed from: p */
    public final Provider<C37694a> f64909p;

    /* renamed from: q */
    public final Provider<GetArsenalJOBannerUseCase> f64910q;

    /* renamed from: r */
    public final Provider<LoyaltyDetailAnalyticsDelegate> f64911r;

    public C26556a(Provider<GetGazStationsCampaignUseCase> provider, Provider<GetLoyaltyBalanceUseCase> provider2, Provider<GetLoyaltyClubsUseCase> provider3, Provider<GetLoyaltyBonusListUseCase> provider4, Provider<FidelityHasCardFidUseCase> provider5, Provider<SaveHasPrimeFidUseCase> provider6, Provider<ClearLoyaltyUseCase> provider7, Provider<GetLoyaltyChannelsUseCase> provider8, Provider<C37878e> provider9, Provider<FetchCouponsUseCase> provider10, Provider<LoginRepository> provider11, Provider<C37515a> provider12, Provider<C37823k> provider13, Provider<C37827o> provider14, Provider<C37888b> provider15, Provider<C37694a> provider16, Provider<GetArsenalJOBannerUseCase> provider17, Provider<LoyaltyDetailAnalyticsDelegate> provider18) {
        this.f64894a = provider;
        this.f64895b = provider2;
        this.f64896c = provider3;
        this.f64897d = provider4;
        this.f64898e = provider5;
        this.f64899f = provider6;
        this.f64900g = provider7;
        this.f64901h = provider8;
        this.f64902i = provider9;
        this.f64903j = provider10;
        this.f64904k = provider11;
        this.f64905l = provider12;
        this.f64906m = provider13;
        this.f64907n = provider14;
        this.f64908o = provider15;
        this.f64909p = provider16;
        this.f64910q = provider17;
        this.f64911r = provider18;
    }

    /* renamed from: a */
    public static C26556a m113103a(Provider<GetGazStationsCampaignUseCase> provider, Provider<GetLoyaltyBalanceUseCase> provider2, Provider<GetLoyaltyClubsUseCase> provider3, Provider<GetLoyaltyBonusListUseCase> provider4, Provider<FidelityHasCardFidUseCase> provider5, Provider<SaveHasPrimeFidUseCase> provider6, Provider<ClearLoyaltyUseCase> provider7, Provider<GetLoyaltyChannelsUseCase> provider8, Provider<C37878e> provider9, Provider<FetchCouponsUseCase> provider10, Provider<LoginRepository> provider11, Provider<C37515a> provider12, Provider<C37823k> provider13, Provider<C37827o> provider14, Provider<C37888b> provider15, Provider<C37694a> provider16, Provider<GetArsenalJOBannerUseCase> provider17, Provider<LoyaltyDetailAnalyticsDelegate> provider18) {
        return new C26556a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    /* renamed from: c */
    public static LoyaltyDetailViewModel m113104c(GetGazStationsCampaignUseCase getGazStationsCampaignUseCase, GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, GetLoyaltyClubsUseCase getLoyaltyClubsUseCase, GetLoyaltyBonusListUseCase getLoyaltyBonusListUseCase, FidelityHasCardFidUseCase fidelityHasCardFidUseCase, SaveHasPrimeFidUseCase saveHasPrimeFidUseCase, ClearLoyaltyUseCase clearLoyaltyUseCase, GetLoyaltyChannelsUseCase getLoyaltyChannelsUseCase, C37878e eVar, FetchCouponsUseCase fetchCouponsUseCase, LoginRepository loginRepository, C37515a aVar, C37823k kVar, C37827o oVar, C37888b bVar, C37694a aVar2, GetArsenalJOBannerUseCase getArsenalJOBannerUseCase, LoyaltyDetailAnalyticsDelegate loyaltyDetailAnalyticsDelegate) {
        return new LoyaltyDetailViewModel(getGazStationsCampaignUseCase, getLoyaltyBalanceUseCase, getLoyaltyClubsUseCase, getLoyaltyBonusListUseCase, fidelityHasCardFidUseCase, saveHasPrimeFidUseCase, clearLoyaltyUseCase, getLoyaltyChannelsUseCase, eVar, fetchCouponsUseCase, loginRepository, aVar, kVar, oVar, bVar, aVar2, getArsenalJOBannerUseCase, loyaltyDetailAnalyticsDelegate);
    }

    /* renamed from: b */
    public LoyaltyDetailViewModel get() {
        return m113104c(this.f64894a.get(), this.f64895b.get(), this.f64896c.get(), this.f64897d.get(), this.f64898e.get(), this.f64899f.get(), this.f64900g.get(), this.f64901h.get(), this.f64902i.get(), this.f64903j.get(), this.f64904k.get(), this.f64905l.get(), this.f64906m.get(), this.f64907n.get(), this.f64908o.get(), this.f64909p.get(), this.f64910q.get(), this.f64911r.get());
    }
}
