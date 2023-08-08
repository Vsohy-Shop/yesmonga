package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.domain.interactors.basket.C37564e;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.order.C37738n;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.interactors.slot.C37861g;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.a */
public final class C39951a implements C10324h<ServiceSlotOmrViewModel> {

    /* renamed from: a */
    public final Provider<C37861g> f101903a;

    /* renamed from: b */
    public final Provider<C37823k> f101904b;

    /* renamed from: c */
    public final Provider<C37569f0> f101905c;

    /* renamed from: d */
    public final Provider<C37812b> f101906d;

    /* renamed from: e */
    public final Provider<C37818g> f101907e;

    /* renamed from: f */
    public final Provider<C37620b> f101908f;

    /* renamed from: g */
    public final Provider<C37817f> f101909g;

    /* renamed from: h */
    public final Provider<C37836s> f101910h;

    /* renamed from: i */
    public final Provider<C37841v> f101911i;

    /* renamed from: j */
    public final Provider<C37564e> f101912j;

    /* renamed from: k */
    public final Provider<C37738n> f101913k;

    /* renamed from: l */
    public final Provider<C39866a> f101914l;

    /* renamed from: m */
    public final Provider<C19456p0> f101915m;

    public C39951a(Provider<C37861g> provider, Provider<C37823k> provider2, Provider<C37569f0> provider3, Provider<C37812b> provider4, Provider<C37818g> provider5, Provider<C37620b> provider6, Provider<C37817f> provider7, Provider<C37836s> provider8, Provider<C37841v> provider9, Provider<C37564e> provider10, Provider<C37738n> provider11, Provider<C39866a> provider12, Provider<C19456p0> provider13) {
        this.f101903a = provider;
        this.f101904b = provider2;
        this.f101905c = provider3;
        this.f101906d = provider4;
        this.f101907e = provider5;
        this.f101908f = provider6;
        this.f101909g = provider7;
        this.f101910h = provider8;
        this.f101911i = provider9;
        this.f101912j = provider10;
        this.f101913k = provider11;
        this.f101914l = provider12;
        this.f101915m = provider13;
    }

    /* renamed from: a */
    public static C39951a m162849a(Provider<C37861g> provider, Provider<C37823k> provider2, Provider<C37569f0> provider3, Provider<C37812b> provider4, Provider<C37818g> provider5, Provider<C37620b> provider6, Provider<C37817f> provider7, Provider<C37836s> provider8, Provider<C37841v> provider9, Provider<C37564e> provider10, Provider<C37738n> provider11, Provider<C39866a> provider12, Provider<C19456p0> provider13) {
        return new C39951a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    /* renamed from: c */
    public static ServiceSlotOmrViewModel m162850c(C37861g gVar, C37823k kVar, C37569f0 f0Var, C37812b bVar, C37818g gVar2, C37620b bVar2, C37817f fVar, C37836s sVar, C37841v vVar, C37564e eVar, C37738n nVar, C39866a aVar, C19456p0 p0Var) {
        return new ServiceSlotOmrViewModel(gVar, kVar, f0Var, bVar, gVar2, bVar2, fVar, sVar, vVar, eVar, nVar, aVar, p0Var);
    }

    /* renamed from: b */
    public ServiceSlotOmrViewModel get() {
        return m162850c(this.f101903a.get(), this.f101904b.get(), this.f101905c.get(), this.f101906d.get(), this.f101907e.get(), this.f101908f.get(), this.f101909g.get(), this.f101910h.get(), this.f101911i.get(), this.f101912j.get(), this.f101913k.get(), this.f101914l.get(), this.f101915m.get());
    }
}
