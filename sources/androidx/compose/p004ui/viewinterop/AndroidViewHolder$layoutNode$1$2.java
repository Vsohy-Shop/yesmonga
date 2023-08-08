package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/unit/d;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/unit/d;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2 */
public final class AndroidViewHolder$layoutNode$1$2 extends Lambda implements C11300l<C16479d, C11079d2> {
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.$layoutNode = layoutNode;
    }

    /* renamed from: a */
    public final void mo47960a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "it");
        this.$layoutNode.mo44583w(dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo47960a((C16479d) obj);
        return C11079d2.f28267a;
    }
}
