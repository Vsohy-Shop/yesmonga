package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.RepairabilityKt$Repairability$3 */
public final class RepairabilityKt$Repairability$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ int $drawableId;
    final /* synthetic */ float $height;
    final /* synthetic */ double $level;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepairabilityKt$Repairability$3(long j, C8767m mVar, int i, float f, double d, int i2, int i3) {
        super(2);
        this.$color = j;
        this.$modifier = mVar;
        this.$drawableId = i;
        this.$height = f;
        this.$level = d;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        RepairabilityKt.m117259b(this.$color, this.$modifier, this.$drawableId, this.$height, this.$level, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
