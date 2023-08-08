package androidx.compose.material;

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
    final /* synthetic */ C3052i1 $key;
    final /* synthetic */ C7874k0<C3052i1> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(C3052i1 i1Var, C7874k0<C3052i1> k0Var) {
        super(0);
        this.$key = i1Var;
        this.$state = k0Var;
    }

    public final void invoke() {
        if (!Intrinsics.areEqual((Object) this.$key, this.$state.mo10851a())) {
            List<C7871j0<C3052i1>> b = this.$state.mo10852b();
            final C3052i1 i1Var = this.$key;
            C10994x.m42348I0(b, new C11300l<C7871j0<C3052i1>, Boolean>() {
                @C12579k
                /* renamed from: a */
                public final Boolean invoke(@C12579k C7871j0<C3052i1> j0Var) {
                    Intrinsics.checkNotNullParameter(j0Var, "it");
                    return Boolean.valueOf(Intrinsics.areEqual((Object) j0Var.mo10844e(), (Object) i1Var));
                }
            });
            C8586m1 c = this.$state.mo10853c();
            if (c != null) {
                c.invalidate();
            }
        }
    }
}
