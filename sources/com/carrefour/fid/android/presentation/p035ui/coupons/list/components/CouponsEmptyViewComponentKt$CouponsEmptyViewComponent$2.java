package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$2 */
public final class CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isShowBarCodeButtonEnabled;
    final /* synthetic */ C11289a<C11079d2> $onShowBarCodeClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsEmptyViewComponentKt$CouponsEmptyViewComponent$2(boolean z, C11289a<C11079d2> aVar, int i) {
        super(2);
        this.$isShowBarCodeButtonEnabled = z;
        this.$onShowBarCodeClicked = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CouponsEmptyViewComponentKt.m105646a(this.$isShowBarCodeButtonEnabled, this.$onShowBarCodeClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
