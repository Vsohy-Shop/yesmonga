package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.f */
public final class C27128f implements C10324h<PhysicalStoreViewModel> {

    /* renamed from: a */
    public final Provider<C37832c> f65974a;

    /* renamed from: b */
    public final Provider<C37816e> f65975b;

    /* renamed from: c */
    public final Provider<C37833d> f65976c;

    /* renamed from: d */
    public final Provider<C37878e> f65977d;

    /* renamed from: e */
    public final Provider<LoyaltyPreferencesStorage> f65978e;

    /* renamed from: f */
    public final Provider<GetLoyaltyBalanceUseCase> f65979f;

    /* renamed from: g */
    public final Provider<FetchCouponsUseCase> f65980g;

    /* renamed from: h */
    public final Provider<C37823k> f65981h;

    /* renamed from: i */
    public final Provider<GetStickersContentUseCase> f65982i;

    /* renamed from: j */
    public final Provider<C37888b> f65983j;

    /* renamed from: k */
    public final Provider<LoginRepository> f65984k;

    /* renamed from: l */
    public final Provider<C37610b> f65985l;

    public C27128f(Provider<C37832c> provider, Provider<C37816e> provider2, Provider<C37833d> provider3, Provider<C37878e> provider4, Provider<LoyaltyPreferencesStorage> provider5, Provider<GetLoyaltyBalanceUseCase> provider6, Provider<FetchCouponsUseCase> provider7, Provider<C37823k> provider8, Provider<GetStickersContentUseCase> provider9, Provider<C37888b> provider10, Provider<LoginRepository> provider11, Provider<C37610b> provider12) {
        this.f65974a = provider;
        this.f65975b = provider2;
        this.f65976c = provider3;
        this.f65977d = provider4;
        this.f65978e = provider5;
        this.f65979f = provider6;
        this.f65980g = provider7;
        this.f65981h = provider8;
        this.f65982i = provider9;
        this.f65983j = provider10;
        this.f65984k = provider11;
        this.f65985l = provider12;
    }

    /* renamed from: a */
    public static C27128f m114662a(Provider<C37832c> provider, Provider<C37816e> provider2, Provider<C37833d> provider3, Provider<C37878e> provider4, Provider<LoyaltyPreferencesStorage> provider5, Provider<GetLoyaltyBalanceUseCase> provider6, Provider<FetchCouponsUseCase> provider7, Provider<C37823k> provider8, Provider<GetStickersContentUseCase> provider9, Provider<C37888b> provider10, Provider<LoginRepository> provider11, Provider<C37610b> provider12) {
        return new C27128f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    /* renamed from: c */
    public static PhysicalStoreViewModel m114663c(C37832c cVar, C37816e eVar, C37833d dVar, C37878e eVar2, LoyaltyPreferencesStorage loyaltyPreferencesStorage, GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, FetchCouponsUseCase fetchCouponsUseCase, C37823k kVar, GetStickersContentUseCase getStickersContentUseCase, C37888b bVar, LoginRepository loginRepository, C37610b bVar2) {
        return new PhysicalStoreViewModel(cVar, eVar, dVar, eVar2, loyaltyPreferencesStorage, getLoyaltyBalanceUseCase, fetchCouponsUseCase, kVar, getStickersContentUseCase, bVar, loginRepository, bVar2);
    }

    /* renamed from: b */
    public PhysicalStoreViewModel get() {
        return m114663c(this.f65974a.get(), this.f65975b.get(), this.f65976c.get(), this.f65977d.get(), this.f65978e.get(), this.f65979f.get(), this.f65980g.get(), this.f65981h.get(), this.f65982i.get(), this.f65983j.get(), this.f65984k.get(), this.f65985l.get());
    }
}
