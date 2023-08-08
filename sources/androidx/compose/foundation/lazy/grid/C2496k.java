package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2002p1;
import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8547h2;
import org.jetbrains.annotations.C12579k;

@C2503r
@C8547h2
/* renamed from: androidx.compose.foundation.lazy.grid.k */
public interface C2496k {
    /* renamed from: b */
    static /* synthetic */ C8767m m11196b(C2496k kVar, C8767m mVar, C1956d0 d0Var, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
            }
            return kVar.mo8454a(mVar, d0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    @C2855v
    @C12579k
    /* renamed from: a */
    C8767m mo8454a(@C12579k C8767m mVar, @C12579k C1956d0<C16494m> d0Var);
}
