package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.grid.a */
public final class C2482a extends C15988w0 implements C15605u0 {
    @C12579k

    /* renamed from: d */
    public final C1956d0<C16494m> f6570d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2482a(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6570d = d0Var;
    }

    @C12579k
    /* renamed from: N */
    public Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return this.f6570d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2482a)) {
            return false;
        }
        return !Intrinsics.areEqual((Object) this.f6570d, (Object) ((C2482a) obj).f6570d);
    }

    public int hashCode() {
        return this.f6570d.hashCode();
    }

    @C12579k
    /* renamed from: r */
    public final C1956d0<C16494m> mo8538r() {
        return this.f6570d;
    }
}
