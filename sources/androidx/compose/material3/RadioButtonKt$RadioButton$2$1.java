package androidx.compose.material3;

import androidx.compose.material3.tokens.C8338s0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,226:1\n75#2:227\n154#3:228\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt$RadioButton$2$1\n*L\n120#1:227\n123#1:228\n*E\n"})
public final class RadioButtonKt$RadioButton$2$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<C16483g> $dotRadius;
    final /* synthetic */ C8578k2<C15240j2> $radioColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(C8578k2<C15240j2> k2Var, C8578k2<C16483g> k2Var2) {
        super(1);
        this.$radioColor = k2Var;
        this.$dotRadius = k2Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$Canvas");
        float g5 = eVar2.mo7425g5(RadioButtonKt.f19590d);
        float f = (float) 2;
        float f2 = g5 / f;
        C15187e.m65705a6(eVar, this.$radioColor.getValue().mo42833M(), eVar2.mo7425g5(C16483g.m74435M(C8338s0.f22041a.mo14389c() / f)) - f2, 0, 0.0f, new C15198m(g5, 0.0f, 0, 0, (C15242j3) null, 30, (DefaultConstructorMarker) null), (C15249k2) null, 0, 108, (Object) null);
        if (C16483g.m74452z(this.$dotRadius.getValue().mo47823t0(), C16483g.m74435M((float) 0)) > 0) {
            C15187e.m65705a6(eVar, this.$radioColor.getValue().mo42833M(), eVar2.mo7425g5(this.$dotRadius.getValue().mo47823t0()) - f2, 0, 0.0f, C15197l.f37504a, (C15249k2) null, 0, 108, (Object) null);
        }
    }
}
