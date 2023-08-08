package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class ConstraintLayoutKt$ConstraintLayout$6$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ Measurer $measurer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$6$2(Measurer measurer, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$measurer = measurer;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if (((i & 11) ^ 2) != 0 || !oVar.mo15011p()) {
            this.$measurer.mo48393h(oVar, 8);
            this.$content.invoke(oVar, Integer.valueOf((this.$$changed >> 18) & 14));
            return;
        }
        oVar.mo14958a0();
    }
}
