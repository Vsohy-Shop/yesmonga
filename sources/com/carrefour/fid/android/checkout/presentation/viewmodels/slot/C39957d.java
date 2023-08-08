package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.domain.interactors.basket.C37564e;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.order.C37738n;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
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
/* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.d */
public final class C39957d implements C10324h<ServiceSlotViewModel> {

    /* renamed from: a */
    public final Provider<C37861g> f101917a;

    /* renamed from: b */
    public final Provider<C37823k> f101918b;

    /* renamed from: c */
    public final Provider<C37569f0> f101919c;

    /* renamed from: d */
    public final Provider<C37566e0> f101920d;

    /* renamed from: e */
    public final Provider<C37584l0> f101921e;

    /* renamed from: f */
    public final Provider<C37564e> f101922f;

    /* renamed from: g */
    public final Provider<C37738n> f101923g;

    /* renamed from: h */
    public final Provider<C37812b> f101924h;

    /* renamed from: i */
    public final Provider<C37818g> f101925i;

    /* renamed from: j */
    public final Provider<C37620b> f101926j;

    /* renamed from: k */
    public final Provider<C37817f> f101927k;

    /* renamed from: l */
    public final Provider<C37836s> f101928l;

    /* renamed from: m */
    public final Provider<C37841v> f101929m;

    /* renamed from: n */
    public final Provider<C37811a> f101930n;

    /* renamed from: o */
    public final Provider<C37807b> f101931o;

    /* renamed from: p */
    public final Provider<C39866a> f101932p;

    /* renamed from: q */
    public final Provider<C19456p0> f101933q;

    public C39957d(Provider<C37861g> provider, Provider<C37823k> provider2, Provider<C37569f0> provider3, Provider<C37566e0> provider4, Provider<C37584l0> provider5, Provider<C37564e> provider6, Provider<C37738n> provider7, Provider<C37812b> provider8, Provider<C37818g> provider9, Provider<C37620b> provider10, Provider<C37817f> provider11, Provider<C37836s> provider12, Provider<C37841v> provider13, Provider<C37811a> provider14, Provider<C37807b> provider15, Provider<C39866a> provider16, Provider<C19456p0> provider17) {
        this.f101917a = provider;
        this.f101918b = provider2;
        this.f101919c = provider3;
        this.f101920d = provider4;
        this.f101921e = provider5;
        this.f101922f = provider6;
        this.f101923g = provider7;
        this.f101924h = provider8;
        this.f101925i = provider9;
        this.f101926j = provider10;
        this.f101927k = provider11;
        this.f101928l = provider12;
        this.f101929m = provider13;
        this.f101930n = provider14;
        this.f101931o = provider15;
        this.f101932p = provider16;
        this.f101933q = provider17;
    }

    /* renamed from: a */
    public static C39957d m162858a(Provider<C37861g> provider, Provider<C37823k> provider2, Provider<C37569f0> provider3, Provider<C37566e0> provider4, Provider<C37584l0> provider5, Provider<C37564e> provider6, Provider<C37738n> provider7, Provider<C37812b> provider8, Provider<C37818g> provider9, Provider<C37620b> provider10, Provider<C37817f> provider11, Provider<C37836s> provider12, Provider<C37841v> provider13, Provider<C37811a> provider14, Provider<C37807b> provider15, Provider<C39866a> provider16, Provider<C19456p0> provider17) {
        return new C39957d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    /* renamed from: c */
    public static ServiceSlotViewModel m162859c(C37861g gVar, C37823k kVar, C37569f0 f0Var, C37566e0 e0Var, C37584l0 l0Var, C37564e eVar, C37738n nVar, C37812b bVar, C37818g gVar2, C37620b bVar2, C37817f fVar, C37836s sVar, C37841v vVar, C37811a aVar, C37807b bVar3, C39866a aVar2, C19456p0 p0Var) {
        return new ServiceSlotViewModel(gVar, kVar, f0Var, e0Var, l0Var, eVar, nVar, bVar, gVar2, bVar2, fVar, sVar, vVar, aVar, bVar3, aVar2, p0Var);
    }

    /* renamed from: b */
    public ServiceSlotViewModel get() {
        return m162859c(this.f101917a.get(), this.f101918b.get(), this.f101919c.get(), this.f101920d.get(), this.f101921e.get(), this.f101922f.get(), this.f101923g.get(), this.f101924h.get(), this.f101925i.get(), this.f101926j.get(), this.f101927k.get(), this.f101928l.get(), this.f101929m.get(), this.f101930n.get(), this.f101931o.get(), this.f101932p.get(), this.f101933q.get());
    }
}
