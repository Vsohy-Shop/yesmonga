package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.gc */
public final class C41970gc extends C41988hc {
    public C41970gc(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo136771a(Object obj, long j) {
        return Double.longBitsToDouble(this.f106192a.getLong(obj, j));
    }

    /* renamed from: b */
    public final float mo136772b(Object obj, long j) {
        return Float.intBitsToFloat(this.f106192a.getInt(obj, j));
    }

    /* renamed from: c */
    public final void mo136773c(Object obj, long j, boolean z) {
        if (C42006ic.f106221h) {
            C42006ic.m170293d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C42006ic.m170294e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo136774d(Object obj, long j, byte b) {
        if (C42006ic.f106221h) {
            C42006ic.m170293d(obj, j, b);
        } else {
            C42006ic.m170294e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo136775e(Object obj, long j, double d) {
        this.f106192a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo136776f(Object obj, long j, float f) {
        this.f106192a.putInt(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo136777g(Object obj, long j) {
        if (C42006ic.f106221h) {
            return C42006ic.m170314y(obj, j);
        }
        return C42006ic.m170315z(obj, j);
    }
}
