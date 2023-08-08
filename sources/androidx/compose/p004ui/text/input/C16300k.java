package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;

/* renamed from: androidx.compose.ui.text.input.k */
public final class C16300k {
    /* renamed from: a */
    public static final long m73451a(long j, long j2) {
        int i;
        int l = C16356n0.m73740l(j);
        int k = C16356n0.m73739k(j);
        if (C16356n0.m73744p(j2, j)) {
            if (C16356n0.m73732d(j2, j)) {
                l = C16356n0.m73740l(j2);
                k = l;
            } else if (C16356n0.m73732d(j, j2)) {
                i = C16356n0.m73738j(j2);
            } else if (C16356n0.m73733e(j2, l)) {
                l = C16356n0.m73740l(j2);
                i = C16356n0.m73738j(j2);
            } else {
                k = C16356n0.m73740l(j2);
            }
            return C16359o0.m73780b(l, k);
        }
        if (k > C16356n0.m73740l(j2)) {
            l -= C16356n0.m73738j(j2);
            i = C16356n0.m73738j(j2);
        }
        return C16359o0.m73780b(l, k);
        k -= i;
        return C16359o0.m73780b(l, k);
    }
}
