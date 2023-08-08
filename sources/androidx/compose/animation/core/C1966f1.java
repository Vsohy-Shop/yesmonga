package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.f1 */
public interface C1966f1<V extends C1997o> extends C1970g1<V> {

    /* renamed from: androidx.compose.animation.core.f1$a */
    public static final class C1967a {
        @Deprecated
        /* renamed from: a */
        public static <V extends C1997o> long m8365a(@C12579k C1966f1<V> f1Var, @C12579k V v, @C12579k V v2, @C12579k V v3) {
            Intrinsics.checkNotNullParameter(v, "initialValue");
            Intrinsics.checkNotNullParameter(v2, "targetValue");
            Intrinsics.checkNotNullParameter(v3, "initialVelocity");
            return C1966f1.super.mo6802b(v, v2, v3);
        }

        @Deprecated
        @C12579k
        /* renamed from: b */
        public static <V extends C1997o> V m8366b(@C12579k C1966f1<V> f1Var, @C12579k V v, @C12579k V v2, @C12579k V v3) {
            Intrinsics.checkNotNullParameter(v, "initialValue");
            Intrinsics.checkNotNullParameter(v2, "targetValue");
            Intrinsics.checkNotNullParameter(v3, "initialVelocity");
            return C1966f1.super.mo6803f(v, v2, v3);
        }

        @Deprecated
        /* renamed from: c */
        public static <V extends C1997o> boolean m8367c(@C12579k C1966f1<V> f1Var) {
            return C1966f1.super.mo6801a();
        }
    }

    /* renamed from: b */
    long mo6802b(@C12579k V v, @C12579k V v2, @C12579k V v3) {
        Intrinsics.checkNotNullParameter(v, "initialValue");
        Intrinsics.checkNotNullParameter(v2, "targetValue");
        Intrinsics.checkNotNullParameter(v3, "initialVelocity");
        return ((long) (mo6843e() + mo6844g())) * 1000000;
    }

    /* renamed from: e */
    int mo6843e();

    /* renamed from: g */
    int mo6844g();
}
