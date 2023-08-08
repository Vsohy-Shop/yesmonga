package androidx.navigation.compose;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.navigation.C19754h0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class NavHostKt$NavHost$3 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C19754h0 $navController;

    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$3$a */
    public static final class C19706a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C19754h0 f50507a;

        public C19706a(C19754h0 h0Var) {
            this.f50507a = h0Var;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f50507a.mo58164x(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$3(C19754h0 h0Var) {
        super(1);
        this.$navController = h0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$navController.mo58164x(true);
        return new C19706a(this.$navController);
    }
}
