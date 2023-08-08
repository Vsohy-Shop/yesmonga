package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.unit.b */
public final class C16476b {
    @C12579k

    /* renamed from: b */
    public static final C16477a f40850b = new C16477a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40851c = Integer.MAX_VALUE;

    /* renamed from: d */
    public static final long f40852d = 0;

    /* renamed from: e */
    public static final long f40853e = 1;

    /* renamed from: f */
    public static final long f40854f = 2;

    /* renamed from: g */
    public static final long f40855g = 3;

    /* renamed from: h */
    public static final long f40856h = 3;

    /* renamed from: i */
    public static final int f40857i = 16;

    /* renamed from: j */
    public static final int f40858j = 65535;

    /* renamed from: k */
    public static final int f40859k = 15;

    /* renamed from: l */
    public static final int f40860l = 32767;

    /* renamed from: m */
    public static final int f40861m = 18;

    /* renamed from: n */
    public static final int f40862n = 262143;

    /* renamed from: o */
    public static final int f40863o = 13;

    /* renamed from: p */
    public static final int f40864p = 8191;
    @C12579k

    /* renamed from: q */
    public static final int[] f40865q = {18, 20, 17, 15};
    @C12579k

    /* renamed from: r */
    public static final int[] f40866r = {65535, f40862n, 32767, f40864p};
    @C12579k

    /* renamed from: s */
    public static final int[] f40867s = {32767, f40864p, 65535, f40862n};

    /* renamed from: a */
    public final long f40868a;

    /* renamed from: androidx.compose.ui.unit.b$a */
    public static final class C16477a {
        public /* synthetic */ C16477a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47808a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: b */
        public final long mo47809b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            int i7;
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int a = mo47808a(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int a2 = mo47808a(i6);
            if (a + a2 <= 31) {
                if (a2 == 13) {
                    j = 3;
                } else if (a2 == 18) {
                    j = 1;
                } else if (a2 == 15) {
                    j = 2;
                } else if (a2 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                int i8 = 0;
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = C16476b.f40865q[(int) j];
                return C16476b.m74349c((((long) i7) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i8) << (i9 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        @C8547h2
        /* renamed from: c */
        public final long mo47810c(int i, int i2) {
            boolean z;
            if (i < 0 || i2 < 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return mo47809b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }

        @C8547h2
        /* renamed from: d */
        public final long mo47811d(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo47809b(0, Integer.MAX_VALUE, i, i);
            }
            throw new IllegalArgumentException(("height(" + i + ") must be >= 0").toString());
        }

        @C8547h2
        /* renamed from: e */
        public final long mo47812e(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo47809b(i, i, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i + ") must be >= 0").toString());
        }

        public C16477a() {
        }
    }

    public /* synthetic */ C16476b(long j) {
        this.f40868a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C16476b m74348b(long j) {
        return new C16476b(j);
    }

    /* renamed from: c */
    public static long m74349c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final long m74350d(long j, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i3 < 0 || i < 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i4 < i3 && i4 != Integer.MAX_VALUE) {
                    z3 = false;
                }
                if (z3) {
                    return f40850b.mo47809b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }

    /* renamed from: e */
    public static /* synthetic */ long m74351e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m74364r(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m74362p(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m74363q(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m74361o(j);
        }
        return m74350d(j, i6, i7, i8, i4);
    }

    /* renamed from: f */
    public static boolean m74352f(long j, Object obj) {
        return (obj instanceof C16476b) && j == ((C16476b) obj).mo47807x();
    }

    /* renamed from: g */
    public static final boolean m74353g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static final int m74354h(long j) {
        return (int) (j & 3);
    }

    /* renamed from: i */
    public static final boolean m74355i(long j) {
        int h = m74354h(j);
        if ((((int) (j >> (f40865q[h] + 31))) & f40867s[h]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m74356j(long j) {
        return (((int) (j >> 33)) & f40866r[m74354h(j)]) != 0;
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m74357k() {
    }

    /* renamed from: l */
    public static final boolean m74358l(long j) {
        return m74361o(j) == m74363q(j);
    }

    @C8547h2
    /* renamed from: m */
    public static /* synthetic */ void m74359m() {
    }

    /* renamed from: n */
    public static final boolean m74360n(long j) {
        return m74362p(j) == m74364r(j);
    }

    /* renamed from: o */
    public static final int m74361o(long j) {
        int h = m74354h(j);
        int i = ((int) (j >> (f40865q[h] + 31))) & f40867s[h];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: p */
    public static final int m74362p(long j) {
        int i = ((int) (j >> 33)) & f40866r[m74354h(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: q */
    public static final int m74363q(long j) {
        int h = m74354h(j);
        return ((int) (j >> f40865q[h])) & f40867s[h];
    }

    /* renamed from: r */
    public static final int m74364r(long j) {
        return ((int) (j >> 2)) & f40866r[m74354h(j)];
    }

    @C11532s0
    /* renamed from: s */
    public static /* synthetic */ void m74365s() {
    }

    /* renamed from: t */
    public static int m74366t(long j) {
        return Long.hashCode(j);
    }

    @C8547h2
    /* renamed from: u */
    public static /* synthetic */ void m74367u() {
    }

    /* renamed from: v */
    public static final boolean m74368v(long j) {
        return m74362p(j) == 0 || m74361o(j) == 0;
    }

    @C12579k
    /* renamed from: w */
    public static String m74369w(long j) {
        String str;
        int p = m74362p(j);
        String str2 = "Infinity";
        if (p == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(p);
        }
        int o = m74361o(j);
        if (o != Integer.MAX_VALUE) {
            str2 = String.valueOf(o);
        }
        return "Constraints(minWidth = " + m74364r(j) + ", maxWidth = " + str + ", minHeight = " + m74363q(j) + ", maxHeight = " + str2 + ')';
    }

    public boolean equals(Object obj) {
        return m74352f(this.f40868a, obj);
    }

    public int hashCode() {
        return m74366t(this.f40868a);
    }

    @C12579k
    public String toString() {
        return m74369w(this.f40868a);
    }

    /* renamed from: x */
    public final /* synthetic */ long mo47807x() {
        return this.f40868a;
    }
}
