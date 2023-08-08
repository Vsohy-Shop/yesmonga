package androidx.compose.p004ui.node;

import androidx.compose.p004ui.graphics.C15118b2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$invoke$1 */
public final class NodeCoordinator$invoke$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C15118b2 $canvas;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invoke$1(NodeCoordinator nodeCoordinator, C15118b2 b2Var) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$canvas = b2Var;
    }

    public final void invoke() {
        this.this$0.mo44889w3(this.$canvas);
    }
}
