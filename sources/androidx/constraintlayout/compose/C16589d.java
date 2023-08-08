package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.d */
public final class C16589d extends BaseVerticalAnchorable {
    @C12579k

    /* renamed from: c */
    public final Object f41222c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16589d(@C12579k List<C11300l<C16611l0, C11079d2>> list, @C12579k Object obj, int i) {
        super(list, i);
        Intrinsics.checkNotNullParameter(list, "tasks");
        Intrinsics.checkNotNullParameter(obj, "id");
        this.f41222c = obj;
    }

    @C12579k
    /* renamed from: c */
    public ConstraintReference mo48160c(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        C16745a m = l0Var.mo49315m(this.f41222c, State.C16743Helper.HORIZONTAL_CHAIN);
        Intrinsics.checkNotNullExpressionValue(m, "state.helper(id, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN)");
        return m;
    }
}
