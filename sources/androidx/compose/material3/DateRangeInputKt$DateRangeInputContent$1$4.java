package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n50#2:104\n49#2:105\n1114#3,6:106\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$1$4\n*L\n86#1:104\n86#1:105\n86#1:106,6\n*E\n"})
public final class DateRangeInputKt$DateRangeInputContent$1$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ String $endRangeText;
    final /* synthetic */ String $pattern;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateRangeInputKt$DateRangeInputContent$1$4(String str, String str2) {
        super(2);
        this.$endRangeText = str;
        this.$pattern = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-663502784, i2, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:83)");
            }
            String str = this.$endRangeText;
            C8767m.C8768a aVar = C8767m.f23478j;
            String str2 = this.$pattern;
            oVar2.mo14918M(511388516);
            boolean n0 = oVar2.mo15006n0(str) | oVar2.mo15006n0(str2);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new DateRangeInputKt$DateRangeInputContent$1$4$1$1(str, str2);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            TextKt.m26700c(str, SemanticsModifierKt.m71868c(aVar, false, (C11300l) N, 1, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 0, 0, 131068);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
