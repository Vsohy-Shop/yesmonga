package androidx.compose.material;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarKt$TextOnlySnackbar$2$measure$4 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $containerHeight;
    final /* synthetic */ C15611w0 $textPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$TextOnlySnackbar$2$measure$4(int i, C15611w0 w0Var) {
        super(1);
        this.$containerHeight = i;
        this.$textPlaceable = w0Var;
    }

    /* renamed from: a */
    public final void mo10453a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69414v(aVar2, this.$textPlaceable, 0, (this.$containerHeight - this.$textPlaceable.mo44468G0()) / 2, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10453a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
