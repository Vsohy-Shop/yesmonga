package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 */
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends Lambda implements C11300l<LayoutNode, C11079d2> {
    final /* synthetic */ C11300l<C15571h1, C11079d2> $onAttached;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(C11300l<? super C15571h1, C11079d2> lVar) {
        super(1);
        this.$onAttached = lVar;
    }

    /* renamed from: a */
    public final void mo44353a(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$init");
        this.$onAttached.invoke(new C15571h1(layoutNode));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44353a((LayoutNode) obj);
        return C11079d2.f28267a;
    }
}
