package androidx.compose.material;

import androidx.compose.p004ui.focus.FocusRequester;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1(boolean z, FocusRequester focusRequester) {
        super(0);
        this.$expanded = z;
        this.$focusRequester = focusRequester;
    }

    public final void invoke() {
        if (this.$expanded) {
            this.$focusRequester.mo42129h();
        }
    }
}
