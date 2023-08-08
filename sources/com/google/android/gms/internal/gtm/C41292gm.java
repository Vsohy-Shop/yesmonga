package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.gtm.gm */
public final class C41292gm extends C41316hm {
    public C41292gm(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo135381a(Object obj, long j) {
        return Double.longBitsToDouble(mo135468k(obj, j));
    }

    /* renamed from: b */
    public final float mo135382b(Object obj, long j) {
        return Float.intBitsToFloat(mo135467j(obj, j));
    }

    /* renamed from: c */
    public final void mo135383c(Object obj, long j, boolean z) {
        if (C41340im.f104693i) {
            C41340im.m167746d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C41340im.m167747e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo135384d(Object obj, long j, byte b) {
        if (C41340im.f104693i) {
            C41340im.m167746d(obj, j, b);
        } else {
            C41340im.m167747e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo135385e(Object obj, long j, double d) {
        mo135472o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo135386f(Object obj, long j, float f) {
        mo135471n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo135387g(Object obj, long j) {
        if (C41340im.f104693i) {
            return C41340im.m167767y(obj, j);
        }
        return C41340im.m167768z(obj, j);
    }
}
