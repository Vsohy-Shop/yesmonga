package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $border;
    final /* synthetic */ C7930s1 $colors;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $innerTextField;
    final /* synthetic */ C2241e $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$2(TextFieldDefaults textFieldDefaults, String str, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, boolean z, boolean z2, C16275a1 a1Var, C2241e eVar, boolean z3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, C7930s1 s1Var, C2366i0 i0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar6, int i, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$value = str;
        this.$innerTextField = pVar;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = a1Var;
        this.$interactionSource = eVar;
        this.$isError = z3;
        this.$label = pVar2;
        this.$placeholder = pVar3;
        this.$leadingIcon = pVar4;
        this.$trailingIcon = pVar5;
        this.$colors = s1Var;
        this.$contentPadding = i0Var;
        this.$border = pVar6;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        TextFieldDefaults textFieldDefaults = this.$tmp0_rcvr;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        textFieldDefaults2.mo10628b(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$contentPadding, this.$border, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
