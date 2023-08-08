package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidListUseCase;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.interactors.basket.C37577j;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37585m;
import com.carrefour.fid.android.domain.interactors.basket.C37600u;
import com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase;
import com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.C37666g;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase;
import com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37834q;
import com.carrefour.fid.android.domain.interactors.slot.C37855b;
import com.carrefour.fid.android.domain.interactors.user.C37874b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.f */
public final class C26010f implements C10324h<CheckoutStep1MVIViewModel> {

    /* renamed from: A */
    public final Provider<ShowPreparationFeesUseCase> f63579A;

    /* renamed from: a */
    public final Provider<AccountRepository> f63580a;

    /* renamed from: b */
    public final Provider<CriteoSendCriteoEventUseCase> f63581b;

    /* renamed from: c */
    public final Provider<C37672j> f63582c;

    /* renamed from: d */
    public final Provider<C37666g> f63583d;

    /* renamed from: e */
    public final Provider<GetLoyaltyClubsUseCase> f63584e;

    /* renamed from: f */
    public final Provider<GetOfferProductListUseCase> f63585f;

    /* renamed from: g */
    public final Provider<GetCmsPrimeFidListUseCase> f63586g;

    /* renamed from: h */
    public final Provider<C37855b> f63587h;

    /* renamed from: i */
    public final Provider<C37600u> f63588i;

    /* renamed from: j */
    public final Provider<LoginRepository> f63589j;

    /* renamed from: k */
    public final Provider<LoyaltyPreferencesStorage> f63590k;

    /* renamed from: l */
    public final Provider<C37716b> f63591l;

    /* renamed from: m */
    public final Provider<C37584l0> f63592m;

    /* renamed from: n */
    public final Provider<OfferListModelDataMapper> f63593n;

    /* renamed from: o */
    public final Provider<C37834q> f63594o;

    /* renamed from: p */
    public final Provider<C37811a> f63595p;

    /* renamed from: q */
    public final Provider<RecommendedProductUseCase> f63596q;

    /* renamed from: r */
    public final Provider<C37874b> f63597r;

    /* renamed from: s */
    public final Provider<UpdateOfferListUseCase> f63598s;

    /* renamed from: t */
    public final Provider<C37577j> f63599t;

    /* renamed from: u */
    public final Provider<C37823k> f63600u;

    /* renamed from: v */
    public final Provider<C37493a> f63601v;

    /* renamed from: w */
    public final Provider<C28994a> f63602w;

    /* renamed from: x */
    public final Provider<C37585m> f63603x;

    /* renamed from: y */
    public final Provider<C37807b> f63604y;

    /* renamed from: z */
    public final Provider<CheckoutCheckDeliveryEligibilityUseCase> f63605z;

    public C26010f(Provider<AccountRepository> provider, Provider<CriteoSendCriteoEventUseCase> provider2, Provider<C37672j> provider3, Provider<C37666g> provider4, Provider<GetLoyaltyClubsUseCase> provider5, Provider<GetOfferProductListUseCase> provider6, Provider<GetCmsPrimeFidListUseCase> provider7, Provider<C37855b> provider8, Provider<C37600u> provider9, Provider<LoginRepository> provider10, Provider<LoyaltyPreferencesStorage> provider11, Provider<C37716b> provider12, Provider<C37584l0> provider13, Provider<OfferListModelDataMapper> provider14, Provider<C37834q> provider15, Provider<C37811a> provider16, Provider<RecommendedProductUseCase> provider17, Provider<C37874b> provider18, Provider<UpdateOfferListUseCase> provider19, Provider<C37577j> provider20, Provider<C37823k> provider21, Provider<C37493a> provider22, Provider<C28994a> provider23, Provider<C37585m> provider24, Provider<C37807b> provider25, Provider<CheckoutCheckDeliveryEligibilityUseCase> provider26, Provider<ShowPreparationFeesUseCase> provider27) {
        this.f63580a = provider;
        this.f63581b = provider2;
        this.f63582c = provider3;
        this.f63583d = provider4;
        this.f63584e = provider5;
        this.f63585f = provider6;
        this.f63586g = provider7;
        this.f63587h = provider8;
        this.f63588i = provider9;
        this.f63589j = provider10;
        this.f63590k = provider11;
        this.f63591l = provider12;
        this.f63592m = provider13;
        this.f63593n = provider14;
        this.f63594o = provider15;
        this.f63595p = provider16;
        this.f63596q = provider17;
        this.f63597r = provider18;
        this.f63598s = provider19;
        this.f63599t = provider20;
        this.f63600u = provider21;
        this.f63601v = provider22;
        this.f63602w = provider23;
        this.f63603x = provider24;
        this.f63604y = provider25;
        this.f63605z = provider26;
        this.f63579A = provider27;
    }

