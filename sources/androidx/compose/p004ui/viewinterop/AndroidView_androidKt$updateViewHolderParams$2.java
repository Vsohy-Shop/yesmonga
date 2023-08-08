package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/unit/d;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/d;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2 */
public final class AndroidView_androidKt$updateViewHolderParams$2 extends Lambda implements C11304p<LayoutNode, C16479d, C11079d2> {

    /* renamed from: f */
    public static final AndroidView_androidKt$updateViewHolderParams$2 f40958f = new AndroidView_androidKt$updateViewHolderParams$2();

    public AndroidView_androidKt$updateViewHolderParams$2() {
        super(2);
    }

    /* renamed from: a */
    public final void mo47983a(@C12579k LayoutNode layoutNode, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(dVar, "it");
        AndroidView_androidKt.m74834f(layoutNode).setDensity(dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo47983a((LayoutNode) obj, (C16479d) obj2);
        return C11079d2.f28267a;
    }
}
