package androidx.compose.material3;

import androidx.compose.animation.core.C1998o0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MenuKt$DropdownMenuContent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C1998o0<Boolean> $expandedStates;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C8700z0<C15283o4> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$3(C1998o0<Boolean> o0Var, C8700z0<C15283o4> z0Var, C8767m mVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$expandedStates = o0Var;
        this.$transformOriginState = z0Var;
        this.$modifier = mVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        MenuKt.m25868a(this.$expandedStates, this.$transformOriginState, this.$modifier, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
