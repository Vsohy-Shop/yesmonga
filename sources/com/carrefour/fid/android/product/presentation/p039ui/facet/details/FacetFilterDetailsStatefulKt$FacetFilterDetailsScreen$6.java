package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$6 */
public final class FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C27965a, C11079d2> $actioner;
    final /* synthetic */ Filter.CheckboxFilter $currentFilters;
    final /* synthetic */ boolean $displayAllergenDialogConfirmation;
    final /* synthetic */ Facet $facet;
    final /* synthetic */ boolean $isUpdating;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FacetFilterDetailsScreen$6(Facet facet, Filter.CheckboxFilter checkboxFilter, boolean z, boolean z2, C11300l<? super C27965a, C11079d2> lVar, int i) {
        super(2);
        this.$facet = facet;
        this.$currentFilters = checkboxFilter;
        this.$displayAllergenDialogConfirmation = z;
        this.$isUpdating = z2;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FacetFilterDetailsStatefulKt.m117340b(this.$facet, this.$currentFilters, this.$displayAllergenDialogConfirmation, this.$isUpdating, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
