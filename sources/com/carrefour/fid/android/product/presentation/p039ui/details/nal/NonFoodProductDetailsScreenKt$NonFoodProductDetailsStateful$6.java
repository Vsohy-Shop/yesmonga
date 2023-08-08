package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$6 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C28123g $analyticsViewModel;
    final /* synthetic */ C11300l<Integer, C11079d2> $handleComponentExpandComplete;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onDeliveryChoiceInfoRedirection;
    final /* synthetic */ C11289a<C11079d2> $onHeartClicked;
    final /* synthetic */ C11300l<ReinsuranceType, C11079d2> $onReinsuranceClicked;
    final /* synthetic */ C11289a<C11079d2> $onServiceSelectionRequired;
    final /* synthetic */ C11289a<C11079d2> $onSignInRequired;
    final /* synthetic */ C11300l<String, C11079d2> $onWebRedirection;
    final /* synthetic */ NonFoodProductDetailsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$6(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, C28123g gVar, C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super Boolean, C11079d2> lVar2, C11289a<C11079d2> aVar4, C11300l<? super Integer, C11079d2> lVar3, C11300l<? super ReinsuranceType, C11079d2> lVar4, int i) {
        super(2);
        this.$viewModel = nonFoodProductDetailsViewModel;
        this.$analyticsViewModel = gVar;
        this.$onBackPressed = aVar;
        this.$onWebRedirection = lVar;
        this.$onSignInRequired = aVar2;
        this.$onServiceSelectionRequired = aVar3;
        this.$onDeliveryChoiceInfoRedirection = lVar2;
        this.$onHeartClicked = aVar4;
        this.$handleComponentExpandComplete = lVar3;
        this.$onReinsuranceClicked = lVar4;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodProductDetailsScreenKt.m116863m(this.$viewModel, this.$analyticsViewModel, this.$onBackPressed, this.$onWebRedirection, this.$onSignInRequired, this.$onServiceSelectionRequired, this.$onDeliveryChoiceInfoRedirection, this.$onHeartClicked, this.$handleComponentExpandComplete, this.$onReinsuranceClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
