package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.product.Filter;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$5 */
public final class FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$5 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27965a, C11079d2> $actioner;
    final /* synthetic */ Filter.CheckboxFilter $currentFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$5(Filter.CheckboxFilter checkboxFilter, C11300l<? super C27965a, C11079d2> lVar, int i) {
        super(3);
        this.$currentFilters = checkboxFilter;
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
        int i2;
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if ((i & 14) == 0) {
            i2 = (oVar.mo15006n0(i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-340427429, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsScreen.<anonymous> (FacetFilterDetailsStateful.kt:200)");
            }
            FacetFilterDetailsStatefulKt.m117343e(PaddingKt.m10023j(C8767m.f23478j, i0Var), this.$currentFilters, this.$actioner, oVar, ((this.$$dirty >> 6) & 896) | 64);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
