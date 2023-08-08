package com.skydoves.landscapist;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class Shimmer__ShimmerKt$Shimmer$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $baseColor;
    final /* synthetic */ float $dropOff;
    final /* synthetic */ int $durationMillis;
    final /* synthetic */ long $highlightColor;
    final /* synthetic */ float $intensity;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $tilt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Shimmer__ShimmerKt$Shimmer$3(C8767m mVar, long j, long j2, float f, float f2, float f3, int i, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$baseColor = j;
        this.$highlightColor = j2;
        this.$intensity = f;
        this.$dropOff = f2;
        this.$tilt = f3;
        this.$durationMillis = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C35343m.m145679a(this.$modifier, this.$baseColor, this.$highlightColor, this.$intensity, this.$dropOff, this.$tilt, this.$durationMillis, oVar, this.$$changed | 1, this.$$default);
    }
}
