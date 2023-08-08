package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29001e;
import com.carrefour.fid.android.tracking.product.C29021a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.d */
public final class C26817d implements C10324h<AdditionalOrderDepartmentViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f65407a;

    /* renamed from: b */
    public final Provider<C29021a> f65408b;

    /* renamed from: c */
    public final Provider<C29001e> f65409c;

    /* renamed from: d */
    public final Provider<C37807b> f65410d;

    /* renamed from: e */
    public final Provider<CoroutineDispatcher> f65411e;

    public C26817d(Provider<C37716b> provider, Provider<C29021a> provider2, Provider<C29001e> provider3, Provider<C37807b> provider4, Provider<CoroutineDispatcher> provider5) {
        this.f65407a = provider;
        this.f65408b = provider2;
        this.f65409c = provider3;
        this.f65410d = provider4;
        this.f65411e = provider5;
    }

    /* renamed from: a */
    public static C26817d m113812a(Provider<C37716b> provider, Provider<C29021a> provider2, Provider<C29001e> provider3, Provider<C37807b> provider4, Provider<CoroutineDispatcher> provider5) {
        return new C26817d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static AdditionalOrderDepartmentViewModel m113813c(C37716b bVar, C29021a aVar, C29001e eVar, C37807b bVar2, CoroutineDispatcher coroutineDispatcher) {
        return new AdditionalOrderDepartmentViewModel(bVar, aVar, eVar, bVar2, coroutineDispatcher);
    }

    /* renamed from: b */
    public AdditionalOrderDepartmentViewModel get() {
        return m113813c(this.f65407a.get(), this.f65408b.get(), this.f65409c.get(), this.f65410d.get(), this.f65411e.get());
    }
}
