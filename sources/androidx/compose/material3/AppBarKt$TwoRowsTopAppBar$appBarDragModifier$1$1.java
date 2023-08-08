package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C8275r3 $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1(C8275r3 r3Var) {
        super(1);
        this.$scrollBehavior = r3Var;
    }

    /* renamed from: a */
    public final void mo11160a(float f) {
        this.$scrollBehavior.getState().mo12417h(this.$scrollBehavior.getState().mo12413d() + f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11160a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
