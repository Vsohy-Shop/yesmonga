package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1 */
public final class C16572xe992e98a extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    final /* synthetic */ C8700z0<Boolean> $remeasureRequesterState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16572xe992e98a(C8700z0<Boolean> z0Var, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$remeasureRequesterState = z0Var;
        this.$constraintSet = constraintSetForInlineDsl;
    }

    public final void invoke() {
        C8700z0<Boolean> z0Var = this.$remeasureRequesterState;
        z0Var.setValue(Boolean.valueOf(!z0Var.getValue().booleanValue()));
        this.$constraintSet.mo48360o(true);
    }
}
