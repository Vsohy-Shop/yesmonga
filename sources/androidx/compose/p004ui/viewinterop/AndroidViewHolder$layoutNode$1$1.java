package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/m;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/m;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1 */
public final class AndroidViewHolder$layoutNode$1$1 extends Lambda implements C11300l<C8767m, C11079d2> {
    final /* synthetic */ C8767m $coreModifier;
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, C8767m mVar) {
        super(1);
        this.$layoutNode = layoutNode;
        this.$coreModifier = mVar;
    }

    /* renamed from: a */
    public final void mo47959a(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "it");
        this.$layoutNode.mo44582u(mVar.mo17224k3(this.$coreModifier));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo47959a((C8767m) obj);
        return C11079d2.f28267a;
    }
}
