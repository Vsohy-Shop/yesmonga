package androidx.compose.p004ui.viewinterop;

import android.view.View;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.AndroidComposeView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/node/c1;", "owner", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/c1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3 */
public final class AndroidViewHolder$layoutNode$1$3 extends Lambda implements C11300l<C15675c1, C11079d2> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;
    final /* synthetic */ Ref.ObjectRef<View> $viewRemovedOnDetach;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, Ref.ObjectRef<View> objectRef) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
        this.$viewRemovedOnDetach = objectRef;
    }

    /* renamed from: a */
    public final void mo47961a(@C12579k C15675c1 c1Var) {
        AndroidComposeView androidComposeView;
        Intrinsics.checkNotNullParameter(c1Var, "owner");
        if (c1Var instanceof AndroidComposeView) {
            androidComposeView = (AndroidComposeView) c1Var;
        } else {
            androidComposeView = null;
        }
        if (androidComposeView != null) {
            androidComposeView.mo45305Z(this.$this_run, this.$layoutNode);
        }
        T t = this.$viewRemovedOnDetach.element;
        if (t != null) {
            this.$this_run.setView$ui_release((View) t);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo47961a((C15675c1) obj);
        return C11079d2.f28267a;
    }
}
