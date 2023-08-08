package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2002p1;
import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8547h2;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C2622w
/* renamed from: androidx.compose.foundation.lazy.e */
public interface C2455e {

    /* renamed from: androidx.compose.foundation.lazy.e$a */
    public static final class C2456a {
    }

    /* renamed from: b */
    static /* synthetic */ C8767m m10931b(C2455e eVar, C8767m mVar, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return eVar.mo8267g(mVar, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }

    /* renamed from: c */
    static /* synthetic */ C8767m m10932c(C2455e eVar, C8767m mVar, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return eVar.mo8268h(mVar, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
    }

    /* renamed from: d */
    static /* synthetic */ C8767m m10933d(C2455e eVar, C8767m mVar, C1956d0 d0Var, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
            }
            return eVar.mo8265a(mVar, d0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    /* renamed from: e */
    static /* synthetic */ C8767m m10934e(C2455e eVar, C8767m mVar, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return eVar.mo8266f(mVar, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
    }

    @C2855v
    @C12579k
    /* renamed from: a */
    C8767m mo8265a(@C12579k C8767m mVar, @C12579k C1956d0<C16494m> d0Var);

    @C12579k
    /* renamed from: f */
    C8767m mo8266f(@C12579k C8767m mVar, float f);

    @C12579k
    /* renamed from: g */
    C8767m mo8267g(@C12579k C8767m mVar, float f);

    @C12579k
    /* renamed from: h */
    C8767m mo8268h(@C12579k C8767m mVar, float f);
}
