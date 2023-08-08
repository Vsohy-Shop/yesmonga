package androidx.constraintlayout.compose;

import androidx.compose.p004ui.layout.C15557e0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstraintSetForInlineDsl$applyTo$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ List<C15557e0> $measurables;
    final /* synthetic */ C16611l0 $state;
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$applyTo$1(List<? extends C15557e0> list, C16611l0 l0Var, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$measurables = list;
        this.$state = l0Var;
        this.this$0 = constraintSetForInlineDsl;
    }

    public final void invoke() {
        List<C15557e0> list = this.$measurables;
        C16611l0 l0Var = this.$state;
        ConstraintSetForInlineDsl constraintSetForInlineDsl = this.this$0;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object c = list.get(i).mo44319c();
                C16595g gVar = c instanceof C16595g ? (C16595g) c : null;
                if (gVar != null) {
                    ConstrainScope constrainScope = new ConstrainScope(gVar.mo48496b().mo48480k());
                    gVar.mo48495a().invoke(constrainScope);
                    constrainScope.mo48189c(l0Var);
                }
                constraintSetForInlineDsl.f41159f.add(gVar);
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
