package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarKt$OneRowSnackbar$2$measure$4 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $actionButtonPlaceX;
    final /* synthetic */ int $actionButtonPlaceY;
    final /* synthetic */ C15611w0 $actionButtonPlaceable;
    final /* synthetic */ int $dismissButtonPlaceX;
    final /* synthetic */ int $dismissButtonPlaceY;
    final /* synthetic */ C15611w0 $dismissButtonPlaceable;
    final /* synthetic */ int $textPlaceY;
    final /* synthetic */ C15611w0 $textPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(C15611w0 w0Var, int i, C15611w0 w0Var2, int i2, int i3, C15611w0 w0Var3, int i4, int i5) {
        super(1);
        this.$textPlaceable = w0Var;
        this.$textPlaceY = i;
        this.$dismissButtonPlaceable = w0Var2;
        this.$dismissButtonPlaceX = i2;
        this.$dismissButtonPlaceY = i3;
        this.$actionButtonPlaceable = w0Var3;
        this.$actionButtonPlaceX = i4;
        this.$actionButtonPlaceY = i5;
    }

    /* renamed from: a */
    public final void mo11958a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a.m69414v(aVar, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, (Object) null);
        C15611w0 w0Var = this.$dismissButtonPlaceable;
        if (w0Var != null) {
            C15611w0.C15612a.m69414v(aVar, w0Var, this.$dismissButtonPlaceX, this.$dismissButtonPlaceY, 0.0f, 4, (Object) null);
        }
        C15611w0 w0Var2 = this.$actionButtonPlaceable;
        if (w0Var2 != null) {
            C15611w0.C15612a.m69414v(aVar, w0Var2, this.$actionButtonPlaceX, this.$actionButtonPlaceY, 0.0f, 4, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11958a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
