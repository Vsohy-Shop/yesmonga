package com.google.android.gms.internal.mlkit_common;

final class zzap<E> extends zzan<E> {

    /* renamed from: e */
    public static final zzan<Object> f107495e = new zzap(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f107496c;

    /* renamed from: d */
    public final transient int f107497d;

    public zzap(Object[] objArr, int i) {
        this.f107496c = objArr;
        this.f107497d = i;
    }

    /* renamed from: e */
    public final int mo137852e(Object[] objArr, int i) {
        System.arraycopy(this.f107496c, 0, objArr, 0, this.f107497d);
        return this.f107497d;
    }

    public final E get(int i) {
        C42347e.m171459a(i, this.f107497d, "index");
        E e = this.f107496c[i];
        e.getClass();
        return e;
    }

    /* renamed from: h */
    public final int mo137853h() {
        return this.f107497d;
    }

    /* renamed from: i */
    public final int mo137854i() {
        return 0;
    }

    /* renamed from: q */
    public final Object[] mo137857q() {
        return this.f107496c;
    }

    public final int size() {
        return this.f107497d;
    }
}
