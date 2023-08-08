package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeToDismissKt$rememberDismissState$2$1 extends Lambda implements C11289a<DismissState> {
    final /* synthetic */ C11300l<DismissValue, Boolean> $confirmStateChange;
    final /* synthetic */ DismissValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$rememberDismissState$2$1(DismissValue dismissValue, C11300l<? super DismissValue, Boolean> lVar) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final DismissState invoke() {
        return new DismissState(this.$initialValue, this.$confirmStateChange);
    }
}
