package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$1 */
public final class LookaheadLayoutKt$LookaheadLayout$1$1 extends Lambda implements C11304p<LayoutNode, LookaheadLayoutScopeImpl, C11079d2> {

    /* renamed from: f */
    public static final LookaheadLayoutKt$LookaheadLayout$1$1 f38654f = new LookaheadLayoutKt$LookaheadLayout$1$1();

    public LookaheadLayoutKt$LookaheadLayout$1$1() {
        super(2);
    }

    /* renamed from: a */
    public final void mo44301a(@C12579k LayoutNode layoutNode, @C12579k LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(lookaheadLayoutScopeImpl, "scope");
        lookaheadLayoutScopeImpl.mo44307d(layoutNode.mo44674d0());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo44301a((LayoutNode) obj, (LookaheadLayoutScopeImpl) obj2);
        return C11079d2.f28267a;
    }
}
