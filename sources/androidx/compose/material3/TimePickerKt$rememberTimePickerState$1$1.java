package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$rememberTimePickerState$1$1 extends Lambda implements C11289a<TimePickerState> {
    final /* synthetic */ int $initialHour;
    final /* synthetic */ int $initialMinute;
    final /* synthetic */ boolean $is24Hour;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$rememberTimePickerState$1$1(int i, int i2, boolean z) {
        super(0);
        this.$initialHour = i;
        this.$initialMinute = i2;
        this.$is24Hour = z;
    }

    @C12579k
    /* renamed from: a */
    public final TimePickerState invoke() {
        return new TimePickerState(this.$initialHour, this.$initialMinute, this.$is24Hour);
    }
}
