package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.shared.extension.C28759i;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetScreen$2 */
public final class FacetStatefulKt$FacetScreen$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27998a, C11079d2> $actioner;
    final /* synthetic */ C28892e<Facet> $facetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$FacetScreen$2(C28892e<Facet> eVar, C11300l<? super C27998a, C11079d2> lVar, int i) {
        super(2);
        this.$facetState = eVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1546682497, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetScreen.<anonymous> (FacetStateful.kt:156)");
            }
            Facet facet = (Facet) C28897f.m119478b(this.$facetState);
            int j = facet != null ? facet.mo118346j() : 0;
            if (C28759i.m119064a(Integer.valueOf(j), 0)) {
                FacetStatefulKt.m117377e(j, !C28897f.m119479c(this.$facetState), this.$actioner, oVar, (this.$$dirty << 3) & 896);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
