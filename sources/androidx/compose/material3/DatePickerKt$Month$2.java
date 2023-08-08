package androidx.compose.material3;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$Month$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ C8266q $month;
    final /* synthetic */ C11300l<Long, C11079d2> $onDateSelected;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8238l $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$2(C8266q qVar, C11300l<? super Long, C11079d2> lVar, C8238l lVar2, StateData stateData, boolean z, C11300l<? super Long, Boolean> lVar3, C8186d0 d0Var, C8180c0 c0Var, int i) {
        super(2);
        this.$month = qVar;
        this.$onDateSelected = lVar;
        this.$today = lVar2;
        this.$stateData = stateData;
        this.$rangeSelectionEnabled = z;
        this.$dateValidator = lVar3;
        this.$dateFormatter = d0Var;
        this.$colors = c0Var;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DatePickerKt.m25604j(this.$month, this.$onDateSelected, this.$today, this.$stateData, this.$rangeSelectionEnabled, this.$dateValidator, this.$dateFormatter, this.$colors, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
