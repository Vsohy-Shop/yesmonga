package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarKt$SearchBar$4$1$1$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ C8578k2<Float> $animationProgress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$4$1$1$1(C8578k2<Float> k2Var) {
        super(1);
        this.$animationProgress = k2Var;
    }

    /* renamed from: a */
    public final void mo11827a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        u2Var.mo42473g(this.$animationProgress.getValue().floatValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11827a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
