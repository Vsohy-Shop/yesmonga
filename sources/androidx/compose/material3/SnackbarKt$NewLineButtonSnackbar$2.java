package androidx.compose.material3;

import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarKt$NewLineButtonSnackbar$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ C16361p0 $actionTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$NewLineButtonSnackbar$2(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C16361p0 p0Var, long j, long j2, int i) {
        super(2);
        this.$text = pVar;
        this.$action = pVar2;
        this.$dismissAction = pVar3;
        this.$actionTextStyle = p0Var;
        this.$actionContentColor = j;
        this.$dismissActionContentColor = j2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        SnackbarKt.m26287a(this.$text, this.$action, this.$dismissAction, this.$actionTextStyle, this.$actionContentColor, this.$dismissActionContentColor, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
