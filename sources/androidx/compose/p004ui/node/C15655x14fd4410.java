package androidx.compose.p004ui.node;

import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 */
public final class C15655x14fd4410 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C15327u2, C11079d2> $layerBlock;
    final /* synthetic */ long $position;
    final /* synthetic */ float $zIndex;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15655x14fd4410(C11300l<? super C15327u2, C11079d2> lVar, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j, float f) {
        super(0);
        this.$layerBlock = lVar;
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
        this.$zIndex = f;
    }

    public final void invoke() {
        C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
        C11300l<C15327u2, C11079d2> lVar = this.$layerBlock;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        float f = this.$zIndex;
        if (lVar == null) {
            aVar.mo44482q(layoutNodeLayoutDelegate.mo44761z(), j, f);
        } else {
            aVar.mo44477E(layoutNodeLayoutDelegate.mo44761z(), j, f, lVar);
        }
    }
}
