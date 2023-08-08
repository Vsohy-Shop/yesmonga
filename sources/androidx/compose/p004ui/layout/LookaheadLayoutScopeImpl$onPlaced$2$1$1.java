package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.C15697j0;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl$onPlaced$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2$1$1 */
public final class LookaheadLayoutScopeImpl$onPlaced$2$1$1 extends Lambda implements C11289a<C15617y> {
    final /* synthetic */ LookaheadLayoutScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadLayoutScopeImpl$onPlaced$2$1$1(LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl) {
        super(0);
        this.this$0 = lookaheadLayoutScopeImpl;
    }

    @C12579k
    /* renamed from: a */
    public final C15617y invoke() {
        NodeCoordinator c = this.this$0.mo44306c();
        if (c != null) {
            C15697j0 j4 = c.mo44868j4();
            Intrinsics.checkNotNull(j4);
            C15619z d2 = j4.mo45034d2();
            if (d2 != null) {
                return d2;
            }
        }
        throw new IllegalStateException("Lookahead root has not been set up yet".toString());
    }
}
