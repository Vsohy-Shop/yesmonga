package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BaseHorizontalAnchorable$linkTo$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ ConstraintLayoutBaseScope.C16567b $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ BaseHorizontalAnchorable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseHorizontalAnchorable$linkTo$1(BaseHorizontalAnchorable baseHorizontalAnchorable, ConstraintLayoutBaseScope.C16567b bVar, float f, float f2) {
        super(1);
        this.this$0 = baseHorizontalAnchorable;
        this.$anchor = bVar;
        this.$margin = f;
        this.$goneMargin = f2;
    }

    /* renamed from: a */
    public final void mo48158a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        ConstraintReference c = this.this$0.mo48157c(l0Var);
        BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
        ConstraintLayoutBaseScope.C16567b bVar = this.$anchor;
        ((ConstraintReference) AnchorFunctions.f41080a.mo48144f()[baseHorizontalAnchorable.f41094b][bVar.mo48291f()].invoke(c, bVar.mo48289e())).mo49239d0(C16483g.m74451w(this.$margin)).mo49243f0(C16483g.m74451w(this.$goneMargin));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48158a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
