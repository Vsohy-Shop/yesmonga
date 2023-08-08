package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/m;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/m;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1 */
public final class AndroidView_androidKt$updateViewHolderParams$1 extends Lambda implements C11304p<LayoutNode, C8767m, C11079d2> {

    /* renamed from: f */
    public static final AndroidView_androidKt$updateViewHolderParams$1 f40957f = new AndroidView_androidKt$updateViewHolderParams$1();

    public AndroidView_androidKt$updateViewHolderParams$1() {
        super(2);
    }

    /* renamed from: a */
    public final void mo47982a(@C12579k LayoutNode layoutNode, @C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(mVar, "it");
        AndroidView_androidKt.m74834f(layoutNode).setModifier(mVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo47982a((LayoutNode) obj, (C8767m) obj2);
        return C11079d2.f28267a;
    }
}
