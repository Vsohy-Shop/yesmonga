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
public final class DatePickerKt$DatePickerContent$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$2(StateData stateData, C8186d0 d0Var, C11300l<? super Long, Boolean> lVar, C8180c0 c0Var, int i) {
        super(2);
        this.$stateData = stateData;
        this.$dateFormatter = d0Var;
        this.$dateValidator = lVar;
        this.$colors = c0Var;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DatePickerKt.m25597c(this.$stateData, this.$dateFormatter, this.$dateValidator, this.$colors, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
