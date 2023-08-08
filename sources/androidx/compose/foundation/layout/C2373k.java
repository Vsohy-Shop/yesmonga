package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15574i0;
import androidx.compose.p004ui.layout.C15575i1;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;

@C2429z
@C8585m0
/* renamed from: androidx.compose.foundation.layout.k */
public interface C2373k {

    /* renamed from: androidx.compose.foundation.layout.k$a */
    public static final class C2374a {
    }

    /* renamed from: c */
    static /* synthetic */ C8767m m10461c(C2373k kVar, C8767m mVar, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return kVar.mo7712b(mVar, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    @C8547h2
    @C12579k
    /* renamed from: a */
    C8767m mo7711a(@C12579k C8767m mVar, @C12579k C11300l<? super C15574i0, Integer> lVar);

    @C8547h2
    @C12579k
    /* renamed from: b */
    C8767m mo7712b(@C12579k C8767m mVar, float f, boolean z);

    @C8547h2
    @C12579k
    /* renamed from: d */
    C8767m mo7713d(@C12579k C8767m mVar, @C12579k C15575i1 i1Var);

    @C8547h2
    @C12579k
    /* renamed from: e */
    C8767m mo7714e(@C12579k C8767m mVar, @C12579k C8734c.C8736b bVar);
}
