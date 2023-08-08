package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$6 */
public final class FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C27950a $analytics;
    final /* synthetic */ C11289a<C11079d2> $displayErrorSnackbar;
    final /* synthetic */ C11289a<C11079d2> $onBackClicked;
    final /* synthetic */ C11289a<C11079d2> $onSeeProductClicked;
    final /* synthetic */ C11289a<C11079d2> $onShowAllergenClicked;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ String $selectedFilter;
    final /* synthetic */ FacetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$6(FacetViewModel facetViewModel, C27950a aVar, C38326b bVar, String str, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, int i) {
        super(2);
        this.$viewModel = facetViewModel;
        this.$analytics = aVar;
        this.$performance = bVar;
        this.$selectedFilter = str;
        this.$onBackClicked = aVar2;
        this.$onSeeProductClicked = aVar3;
        this.$onShowAllergenClicked = aVar4;
        this.$displayErrorSnackbar = aVar5;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FacetFilterDetailsStatefulKt.m117342d(this.$viewModel, this.$analytics, this.$performance, this.$selectedFilter, this.$onBackClicked, this.$onSeeProductClicked, this.$onShowAllergenClicked, this.$displayErrorSnackbar, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
