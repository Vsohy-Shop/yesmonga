package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import kotlin.ranges.C11479u;

/* renamed from: androidx.compose.ui.unit.c */
public final class C16478c {
    @C8547h2
    /* renamed from: a */
    public static final long m74376a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i < 0 || i3 < 0) {
                    z3 = false;
                }
                if (z3) {
                    return C16476b.f40850b.mo47809b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m74377b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m74376a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static final int m74378c(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : C11479u.m44447u(i + i2, 0);
    }

    @C8547h2
    /* renamed from: d */
    public static final long m74379d(long j, long j2) {
        return C16502r.m74668a(C11479u.m44334I(C16500q.m74662m(j2), C16476b.m74364r(j), C16476b.m74362p(j)), C11479u.m44334I(C16500q.m74659j(j2), C16476b.m74363q(j), C16476b.m74361o(j)));
    }

    /* renamed from: e */
    public static final long m74380e(long j, long j2) {
        return m74376a(C11479u.m44334I(C16476b.m74364r(j2), C16476b.m74364r(j), C16476b.m74362p(j)), C11479u.m44334I(C16476b.m74362p(j2), C16476b.m74364r(j), C16476b.m74362p(j)), C11479u.m44334I(C16476b.m74363q(j2), C16476b.m74363q(j), C16476b.m74361o(j)), C11479u.m44334I(C16476b.m74361o(j2), C16476b.m74363q(j), C16476b.m74361o(j)));
    }

    @C8547h2
    /* renamed from: f */
    public static final int m74381f(long j, int i) {
        return C11479u.m44334I(i, C16476b.m74363q(j), C16476b.m74361o(j));
    }

    @C8547h2
    /* renamed from: g */
    public static final int m74382g(long j, int i) {
        return C11479u.m44334I(i, C16476b.m74364r(j), C16476b.m74362p(j));
    }

    @C8547h2
    /* renamed from: h */
    public static final boolean m74383h(long j, long j2) {
        int r = C16476b.m74364r(j);
        int p = C16476b.m74362p(j);
        int m = C16500q.m74662m(j2);
        if (r <= m && m <= p) {
            int q = C16476b.m74363q(j);
            int o = C16476b.m74361o(j);
            int j3 = C16500q.m74659j(j2);
            if (q <= j3 && j3 <= o) {
                return true;
            }
        }
        return false;
    }

    @C8547h2
    /* renamed from: i */
    public static final long m74384i(long j, int i, int i2) {
        return m74376a(C11479u.m44447u(C16476b.m74364r(j) + i, 0), m74378c(C16476b.m74362p(j), i), C11479u.m44447u(C16476b.m74363q(j) + i2, 0), m74378c(C16476b.m74361o(j), i2));
    }

    /* renamed from: j */
    public static /* synthetic */ long m74385j(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m74384i(j, i, i2);
    }
}
