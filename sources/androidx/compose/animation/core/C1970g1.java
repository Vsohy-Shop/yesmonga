package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.g1 */
public interface C1970g1<V extends C1997o> extends C1953c1<V> {

    /* renamed from: androidx.compose.animation.core.g1$a */
    public static final class C1971a {
        @Deprecated
        @C12579k
        /* renamed from: a */
        public static <V extends C1997o> V m8374a(@C12579k C1970g1<V> g1Var, @C12579k V v, @C12579k V v2, @C12579k V v3) {
            Intrinsics.checkNotNullParameter(v, "initialValue");
            Intrinsics.checkNotNullParameter(v2, "targetValue");
            Intrinsics.checkNotNullParameter(v3, "initialVelocity");
            return C1970g1.super.mo6803f(v, v2, v3);
        }

        @Deprecated
        /* renamed from: b */
        public static <V extends C1997o> boolean m8375b(@C12579k C1970g1<V> g1Var) {
            return C1970g1.super.mo6801a();
        }
    }

    /* renamed from: a */
    boolean mo6801a() {
        return false;
    }
}
