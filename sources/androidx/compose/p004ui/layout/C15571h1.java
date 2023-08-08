package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.layout.h1 */
public final class C15571h1 {

    /* renamed from: b */
    public static final int f38726b = 8;
    @C12579k

    /* renamed from: a */
    public final LayoutNode f38727a;

    public C15571h1(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        this.f38727a = layoutNode;
    }

    /* renamed from: a */
    public final void mo44413a(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        this.f38727a.mo44582u(mVar);
    }
}
