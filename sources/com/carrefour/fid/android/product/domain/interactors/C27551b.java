package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37750b;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.domain.interactors.b */
public final class C27551b implements C37750b {
    @C12579k

    /* renamed from: a */
    public final FacetRepository f66916a;

    @Inject
    public C27551b(@C12579k FacetRepository facetRepository) {
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        this.f66916a = facetRepository;
    }

    /* renamed from: a */
    public void mo80029a() {
        this.f66916a.mo80170a();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        mo80029a();
        return C11079d2.f28267a;
    }
}
