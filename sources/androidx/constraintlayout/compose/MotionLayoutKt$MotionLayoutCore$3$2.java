package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class MotionLayoutKt$MotionLayoutCore$3$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11305q<C16596g0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C16596g0 $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$3$2(C11305q<? super C16596g0, ? super C8592o, ? super Integer, C11079d2> qVar, C16596g0 g0Var, int i) {
        super(2);
        this.$content = qVar;
        this.$scope = g0Var;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            this.$content.invoke(this.$scope, oVar, Integer.valueOf(((this.$$changed >> 21) & 112) | 8));
        } else {
            oVar.mo14958a0();
        }
    }
}
