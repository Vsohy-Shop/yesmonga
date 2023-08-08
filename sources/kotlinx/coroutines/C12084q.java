package kotlinx.coroutines;

import kotlin.jvm.C11287e;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.q */
public final class C12084q {

    /* renamed from: a */
    public static final int f29730a = 0;

    /* renamed from: b */
    public static final int f29731b = 1;

    /* renamed from: c */
    public static final int f29732c = 2;

    /* renamed from: d */
    public static final int f29733d = 29;

    /* renamed from: e */
    public static final int f29734e = 536870911;

    /* renamed from: f */
    public static final int f29735f = 536870911;
    @C12579k
    @C11287e

    /* renamed from: g */
    public static final C12009o0 f29736g = new C12009o0("RESUME_TOKEN");

    /* renamed from: a */
    public static final int m48277a(int i, int i2) {
        return (i << 29) + i2;
    }

    /* renamed from: b */
    public static final int m48278b(int i) {
        return i >> 29;
    }

    /* renamed from: c */
    public static final int m48279c(int i) {
        return i & 536870911;
    }
}
