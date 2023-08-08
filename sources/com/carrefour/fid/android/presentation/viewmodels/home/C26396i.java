package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase;
import com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ShouldDisplayUserConsentsBackdropUseCase;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalBannersUseCase;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase;
import com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase;
import com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.domain.interactors.service.C37826n;
import com.carrefour.fid.android.domain.interactors.service.C37828p;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37874b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.C26620a;
import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import com.carrefour.fid.android.utils.tagging.inbox.C22725b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.i */
public final class C26396i implements C10324h<HomePageViewModel> {

    /* renamed from: A */
    public final Provider<C37874b> f64537A;

    /* renamed from: B */
    public final Provider<AppPreferencesStorage> f64538B;

    /* renamed from: C */
    public final Provider<ScanPreferencesStorage> f64539C;

    /* renamed from: D */
    public final Provider<HomeAnalyticsViewModel> f64540D;

    /* renamed from: E */
    public final Provider<LuckyCartGetLuckyCartBannerDetailsUseCase> f64541E;

    /* renamed from: F */
    public final Provider<GetArsenalBannersUseCase> f64542F;

    /* renamed from: G */
    public final Provider<GetArsenalTopBannersUseCase> f64543G;

    /* renamed from: H */
    public final Provider<GetLuckyCartGameBannerUseCase> f64544H;

    /* renamed from: I */
    public final Provider<GetStickersContentUseCase> f64545I;

    /* renamed from: J */
    public final Provider<C26620a> f64546J;

    /* renamed from: K */
    public final Provider<GetCriteoBannerUseCase> f64547K;

    /* renamed from: L */
    public final Provider<C37566e0> f64548L;

    /* renamed from: M */
    public final Provider<C37619a> f64549M;

    /* renamed from: N */
    public final Provider<C37823k> f64550N;

    /* renamed from: O */
    public final Provider<ShouldDisplayUserConsentsBackdropUseCase> f64551O;

    /* renamed from: P */
    public final Provider<C37630b> f64552P;

    /* renamed from: Q */
    public final Provider<SaveConsentCurrentDateUseCase> f64553Q;

    /* renamed from: R */
    public final Provider<C37672j> f64554R;

    /* renamed from: S */
    public final Provider<LoadBasketBuilderUseCase> f64555S;

    /* renamed from: T */
    public final Provider<C37888b> f64556T;

    /* renamed from: U */
    public final Provider<GetCmsMiniHubBlocksUseCase> f64557U;

    /* renamed from: V */
    public final Provider<C37694a> f64558V;

    /* renamed from: W */
    public final Provider<C37610b> f64559W;

    /* renamed from: X */
    public final Provider<GetArsenalJOBannerUseCase> f64560X;

    /* renamed from: a */
    public final Provider<GetOfferProductListUseCase> f64561a;

    /* renamed from: b */
    public final Provider<OfferListModelDataMapper> f64562b;

    /* renamed from: c */
    public final Provider<GetOrderOnlineListUseCase> f64563c;

    /* renamed from: d */
    public final Provider<GetOrderOnlineDetailUseCase> f64564d;

    /* renamed from: e */
    public final Provider<C25222e> f64565e;

    /* renamed from: f */
    public final Provider<C25216a> f64566f;

    /* renamed from: g */
    public final Provider<C37569f0> f64567g;

    /* renamed from: h */
    public final Provider<C37807b> f64568h;

    /* renamed from: i */
    public final Provider<GetCmsCarouselsUseCase> f64569i;

    /* renamed from: j */
    public final Provider<GetCmsOffersUseCase> f64570j;

    /* renamed from: k */
    public final Provider<GetGazStationsCampaignUseCase> f64571k;

    /* renamed from: l */
    public final Provider<C37878e> f64572l;

    /* renamed from: m */
    public final Provider<FetchCouponsUseCase> f64573m;

    /* renamed from: n */
    public final Provider<GetLoyaltyBalanceUseCase> f64574n;

    /* renamed from: o */
    public final Provider<LoginRepository> f64575o;

