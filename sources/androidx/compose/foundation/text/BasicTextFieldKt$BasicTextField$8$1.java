package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasicTextFieldKt$BasicTextField$8$1 extends Lambda implements C11300l<TextFieldValue, C11079d2> {
    final /* synthetic */ C11300l<TextFieldValue, C11079d2> $onValueChange;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$8$1(TextFieldValue textFieldValue, C11300l<? super TextFieldValue, C11079d2> lVar) {
        super(1);
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
    }

    /* renamed from: a */
    public final void mo9227a(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "it");
        if (!Intrinsics.areEqual((Object) this.$value, (Object) textFieldValue)) {
            this.$onValueChange.invoke(textFieldValue);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9227a((TextFieldValue) obj);
        return C11079d2.f28267a;
    }
}
