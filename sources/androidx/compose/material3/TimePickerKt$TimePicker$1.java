package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$TimePicker$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ int $layoutType;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePicker$1(TimePickerState timePickerState, C8767m mVar, C8212h3 h3Var, int i, int i2, int i3) {
        super(2);
        this.$state = timePickerState;
        this.$modifier = mVar;
        this.$colors = h3Var;
        this.$layoutType = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TimePickerKt.m26768r(this.$state, this.$modifier, this.$colors, this.$layoutType, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
