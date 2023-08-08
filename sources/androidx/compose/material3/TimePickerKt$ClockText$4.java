package androidx.compose.material3;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$ClockText$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$4(TimePickerState timePickerState, int i, boolean z, int i2) {
        super(2);
        this.$state = timePickerState;
        this.$value = i;
        this.$autoSwitchToMinute = z;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TimePickerKt.m26741d(this.$state, this.$value, this.$autoSwitchToMinute, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
