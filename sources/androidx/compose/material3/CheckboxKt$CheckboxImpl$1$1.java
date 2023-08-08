package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<C15240j2> $borderColor;
    final /* synthetic */ C8578k2<C15240j2> $boxColor;
    final /* synthetic */ C8281t $checkCache;
    final /* synthetic */ C8578k2<Float> $checkCenterGravitationShiftFraction;
    final /* synthetic */ C8578k2<C15240j2> $checkColor;
    final /* synthetic */ C8578k2<Float> $checkDrawFraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(C8578k2<C15240j2> k2Var, C8578k2<C15240j2> k2Var2, C8578k2<C15240j2> k2Var3, C8578k2<Float> k2Var4, C8578k2<Float> k2Var5, C8281t tVar) {
        super(1);
        this.$boxColor = k2Var;
        this.$borderColor = k2Var2;
        this.$checkColor = k2Var3;
        this.$checkDrawFraction = k2Var4;
        this.$checkCenterGravitationShiftFraction = k2Var5;
        this.$checkCache = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        float floor = (float) Math.floor((double) eVar.mo7425g5(CheckboxKt.f19208f));
        C15187e eVar2 = eVar;
        CheckboxKt.m25485i(eVar2, this.$boxColor.getValue().mo42833M(), this.$borderColor.getValue().mo42833M(), eVar.mo7425g5(CheckboxKt.f19209g), floor);
        CheckboxKt.m25486j(eVar2, this.$checkColor.getValue().mo42833M(), this.$checkDrawFraction.getValue().floatValue(), this.$checkCenterGravitationShiftFraction.getValue().floatValue(), floor, this.$checkCache);
    }
}
