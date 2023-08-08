package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public abstract class BaseHorizontalAnchorable implements C16635z {
    @C12579k

    /* renamed from: a */
    public final List<C11300l<C16611l0, C11079d2>> f41093a;

    /* renamed from: b */
    public final int f41094b;

    public BaseHorizontalAnchorable(@C12579k List<C11300l<C16611l0, C11079d2>> list, int i) {
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.f41093a = list;
        this.f41094b = i;
    }

    /* renamed from: a */
    public final void mo48156a(@C12579k ConstraintLayoutBaseScope.C16567b bVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(bVar, "anchor");
        this.f41093a.add(new BaseHorizontalAnchorable$linkTo$1(this, bVar, f, f2));
    }

    @C12579k
    /* renamed from: c */
    public abstract ConstraintReference mo48157c(@C12579k C16611l0 l0Var);
}
