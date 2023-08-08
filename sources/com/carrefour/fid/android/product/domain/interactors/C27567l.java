package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.domain.interactors.l */
public final class C27567l implements C11300l<C11045c<? super C11907e<? extends Facet>>, Object>, C11074j {
    @C12579k

    /* renamed from: a */
    public final FacetRepository f66954a;

    @Inject
    public C27567l(@C12579k FacetRepository facetRepository) {
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        this.f66954a = facetRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k C11045c<? super C11907e<Facet>> cVar) {
        return C11909g.m47385M0(this.f66954a.mo80173e().getValue());
    }
}
