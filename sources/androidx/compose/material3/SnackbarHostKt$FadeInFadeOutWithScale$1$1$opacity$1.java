package androidx.compose.material3;

import androidx.compose.runtime.C8586m1;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10994x;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8269q2 $key;
    final /* synthetic */ C8272r0<C8269q2> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(C8269q2 q2Var, C8272r0<C8269q2> r0Var) {
        super(0);
        this.$key = q2Var;
        this.$state = r0Var;
    }

    public final void invoke() {
        if (!Intrinsics.areEqual((Object) this.$key, this.$state.mo12945a())) {
            List<C8267q0<C8269q2>> b = this.$state.mo12946b();
            final C8269q2 q2Var = this.$key;
            C10994x.m42348I0(b, new C11300l<C8267q0<C8269q2>, Boolean>() {
                @C12579k
                /* renamed from: a */
                public final Boolean invoke(@C12579k C8267q0<C8269q2> q0Var) {
                    Intrinsics.checkNotNullParameter(q0Var, "it");
                    return Boolean.valueOf(Intrinsics.areEqual((Object) q0Var.mo12928e(), (Object) q2Var));
                }
            });
            C8586m1 c = this.$state.mo12947c();
            if (c != null) {
                c.invalidate();
            }
        }
    }
}
