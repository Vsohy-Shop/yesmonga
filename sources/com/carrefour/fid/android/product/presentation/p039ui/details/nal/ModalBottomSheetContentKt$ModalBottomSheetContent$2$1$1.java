package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27864i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ModalBottomSheetContentKt$ModalBottomSheetContent$2$1$1 */
public final class ModalBottomSheetContentKt$ModalBottomSheetContent$2$1$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C11300l<C27864i, C11079d2> $onClick;
    final /* synthetic */ C27864i $type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetContentKt$ModalBottomSheetContent$2$1$1(C11300l<? super C27864i, C11079d2> lVar, C27864i iVar) {
        super(1);
        this.$onClick = lVar;
        this.$type = iVar;
    }

    /* renamed from: a */
    public final void mo80823a(int i) {
        this.$onClick.invoke(C27864i.C27866b.m116944d((C27864i.C27866b) this.$type, i, 0, 2, (Object) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80823a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
