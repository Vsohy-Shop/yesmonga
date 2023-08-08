package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.product.presentation.p039ui.facet.details.C27965a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$GridItem$1 */
public final class FacetFilterDetailsStatefulKt$GridItem$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C27965a, C11079d2> $actioner;
    final /* synthetic */ String $filterField;
    final /* synthetic */ Term $term;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$GridItem$1(C11300l<? super C27965a, C11079d2> lVar, String str, Term term) {
        super(0);
        this.$actioner = lVar;
        this.$filterField = str;
        this.$term = term;
    }

    public final void invoke() {
        this.$actioner.invoke(new C27965a.C27967b(new C38105d(this.$filterField, C10976s.m41419k(C38112f.m157657a(this.$term.mo118626e())), (DefaultConstructorMarker) null)));
    }
}
