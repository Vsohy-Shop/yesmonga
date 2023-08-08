package androidx.compose.foundation.layout;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.j0 */
public final class C2371j0 extends C2410u {
    @C12579k

    /* renamed from: e */
    public final C2366i0 f6285e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2371j0(@C12579k C2366i0 i0Var, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6285e = i0Var;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2371j0)) {
            return false;
        }
        return Intrinsics.areEqual((Object) ((C2371j0) obj).f6285e, (Object) this.f6285e);
    }

    public int hashCode() {
        return this.f6285e.hashCode();
    }

    @C12579k
    /* renamed from: r */
    public C2354e1 mo8013r(@C12579k C2354e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "modifierLocalInsets");
        return C2358f1.m10392e(C2358f1.m10393f(this.f6285e), e1Var);
    }
}
