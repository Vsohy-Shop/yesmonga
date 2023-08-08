package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n165#2:1238\n476#3,11:1239\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1161#1:1238\n1161#1:1239,11\n*E\n"})
/* renamed from: androidx.compose.ui.node.f0 */
public final class C15685f0 {
    /* renamed from: b */
    public static final void m70257b(LayoutNode layoutNode, C8423g<C15557e0> gVar, C11300l<? super LayoutNode, ? extends C15557e0> lVar) {
        C8423g<LayoutNode> I0 = layoutNode.mo44627I0();
        int h0 = I0.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = I0.mo15462d0();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) d0[i];
                if (gVar.mo15469h0() <= i) {
                    gVar.mo15463e(lVar.invoke(layoutNode2));
                } else {
                    gVar.mo15443H0(i, lVar.invoke(layoutNode2));
                }
                i++;
            } while (i < h0);
        }
        gVar.mo15439E0(layoutNode.mo44667Z().size(), gVar.mo15469h0());
    }
}
