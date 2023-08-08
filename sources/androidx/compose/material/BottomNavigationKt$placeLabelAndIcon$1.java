package androidx.compose.material;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavigationKt$placeLabelAndIcon$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $iconPlaceable;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ int $iconX;
    final /* synthetic */ C15611w0 $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $selectedIconY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeLabelAndIcon$1(float f, C15611w0 w0Var, int i, int i2, int i3, C15611w0 w0Var2, int i4, int i5) {
        super(1);
        this.$iconPositionAnimationProgress = f;
        this.$labelPlaceable = w0Var;
        this.$labelX = i;
        this.$labelY = i2;
        this.$offset = i3;
        this.$iconPlaceable = w0Var2;
        this.$iconX = i4;
        this.$selectedIconY = i5;
    }

    /* renamed from: a */
    public final void mo10031a(@C12579k C15611w0.C15612a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        if (this.$iconPositionAnimationProgress == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C15611w0.C15612a.m69414v(aVar, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset, 0.0f, 4, (Object) null);
        }
        C15611w0.C15612a.m69414v(aVar, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10031a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
