package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateRangePickerKt$rememberDateRangePickerState$1 extends Lambda implements C11289a<DateRangePickerState> {
    final /* synthetic */ int $initialDisplayMode;
    final /* synthetic */ Long $initialDisplayedMonthMillis;
    final /* synthetic */ Long $initialSelectedEndDateMillis;
    final /* synthetic */ Long $initialSelectedStartDateMillis;
    final /* synthetic */ C11466l $yearRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$rememberDateRangePickerState$1(Long l, Long l2, Long l3, C11466l lVar, int i) {
        super(0);
        this.$initialSelectedStartDateMillis = l;
        this.$initialSelectedEndDateMillis = l2;
        this.$initialDisplayedMonthMillis = l3;
        this.$yearRange = lVar;
        this.$initialDisplayMode = i;
    }

    @C12579k
    /* renamed from: a */
    public final DateRangePickerState invoke() {
        return new DateRangePickerState(this.$initialSelectedStartDateMillis, this.$initialSelectedEndDateMillis, this.$initialDisplayedMonthMillis, this.$yearRange, this.$initialDisplayMode, (DefaultConstructorMarker) null);
    }
}
