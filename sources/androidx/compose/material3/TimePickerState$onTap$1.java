package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.TimePickerState", mo22502f = "TimePicker.kt", mo22503i = {0, 0, 0, 0, 0, 1, 1}, mo22504l = {621, 629, 630, 633}, mo22505m = "onTap$material3_release", mo22506n = {"this", "x", "y", "maxDist", "autoSwitchToMinute", "this", "targetValue"}, mo22507s = {"L$0", "F$0", "F$1", "F$2", "Z$0", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerState$onTap$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerState$onTap$1(TimePickerState timePickerState, C11045c<? super TimePickerState$onTap$1> cVar) {
        super(cVar);
        this.this$0 = timePickerState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo12362w(0.0f, 0.0f, 0.0f, false, this);
    }
}
