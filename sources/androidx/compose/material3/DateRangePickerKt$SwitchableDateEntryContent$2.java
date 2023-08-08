package androidx.compose.material3;

import androidx.compose.material3.C8208h0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DateRangePickerKt$SwitchableDateEntryContent$2 extends Lambda implements C11305q<C8208h0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ DateRangePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$SwitchableDateEntryContent$2(DateRangePickerState dateRangePickerState, C8186d0 d0Var, C11300l<? super Long, Boolean> lVar, C8180c0 c0Var, int i) {
        super(3);
        this.$state = dateRangePickerState;
        this.$dateFormatter = d0Var;
        this.$dateValidator = lVar;
        this.$colors = c0Var;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11470a(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        if ((i2 & 14) == 0) {
            if (oVar.mo14976f(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1354418636, i2, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:458)");
            }
            C8208h0.C8209a aVar = C8208h0.f20150b;
            if (C8208h0.m27132f(i, aVar.mo12627b())) {
                oVar.mo14918M(-1168754929);
                StateData d = this.$state.mo11487d();
                C8186d0 d0Var = this.$dateFormatter;
                C11300l<Long, Boolean> lVar = this.$dateValidator;
                C8180c0 c0Var = this.$colors;
                int i5 = this.$$dirty;
                DateRangePickerKt.m25655b(d, d0Var, lVar, c0Var, oVar, (i5 & 112) | (i5 & 896) | (i5 & 7168));
                oVar.mo15002m0();
            } else if (C8208h0.m27132f(i, aVar.mo12626a())) {
                oVar.mo14918M(-1168754686);
                StateData d2 = this.$state.mo11487d();
                C8186d0 d0Var2 = this.$dateFormatter;
                C11300l<Long, Boolean> lVar2 = this.$dateValidator;
                int i6 = this.$$dirty;
                DateRangeInputKt.m25647a(d2, d0Var2, lVar2, oVar, (i6 & 896) | (i6 & 112));
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(-1168754501);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11470a(((C8208h0) obj).mo12624i(), (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