    /* renamed from: p */
    public final Provider<C22725b> f64576p;

    /* renamed from: q */
    public final Provider<AccountRepository> f64577q;

    /* renamed from: r */
    public final Provider<C37824l> f64578r;

    /* renamed from: s */
    public final Provider<C37835r> f64579s;

    /* renamed from: t */
    public final Provider<C37828p> f64580t;

    /* renamed from: u */
    public final Provider<C37811a> f64581u;

    /* renamed from: v */
    public final Provider<C37826n> f64582v;

    /* renamed from: w */
    public final Provider<LoyaltyPreferencesStorage> f64583w;

    /* renamed from: x */
    public final Provider<C37832c> f64584x;

    /* renamed from: y */
    public final Provider<C37816e> f64585y;

    /* renamed from: z */
    public final Provider<C37833d> f64586z;

    public C26396i(Provider<GetOfferProductListUseCase> provider, Provider<OfferListModelDataMapper> provider2, Provider<GetOrderOnlineListUseCase> provider3, Provider<GetOrderOnlineDetailUseCase> provider4, Provider<C25222e> provider5, Provider<C25216a> provider6, Provider<C37569f0> provider7, Provider<C37807b> provider8, Provider<GetCmsCarouselsUseCase> provider9, Provider<GetCmsOffersUseCase> provider10, Provider<GetGazStationsCampaignUseCase> provider11, Provider<C37878e> provider12, Provider<FetchCouponsUseCase> provider13, Provider<GetLoyaltyBalanceUseCase> provider14, Provider<LoginRepository> provider15, Provider<C22725b> provider16, Provider<AccountRepository> provider17, Provider<C37824l> provider18, Provider<C37835r> provider19, Provider<C37828p> provider20, Provider<C37811a> provider21, Provider<C37826n> provider22, Provider<LoyaltyPreferencesStorage> provider23, Provider<C37832c> provider24, Provider<C37816e> provider25, Provider<C37833d> provider26, Provider<C37874b> provider27, Provider<AppPreferencesStorage> provider28, Provider<ScanPreferencesStorage> provider29, Provider<HomeAnalyticsViewModel> provider30, Provider<LuckyCartGetLuckyCartBannerDetailsUseCase> provider31, Provider<GetArsenalBannersUseCase> provider32, Provider<GetArsenalTopBannersUseCase> provider33, Provider<GetLuckyCartGameBannerUseCase> provider34, Provider<GetStickersContentUseCase> provider35, Provider<C26620a> provider36, Provider<GetCriteoBannerUseCase> provider37, Provider<C37566e0> provider38, Provider<C37619a> provider39, Provider<C37823k> provider40, Provider<ShouldDisplayUserConsentsBackdropUseCase> provider41, Provider<C37630b> provider42, Provider<SaveConsentCurrentDateUseCase> provider43, Provider<C37672j> provider44, Provider<LoadBasketBuilderUseCase> provider45, Provider<C37888b> provider46, Provider<GetCmsMiniHubBlocksUseCase> provider47, Provider<C37694a> provider48, Provider<C37610b> provider49, Provider<GetArsenalJOBannerUseCase> provider50) {
        this.f64561a = provider;
        this.f64562b = provider2;
        this.f64563c = provider3;
        this.f64564d = provider4;
        this.f64565e = provider5;
        this.f64566f = provider6;
        this.f64567g = provider7;
        this.f64568h = provider8;
        this.f64569i = provider9;
        this.f64570j = provider10;
        this.f64571k = provider11;
        this.f64572l = provider12;
        this.f64573m = provider13;
        this.f64574n = provider14;
        this.f64575o = provider15;
        this.f64576p = provider16;
        this.f64577q = provider17;
        this.f64578r = provider18;
        this.f64579s = provider19;
        this.f64580t = provider20;
        this.f64581u = provider21;
        this.f64582v = provider22;
        this.f64583w = provider23;
        this.f64584x = provider24;
        this.f64585y = provider25;
        this.f64586z = provider26;
        this.f64537A = provider27;
        this.f64538B = provider28;
        this.f64539C = provider29;
        this.f64540D = provider30;
        this.f64541E = provider31;
        this.f64542F = provider32;
        this.f64543G = provider33;
        this.f64544H = provider34;
        this.f64545I = provider35;
        this.f64546J = provider36;
        this.f64547K = provider37;
        this.f64548L = provider38;
        this.f64549M = provider39;
        this.f64550N = provider40;
        this.f64551O = provider41;
        this.f64552P = provider42;
        this.f64553Q = provider43;
        this.f64554R = provider44;
        this.f64555S = provider45;
        this.f64556T = provider46;
        this.f64557U = provider47;
        this.f64558V = provider48;
        this.f64559W = provider49;
        this.f64560X = provider50;
    }

