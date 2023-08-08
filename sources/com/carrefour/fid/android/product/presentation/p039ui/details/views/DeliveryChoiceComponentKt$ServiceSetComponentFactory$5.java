package com.carrefour.fid.android.product.presentation.p039ui.details.views;

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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.DeliveryChoiceComponentKt$ServiceSetComponentFactory$5 */
public final class DeliveryChoiceComponentKt$ServiceSetComponentFactory$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C27934i, C11079d2> $onClick;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onInfoClicked;
    final /* synthetic */ C27934i $serviceSet;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryChoiceComponentKt$ServiceSetComponentFactory$5(C8767m mVar, C27934i iVar, C11300l<? super C27934i, C11079d2> lVar, C11300l<? super Boolean, C11079d2> lVar2, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$serviceSet = iVar;
        this.$onClick = lVar;
        this.$onInfoClicked = lVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DeliveryChoiceComponentKt.m117175c(this.$modifier, this.$serviceSet, this.$onClick, this.$onInfoClicked, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
