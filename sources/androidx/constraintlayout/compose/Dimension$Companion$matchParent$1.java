package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "it", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class Dimension$Companion$matchParent$1 extends Lambda implements C11300l<C16611l0, Dimension> {

    /* renamed from: f */
    public static final Dimension$Companion$matchParent$1 f41163f = new Dimension$Companion$matchParent$1();

    public Dimension$Companion$matchParent$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Dimension invoke(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "it");
        Dimension c = Dimension.m76550c();
        Intrinsics.checkNotNullExpressionValue(c, "Parent()");
        return c;
    }
}
