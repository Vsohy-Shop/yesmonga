package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$3 */
public final class ModalBottomSheetContentKt$ModalBottomSheetContent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C27864i, C11079d2> $onClick;
    final /* synthetic */ C27864i $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetContentKt$ModalBottomSheetContent$3(C27864i iVar, C8767m mVar, C11300l<? super C27864i, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$type = iVar;
        this.$modifier = mVar;
        this.$onClick = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ModalBottomSheetContentKt.m116821a(this.$type, this.$modifier, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
