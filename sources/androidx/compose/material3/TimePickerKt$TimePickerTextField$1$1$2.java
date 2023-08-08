package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8303f1;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1673:1\n154#2:1674\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n*L\n1457#1:1674\n*E\n"})
public final class TimePickerKt$TimePickerTextField$1$1$2 extends Lambda implements C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8189d3 $textFieldColors;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$1$1$2(TextFieldValue textFieldValue, C2243g gVar, C8189d3 d3Var) {
        super(3);
        this.$value = textFieldValue;
        this.$interactionSource = gVar;
        this.$textFieldColors = d3Var;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public final void mo12306a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(pVar2, "it");
        if ((i & 14) == 0) {
            if (oVar2.mo14927P(pVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2133555260, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1447)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f19530a;
            String i4 = this.$value.mo47115i();
            C16275a1 a = C16275a1.f40457a.mo47161a();
            C2366i0 a2 = PaddingKt.m10014a(C16483g.m74435M((float) 0));
            C2243g gVar = this.$interactionSource;
            final C2243g gVar2 = gVar;
            final C8189d3 d3Var = this.$textFieldColors;
            outlinedTextFieldDefaults.mo11745b(i4, pVar, true, true, a, gVar, false, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, d3Var, a2, C8553b.m31048b(oVar2, -968963953, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-968963953, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1457)");
                        }
                        OutlinedTextFieldDefaults.f19530a.mo11744a(true, false, gVar2, d3Var, ShapesKt.m26127f(C8303f1.f21117a.mo13560x(), oVar, 6), 0.0f, 0.0f, oVar, 12583350, 96);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, ((i2 << 3) & 112) | 224640, 14352384, 16320);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo12306a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
