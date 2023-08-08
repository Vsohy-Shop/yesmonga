package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/text/input/TextFieldValue;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldState$onValueChange$1 extends Lambda implements C11300l<TextFieldValue, C11079d2> {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldState$onValueChange$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    /* renamed from: a */
    public final void mo9464a(@C12579k TextFieldValue textFieldValue) {
        String str;
        Intrinsics.checkNotNullParameter(textFieldValue, "it");
        String i = textFieldValue.mo47115i();
        C16156d s = this.this$0.mo9455s();
        if (s != null) {
            str = s.mo46683j();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual((Object) i, (Object) str)) {
            this.this$0.mo9457u(HandleState.None);
        }
        this.this$0.f7239q.invoke(textFieldValue);
        this.this$0.mo9448l().invalidate();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9464a((TextFieldValue) obj);
        return C11079d2.f28267a;
    }
}
