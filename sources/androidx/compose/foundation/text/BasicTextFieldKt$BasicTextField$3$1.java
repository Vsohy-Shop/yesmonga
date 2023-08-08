package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasicTextFieldKt$BasicTextField$3$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ C8700z0<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(TextFieldValue textFieldValue, C8700z0<TextFieldValue> z0Var) {
        super(0);
        this.$textFieldValue = textFieldValue;
        this.$textFieldValueState$delegate = z0Var;
    }

    public final void invoke() {
        if (!C16356n0.m73735g(this.$textFieldValue.mo47113h(), BasicTextFieldKt.m12192e(this.$textFieldValueState$delegate).mo47113h()) || !Intrinsics.areEqual((Object) this.$textFieldValue.mo47112g(), (Object) BasicTextFieldKt.m12192e(this.$textFieldValueState$delegate).mo47112g())) {
            BasicTextFieldKt.m12193f(this.$textFieldValueState$delegate, this.$textFieldValue);
        }
    }
}
