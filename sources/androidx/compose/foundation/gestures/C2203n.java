package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.gestures.n */
public interface C2203n {

    /* renamed from: androidx.compose.foundation.gestures.n$a */
    public static final class C2204a {
        @Deprecated
        /* renamed from: a */
        public static boolean m9571a(@C12579k C2203n nVar) {
            return C2203n.super.mo7252f();
        }

        @Deprecated
        /* renamed from: b */
        public static boolean m9572b(@C12579k C2203n nVar) {
            return C2203n.super.mo7249a();
        }
    }

    /* renamed from: c */
    static /* synthetic */ Object m9563c(C2203n nVar, MutatePriority mutatePriority, C11304p pVar, C11045c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return nVar.mo7253g(mutatePriority, pVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    /* renamed from: a */
    boolean mo7249a() {
        return true;
    }

    /* renamed from: b */
    float mo7250b(float f);

    /* renamed from: e */
    boolean mo7251e();

    /* renamed from: f */
    boolean mo7252f() {
        return true;
    }

    @C12580l
    /* renamed from: g */
    Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar);
}
