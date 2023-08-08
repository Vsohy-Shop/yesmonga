package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.MessageComponentKt;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetScreen$3 */
public final class FacetStatefulKt$FacetScreen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27998a, C11079d2> $actioner;
    final /* synthetic */ C28892e<Facet> $facetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$FacetScreen$3(C28892e<Facet> eVar, C11300l<? super C27998a, C11079d2> lVar, int i) {
        super(3);
        this.$facetState = eVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if ((i & 14) == 0) {
            i |= oVar.mo15006n0(i0Var) ? 4 : 2;
        }
        if ((i & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(109708663, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetScreen.<anonymous> (FacetStateful.kt:167)");
            }
            C28892e<Facet> eVar = this.$facetState;
            if (Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28896d.f70785b) ? true : Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28894b.f70781b)) {
                oVar.mo14918M(1495734737);
                FacetStatefulKt.m117378f(i0Var, this.$actioner, oVar, (i & 14) | (this.$$dirty & 112));
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28895c) {
                oVar.mo14918M(1495734888);
                FacetStatefulKt.m117380h((Facet) ((C28892e.C28895c) this.$facetState).mo84088d(), i0Var, this.$actioner, oVar, ((i << 3) & 112) | 8 | ((this.$$dirty << 3) & 896));
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28893a) {
                oVar.mo14918M(1495735082);
                MessageComponentKt.m151549f((C8767m) null, (String) null, (C11289a<C11079d2>) null, oVar, 0, 7);
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(1495735112);
                oVar.mo15002m0();
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
