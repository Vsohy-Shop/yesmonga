package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.C16293h;
import androidx.compose.p004ui.text.input.C16331y0;
import androidx.compose.p004ui.text.input.EditProcessor;
import androidx.compose.p004ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "Landroidx/compose/ui/text/input/h;", "it", "Lkotlin/d2;", "a", "(Ljava/util/List;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldDelegate$Companion$restartInput$1 extends Lambda implements C11300l<List<? extends C16293h>, C11079d2> {
    final /* synthetic */ EditProcessor $editProcessor;
    final /* synthetic */ C11300l<TextFieldValue, C11079d2> $onValueChange;
    final /* synthetic */ Ref.ObjectRef<C16331y0> $session;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, C11300l<? super TextFieldValue, C11079d2> lVar, Ref.ObjectRef<C16331y0> objectRef) {
        super(1);
        this.$editProcessor = editProcessor;
        this.$onValueChange = lVar;
        this.$session = objectRef;
    }

    /* renamed from: a */
    public final void mo9375a(@C12579k List<? extends C16293h> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        TextFieldDelegate.f7187a.mo9371g(list, this.$editProcessor, this.$onValueChange, (C16331y0) this.$session.element);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9375a((List) obj);
        return C11079d2.f28267a;
    }
}
