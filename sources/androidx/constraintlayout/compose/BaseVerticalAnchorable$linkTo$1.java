package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BaseVerticalAnchorable$linkTo$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ ConstraintLayoutBaseScope.C16568c $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ BaseVerticalAnchorable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseVerticalAnchorable$linkTo$1(BaseVerticalAnchorable baseVerticalAnchorable, ConstraintLayoutBaseScope.C16568c cVar, float f, float f2) {
        super(1);
        this.this$0 = baseVerticalAnchorable;
        this.$anchor = cVar;
        this.$margin = f;
        this.$goneMargin = f2;
    }

    /* renamed from: a */
    public final void mo48161a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        LayoutDirection G = l0Var.mo48541G();
        AnchorFunctions anchorFunctions = AnchorFunctions.f41080a;
        int h = anchorFunctions.mo48146h(this.this$0.f41096b, G);
        int h2 = anchorFunctions.mo48146h(this.$anchor.mo48299f(), G);
        ((ConstraintReference) anchorFunctions.mo48145g()[h][h2].invoke(this.this$0.mo48160c(l0Var), this.$anchor.mo48297e(), l0Var.mo48541G())).mo49239d0(C16483g.m74451w(this.$margin)).mo49243f0(C16483g.m74451w(this.$goneMargin));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48161a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
