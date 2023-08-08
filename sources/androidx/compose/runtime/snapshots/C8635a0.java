package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.snapshots.a0 */
public interface C8635a0 {

    /* renamed from: androidx.compose.runtime.snapshots.a0$a */
    public static final class C8636a {
        @C12580l
        @Deprecated
        /* renamed from: a */
        public static C8638b0 m31605a(@C12579k C8635a0 a0Var, @C12579k C8638b0 b0Var, @C12579k C8638b0 b0Var2, @C12579k C8638b0 b0Var3) {
            Intrinsics.checkNotNullParameter(b0Var, "previous");
            Intrinsics.checkNotNullParameter(b0Var2, "current");
            Intrinsics.checkNotNullParameter(b0Var3, "applied");
            return C8635a0.super.mo15300q(b0Var, b0Var2, b0Var3);
        }
    }

    /* renamed from: e */
    void mo15116e(@C12579k C8638b0 b0Var);

    @C12579k
    /* renamed from: i */
    C8638b0 mo15119i();

    @C12580l
    /* renamed from: q */
    C8638b0 mo15300q(@C12579k C8638b0 b0Var, @C12579k C8638b0 b0Var2, @C12579k C8638b0 b0Var3) {
        Intrinsics.checkNotNullParameter(b0Var, "previous");
        Intrinsics.checkNotNullParameter(b0Var2, "current");
        Intrinsics.checkNotNullParameter(b0Var3, "applied");
        return null;
    }
}
