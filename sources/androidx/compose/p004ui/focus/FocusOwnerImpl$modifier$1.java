package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000f"}, mo22516d2 = {"androidx/compose/ui/focus/FocusOwnerImpl$modifier$1", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "t", "node", "u", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "", "hashCode", "", "other", "", "equals", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1 */
public final class FocusOwnerImpl$modifier$1 extends C15723p0<FocusTargetModifierNode> {

    /* renamed from: c */
    public final /* synthetic */ FocusOwnerImpl f37183c;

    public FocusOwnerImpl$modifier$1(FocusOwnerImpl focusOwnerImpl) {
        this.f37183c = focusOwnerImpl;
    }

    public boolean equals(@C12580l Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.f37183c.mo42085p().hashCode();
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("RootFocusTarget");
    }

    @C12579k
    /* renamed from: t */
    public FocusTargetModifierNode mo17098a() {
        return this.f37183c.mo42085p();
    }

    @C12579k
    /* renamed from: u */
    public FocusTargetModifierNode mo17102s(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "node");
        return focusTargetModifierNode;
    }
}