    /* renamed from: a */
    public static C26010f m111342a(Provider<AccountRepository> provider, Provider<CriteoSendCriteoEventUseCase> provider2, Provider<C37672j> provider3, Provider<C37666g> provider4, Provider<GetLoyaltyClubsUseCase> provider5, Provider<GetOfferProductListUseCase> provider6, Provider<GetCmsPrimeFidListUseCase> provider7, Provider<C37855b> provider8, Provider<C37600u> provider9, Provider<LoginRepository> provider10, Provider<LoyaltyPreferencesStorage> provider11, Provider<C37716b> provider12, Provider<C37584l0> provider13, Provider<OfferListModelDataMapper> provider14, Provider<C37834q> provider15, Provider<C37811a> provider16, Provider<RecommendedProductUseCase> provider17, Provider<C37874b> provider18, Provider<UpdateOfferListUseCase> provider19, Provider<C37577j> provider20, Provider<C37823k> provider21, Provider<C37493a> provider22, Provider<C28994a> provider23, Provider<C37585m> provider24, Provider<C37807b> provider25, Provider<CheckoutCheckDeliveryEligibilityUseCase> provider26, Provider<ShowPreparationFeesUseCase> provider27) {
        return new C26010f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27);
    }

    /* renamed from: c */
    public static CheckoutStep1MVIViewModel m111343c(AccountRepository accountRepository, CriteoSendCriteoEventUseCase criteoSendCriteoEventUseCase, C37672j jVar, C37666g gVar, GetLoyaltyClubsUseCase getLoyaltyClubsUseCase, GetOfferProductListUseCase getOfferProductListUseCase, GetCmsPrimeFidListUseCase getCmsPrimeFidListUseCase, C37855b bVar, C37600u uVar, LoginRepository loginRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37716b bVar2, C37584l0 l0Var, OfferListModelDataMapper offerListModelDataMapper, C37834q qVar, C37811a aVar, RecommendedProductUseCase recommendedProductUseCase, C37874b bVar3, UpdateOfferListUseCase updateOfferListUseCase, C37577j jVar2, C37823k kVar, C37493a aVar2, C28994a aVar3, C37585m mVar, C37807b bVar4, CheckoutCheckDeliveryEligibilityUseCase checkoutCheckDeliveryEligibilityUseCase, ShowPreparationFeesUseCase showPreparationFeesUseCase) {
        return new CheckoutStep1MVIViewModel(accountRepository, criteoSendCriteoEventUseCase, jVar, gVar, getLoyaltyClubsUseCase, getOfferProductListUseCase, getCmsPrimeFidListUseCase, bVar, uVar, loginRepository, loyaltyPreferencesStorage, bVar2, l0Var, offerListModelDataMapper, qVar, aVar, recommendedProductUseCase, bVar3, updateOfferListUseCase, jVar2, kVar, aVar2, aVar3, mVar, bVar4, checkoutCheckDeliveryEligibilityUseCase, showPreparationFeesUseCase);
    }

    /* renamed from: b */
    public CheckoutStep1MVIViewModel get() {
        return m111343c(this.f63580a.get(), this.f63581b.get(), this.f63582c.get(), this.f63583d.get(), this.f63584e.get(), this.f63585f.get(), this.f63586g.get(), this.f63587h.get(), this.f63588i.get(), this.f63589j.get(), this.f63590k.get(), this.f63591l.get(), this.f63592m.get(), this.f63593n.get(), this.f63594o.get(), this.f63595p.get(), this.f63596q.get(), this.f63597r.get(), this.f63598s.get(), this.f63599t.get(), this.f63600u.get(), this.f63601v.get(), this.f63602w.get(), this.f63603x.get(), this.f63604y.get(), this.f63605z.get(), this.f63579A.get());
    }
}
