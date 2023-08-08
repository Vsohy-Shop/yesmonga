package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.f */
public final class C16593f extends BaseHorizontalAnchorable {
    @C12579k

    /* renamed from: c */
    public final Object f41234c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16593f(@C12579k Object obj, int i, @C12579k List<C11300l<C16611l0, C11079d2>> list) {
        super(list, i);
        Intrinsics.checkNotNullParameter(obj, "id");
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.f41234c = obj;
    }

    @C12579k
    /* renamed from: c */
    public ConstraintReference mo48157c(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        ConstraintReference e = l0Var.mo49308e(this.f41234c);
        Intrinsics.checkNotNullExpressionValue(e, "state.constraints(id)");
        return e;
    }

    @C12579k
    /* renamed from: d */
    public final Object mo48487d() {
        return this.f41234c;
    }
}
