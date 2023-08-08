package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetComponentKt$ModalBottomSheetComponent$2 */
public final class ModalBottomSheetComponentKt$ModalBottomSheetComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $sheetContent;
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetComponentKt$ModalBottomSheetComponent$2(ModalBottomSheetState modalBottomSheetState, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$modalBottomSheetState = modalBottomSheetState;
        this.$snackbarHost = qVar;
        this.$sheetContent = qVar2;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ModalBottomSheetComponentKt.m116819a(this.$modalBottomSheetState, this.$snackbarHost, this.$sheetContent, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
