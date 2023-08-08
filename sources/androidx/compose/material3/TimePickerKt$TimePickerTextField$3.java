package androidx.compose.material3;

import androidx.compose.foundation.text.C2776k;
import androidx.compose.foundation.text.C2779m;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$TimePickerTextField$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ C2776k $keyboardActions;
    final /* synthetic */ C2779m $keyboardOptions;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<TextFieldValue, C11079d2> $onValueChange;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$3(C8767m mVar, TextFieldValue textFieldValue, C11300l<? super TextFieldValue, C11079d2> lVar, TimePickerState timePickerState, int i, C2779m mVar2, C2776k kVar, C8212h3 h3Var, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$state = timePickerState;
        this.$selection = i;
        this.$keyboardOptions = mVar2;
        this.$keyboardActions = kVar;
        this.$colors = h3Var;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        TimePickerKt.m26769s(this.$modifier, this.$value, this.$onValueChange, this.$state, this.$selection, this.$keyboardOptions, this.$keyboardActions, this.$colors, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
