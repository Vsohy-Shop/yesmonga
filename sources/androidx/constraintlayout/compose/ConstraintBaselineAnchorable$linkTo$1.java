package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/constraintlayout/compose/l0;", "state", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstraintBaselineAnchorable$linkTo$1 extends Lambda implements C11300l<C16611l0, C11079d2> {
    final /* synthetic */ ConstraintLayoutBaseScope.C16566a $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ ConstraintBaselineAnchorable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintBaselineAnchorable$linkTo$1(ConstraintBaselineAnchorable constraintBaselineAnchorable, ConstraintLayoutBaseScope.C16566a aVar, float f, float f2) {
        super(1);
        this.this$0 = constraintBaselineAnchorable;
        this.$anchor = aVar;
        this.$margin = f;
        this.$goneMargin = f2;
    }

    /* renamed from: a */
    public final void mo48250a(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        if (l0Var != null) {
            ConstraintBaselineAnchorable constraintBaselineAnchorable = this.this$0;
            ConstraintLayoutBaseScope.C16566a aVar = this.$anchor;
            l0Var.mo48537C(constraintBaselineAnchorable.mo48248b());
            l0Var.mo48537C(aVar.mo48282d());
        }
        ConstraintReference e = l0Var.mo49308e(this.this$0.mo48248b());
        ConstraintLayoutBaseScope.C16566a aVar2 = this.$anchor;
        float f = this.$margin;
        float f2 = this.$goneMargin;
        C11304p<ConstraintReference, Object, ConstraintReference> e2 = AnchorFunctions.f41080a.mo48143e();
        Intrinsics.checkNotNullExpressionValue(e, "this");
        e2.invoke(e, aVar2.mo48282d()).mo49239d0(C16483g.m74451w(f)).mo49243f0(C16483g.m74451w(f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48250a((C16611l0) obj);
        return C11079d2.f28267a;
    }
}
