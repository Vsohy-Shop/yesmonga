package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class ConstraintLayoutKt$ConstraintLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11305q<ConstraintLayoutScope, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11289a<C11079d2> $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, C11305q<? super ConstraintLayoutScope, ? super C8592o, ? super Integer, C11079d2> qVar, int i, C11289a<C11079d2> aVar) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$content = qVar;
        this.$$changed = i;
        this.$onHelpersChanged = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            int G = this.$scope.mo48254G();
            this.$scope.mo48256J();
            this.$content.invoke(this.$scope, oVar, Integer.valueOf(((this.$$changed >> 3) & 112) | 8));
            if (this.$scope.mo48254G() != G) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
