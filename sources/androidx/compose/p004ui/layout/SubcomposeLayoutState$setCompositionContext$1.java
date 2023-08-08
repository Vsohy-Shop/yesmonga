package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.C8602q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/q;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/q;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1 */
public final class SubcomposeLayoutState$setCompositionContext$1 extends Lambda implements C11304p<LayoutNode, C8602q, C11079d2> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    /* renamed from: a */
    public final void mo44350a(@C12579k LayoutNode layoutNode, @C12579k C8602q qVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
        Intrinsics.checkNotNullParameter(qVar, "it");
        this.this$0.mo44348i().mo44280x(qVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo44350a((LayoutNode) obj, (C8602q) obj2);
        return C11079d2.f28267a;
    }
}
