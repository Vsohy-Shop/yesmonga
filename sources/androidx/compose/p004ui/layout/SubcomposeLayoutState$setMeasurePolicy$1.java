package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, mo22516d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/f1;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/g0;", "Lkotlin/t;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/p;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1 */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends Lambda implements C11304p<LayoutNode, C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0>, C11079d2> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    /* renamed from: a */
    public final void mo44351a(@C12579k LayoutNode layoutNode, @C12579k C11304p<? super C15562f1, ? super C16476b, ? extends C15564g0> pVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
        Intrinsics.checkNotNullParameter(pVar, "it");
        layoutNode.mo44581o(this.this$0.mo44348i().mo44268k(pVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo44351a((LayoutNode) obj, (C11304p) obj2);
        return C11079d2.f28267a;
    }
}
