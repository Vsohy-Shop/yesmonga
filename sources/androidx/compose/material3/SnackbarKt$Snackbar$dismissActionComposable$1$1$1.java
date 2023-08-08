package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarKt$Snackbar$dismissActionComposable$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8269q2 $snackbarData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$dismissActionComposable$1$1$1(C8269q2 q2Var) {
        super(0);
        this.$snackbarData = q2Var;
    }

    public final void invoke() {
        this.$snackbarData.dismiss();
    }
}
