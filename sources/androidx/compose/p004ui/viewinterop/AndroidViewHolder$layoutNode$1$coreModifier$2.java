package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.AndroidComposeView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/e;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,567:1\n245#2:568\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n318#1:568\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2 */
public final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$2(LayoutNode layoutNode, AndroidViewHolder androidViewHolder) {
        super(1);
        this.$layoutNode = layoutNode;
        this.this$0 = androidViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$drawBehind");
        LayoutNode layoutNode = this.$layoutNode;
        AndroidViewHolder androidViewHolder = this.this$0;
        C15118b2 c = eVar.mo42683q5().mo42705c();
        C15675c1 B0 = layoutNode.mo44611B0();
        AndroidComposeView androidComposeView = B0 instanceof AndroidComposeView ? (AndroidComposeView) B0 : null;
        if (androidComposeView != null) {
            androidComposeView.mo45319f0(androidViewHolder, C15208f0.m65929d(c));
        }
    }
}
