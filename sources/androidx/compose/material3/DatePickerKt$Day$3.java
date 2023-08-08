package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$Day$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $animateChecked;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ String $description;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $inRange;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ boolean $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Day$3(C8767m mVar, boolean z, C11289a<C11079d2> aVar, boolean z2, boolean z3, boolean z4, boolean z5, String str, C8180c0 c0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$modifier = mVar;
        this.$selected = z;
        this.$onClick = aVar;
        this.$animateChecked = z2;
        this.$enabled = z3;
        this.$today = z4;
        this.$inRange = z5;
        this.$description = str;
        this.$colors = c0Var;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DatePickerKt.m25601g(this.$modifier, this.$selected, this.$onClick, this.$animateChecked, this.$enabled, this.$today, this.$inRange, this.$description, this.$colors, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
