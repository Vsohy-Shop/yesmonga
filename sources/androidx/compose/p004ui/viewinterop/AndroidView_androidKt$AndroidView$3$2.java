package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2 */
public final class AndroidView_androidKt$AndroidView$3$2 extends Lambda implements C11304p<LayoutNode, C11300l<? super T, ? extends C11079d2>, C11079d2> {

    /* renamed from: f */
    public static final AndroidView_androidKt$AndroidView$3$2 f40954f = new AndroidView_androidKt$AndroidView$3$2();

    public AndroidView_androidKt$AndroidView$3$2() {
        super(2);
    }

    /* renamed from: a */
    public final void mo47977a(@C12579k LayoutNode layoutNode, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(lVar, "it");
        AndroidView_androidKt.m74834f(layoutNode).setUpdateBlock(lVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo47977a((LayoutNode) obj, (C11300l) obj2);
        return C11079d2.f28267a;
    }
}
