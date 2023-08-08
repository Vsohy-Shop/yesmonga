package androidx.compose.material;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $textPlaceable;
    final /* synthetic */ int $textPositionY;
    final /* synthetic */ C15611w0 $titlePlaceable;
    final /* synthetic */ int $titlePositionY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(C15611w0 w0Var, int i, C15611w0 w0Var2, int i2) {
        super(1);
        this.$titlePlaceable = w0Var;
        this.$titlePositionY = i;
        this.$textPlaceable = w0Var2;
        this.$textPositionY = i2;
    }

    /* renamed from: a */
    public final void mo9945a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0 w0Var = this.$titlePlaceable;
        if (w0Var != null) {
            C15611w0.C15612a.m69412p(aVar, w0Var, 0, this.$titlePositionY, 0.0f, 4, (Object) null);
        }
        C15611w0 w0Var2 = this.$textPlaceable;
        if (w0Var2 != null) {
            C15611w0.C15612a.m69412p(aVar, w0Var2, 0, this.$textPositionY, 0.0f, 4, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9945a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
