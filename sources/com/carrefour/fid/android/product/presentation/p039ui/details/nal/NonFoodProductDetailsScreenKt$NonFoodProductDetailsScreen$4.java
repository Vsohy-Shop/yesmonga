package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.material.C3043g;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$4 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ C27854a $basketData;
    final /* synthetic */ C3043g $bottomSheetState;
    final /* synthetic */ C27906t $errorVariant;
    final /* synthetic */ boolean $isBottomSheetDisplayed;
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C27864i $modalBottomSheetType;
    final /* synthetic */ C27899o $productData;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsScreen$4(C3043g gVar, ModalBottomSheetState modalBottomSheetState, C27864i iVar, C27899o oVar, C27854a aVar, boolean z, SnackbarHostState snackbarHostState, C27906t tVar, C11300l<? super C27870j, C11079d2> lVar, int i) {
        super(2);
        this.$bottomSheetState = gVar;
        this.$modalBottomSheetState = modalBottomSheetState;
        this.$modalBottomSheetType = iVar;
        this.$productData = oVar;
        this.$basketData = aVar;
        this.$isBottomSheetDisplayed = z;
        this.$snackbarHostState = snackbarHostState;
        this.$errorVariant = tVar;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodProductDetailsScreenKt.m116861k(this.$bottomSheetState, this.$modalBottomSheetState, this.$modalBottomSheetType, this.$productData, this.$basketData, this.$isBottomSheetDisplayed, this.$snackbarHostState, this.$errorVariant, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
