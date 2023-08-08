package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.gestures.f */
public interface C2193f {

    /* renamed from: androidx.compose.foundation.gestures.f$a */
    public static final class C2194a {
    }

    /* renamed from: c */
    static /* synthetic */ Object m9521c(C2193f fVar, MutatePriority mutatePriority, C11304p pVar, C11045c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return fVar.mo7350d(mutatePriority, pVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    /* renamed from: b */
    void mo7349b(float f);

    @C12580l
    /* renamed from: d */
    Object mo7350d(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2192e, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar);
}
