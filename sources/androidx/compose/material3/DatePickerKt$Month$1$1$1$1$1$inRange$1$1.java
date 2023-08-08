package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$Month$1$1$1$1$1$inRange$1$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ long $dateInMillis;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$1$1$1$1$1$inRange$1$1(StateData stateData, boolean z, long j) {
        super(0);
        this.$stateData = stateData;
        this.$rangeSelectionEnabled = z;
        this.$dateInMillis = j;
    }

    @C12579k
    public final Boolean invoke() {
        boolean z;
        StateData stateData = this.$stateData;
        boolean z2 = this.$rangeSelectionEnabled;
        long j = this.$dateInMillis;
        if (z2) {
            C8238l value = stateData.mo11993g().getValue();
            if (j >= (value != null ? value.mo12763X() : Long.MAX_VALUE)) {
                C8238l value2 = stateData.mo11992f().getValue();
                if (j <= (value2 != null ? value2.mo12763X() : Long.MIN_VALUE)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
