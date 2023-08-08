package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateRangePickerKt$DateRangePicker$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$4(DateRangePickerState dateRangePickerState, C8186d0 d0Var, int i) {
        super(2);
        this.$state = dateRangePickerState;
        this.$dateFormatter = d0Var;
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
                ComposerKt.m29845w0(-204181785, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
            }
            DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.f19346a;
            DateRangePickerState dateRangePickerState = this.$state;
            C8186d0 d0Var = this.$dateFormatter;
            C8767m j = PaddingKt.m10023j(C8767m.f23478j, DateRangePickerKt.f19350c);
            int i2 = this.$$dirty;
            dateRangePickerDefaults.mo11451a(dateRangePickerState, d0Var, j, oVar, (i2 & 14) | 3456 | ((i2 >> 3) & 112), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
