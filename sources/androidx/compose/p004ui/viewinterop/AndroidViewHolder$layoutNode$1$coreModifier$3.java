package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/layout/o;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/o;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3 */
public final class AndroidViewHolder$layoutNode$1$coreModifier$3 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    /* renamed from: a */
    public final void mo47969a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "it");
        C16523c.m74854e(this.$this_run, this.$layoutNode);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo47969a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
