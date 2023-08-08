package androidx.compose.p004ui.node;

import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/unit/LayoutDirection;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/ComposeUiNode;Landroidx/compose/ui/unit/LayoutDirection;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1 */
public final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements C11304p<ComposeUiNode, LayoutDirection, C11079d2> {

    /* renamed from: f */
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 f38807f = new ComposeUiNode$Companion$SetLayoutDirection$1();

    public ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    /* renamed from: a */
    public final void mo44593a(@C12579k ComposeUiNode composeUiNode, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(composeUiNode, "$this$null");
        Intrinsics.checkNotNullParameter(layoutDirection, "it");
        composeUiNode.mo44575a(layoutDirection);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo44593a((ComposeUiNode) obj, (LayoutDirection) obj2);
        return C11079d2.f28267a;
    }
}
