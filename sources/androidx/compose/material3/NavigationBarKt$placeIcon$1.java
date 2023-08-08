package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NavigationBarKt$placeIcon$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ int $height;
    final /* synthetic */ C15611w0 $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ int $iconY;
    final /* synthetic */ C15611w0 $indicatorPlaceable;
    final /* synthetic */ C15611w0 $indicatorRipplePlaceable;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeIcon$1(C15611w0 w0Var, C15611w0 w0Var2, int i, int i2, C15611w0 w0Var3, int i3, int i4, int i5, int i6) {
        super(1);
        this.$indicatorPlaceable = w0Var;
        this.$iconPlaceable = w0Var2;
        this.$iconX = i;
        this.$iconY = i2;
        this.$indicatorRipplePlaceable = w0Var3;
        this.$rippleX = i3;
        this.$rippleY = i4;
        this.$width = i5;
        this.$height = i6;
    }

    /* renamed from: a */
    public final void mo11701a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0 w0Var = this.$indicatorPlaceable;
        if (w0Var != null) {
            int i = this.$width;
            int i2 = this.$height;
            C15611w0.C15612a.m69414v(aVar, w0Var, (i - w0Var.mo44471K0()) / 2, (i2 - w0Var.mo44468G0()) / 2, 0.0f, 4, (Object) null);
        }
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69414v(aVar2, this.$iconPlaceable, this.$iconX, this.$iconY, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69414v(aVar2, this.$indicatorRipplePlaceable, this.$rippleX, this.$rippleY, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11701a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
