package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37560c;
import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37593p;
import com.carrefour.fid.android.domain.interactors.basket.C37594p0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase;
import com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37827o;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics.C26092a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.a */
public final class C26091a implements C10324h<CheckoutStep2ViewModel> {

    /* renamed from: a */
    public final Provider<AccountRepository> f63761a;

    /* renamed from: b */
    public final Provider<C37606z> f63762b;

    /* renamed from: c */
    public final Provider<C37593p> f63763c;

    /* renamed from: d */
    public final Provider<GetOfferDetailsInBasketUseCase> f63764d;

    /* renamed from: e */
    public final Provider<C37584l0> f63765e;

    /* renamed from: f */
    public final Provider<C37594p0> f63766f;

    /* renamed from: g */
    public final Provider<ShowPreparationFeesUseCase> f63767g;

    /* renamed from: h */
    public final Provider<C37823k> f63768h;

    /* renamed from: i */
    public final Provider<C37827o> f63769i;

    /* renamed from: j */
    public final Provider<C37807b> f63770j;

    /* renamed from: k */
    public final Provider<C37560c> f63771k;

    /* renamed from: l */
    public final Provider<C37561c0> f63772l;

    /* renamed from: m */
    public final Provider<C26092a> f63773m;

    /* renamed from: n */
    public final Provider<C19456p0> f63774n;

    public C26091a(Provider<AccountRepository> provider, Provider<C37606z> provider2, Provider<C37593p> provider3, Provider<GetOfferDetailsInBasketUseCase> provider4, Provider<C37584l0> provider5, Provider<C37594p0> provider6, Provider<ShowPreparationFeesUseCase> provider7, Provider<C37823k> provider8, Provider<C37827o> provider9, Provider<C37807b> provider10, Provider<C37560c> provider11, Provider<C37561c0> provider12, Provider<C26092a> provider13, Provider<C19456p0> provider14) {
        this.f63761a = provider;
        this.f63762b = provider2;
        this.f63763c = provider3;
        this.f63764d = provider4;
        this.f63765e = provider5;
        this.f63766f = provider6;
        this.f63767g = provider7;
        this.f63768h = provider8;
        this.f63769i = provider9;
        this.f63770j = provider10;
        this.f63771k = provider11;
        this.f63772l = provider12;
        this.f63773m = provider13;
        this.f63774n = provider14;
    }

    /* renamed from: a */
    public static C26091a m111563a(Provider<AccountRepository> provider, Provider<C37606z> provider2, Provider<C37593p> provider3, Provider<GetOfferDetailsInBasketUseCase> provider4, Provider<C37584l0> provider5, Provider<C37594p0> provider6, Provider<ShowPreparationFeesUseCase> provider7, Provider<C37823k> provider8, Provider<C37827o> provider9, Provider<C37807b> provider10, Provider<C37560c> provider11, Provider<C37561c0> provider12, Provider<C26092a> provider13, Provider<C19456p0> provider14) {
        return new C26091a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    /* renamed from: c */
    public static CheckoutStep2ViewModel m111564c(AccountRepository accountRepository, C37606z zVar, C37593p pVar, GetOfferDetailsInBasketUseCase getOfferDetailsInBasketUseCase, C37584l0 l0Var, C37594p0 p0Var, ShowPreparationFeesUseCase showPreparationFeesUseCase, C37823k kVar, C37827o oVar, C37807b bVar, C37560c cVar, C37561c0 c0Var, C26092a aVar, C19456p0 p0Var2) {
        return new CheckoutStep2ViewModel(accountRepository, zVar, pVar, getOfferDetailsInBasketUseCase, l0Var, p0Var, showPreparationFeesUseCase, kVar, oVar, bVar, cVar, c0Var, aVar, p0Var2);
    }

    /* renamed from: b */
    public CheckoutStep2ViewModel get() {
        return m111564c(this.f63761a.get(), this.f63762b.get(), this.f63763c.get(), this.f63764d.get(), this.f63765e.get(), this.f63766f.get(), this.f63767g.get(), this.f63768h.get(), this.f63769i.get(), this.f63770j.get(), this.f63771k.get(), this.f63772l.get(), this.f63773m.get(), this.f63774n.get());
    }
}
