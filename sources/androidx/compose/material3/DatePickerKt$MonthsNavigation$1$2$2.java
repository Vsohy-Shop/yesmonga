package androidx.compose.material3;

import androidx.compose.material.icons.C3053a;
import androidx.compose.material.icons.filled.C3836uz;
import androidx.compose.material.icons.filled.C3873vz;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.vector.C15340c;
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
public final class DatePickerKt$MonthsNavigation$1$2$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $rtl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$1$2$2(boolean z) {
        super(2);
        this.$rtl = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C15340c cVar;
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1336532191, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1813)");
            }
            if (this.$rtl) {
                cVar = C3836uz.m16045a(C3053a.C3054a.f8153a);
            } else {
                cVar = C3873vz.m16127a(C3053a.C3054a.f8153a);
            }
            IconKt.m25825c(cVar, C8357u2.m29348a(C8284t2.f20507b.mo13076y(), oVar, 6), (C8767m) null, 0, oVar, 0, 12);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
