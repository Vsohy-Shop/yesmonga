package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSwitchComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchComponent.kt\ncom/carrefour/fid/android/design/components/compose/SwitchComponentKt$SwitchComponent$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,109:1\n154#2:110\n*S KotlinDebug\n*F\n+ 1 SwitchComponent.kt\ncom/carrefour/fid/android/design/components/compose/SwitchComponentKt$SwitchComponent$1$2$1\n*L\n71#1:110\n*E\n"})
public final class SwitchComponentKt$SwitchComponent$1$2$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<Float> $animatePosition;
    final /* synthetic */ long $thumbColor;
    final /* synthetic */ float $thumbRadius;
    final /* synthetic */ long $trackBackgroundColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchComponentKt$SwitchComponent$1$2$1(long j, long j2, float f, C8578k2<Float> k2Var) {
        super(1);
        this.$trackBackgroundColor = j;
        this.$thumbColor = j2;
        this.$thumbRadius = f;
        this.$animatePosition = k2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$Canvas");
        float f = (float) 10;
        C15187e.m65706b6(eVar, this.$trackBackgroundColor, 0, 0, C15090b.m64845a(eVar2.mo7425g5(C16483g.m74435M(f)), eVar2.mo7425g5(C16483g.m74435M(f))), (C15192h) null, 0.0f, (C15249k2) null, 0, 246, (Object) null);
        C15187e.m65705a6(eVar, this.$thumbColor, eVar.mo7425g5(this.$thumbRadius), C15096g.m64898a(this.$animatePosition.getValue().floatValue(), C15104m.m65016m(eVar.mo42718b()) / ((float) 2)), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
    }
}
