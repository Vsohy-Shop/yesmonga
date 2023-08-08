package androidx.compose.foundation;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollingLayoutModifier$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ int $side;
    final /* synthetic */ ScrollingLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutModifier$measure$1(ScrollingLayoutModifier scrollingLayoutModifier, int i, C15611w0 w0Var) {
        super(1);
        this.this$0 = scrollingLayoutModifier;
        this.$side = i;
        this.$placeable = w0Var;
    }

    /* renamed from: a */
    public final void mo7278a(@C12579k C15611w0.C15612a aVar) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        int I = C11479u.m44334I(this.this$0.mo7274m().mo7258r(), 0, this.$side);
        if (this.this$0.mo7275n()) {
            i = I - this.$side;
        } else {
            i = -I;
        }
        if (this.this$0.mo7276o()) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (this.this$0.mo7276o()) {
            i3 = i;
        } else {
            i3 = 0;
        }
        C15611w0.C15612a.m69416z(aVar, this.$placeable, i2, i3, 0.0f, (C11300l) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7278a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
