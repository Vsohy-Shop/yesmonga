package androidx.lifecycle;

import androidx.annotation.C0353k0;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "ViewModelProviderGetKt")
/* renamed from: androidx.lifecycle.y0 */
public final class C19515y0 {
    @C12579k
    /* renamed from: a */
    public static final C19477a m90894a(@C12579k C19395b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "owner");
        if (b1Var instanceof C19455p) {
            return ((C19455p) b1Var).getDefaultViewModelCreationExtras();
        }
        return C19477a.C19478a.f49866b;
    }

    @C0353k0
    /* renamed from: b */
    public static final /* synthetic */ <VM extends C19476v0> VM m90895b(C19502x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        return x0Var.mo57693a(C19476v0.class);
    }
}
