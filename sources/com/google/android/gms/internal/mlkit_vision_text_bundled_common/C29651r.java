package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.r */
public final class C29651r extends C29688s {
    public C29651r(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo84786a(Object obj, long j) {
        return Double.longBitsToDouble(mo84819k(obj, j));
    }

    /* renamed from: b */
    public final float mo84787b(Object obj, long j) {
        return Float.intBitsToFloat(mo84818j(obj, j));
    }

    /* renamed from: c */
    public final void mo84788c(Object obj, long j, boolean z) {
        if (C29725t.f71469i) {
            C29725t.m121132d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C29725t.m121133e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo84789d(Object obj, long j, byte b) {
        if (C29725t.f71469i) {
            C29725t.m121132d(obj, j, b);
        } else {
            C29725t.m121133e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo84790e(Object obj, long j, double d) {
        mo84823o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo84791f(Object obj, long j, float f) {
        mo84822n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo84792g(Object obj, long j) {
        if (C29725t.f71469i) {
            return C29725t.m121153y(obj, j);
        }
        return C29725t.m121154z(obj, j);
    }
}
