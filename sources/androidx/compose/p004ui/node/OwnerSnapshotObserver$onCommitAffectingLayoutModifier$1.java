package androidx.compose.p004ui.node;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1 */
public final class OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1 extends Lambda implements C11300l<LayoutNode, C11079d2> {

    /* renamed from: f */
    public static final OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1 f38980f = new OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1();

    public OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo44923a(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (layoutNode.mo44553e0()) {
            LayoutNode.m69644A1(layoutNode, false, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44923a((LayoutNode) obj);
        return C11079d2.f28267a;
    }
}
