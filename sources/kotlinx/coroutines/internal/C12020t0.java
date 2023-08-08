package kotlinx.coroutines.internal;

import kotlin.text.C11621s;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.internal.t0 */
public final /* synthetic */ class C12020t0 {
    /* renamed from: a */
    public static final int m47957a(@C12579k String str, int i, int i2, int i3) {
        return (int) C12016r0.m47946c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m47958b(@C12579k String str, long j, long j2, long j3) {
        String d = C12016r0.m47947d(str);
        if (d == null) {
            return j;
        }
        Long longOrNull = C11621s.toLongOrNull(d);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    @C12579k
    /* renamed from: c */
    public static final String m47959c(@C12579k String str, @C12579k String str2) {
        String d = C12016r0.m47947d(str);
        return d == null ? str2 : d;
    }

    /* renamed from: d */
    public static final boolean m47960d(@C12579k String str, boolean z) {
        String d = C12016r0.m47947d(str);
        return d != null ? Boolean.parseBoolean(d) : z;
    }

    /* renamed from: e */
    public static /* synthetic */ int m47961e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C12016r0.m47945b(str, i, i2, i3);
    }

    /* renamed from: f */
    public static /* synthetic */ long m47962f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C12016r0.m47946c(str, j, j4, j3);
    }
}
