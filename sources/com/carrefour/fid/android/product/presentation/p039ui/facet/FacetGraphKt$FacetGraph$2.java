package com.carrefour.fid.android.product.presentation.p039ui.facet;

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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.FacetGraphKt$FacetGraph$2 */
public final class FacetGraphKt$FacetGraph$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C27950a $analytics;
    final /* synthetic */ C11289a<C11079d2> $displayErrorSnackbar;
    final /* synthetic */ C11289a<C11079d2> $onBackPress;
    final /* synthetic */ C11289a<C11079d2> $onShowAllergoBoxInformationPressed;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ FacetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetGraphKt$FacetGraph$2(FacetViewModel facetViewModel, C27950a aVar, C38326b bVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, int i, int i2) {
        super(2);
        this.$viewModel = facetViewModel;
        this.$analytics = aVar;
        this.$performance = bVar;
        this.$onBackPress = aVar2;
        this.$onShowAllergoBoxInformationPressed = aVar3;
        this.$displayErrorSnackbar = aVar4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        FacetGraphKt.m117312a(this.$viewModel, this.$analytics, this.$performance, this.$onBackPress, this.$onShowAllergoBoxInformationPressed, this.$displayErrorSnackbar, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
