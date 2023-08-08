package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.gestures.q */
public interface C2211q {

    /* renamed from: androidx.compose.foundation.gestures.q$a */
    public static final class C2212a {
    }

    /* renamed from: a */
    static /* synthetic */ Object m9580a(C2211q qVar, MutatePriority mutatePriority, C11304p pVar, C11045c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return qVar.mo7364c(mutatePriority, pVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
    }

    /* renamed from: b */
    boolean mo7363b();

    @C12580l
    /* renamed from: c */
    Object mo7364c(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2209p, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar);
}
