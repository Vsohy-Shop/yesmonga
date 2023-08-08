package androidx.compose.foundation.relocation;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.geometry.C15098i;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
/* renamed from: androidx.compose.foundation.relocation.d */
public interface C2672d {
    /* renamed from: a */
    static /* synthetic */ Object m12048a(C2672d dVar, C15098i iVar, C11045c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                iVar = null;
            }
            return dVar.mo9125b(iVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    @C12580l
    /* renamed from: b */
    Object mo9125b(@C12580l C15098i iVar, @C12579k C11045c<? super C11079d2> cVar);
}
