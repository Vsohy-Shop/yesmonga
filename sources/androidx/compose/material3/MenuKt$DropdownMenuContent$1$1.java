package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MenuKt$DropdownMenuContent$1$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ C8578k2<Float> $alpha$delegate;
    final /* synthetic */ C8578k2<Float> $scale$delegate;
    final /* synthetic */ C8700z0<C15283o4> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(C8700z0<C15283o4> z0Var, C8578k2<Float> k2Var, C8578k2<Float> k2Var2) {
        super(1);
        this.$transformOriginState = z0Var;
        this.$scale$delegate = k2Var;
        this.$alpha$delegate = k2Var2;
    }

    /* renamed from: a */
    public final void mo11644a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        u2Var.mo42487x(MenuKt.m25869b(this.$scale$delegate));
        u2Var.mo42457J(MenuKt.m25869b(this.$scale$delegate));
        u2Var.mo42473g(MenuKt.m25870c(this.$alpha$delegate));
        u2Var.mo42480o2(this.$transformOriginState.getValue().mo42931o());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11644a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
