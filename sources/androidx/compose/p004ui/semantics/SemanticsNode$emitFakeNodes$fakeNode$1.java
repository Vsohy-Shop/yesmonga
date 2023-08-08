package androidx.compose.p004ui.semantics;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/semantics/q;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/semantics/q;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1 */
public final class SemanticsNode$emitFakeNodes$fakeNode$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C16031g $nodeRole;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemanticsNode$emitFakeNodes$fakeNode$1(C16031g gVar) {
        super(1);
        this.$nodeRole = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$fakeSemanticsNode");
        SemanticsPropertiesKt.m71981R0(qVar, this.$nodeRole.mo46119n());
    }
}
