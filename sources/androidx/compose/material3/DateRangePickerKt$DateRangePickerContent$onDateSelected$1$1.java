package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1 extends Lambda implements C11300l<Long, C11079d2> {
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1(StateData stateData) {
        super(1);
        this.$stateData = stateData;
    }

    /* renamed from: a */
    public final void mo11468a(long j) {
        DateRangePickerKt.m25669p(this.$stateData, j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11468a(((Number) obj).longValue());
        return C11079d2.f28267a;
    }
}
