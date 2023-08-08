package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.domain.interactors.product.C37760h;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.product.domain.interactors.C27567l;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.a */
public final class C28199a implements C10324h<PlpFlowProvider> {

    /* renamed from: a */
    public final Provider<C37823k> f68301a;

    /* renamed from: b */
    public final Provider<C37760h> f68302b;

    /* renamed from: c */
    public final Provider<C27567l> f68303c;

    public C28199a(Provider<C37823k> provider, Provider<C37760h> provider2, Provider<C27567l> provider3) {
        this.f68301a = provider;
        this.f68302b = provider2;
        this.f68303c = provider3;
    }

    /* renamed from: a */
    public static C28199a m118073a(Provider<C37823k> provider, Provider<C37760h> provider2, Provider<C27567l> provider3) {
        return new C28199a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static PlpFlowProvider m118074c(C37823k kVar, C37760h hVar, C27567l lVar) {
        return new PlpFlowProvider(kVar, hVar, lVar);
    }

    /* renamed from: b */
    public PlpFlowProvider get() {
        return m118074c(this.f68301a.get(), this.f68302b.get(), this.f68303c.get());
    }
}
