package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ConstraintBaselineAnchorable implements C16581a {
    @C12579k

    /* renamed from: a */
    public final Object f41126a;
    @C12579k

    /* renamed from: b */
    public final List<C11300l<C16611l0, C11079d2>> f41127b;

    public ConstraintBaselineAnchorable(@C12579k Object obj, @C12579k List<C11300l<C16611l0, C11079d2>> list) {
        Intrinsics.checkNotNullParameter(obj, "id");
        Intrinsics.checkNotNullParameter(list, "tasks");
        this.f41126a = obj;
        this.f41127b = list;
    }

    /* renamed from: a */
    public void mo48247a(@C12579k ConstraintLayoutBaseScope.C16566a aVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(aVar, "anchor");
        this.f41127b.add(new ConstraintBaselineAnchorable$linkTo$1(this, aVar, f, f2));
    }

    @C12579k
    /* renamed from: b */
    public final Object mo48248b() {
        return this.f41126a;
    }

    @C12579k
    /* renamed from: c */
    public final List<C11300l<C16611l0, C11079d2>> mo48249c() {
        return this.f41127b;
    }
}
