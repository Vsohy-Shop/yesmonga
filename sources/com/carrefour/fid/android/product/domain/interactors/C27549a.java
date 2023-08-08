package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.a */
public final class C27549a implements C10324h<AddMarketingElementsToPlpUseCase> {

    /* renamed from: a */
    public final Provider<C37890c> f66911a;

    /* renamed from: b */
    public final Provider<C37802t> f66912b;

    /* renamed from: c */
    public final Provider<C37672j> f66913c;

    public C27549a(Provider<C37890c> provider, Provider<C37802t> provider2, Provider<C37672j> provider3) {
        this.f66911a = provider;
        this.f66912b = provider2;
        this.f66913c = provider3;
    }

    /* renamed from: a */
    public static C27549a m115941a(Provider<C37890c> provider, Provider<C37802t> provider2, Provider<C37672j> provider3) {
        return new C27549a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static AddMarketingElementsToPlpUseCase m115942c(C37890c cVar, C37802t tVar, C37672j jVar) {
        return new AddMarketingElementsToPlpUseCase(cVar, tVar, jVar);
    }

    /* renamed from: b */
    public AddMarketingElementsToPlpUseCase get() {
        return m115942c(this.f66911a.get(), this.f66912b.get(), this.f66913c.get());
    }
}
