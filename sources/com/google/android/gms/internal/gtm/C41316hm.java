package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.gtm.hm */
public abstract class C41316hm {

    /* renamed from: a */
    public final Unsafe f104665a;

    public C41316hm(Unsafe unsafe) {
        this.f104665a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo135381a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo135382b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo135383c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo135384d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo135385e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo135386f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo135387g(Object obj, long j);

    /* renamed from: h */
    public final int mo135465h(Class<?> cls) {
        return this.f104665a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo135466i(Class<?> cls) {
        return this.f104665a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo135467j(Object obj, long j) {
        return this.f104665a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo135468k(Object obj, long j) {
        return this.f104665a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo135469l(Field field) {
        return this.f104665a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo135470m(Object obj, long j) {
        return this.f104665a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo135471n(Object obj, long j, int i) {
        this.f104665a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo135472o(Object obj, long j, long j2) {
        this.f104665a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo135473p(Object obj, long j, Object obj2) {
        this.f104665a.putObject(obj, j, obj2);
    }
}
