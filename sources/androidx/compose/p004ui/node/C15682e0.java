package androidx.compose.p004ui.node;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.e0 */
public final class C15682e0 {

    /* renamed from: a */
    public static final boolean f38996a = false;

    /* renamed from: a */
    public static final void m70246a(@C12579k LayoutNode layoutNode, @C12579k LayoutNode layoutNode2) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(layoutNode2, "child");
        layoutNode.mo44641O0(layoutNode.mo44667Z().size(), layoutNode2);
    }

    @C12579k
    /* renamed from: b */
    public static final C15675c1 m70247b(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        C15675c1 B0 = layoutNode.mo44611B0();
        if (B0 != null) {
            return B0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
