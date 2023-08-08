package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0;", "placeable", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowLayoutKt$breakDownItems$1 extends Lambda implements C11300l<C15611w0, C11079d2> {
    final /* synthetic */ int $index;
    final /* synthetic */ C15611w0[] $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$breakDownItems$1(C15611w0[] w0VarArr, int i) {
        super(1);
        this.$placeables = w0VarArr;
        this.$index = i;
    }

    /* renamed from: a */
    public final void mo7736a(@C12580l C15611w0 w0Var) {
        this.$placeables[this.$index + 1] = w0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7736a((C15611w0) obj);
        return C11079d2.f28267a;
    }
}
