package androidx.compose.p004ui.text.input;

import android.view.inputmethod.InputMethodManager;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroid/view/inputmethod/InputMethodManager;", "a", "()Landroid/view/inputmethod/InputMethodManager;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2 */
public final class InputMethodManagerImpl$imm$2 extends Lambda implements C11289a<InputMethodManager> {
    final /* synthetic */ InputMethodManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.this$0 = inputMethodManagerImpl;
    }

    @C12579k
    /* renamed from: a */
    public final InputMethodManager invoke() {
        Object systemService = this.this$0.f40391a.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
