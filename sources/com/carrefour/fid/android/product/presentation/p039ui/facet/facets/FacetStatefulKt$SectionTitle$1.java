package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$SectionTitle$1 */
public final class FacetStatefulKt$SectionTitle$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $titleId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$SectionTitle$1(int i, int i2) {
        super(2);
        this.$titleId = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FacetStatefulKt.m117379g(this.$titleId, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
