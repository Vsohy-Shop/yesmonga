package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends Lambda implements C11304p<DismissValue, DismissValue, C7941v1> {
    final /* synthetic */ C11300l<DismissDirection, C7941v1> $dismissThresholds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(C11300l<? super DismissDirection, ? extends C7941v1> lVar) {
        super(2);
        this.$dismissThresholds = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final C7941v1 invoke(@C12579k DismissValue dismissValue, @C12579k DismissValue dismissValue2) {
        Intrinsics.checkNotNullParameter(dismissValue, "from");
        Intrinsics.checkNotNullParameter(dismissValue2, "to");
        C11300l<DismissDirection, C7941v1> lVar = this.$dismissThresholds;
        DismissDirection c = SwipeToDismissKt.m13894d(dismissValue, dismissValue2);
        Intrinsics.checkNotNull(c);
        return lVar.invoke(c);
    }
}
