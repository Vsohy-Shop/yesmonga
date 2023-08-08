package androidx.compose.material3;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.window.C16541b;
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
public final class DatePickerDialog_androidKt$DatePickerDialog$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $confirmButton;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dismissButton;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onDismissRequest;
    final /* synthetic */ C16541b $properties;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerDialog_androidKt$DatePickerDialog$2(C11289a<C11079d2> aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C15218g4 g4Var, float f, C8180c0 c0Var, C16541b bVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$confirmButton = pVar;
        this.$modifier = mVar;
        this.$dismissButton = pVar2;
        this.$shape = g4Var;
        this.$tonalElevation = f;
        this.$colors = c0Var;
        this.$properties = bVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DatePickerDialog_androidKt.m25577a(this.$onDismissRequest, this.$confirmButton, this.$modifier, this.$dismissButton, this.$shape, this.$tonalElevation, this.$colors, this.$properties, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
