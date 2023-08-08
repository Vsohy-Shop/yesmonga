package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$DateEntryContainer$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ float $headerMinHeight;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $headline;
    final /* synthetic */ C16361p0 $headlineTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $modeToggleButton;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DateEntryContainer$3(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8180c0 c0Var, C16361p0 p0Var, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, int i) {
        super(2);
        this.$modifier = mVar;
        this.$title = pVar;
        this.$headline = pVar2;
        this.$modeToggleButton = pVar3;
        this.$colors = c0Var;
        this.$headlineTextStyle = p0Var;
        this.$headerMinHeight = f;
        this.$content = pVar4;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DatePickerKt.m25595a(this.$modifier, this.$title, this.$headline, this.$modeToggleButton, this.$colors, this.$headlineTextStyle, this.$headerMinHeight, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
