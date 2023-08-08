package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.core.state.Dimension;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class Dimension$Companion$preferredValue$1 extends Lambda implements C11300l<C16611l0, Dimension> {
    final /* synthetic */ float $dp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dimension$Companion$preferredValue$1(float f) {
        super(1);
        this.$dp = f;
    }

    @C12579k
    /* renamed from: a */
    public final Dimension invoke(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Dimension w = Dimension.m76554g(l0Var.mo48546f(C16483g.m74451w(this.$dp))).mo49301w(Dimension.f42474k);
        Intrinsics.checkNotNullExpressionValue(w, "Suggested(state.convertDimension(dp)).suggested(SPREAD_DIMENSION)");
        return w;
    }
}
