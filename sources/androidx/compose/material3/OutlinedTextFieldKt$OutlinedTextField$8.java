package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.text.C2776k;
import androidx.compose.foundation.text.C2779m;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OutlinedTextFieldKt$OutlinedTextField$8 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ C8189d3 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C2776k $keyboardActions;
    final /* synthetic */ C2779m $keyboardOptions;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $supportingText;
    final /* synthetic */ C16361p0 $textStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$8(String str, C11300l<? super String, C11079d2> lVar, C8767m mVar, boolean z, boolean z2, C16361p0 p0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, boolean z3, C16275a1 a1Var, C2779m mVar2, C2776k kVar, boolean z4, int i, int i2, C2243g gVar, C15218g4 g4Var, C8189d3 d3Var, int i3, int i4, int i5, int i6) {
        super(2);
        this.$value = str;
        this.$onValueChange = lVar;
        this.$modifier = mVar;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = p0Var;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$supportingText = pVar5;
        this.$isError = z3;
        this.$visualTransformation = a1Var;
        this.$keyboardOptions = mVar2;
        this.$keyboardActions = kVar;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$interactionSource = gVar;
        this.$shape = g4Var;
        this.$colors = d3Var;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        String str = this.$value;
        String str2 = str;
        OutlinedTextFieldKt.m25996d(str2, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$interactionSource, this.$shape, this.$colors, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), C8590n1.m31123a(this.$$changed2), this.$$default);
    }
}
