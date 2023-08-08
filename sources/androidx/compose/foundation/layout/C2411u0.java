package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15574i0;
import androidx.compose.p004ui.layout.C15576j;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;

@C2429z
@C8585m0
/* renamed from: androidx.compose.foundation.layout.u0 */
public interface C2411u0 {

    /* renamed from: androidx.compose.foundation.layout.u0$a */
    public static final class C2412a {
    }

    /* renamed from: e */
    static /* synthetic */ C8767m m10660e(C2411u0 u0Var, C8767m mVar, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return u0Var.mo7842b(mVar, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    @C8547h2
    @C12579k
    /* renamed from: a */
    C8767m mo7841a(@C12579k C8767m mVar, @C12579k C11300l<? super C15574i0, Integer> lVar);

    @C8547h2
    @C12579k
    /* renamed from: b */
    C8767m mo7842b(@C12579k C8767m mVar, float f, boolean z);

    @C8547h2
    @C12579k
    /* renamed from: c */
    C8767m mo7843c(@C12579k C8767m mVar);

    @C8547h2
    @C12579k
    /* renamed from: d */
    C8767m mo7844d(@C12579k C8767m mVar, @C12579k C15576j jVar);

    @C8547h2
    @C12579k
    /* renamed from: f */
    C8767m mo7845f(@C12579k C8767m mVar, @C12579k C8734c.C8737c cVar);
}
