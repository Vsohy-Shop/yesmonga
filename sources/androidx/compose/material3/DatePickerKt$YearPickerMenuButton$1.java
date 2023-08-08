package androidx.compose.material3;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.C3053a;
import androidx.compose.material.icons.filled.C3287g3;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8755m;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$YearPickerMenuButton$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ boolean $expanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPickerMenuButton$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, boolean z) {
        super(3);
        this.$content = pVar;
        this.$$dirty = i;
        this.$expanded = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        String str;
        Intrinsics.checkNotNullParameter(u0Var, "$this$TextButton");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1899012021, i, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:1844)");
            }
            this.$content.invoke(oVar, Integer.valueOf((this.$$dirty >> 9) & 14));
            C8767m.C8768a aVar = C8767m.f23478j;
            C2428y0.m10726a(SizeKt.m10087C(aVar, C8232k.f20254a.mo12740l()), oVar, 6);
            C15340c a = C3287g3.m14828a(C3053a.C3054a.f8153a);
            if (this.$expanded) {
                oVar.mo14918M(1071182504);
                str = C8357u2.m29348a(C8284t2.f20507b.mo13074w(), oVar, 6);
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(1071182591);
                str = C8357u2.m29348a(C8284t2.f20507b.mo13015A(), oVar, 6);
                oVar.mo15002m0();
            }
            IconKt.m25825c(a, str, C8755m.m32557a(aVar, this.$expanded ? 180.0f : 0.0f), 0, oVar, 0, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
