package com.carrefour.fid.android.shared.extension;

import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.extension.d0 */
public final class C28750d0 {
    /* renamed from: a */
    public static final double m119039a(@C12580l Long l, int i) {
        Double b;
        if (l == null || (b = m119040b(l, i)) == null) {
            return 0.0d;
        }
        return b.doubleValue();
    }

    @C12580l
    /* renamed from: b */
    public static final Double m119040b(@C12580l Long l, int i) {
        if (l != null) {
            return Double.valueOf(((double) l.longValue()) / Math.pow(10.0d, (double) i));
        }
        return null;
    }

    /* renamed from: c */
    public static final long m119041c(@C12580l Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }
}
