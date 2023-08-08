package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.s */
public abstract class C29688s {

    /* renamed from: a */
    public final Unsafe f71446a;

    public C29688s(Unsafe unsafe) {
        this.f71446a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo84786a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo84787b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo84788c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo84789d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo84790e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo84791f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo84792g(Object obj, long j);

    /* renamed from: h */
    public final int mo84816h(Class<?> cls) {
        return this.f71446a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo84817i(Class<?> cls) {
        return this.f71446a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo84818j(Object obj, long j) {
        return this.f71446a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo84819k(Object obj, long j) {
        return this.f71446a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo84820l(Field field) {
        return this.f71446a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo84821m(Object obj, long j) {
        return this.f71446a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo84822n(Object obj, long j, int i) {
        this.f71446a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo84823o(Object obj, long j, long j2) {
        this.f71446a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo84824p(Object obj, long j, Object obj2) {
        this.f71446a.putObject(obj, j, obj2);
    }
}
