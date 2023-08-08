package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCodeDigitsFieldComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeDigitsFieldComponent.kt\ncom/carrefour/fid/android/design/components/compose/CodeDigitsFieldComponentKt$ValidateButton$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,561:1\n154#2:562\n*S KotlinDebug\n*F\n+ 1 CodeDigitsFieldComponent.kt\ncom/carrefour/fid/android/design/components/compose/CodeDigitsFieldComponentKt$ValidateButton$2\n*L\n478#1:562\n*E\n"})
public final class CodeDigitsFieldComponentKt$ValidateButton$2 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $isLoading;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$ValidateButton$2(boolean z) {
        super(3);
        this.$isLoading = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2411u0 u0Var2 = u0Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(u0Var2, "$this$Button");
        if ((i3 & 14) == 0) {
            i2 = (oVar2.mo15006n0(u0Var2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2063981216, i3, -1, "com.carrefour.fid.android.design.components.compose.ValidateButton.<anonymous> (CodeDigitsFieldComponent.kt:465)");
            }
            if (!this.$isLoading) {
                oVar2.mo14918M(769487308);
                TextKt.m14196c(C16018i.m71858d(C36896b.C36912p.loyalty_ok_button, oVar2, 0), (C8767m) null, C37475b.f94185a.mo114231a0(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153895g(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 3072, 57338);
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(769487556);
                ProgressIndicatorKt.m13705b(u0Var2.mo7845f(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 28)), C8734c.f23406a.mo17070q()), C37475b.f94185a.mo114231a0(), 0.0f, 0, 0, oVar, 0, 28);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
