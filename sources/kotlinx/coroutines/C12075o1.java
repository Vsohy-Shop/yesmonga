package kotlinx.coroutines;

import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.o1 */
public final class C12075o1 {
    @C12579k

    /* renamed from: a */
    public static final C12009o0 f29712a = new C12009o0("REMOVED_TASK");

    /* renamed from: b */
    public static final int f29713b = 0;

    /* renamed from: c */
    public static final int f29714c = 1;

    /* renamed from: d */
    public static final int f29715d = 2;

    /* renamed from: e */
    public static final long f29716e = 1000000;

    /* renamed from: f */
    public static final long f29717f = 9223372036854L;

    /* renamed from: g */
    public static final long f29718g = 4611686018427387903L;
    @C12579k

    /* renamed from: h */
    public static final C12009o0 f29719h = new C12009o0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m48188c(long j) {
        return j / 1000000;
    }

    /* renamed from: d */
    public static final long m48189d(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= f29717f) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