    /* renamed from: a */
    public static C26396i m112750a(Provider<GetOfferProductListUseCase> provider, Provider<OfferListModelDataMapper> provider2, Provider<GetOrderOnlineListUseCase> provider3, Provider<GetOrderOnlineDetailUseCase> provider4, Provider<C25222e> provider5, Provider<C25216a> provider6, Provider<C37569f0> provider7, Provider<C37807b> provider8, Provider<GetCmsCarouselsUseCase> provider9, Provider<GetCmsOffersUseCase> provider10, Provider<GetGazStationsCampaignUseCase> provider11, Provider<C37878e> provider12, Provider<FetchCouponsUseCase> provider13, Provider<GetLoyaltyBalanceUseCase> provider14, Provider<LoginRepository> provider15, Provider<C22725b> provider16, Provider<AccountRepository> provider17, Provider<C37824l> provider18, Provider<C37835r> provider19, Provider<C37828p> provider20, Provider<C37811a> provider21, Provider<C37826n> provider22, Provider<LoyaltyPreferencesStorage> provider23, Provider<C37832c> provider24, Provider<C37816e> provider25, Provider<C37833d> provider26, Provider<C37874b> provider27, Provider<AppPreferencesStorage> provider28, Provider<ScanPreferencesStorage> provider29, Provider<HomeAnalyticsViewModel> provider30, Provider<LuckyCartGetLuckyCartBannerDetailsUseCase> provider31, Provider<GetArsenalBannersUseCase> provider32, Provider<GetArsenalTopBannersUseCase> provider33, Provider<GetLuckyCartGameBannerUseCase> provider34, Provider<GetStickersContentUseCase> provider35, Provider<C26620a> provider36, Provider<GetCriteoBannerUseCase> provider37, Provider<C37566e0> provider38, Provider<C37619a> provider39, Provider<C37823k> provider40, Provider<ShouldDisplayUserConsentsBackdropUseCase> provider41, Provider<C37630b> provider42, Provider<SaveConsentCurrentDateUseCase> provider43, Provider<C37672j> provider44, Provider<LoadBasketBuilderUseCase> provider45, Provider<C37888b> provider46, Provider<GetCmsMiniHubBlocksUseCase> provider47, Provider<C37694a> provider48, Provider<C37610b> provider49, Provider<GetArsenalJOBannerUseCase> provider50) {
        return new C26396i(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35, provider36, provider37, provider38, provider39, provider40, provider41, provider42, provider43, provider44, provider45, provider46, provider47, provider48, provider49, provider50);
    }

