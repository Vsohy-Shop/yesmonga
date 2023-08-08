package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.product.Product;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.QuantityListBottomSheetComponentKt$QuantityListBottomSheetComponent$2 */
public final class C23544xfb465849 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C23547a $bottomSheetData;
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C11304p<Product, Integer, C11079d2> $onNewQuantitySelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23544xfb465849(ModalBottomSheetState modalBottomSheetState, C23547a aVar, C11304p<? super Product, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$modalBottomSheetState = modalBottomSheetState;
        this.$bottomSheetData = aVar;
        this.$onNewQuantitySelected = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        QuantityListBottomSheetComponentKt.m104771a(this.$modalBottomSheetState, this.$bottomSheetData, this.$onNewQuantitySelected, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
