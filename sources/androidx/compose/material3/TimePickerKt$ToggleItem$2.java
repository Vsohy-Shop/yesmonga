package androidx.compose.material3;

import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$ToggleItem$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ToggleItem$2(boolean z, C15218g4 g4Var, C11289a<C11079d2> aVar, C8212h3 h3Var, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$checked = z;
        this.$shape = g4Var;
        this.$onClick = aVar;
        this.$colors = h3Var;
        this.$content = qVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TimePickerKt.m26772v(this.$checked, this.$shape, this.$onClick, this.$colors, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
