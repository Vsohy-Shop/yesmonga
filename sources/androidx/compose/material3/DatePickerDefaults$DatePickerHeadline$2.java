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
public final class DatePickerDefaults$DatePickerHeadline$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ DatePickerState $state;
    final /* synthetic */ DatePickerDefaults $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerHeadline$2(DatePickerDefaults datePickerDefaults, DatePickerState datePickerState, C8186d0 d0Var, C8767m mVar, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = datePickerDefaults;
        this.$state = datePickerState;
        this.$dateFormatter = d0Var;
        this.$modifier = mVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo11345a(this.$state, this.$dateFormatter, this.$modifier, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
