package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstrainScope$visibility$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ C16625r0 $value;
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainScope$visibility$1(ConstrainScope constrainScope, C16625r0 r0Var) {
        super(1);
        this.this$0 = constrainScope;
        this.$value = r0Var;
    }

    /* renamed from: a */
    public final void mo48245a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        ConstraintReference e = l0Var.mo49308e(this.this$0.mo48217w());
        C16625r0 r0Var = this.$value;
        e.mo49215K0(r0Var.mo48575d());
        if (Intrinsics.areEqual((Object) r0Var, (Object) C16625r0.f41307b.mo48577c())) {
            e.mo49247h(0.0f);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48245a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
