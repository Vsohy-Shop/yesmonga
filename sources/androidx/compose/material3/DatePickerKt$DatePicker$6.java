package androidx.compose.material3;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$DatePicker$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ DatePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$6(DatePickerState datePickerState, C8186d0 d0Var, C11300l<? super Long, Boolean> lVar, C8180c0 c0Var, int i) {
        super(2);
        this.$state = datePickerState;
        this.$dateFormatter = d0Var;
        this.$dateValidator = lVar;
        this.$colors = c0Var;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(173769747, i, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:194)");
            }
            DatePickerState datePickerState = this.$state;
            C8186d0 d0Var = this.$dateFormatter;
            C11300l<Long, Boolean> lVar = this.$dateValidator;
            C8180c0 c0Var = this.$colors;
            int i2 = this.$$dirty;
            DatePickerKt.m25606l(datePickerState, d0Var, lVar, c0Var, oVar, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 >> 3) & 896) | ((i2 >> 12) & 7168));
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
