package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.c1 */
public interface C1953c1<V extends C1997o> {

    /* renamed from: androidx.compose.animation.core.c1$a */
    public static final class C1954a {
        @Deprecated
        @C12579k
        /* renamed from: a */
        public static <V extends C1997o> V m8311a(@C12579k C1953c1<V> c1Var, @C12579k V v, @C12579k V v2, @C12579k V v3) {
            Intrinsics.checkNotNullParameter(v, "initialValue");
            Intrinsics.checkNotNullParameter(v2, "targetValue");
            Intrinsics.checkNotNullParameter(v3, "initialVelocity");
            return C1953c1.super.mo6803f(v, v2, v3);
        }
    }

    /* renamed from: a */
    boolean mo6801a();

    /* renamed from: b */
    long mo6802b(@C12579k V v, @C12579k V v2, @C12579k V v3);

    @C12579k
    /* renamed from: f */
    V mo6803f(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return mo6804j(mo6802b(v, v2, v3), v, v2, v3);
    }

    @C12579k
    /* renamed from: j */
    V mo6804j(long j, @C12579k V v, @C12579k V v2, @C12579k V v3);

    @C12579k
    /* renamed from: m */
    V mo6805m(long j, @C12579k V v, @C12579k V v2, @C12579k V v3);
}
