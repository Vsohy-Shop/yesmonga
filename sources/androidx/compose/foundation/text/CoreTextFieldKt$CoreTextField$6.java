package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C15421z1 $cursorBrush;
    final /* synthetic */ C11305q<C11304p<? super C8592o, ? super Integer, C11079d2>, C8592o, Integer, C11079d2> $decorationBox;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C16313q $imeOptions;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C2776k $keyboardActions;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<C16260h0, C11079d2> $onTextLayout;
    final /* synthetic */ C11300l<TextFieldValue, C11079d2> $onValueChange;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ C16361p0 $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$6(TextFieldValue textFieldValue, C11300l<? super TextFieldValue, C11079d2> lVar, C8767m mVar, C16361p0 p0Var, C16275a1 a1Var, C11300l<? super C16260h0, C11079d2> lVar2, C2243g gVar, C15421z1 z1Var, boolean z, int i, int i2, C16313q qVar, C2776k kVar, boolean z2, boolean z3, C11305q<? super C11304p<? super C8592o, ? super Integer, C11079d2>, ? super C8592o, ? super Integer, C11079d2> qVar2, int i3, int i4, int i5) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$modifier = mVar;
        this.$textStyle = p0Var;
        this.$visualTransformation = a1Var;
        this.$onTextLayout = lVar2;
        this.$interactionSource = gVar;
        this.$cursorBrush = z1Var;
        this.$softWrap = z;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$imeOptions = qVar;
        this.$keyboardActions = kVar;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$decorationBox = qVar2;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        TextFieldValue textFieldValue = this.$value;
        TextFieldValue textFieldValue2 = textFieldValue;
        CoreTextFieldKt.m12246a(textFieldValue2, this.$onValueChange, this.$modifier, this.$textStyle, this.$visualTransformation, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$softWrap, this.$maxLines, this.$minLines, this.$imeOptions, this.$keyboardActions, this.$enabled, this.$readOnly, this.$decorationBox, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
