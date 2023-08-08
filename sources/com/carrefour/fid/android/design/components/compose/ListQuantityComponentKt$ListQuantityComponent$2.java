package com.carrefour.fid.android.design.components.compose;

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
public final class ListQuantityComponentKt$ListQuantityComponent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $incrementQuantity;
    final /* synthetic */ int $maxQuantity;
    final /* synthetic */ int $minQuantity;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Integer, C11079d2> $onClick;
    final /* synthetic */ int $selectedQuantity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListQuantityComponentKt$ListQuantityComponent$2(C8767m mVar, int i, int i2, int i3, int i4, C11300l<? super Integer, C11079d2> lVar, int i5, int i6) {
        super(2);
        this.$modifier = mVar;
        this.$selectedQuantity = i;
        this.$maxQuantity = i2;
        this.$minQuantity = i3;
        this.$incrementQuantity = i4;
        this.$onClick = lVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ListQuantityComponentKt.m151522a(this.$modifier, this.$selectedQuantity, this.$maxQuantity, this.$minQuantity, this.$incrementQuantity, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
