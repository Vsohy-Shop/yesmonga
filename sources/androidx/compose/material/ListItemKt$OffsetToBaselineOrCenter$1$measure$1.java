package androidx.compose.material;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ListItemKt$OffsetToBaselineOrCenter$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $placeable;

    /* renamed from: $y */
    final /* synthetic */ int f7694$y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$OffsetToBaselineOrCenter$1$measure$1(C15611w0 w0Var, int i) {
        super(1);
        this.$placeable = w0Var;
        this.f7694$y = i;
    }

    /* renamed from: a */
    public final void mo10235a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a.m69414v(aVar, this.$placeable, 0, this.f7694$y, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10235a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
