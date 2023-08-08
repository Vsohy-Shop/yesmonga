package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.material3.TouchExplorationStateProvider_androidKt$touchExplorationState$3$1 */
public final class C8166x188f61bc extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8204g1 $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8166x188f61bc(C8204g1 g1Var) {
        super(0);
        this.$listener = g1Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$listener.mo12605c());
    }
}
