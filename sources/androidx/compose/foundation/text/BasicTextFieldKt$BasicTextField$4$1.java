package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasicTextFieldKt$BasicTextField$4$1 extends Lambda implements C11300l<TextFieldValue, C11079d2> {
    final /* synthetic */ C8700z0<String> $lastTextValue$delegate;
    final /* synthetic */ C11300l<String, C11079d2> $onValueChange;
    final /* synthetic */ C8700z0<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$4$1(C11300l<? super String, C11079d2> lVar, C8700z0<TextFieldValue> z0Var, C8700z0<String> z0Var2) {
        super(1);
        this.$onValueChange = lVar;
        this.$textFieldValueState$delegate = z0Var;
        this.$lastTextValue$delegate = z0Var2;
    }

    /* renamed from: a */
    public final void mo9224a(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "newTextFieldValueState");
        BasicTextFieldKt.m12193f(this.$textFieldValueState$delegate, textFieldValue);
        boolean z = !Intrinsics.areEqual((Object) BasicTextFieldKt.m12194g(this.$lastTextValue$delegate), (Object) textFieldValue.mo47115i());
        BasicTextFieldKt.m12195h(this.$lastTextValue$delegate, textFieldValue.mo47115i());
        if (z) {
            this.$onValueChange.invoke(textFieldValue.mo47115i());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9224a((TextFieldValue) obj);
        return C11079d2.f28267a;
    }
}
