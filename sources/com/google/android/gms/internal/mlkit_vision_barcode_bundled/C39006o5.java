package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o5 */
public final class C39006o5 extends C39015p5 {
    public C39006o5(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo122973a(Object obj, long j) {
        return Double.longBitsToDouble(mo123011k(obj, j));
    }

    /* renamed from: b */
    public final float mo122974b(Object obj, long j) {
        return Float.intBitsToFloat(mo123010j(obj, j));
    }

    /* renamed from: c */
    public final void mo122975c(Object obj, long j, boolean z) {
        if (C39024q5.f98928i) {
            C39024q5.m160714d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C39024q5.m160715e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo122976d(Object obj, long j, byte b) {
        if (C39024q5.f98928i) {
            C39024q5.m160714d(obj, j, b);
        } else {
            C39024q5.m160715e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo122977e(Object obj, long j, double d) {
        mo123015o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo122978f(Object obj, long j, float f) {
        mo123014n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo122979g(Object obj, long j) {
        if (C39024q5.f98928i) {
            return C39024q5.m160735y(obj, j);
        }
        return C39024q5.m160736z(obj, j);
    }
}
