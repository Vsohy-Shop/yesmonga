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
public final class DateRangePickerDefaults$DateRangePickerHeadline$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $datesDelimiter;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $endDatePlaceholder;
    final /* synthetic */ String $endDateText;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $startDatePlaceholder;
    final /* synthetic */ String $startDateText;
    final /* synthetic */ DateRangePickerState $state;
    final /* synthetic */ DateRangePickerDefaults $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerHeadline$5(DateRangePickerDefaults dateRangePickerDefaults, DateRangePickerState dateRangePickerState, C8186d0 d0Var, C8767m mVar, String str, String str2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i) {
        super(2);
        this.$tmp0_rcvr = dateRangePickerDefaults;
        this.$state = dateRangePickerState;
        this.$dateFormatter = d0Var;
        this.$modifier = mVar;
        this.$startDateText = str;
        this.$endDateText = str2;
        this.$startDatePlaceholder = pVar;
        this.$endDatePlaceholder = pVar2;
        this.$datesDelimiter = pVar3;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo11452b(this.$state, this.$dateFormatter, this.$modifier, this.$startDateText, this.$endDateText, this.$startDatePlaceholder, this.$endDatePlaceholder, this.$datesDelimiter, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
