package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$Month$1$1$1$1$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ long $dateInMillis;
    final /* synthetic */ C11300l<Long, C11079d2> $onDateSelected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$1$1$1$1$1$1$1(C11300l<? super Long, C11079d2> lVar, long j) {
        super(0);
        this.$onDateSelected = lVar;
        this.$dateInMillis = j;
    }

    public final void invoke() {
        this.$onDateSelected.invoke(Long.valueOf(this.$dateInMillis));
    }
}
