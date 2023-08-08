package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.basket.C37567f;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase;
import com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase;
import com.carrefour.fid.android.domain.interactors.product.C37748a;
import com.carrefour.fid.android.domain.interactors.product.C37751c;
import com.carrefour.fid.android.domain.interactors.product.C37803u;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37825m;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.c */
public final class C26145c implements C10324h<NonFoodCheckout1ViewModel> {

    /* renamed from: a */
    public final Provider<UpdateBasketUseCase> f63931a;

    /* renamed from: b */
    public final Provider<ObserveBasketAndOffersUseCase> f63932b;

    /* renamed from: c */
    public final Provider<C37803u> f63933c;

    /* renamed from: d */
    public final Provider<C37748a> f63934d;

    /* renamed from: e */
    public final Provider<C37751c> f63935e;

    /* renamed from: f */
    public final Provider<C37567f> f63936f;

    /* renamed from: g */
    public final Provider<C37596r> f63937g;

    /* renamed from: h */
    public final Provider<C37825m> f63938h;

    /* renamed from: i */
    public final Provider<ShowPreparationFeesUseCase> f63939i;

    /* renamed from: j */
    public final Provider<C19456p0> f63940j;

    public C26145c(Provider<UpdateBasketUseCase> provider, Provider<ObserveBasketAndOffersUseCase> provider2, Provider<C37803u> provider3, Provider<C37748a> provider4, Provider<C37751c> provider5, Provider<C37567f> provider6, Provider<C37596r> provider7, Provider<C37825m> provider8, Provider<ShowPreparationFeesUseCase> provider9, Provider<C19456p0> provider10) {
        this.f63931a = provider;
        this.f63932b = provider2;
        this.f63933c = provider3;
        this.f63934d = provider4;
        this.f63935e = provider5;
        this.f63936f = provider6;
        this.f63937g = provider7;
        this.f63938h = provider8;
        this.f63939i = provider9;
        this.f63940j = provider10;
    }

    /* renamed from: a */
    public static C26145c m111772a(Provider<UpdateBasketUseCase> provider, Provider<ObserveBasketAndOffersUseCase> provider2, Provider<C37803u> provider3, Provider<C37748a> provider4, Provider<C37751c> provider5, Provider<C37567f> provider6, Provider<C37596r> provider7, Provider<C37825m> provider8, Provider<ShowPreparationFeesUseCase> provider9, Provider<C19456p0> provider10) {
        return new C26145c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    /* renamed from: c */
    public static NonFoodCheckout1ViewModel m111773c(UpdateBasketUseCase updateBasketUseCase, ObserveBasketAndOffersUseCase observeBasketAndOffersUseCase, C37803u uVar, C37748a aVar, C37751c cVar, C37567f fVar, C37596r rVar, C37825m mVar, ShowPreparationFeesUseCase showPreparationFeesUseCase, C19456p0 p0Var) {
        return new NonFoodCheckout1ViewModel(updateBasketUseCase, observeBasketAndOffersUseCase, uVar, aVar, cVar, fVar, rVar, mVar, showPreparationFeesUseCase, p0Var);
    }

    /* renamed from: b */
    public NonFoodCheckout1ViewModel get() {
        return m111773c(this.f63931a.get(), this.f63932b.get(), this.f63933c.get(), this.f63934d.get(), this.f63935e.get(), this.f63936f.get(), this.f63937g.get(), this.f63938h.get(), this.f63939i.get(), this.f63940j.get());
    }
}
