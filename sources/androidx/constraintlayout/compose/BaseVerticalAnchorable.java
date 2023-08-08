package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public abstract class BaseVerticalAnchorable implements C16618o0 {
    @C12579k

    /* renamed from: a */
    public final List<C11300l<C16611l0, C11079d2>> f41095a;

    /* renamed from: b */
    public final int f41096b;

    public BaseVerticalAnchorable(@C12579k List<C11300l<C16611l0, C11079d2>> list, int i) {
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.f41095a = list;
        this.f41096b = i;
    }

    /* renamed from: a */
    public final void mo48159a(@C12579k ConstraintLayoutBaseScope.C16568c cVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        this.f41095a.add(new BaseVerticalAnchorable$linkTo$1(this, cVar, f, f2));
    }

    @C12579k
    /* renamed from: c */
    public abstract ConstraintReference mo48160c(@C12579k C16611l0 l0Var);
}
