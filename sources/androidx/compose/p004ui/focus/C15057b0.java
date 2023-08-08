package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.runtime.collection.C8423g;
import java.util.Comparator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,273:1\n48#2:274\n523#2:275\n523#2:276\n1182#3:277\n1161#3,2:278\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n252#1:274\n256#1:275\n257#1:276\n264#1:277\n264#1:278,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.b0 */
public final class C15057b0 implements Comparator<FocusTargetModifierNode> {
    @C12579k

    /* renamed from: a */
    public static final C15057b0 f37225a = new C15057b0();

    /* renamed from: a */
    public int compare(@C12580l FocusTargetModifierNode focusTargetModifierNode, @C12580l FocusTargetModifierNode focusTargetModifierNode2) {
        LayoutNode layoutNode;
        if (focusTargetModifierNode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (focusTargetModifierNode2 != null) {
            int i = 0;
            if (C15054a0.m64688h(focusTargetModifierNode) && C15054a0.m64688h(focusTargetModifierNode2)) {
                NodeCoordinator G = focusTargetModifierNode.mo17230G();
                LayoutNode layoutNode2 = null;
                if (G != null) {
                    layoutNode = G.mo44836H5();
                } else {
                    layoutNode = null;
                }
                if (layoutNode != null) {
                    NodeCoordinator G2 = focusTargetModifierNode2.mo17230G();
                    if (G2 != null) {
                        layoutNode2 = G2.mo44836H5();
                    }
                    if (layoutNode2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (Intrinsics.areEqual((Object) layoutNode, (Object) layoutNode2)) {
                        return 0;
                    } else {
                        C8423g<LayoutNode> b = mo42175b(layoutNode);
                        C8423g<LayoutNode> b2 = mo42175b(layoutNode2);
                        int min = Math.min(b.mo15469h0() - 1, b2.mo15469h0() - 1);
                        if (min >= 0) {
                            while (Intrinsics.areEqual(b.mo15462d0()[i], b2.mo15462d0()[i])) {
                                if (i != min) {
                                    i++;
                                }
                            }
                            return Intrinsics.compare(((LayoutNode) b.mo15462d0()[i]).mo44614D0(), ((LayoutNode) b2.mo15462d0()[i]).mo44614D0());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (C15054a0.m64688h(focusTargetModifierNode)) {
                return -1;
            } else {
                if (C15054a0.m64688h(focusTargetModifierNode2)) {
                    return 1;
                }
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: b */
    public final C8423g<LayoutNode> mo42175b(LayoutNode layoutNode) {
        C8423g<LayoutNode> gVar = new C8423g<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            gVar.mo15459a(0, layoutNode);
            layoutNode = layoutNode.mo44613C0();
        }
        return gVar;
    }
}
