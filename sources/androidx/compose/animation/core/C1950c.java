package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.c */
public interface C1950c<T, V extends C1997o> {

    /* renamed from: androidx.compose.animation.core.c$a */
    public static final class C1951a {
        @Deprecated
        /* renamed from: a */
        public static <T, V extends C1997o> boolean m8304a(@C12579k C1950c<T, V> cVar, long j) {
            return C1950c.super.mo6796c(j);
        }
    }

    /* renamed from: a */
    boolean mo6794a();

    @C12579k
    /* renamed from: b */
    V mo6795b(long j);

    /* renamed from: c */
    boolean mo6796c(long j) {
        return j >= mo6797d();
    }

    /* renamed from: d */
    long mo6797d();

    @C12579k
    /* renamed from: e */
    C1945a1<T, V> mo6798e();

    /* renamed from: f */
    T mo6799f(long j);

    /* renamed from: g */
    T mo6800g();
}
