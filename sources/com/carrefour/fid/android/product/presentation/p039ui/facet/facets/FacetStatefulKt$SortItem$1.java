package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C27998a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$SortItem$1 */
public final class FacetStatefulKt$SortItem$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C27998a, C11079d2> $actioner;
    final /* synthetic */ Sort $sort;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$SortItem$1(C11300l<? super C27998a, C11079d2> lVar, Sort sort) {
        super(0);
        this.$actioner = lVar;
        this.$sort = sort;
    }

    public final void invoke() {
        this.$actioner.invoke(new C27998a.C28003e(this.$sort));
    }
}
