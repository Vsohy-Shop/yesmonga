package androidx.compose.material3;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TooltipKt$RichTooltipBox$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $action;
    final /* synthetic */ C8194e2 $tooltipState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$RichTooltipBox$2$1(C8194e2 e2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(0);
        this.$tooltipState = e2Var;
        this.$action = pVar;
    }

    public final void invoke() {
        this.$tooltipState.mo12565d(this.$action != null);
    }
}
