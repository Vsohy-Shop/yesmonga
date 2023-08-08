package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$rememberDatePickerState$1 extends Lambda implements C11289a<DatePickerState> {
    final /* synthetic */ int $initialDisplayMode;
    final /* synthetic */ Long $initialDisplayedMonthMillis;
    final /* synthetic */ Long $initialSelectedDateMillis;
    final /* synthetic */ C11466l $yearRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$rememberDatePickerState$1(Long l, Long l2, C11466l lVar, int i) {
        super(0);
        this.$initialSelectedDateMillis = l;
        this.$initialDisplayedMonthMillis = l2;
        this.$yearRange = lVar;
        this.$initialDisplayMode = i;
    }

    @C12579k
    /* renamed from: a */
    public final DatePickerState invoke() {
        return new DatePickerState(this.$initialSelectedDateMillis, this.$initialDisplayedMonthMillis, this.$yearRange, this.$initialDisplayMode, (DefaultConstructorMarker) null);
    }
}
