package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.c */
public final class C27554c implements C10324h<C27551b> {

    /* renamed from: a */
    public final Provider<FacetRepository> f66918a;

    public C27554c(Provider<FacetRepository> provider) {
        this.f66918a = provider;
    }

    /* renamed from: a */
    public static C27554c m115949a(Provider<FacetRepository> provider) {
        return new C27554c(provider);
    }

    /* renamed from: c */
    public static C27551b m115950c(FacetRepository facetRepository) {
        return new C27551b(facetRepository);
    }

    /* renamed from: b */
    public C27551b get() {
        return m115950c(this.f66918a.get());
    }
}
