package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstrainScope$resetDimensions$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainScope$resetDimensions$1(ConstrainScope constrainScope) {
        super(1);
        this.this$0 = constrainScope;
    }

    /* renamed from: a */
    public final void mo48234a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Dimension i = ((C16627s) Dimension.f41160a.mo48366d()).mo48587i(l0Var);
        l0Var.mo49308e(this.this$0.mo48217w()).mo49217L0(i).mo49229X(i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48234a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
