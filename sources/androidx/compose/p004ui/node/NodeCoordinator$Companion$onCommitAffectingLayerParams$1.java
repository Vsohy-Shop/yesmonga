package androidx.compose.p004ui.node;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/NodeCoordinator;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1 */
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements C11300l<NodeCoordinator, C11079d2> {

    /* renamed from: f */
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 f38960f = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    public NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo44905a(@C12579k NodeCoordinator nodeCoordinator) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "coordinator");
        if (nodeCoordinator.mo44553e0()) {
            C15736u N1 = nodeCoordinator.f38947L0;
            if (N1 == null) {
                nodeCoordinator.mo44828D6();
                return;
            }
            NodeCoordinator.f38936V0.mo45260b(N1);
            nodeCoordinator.mo44828D6();
            if (!NodeCoordinator.f38936V0.mo45261c(N1)) {
                LayoutNode H5 = nodeCoordinator.mo44836H5();
                LayoutNodeLayoutDelegate k0 = H5.mo44687k0();
                if (k0.mo44748m() > 0) {
                    if (k0.mo44749n()) {
                        LayoutNode.m69644A1(H5, false, 1, (Object) null);
                    }
                    k0.mo44759x().mo44799f1();
                }
                C15675c1 B0 = H5.mo44611B0();
                if (B0 != null) {
                    B0.mo44991j(H5);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44905a((NodeCoordinator) obj);
        return C11079d2.f28267a;
    }
}
