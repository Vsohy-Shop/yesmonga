package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.node.C15703k1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.n */
public final class C16041n {

    /* renamed from: b */
    public static final int f39835b = 8;
    @C12579k

    /* renamed from: a */
    public final LayoutNode f39836a;

    public C16041n(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "rootNode");
        this.f39836a = layoutNode;
    }

    @C12579k
    /* renamed from: a */
    public final SemanticsNode mo46173a() {
        C15703k1 j = C16040m.m72168j(this.f39836a);
        Intrinsics.checkNotNull(j);
        return new SemanticsNode(j, true, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public final SemanticsNode mo46174b() {
        C15703k1 j = C16040m.m72168j(this.f39836a);
        Intrinsics.checkNotNull(j);
        return new SemanticsNode(j, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }
}