    /* renamed from: c */
    public static HomePageViewModel m112751c(GetOfferProductListUseCase getOfferProductListUseCase, OfferListModelDataMapper offerListModelDataMapper, GetOrderOnlineListUseCase getOrderOnlineListUseCase, GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, C25222e eVar, C25216a aVar, C37569f0 f0Var, C37807b bVar, GetCmsCarouselsUseCase getCmsCarouselsUseCase, GetCmsOffersUseCase getCmsOffersUseCase, GetGazStationsCampaignUseCase getGazStationsCampaignUseCase, C37878e eVar2, FetchCouponsUseCase fetchCouponsUseCase, GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, LoginRepository loginRepository, C22725b bVar2, AccountRepository accountRepository, C37824l lVar, C37835r rVar, C37828p pVar, C37811a aVar2, C37826n nVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37832c cVar, C37816e eVar3, C37833d dVar, C37874b bVar3, AppPreferencesStorage appPreferencesStorage, ScanPreferencesStorage scanPreferencesStorage, HomeAnalyticsViewModel homeAnalyticsViewModel, LuckyCartGetLuckyCartBannerDetailsUseCase luckyCartGetLuckyCartBannerDetailsUseCase, GetArsenalBannersUseCase getArsenalBannersUseCase, GetArsenalTopBannersUseCase getArsenalTopBannersUseCase, GetLuckyCartGameBannerUseCase getLuckyCartGameBannerUseCase, GetStickersContentUseCase getStickersContentUseCase, C26620a aVar3, GetCriteoBannerUseCase getCriteoBannerUseCase, C37566e0 e0Var, C37619a aVar4, C37823k kVar, ShouldDisplayUserConsentsBackdropUseCase shouldDisplayUserConsentsBackdropUseCase, C37630b bVar4, SaveConsentCurrentDateUseCase saveConsentCurrentDateUseCase, C37672j jVar, LoadBasketBuilderUseCase loadBasketBuilderUseCase, C37888b bVar5, GetCmsMiniHubBlocksUseCase getCmsMiniHubBlocksUseCase, C37694a aVar5, C37610b bVar6, GetArsenalJOBannerUseCase getArsenalJOBannerUseCase) {
        return new HomePageViewModel(getOfferProductListUseCase, offerListModelDataMapper, getOrderOnlineListUseCase, getOrderOnlineDetailUseCase, eVar, aVar, f0Var, bVar, getCmsCarouselsUseCase, getCmsOffersUseCase, getGazStationsCampaignUseCase, eVar2, fetchCouponsUseCase, getLoyaltyBalanceUseCase, loginRepository, bVar2, accountRepository, lVar, rVar, pVar, aVar2, nVar, loyaltyPreferencesStorage, cVar, eVar3, dVar, bVar3, appPreferencesStorage, scanPreferencesStorage, homeAnalyticsViewModel, luckyCartGetLuckyCartBannerDetailsUseCase, getArsenalBannersUseCase, getArsenalTopBannersUseCase, getLuckyCartGameBannerUseCase, getStickersContentUseCase, aVar3, getCriteoBannerUseCase, e0Var, aVar4, kVar, shouldDisplayUserConsentsBackdropUseCase, bVar4, saveConsentCurrentDateUseCase, jVar, loadBasketBuilderUseCase, bVar5, getCmsMiniHubBlocksUseCase, aVar5, bVar6, getArsenalJOBannerUseCase);
    }

    /* renamed from: b */
    public HomePageViewModel get() {
        return m112751c(this.f64561a.get(), this.f64562b.get(), this.f64563c.get(), this.f64564d.get(), this.f64565e.get(), this.f64566f.get(), this.f64567g.get(), this.f64568h.get(), this.f64569i.get(), this.f64570j.get(), this.f64571k.get(), this.f64572l.get(), this.f64573m.get(), this.f64574n.get(), this.f64575o.get(), this.f64576p.get(), this.f64577q.get(), this.f64578r.get(), this.f64579s.get(), this.f64580t.get(), this.f64581u.get(), this.f64582v.get(), this.f64583w.get(), this.f64584x.get(), this.f64585y.get(), this.f64586z.get(), this.f64537A.get(), this.f64538B.get(), this.f64539C.get(), this.f64540D.get(), this.f64541E.get(), this.f64542F.get(), this.f64543G.get(), this.f64544H.get(), this.f64545I.get(), this.f64546J.get(), this.f64547K.get(), this.f64548L.get(), this.f64549M.get(), this.f64550N.get(), this.f64551O.get(), this.f64552P.get(), this.f64553Q.get(), this.f64554R.get(), this.f64555S.get(), this.f64556T.get(), this.f64557U.get(), this.f64558V.get(), this.f64559W.get(), this.f64560X.get());
    }
}
