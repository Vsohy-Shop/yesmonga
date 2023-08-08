package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p5 */
public abstract class C39015p5 {

    /* renamed from: a */
    public final Unsafe f98918a;

    public C39015p5(Unsafe unsafe) {
        this.f98918a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo122973a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo122974b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo122975c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo122976d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo122977e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo122978f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo122979g(Object obj, long j);

    /* renamed from: h */
    public final int mo123008h(Class<?> cls) {
        return this.f98918a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo123009i(Class<?> cls) {
        return this.f98918a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo123010j(Object obj, long j) {
        return this.f98918a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo123011k(Object obj, long j) {
        return this.f98918a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo123012l(Field field) {
        return this.f98918a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo123013m(Object obj, long j) {
        return this.f98918a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo123014n(Object obj, long j, int i) {
        this.f98918a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo123015o(Object obj, long j, long j2) {
        this.f98918a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo123016p(Object obj, long j, Object obj2) {
        this.f98918a.putObject(obj, j, obj2);
    }
}
