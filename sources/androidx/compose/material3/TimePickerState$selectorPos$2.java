package androidx.compose.material3;

import androidx.compose.material3.tokens.C8306g1;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16485h;
import androidx.compose.p004ui.unit.C16486i;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/unit/i;", "a", "()J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1673:1\n75#2:1674\n58#2:1675\n51#2:1676\n88#2:1677\n75#2:1678\n51#2:1679\n88#2:1680\n75#2:1681\n51#2:1682\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n*L\n509#1:1674\n514#1:1675\n516#1:1676\n517#1:1677\n517#1:1678\n517#1:1679\n518#1:1680\n518#1:1681\n518#1:1682\n*E\n"})
public final class TimePickerState$selectorPos$2 extends Lambda implements C11289a<C16486i> {
    final /* synthetic */ boolean $is24Hour;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerState$selectorPos$2(TimePickerState timePickerState, boolean z) {
        super(0);
        this.this$0 = timePickerState;
        this.$is24Hour = z;
    }

    /* renamed from: a */
    public final long mo12369a() {
        float f;
        boolean s = this.this$0.mo12358s();
        C8306g1 g1Var = C8306g1.f21226a;
        float f2 = (float) 2;
        float M = C16483g.m74435M(g1Var.mo13639j() / f2);
        if (!this.$is24Hour || !s || !C8241l2.m27284f(this.this$0.mo12351l(), C8241l2.f20286b.mo12784a())) {
            f = TimePickerKt.f19896f;
        } else {
            f = TimePickerKt.f19897g;
        }
        float M2 = C16483g.m74435M(C16483g.m74435M(f - M) + M);
        return C16485h.m74482a(C16483g.m74435M(C16483g.m74435M(((float) Math.cos((double) this.this$0.mo12345f().mo6613u().floatValue())) * M2) + C16483g.m74435M(g1Var.mo13630b() / f2)), C16483g.m74435M(C16483g.m74435M(M2 * ((float) Math.sin((double) this.this$0.mo12345f().mo6613u().floatValue()))) + C16483g.m74435M(g1Var.mo13630b() / f2)));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C16486i.m74510c(mo12369a());
    }
}
