package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$2 */
public final class LookaheadLayoutKt$LookaheadLayout$1$2 extends Lambda implements C11300l<LayoutNode, C11079d2> {

    /* renamed from: f */
    public static final LookaheadLayoutKt$LookaheadLayout$1$2 f38655f = new LookaheadLayoutKt$LookaheadLayout$1$2();

    public LookaheadLayoutKt$LookaheadLayout$1$2() {
        super(1);
    }

    /* renamed from: a */
    public final void mo44302a(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$init");
        layoutNode.mo44635L1(true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44302a((LayoutNode) obj);
        return C11079d2.f28267a;
    }
}
