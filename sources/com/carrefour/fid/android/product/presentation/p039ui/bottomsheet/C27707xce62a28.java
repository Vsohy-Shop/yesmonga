package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$1 */
public final class C27707xce62a28 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ String $initialProductGtin;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27707xce62a28(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, String str) {
        super(0);
        this.$viewModel = alternativeProductsBottomSheetViewModel;
        this.$initialProductGtin = str;
    }

    public final void invoke() {
        this.$viewModel.mo81685j0(this.$initialProductGtin);
    }
}
