package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.lifecycle.C19499w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/w;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/lifecycle/w;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3 */
public final class AndroidView_androidKt$updateViewHolderParams$3 extends Lambda implements C11304p<LayoutNode, C19499w, C11079d2> {

    /* renamed from: f */
    public static final AndroidView_androidKt$updateViewHolderParams$3 f40959f = new AndroidView_androidKt$updateViewHolderParams$3();

    public AndroidView_androidKt$updateViewHolderParams$3() {
        super(2);
    }

    /* renamed from: a */
    public final void mo47984a(@C12579k LayoutNode layoutNode, @C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(wVar, "it");
        AndroidView_androidKt.m74834f(layoutNode).setLifecycleOwner(wVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo47984a((LayoutNode) obj, (C19499w) obj2);
        return C11079d2.f28267a;
    }
}
