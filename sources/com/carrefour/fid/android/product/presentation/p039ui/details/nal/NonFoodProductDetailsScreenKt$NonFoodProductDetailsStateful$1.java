package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.material.ModalBottomSheetState;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$1 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$1(ModalBottomSheetState modalBottomSheetState, C11300l<? super C27870j, C11079d2> lVar, C11289a<C11079d2> aVar) {
        super(0);
        this.$modalBottomSheetState = modalBottomSheetState;
        this.$actioner = lVar;
        this.$onBackPressed = aVar;
    }

    public final void invoke() {
        if (this.$modalBottomSheetState.mo10294n()) {
            this.$actioner.invoke(C27870j.C27881h.C27882a.f67519a);
        } else {
            this.$onBackPressed.invoke();
        }
    }
}
