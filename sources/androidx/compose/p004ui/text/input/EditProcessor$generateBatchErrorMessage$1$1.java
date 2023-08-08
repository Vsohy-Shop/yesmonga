package androidx.compose.p004ui.text.input;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/text/input/h;", "it", "", "a", "(Landroidx/compose/ui/text/input/h;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1 */
public final class EditProcessor$generateBatchErrorMessage$1$1 extends Lambda implements C11300l<C16293h, CharSequence> {
    final /* synthetic */ C16293h $failedCommand;
    final /* synthetic */ EditProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditProcessor$generateBatchErrorMessage$1$1(C16293h hVar, EditProcessor editProcessor) {
        super(1);
        this.$failedCommand = hVar;
        this.this$0 = editProcessor;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C16293h hVar) {
        String str;
        Intrinsics.checkNotNullParameter(hVar, "it");
        if (this.$failedCommand == hVar) {
            str = " > ";
        } else {
            str = "   ";
        }
        return str + this.this$0.mo47081g(hVar);
    }
}
