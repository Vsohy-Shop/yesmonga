package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidListUseCase;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29014q;
import com.carrefour.fid.android.tracking.product.C29021a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.j */
public final class C26799j implements C10324h<CheckoutStepOneAdditionalOrderViewModel> {

    /* renamed from: a */
    public final Provider<GetOfferProductListUseCase> f65381a;

    /* renamed from: b */
    public final Provider<C37716b> f65382b;

    /* renamed from: c */
    public final Provider<UpdateOfferListUseCase> f65383c;

    /* renamed from: d */
    public final Provider<LoyaltyPreferencesStorage> f65384d;

    /* renamed from: e */
    public final Provider<OfferListModelDataMapper> f65385e;

    /* renamed from: f */
    public final Provider<GetCmsPrimeFidListUseCase> f65386f;

    /* renamed from: g */
    public final Provider<GetLoyaltyClubsUseCase> f65387g;

    /* renamed from: h */
    public final Provider<C37540a> f65388h;

    /* renamed from: i */
    public final Provider<ShowPreparationFeesUseCase> f65389i;

    /* renamed from: j */
    public final Provider<C29021a> f65390j;

    /* renamed from: k */
    public final Provider<C29014q> f65391k;

    public C26799j(Provider<GetOfferProductListUseCase> provider, Provider<C37716b> provider2, Provider<UpdateOfferListUseCase> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<OfferListModelDataMapper> provider5, Provider<GetCmsPrimeFidListUseCase> provider6, Provider<GetLoyaltyClubsUseCase> provider7, Provider<C37540a> provider8, Provider<ShowPreparationFeesUseCase> provider9, Provider<C29021a> provider10, Provider<C29014q> provider11) {
        this.f65381a = provider;
        this.f65382b = provider2;
        this.f65383c = provider3;
        this.f65384d = provider4;
        this.f65385e = provider5;
        this.f65386f = provider6;
        this.f65387g = provider7;
        this.f65388h = provider8;
        this.f65389i = provider9;
        this.f65390j = provider10;
        this.f65391k = provider11;
    }

    /* renamed from: a */
    public static C26799j m113785a(Provider<GetOfferProductListUseCase> provider, Provider<C37716b> provider2, Provider<UpdateOfferListUseCase> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<OfferListModelDataMapper> provider5, Provider<GetCmsPrimeFidListUseCase> provider6, Provider<GetLoyaltyClubsUseCase> provider7, Provider<C37540a> provider8, Provider<ShowPreparationFeesUseCase> provider9, Provider<C29021a> provider10, Provider<C29014q> provider11) {
        return new C26799j(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    /* renamed from: c */
    public static CheckoutStepOneAdditionalOrderViewModel m113786c(GetOfferProductListUseCase getOfferProductListUseCase, C37716b bVar, UpdateOfferListUseCase updateOfferListUseCase, LoyaltyPreferencesStorage loyaltyPreferencesStorage, OfferListModelDataMapper offerListModelDataMapper, GetCmsPrimeFidListUseCase getCmsPrimeFidListUseCase, GetLoyaltyClubsUseCase getLoyaltyClubsUseCase, C37540a aVar, ShowPreparationFeesUseCase showPreparationFeesUseCase, C29021a aVar2, C29014q qVar) {
        return new CheckoutStepOneAdditionalOrderViewModel(getOfferProductListUseCase, bVar, updateOfferListUseCase, loyaltyPreferencesStorage, offerListModelDataMapper, getCmsPrimeFidListUseCase, getLoyaltyClubsUseCase, aVar, showPreparationFeesUseCase, aVar2, qVar);
    }

    /* renamed from: b */
    public CheckoutStepOneAdditionalOrderViewModel get() {
        return m113786c(this.f65381a.get(), this.f65382b.get(), this.f65383c.get(), this.f65384d.get(), this.f65385e.get(), this.f65386f.get(), this.f65387g.get(), this.f65388h.get(), this.f65389i.get(), this.f65390j.get(), this.f65391k.get());
    }
}
