package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarKt$Snackbar$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $actionColor;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ C8269q2 $snackbarData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$4(C8269q2 q2Var, C8767m mVar, boolean z, C15218g4 g4Var, long j, long j2, long j3, long j4, long j5, int i, int i2) {
        super(2);
        this.$snackbarData = q2Var;
        this.$modifier = mVar;
        this.$actionOnNewLine = z;
        this.$shape = g4Var;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$actionColor = j3;
        this.$actionContentColor = j4;
        this.$dismissActionContentColor = j5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C8269q2 q2Var = this.$snackbarData;
        C8269q2 q2Var2 = q2Var;
        SnackbarKt.m26290d(q2Var2, this.$modifier, this.$actionOnNewLine, this.$shape, this.$containerColor, this.$contentColor, this.$actionColor, this.$actionContentColor, this.$dismissActionContentColor, oVar2, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
