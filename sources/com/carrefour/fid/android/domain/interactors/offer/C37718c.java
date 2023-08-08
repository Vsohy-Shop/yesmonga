package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37575i;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.basket.MixingProductsRemoteConfigUseCase;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37683d;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.shared.network.C28802c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.offer.c */
public final class C37718c implements C10324h<OfferListAndBasketControllerImpl> {

    /* renamed from: a */
    public final Provider<GetOfferProductListUseCase> f94632a;

    /* renamed from: b */
    public final Provider<UpdateOfferListUseCase> f94633b;

    /* renamed from: c */
    public final Provider<OfferListModelDataMapper> f94634c;

    /* renamed from: d */
    public final Provider<C37680a> f94635d;

    /* renamed from: e */
    public final Provider<C37683d> f94636e;

    /* renamed from: f */
    public final Provider<C37584l0> f94637f;

    /* renamed from: g */
    public final Provider<C37566e0> f94638g;

    /* renamed from: h */
    public final Provider<C37588n0> f94639h;

    /* renamed from: i */
    public final Provider<C37575i> f94640i;

    /* renamed from: j */
    public final Provider<LoginRepository> f94641j;

    /* renamed from: k */
    public final Provider<LoyaltyPreferencesStorage> f94642k;

    /* renamed from: l */
    public final Provider<C28802c> f94643l;

    /* renamed from: m */
    public final Provider<MixingProductsRemoteConfigUseCase> f94644m;

    /* renamed from: n */
    public final Provider<CoroutineDispatcher> f94645n;

    /* renamed from: o */
    public final Provider<C38328d> f94646o;

    public C37718c(Provider<GetOfferProductListUseCase> provider, Provider<UpdateOfferListUseCase> provider2, Provider<OfferListModelDataMapper> provider3, Provider<C37680a> provider4, Provider<C37683d> provider5, Provider<C37584l0> provider6, Provider<C37566e0> provider7, Provider<C37588n0> provider8, Provider<C37575i> provider9, Provider<LoginRepository> provider10, Provider<LoyaltyPreferencesStorage> provider11, Provider<C28802c> provider12, Provider<MixingProductsRemoteConfigUseCase> provider13, Provider<CoroutineDispatcher> provider14, Provider<C38328d> provider15) {
        this.f94632a = provider;
        this.f94633b = provider2;
        this.f94634c = provider3;
        this.f94635d = provider4;
        this.f94636e = provider5;
        this.f94637f = provider6;
        this.f94638g = provider7;
        this.f94639h = provider8;
        this.f94640i = provider9;
        this.f94641j = provider10;
        this.f94642k = provider11;
        this.f94643l = provider12;
        this.f94644m = provider13;
        this.f94645n = provider14;
        this.f94646o = provider15;
    }

    /* renamed from: a */
    public static C37718c m154593a(Provider<GetOfferProductListUseCase> provider, Provider<UpdateOfferListUseCase> provider2, Provider<OfferListModelDataMapper> provider3, Provider<C37680a> provider4, Provider<C37683d> provider5, Provider<C37584l0> provider6, Provider<C37566e0> provider7, Provider<C37588n0> provider8, Provider<C37575i> provider9, Provider<LoginRepository> provider10, Provider<LoyaltyPreferencesStorage> provider11, Provider<C28802c> provider12, Provider<MixingProductsRemoteConfigUseCase> provider13, Provider<CoroutineDispatcher> provider14, Provider<C38328d> provider15) {
        return new C37718c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    /* renamed from: c */
    public static OfferListAndBasketControllerImpl m154594c(GetOfferProductListUseCase getOfferProductListUseCase, UpdateOfferListUseCase updateOfferListUseCase, OfferListModelDataMapper offerListModelDataMapper, C37680a aVar, C37683d dVar, C37584l0 l0Var, C37566e0 e0Var, C37588n0 n0Var, C37575i iVar, LoginRepository loginRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C28802c cVar, MixingProductsRemoteConfigUseCase mixingProductsRemoteConfigUseCase, CoroutineDispatcher coroutineDispatcher, C38328d dVar2) {
        return new OfferListAndBasketControllerImpl(getOfferProductListUseCase, updateOfferListUseCase, offerListModelDataMapper, aVar, dVar, l0Var, e0Var, n0Var, iVar, loginRepository, loyaltyPreferencesStorage, cVar, mixingProductsRemoteConfigUseCase, coroutineDispatcher, dVar2);
    }

    /* renamed from: b */
    public OfferListAndBasketControllerImpl get() {
        return m154594c(this.f94632a.get(), this.f94633b.get(), this.f94634c.get(), this.f94635d.get(), this.f94636e.get(), this.f94637f.get(), this.f94638g.get(), this.f94639h.get(), this.f94640i.get(), this.f94641j.get(), this.f94642k.get(), this.f94643l.get(), this.f94644m.get(), this.f94645n.get(), this.f94646o.get());
    }
}
