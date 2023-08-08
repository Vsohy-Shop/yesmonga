package androidx.compose.material;

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
    final /* synthetic */ C8578k2<C15240j2> $borderColor$delegate;
    final /* synthetic */ C8578k2<C15240j2> $boxColor$delegate;
    final /* synthetic */ C7877l $checkCache;
    final /* synthetic */ C8578k2<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ C8578k2<C15240j2> $checkColor$delegate;
    final /* synthetic */ C8578k2<Float> $checkDrawFraction$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(C7877l lVar, C8578k2<C15240j2> k2Var, C8578k2<C15240j2> k2Var2, C8578k2<C15240j2> k2Var3, C8578k2<Float> k2Var4, C8578k2<Float> k2Var5) {
        super(1);
        this.$checkCache = lVar;
        this.$boxColor$delegate = k2Var;
        this.$borderColor$delegate = k2Var2;
        this.$checkColor$delegate = k2Var3;
        this.$checkDrawFraction$delegate = k2Var4;
        this.$checkCenterGravitationShiftFraction$delegate = k2Var5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        float floor = (float) Math.floor((double) eVar.mo7425g5(CheckboxKt.f7573g));
        C15187e eVar2 = eVar;
        CheckboxKt.m13366s(eVar2, CheckboxKt.m13354g(this.$boxColor$delegate), CheckboxKt.m13350c(this.$borderColor$delegate), eVar.mo7425g5(CheckboxKt.f7574h), floor);
        CheckboxKt.m13367t(eVar2, CheckboxKt.m13353f(this.$checkColor$delegate), CheckboxKt.m13351d(this.$checkDrawFraction$delegate), CheckboxKt.m13352e(this.$checkCenterGravitationShiftFraction$delegate), floor, this.$checkCache);
    }
}
