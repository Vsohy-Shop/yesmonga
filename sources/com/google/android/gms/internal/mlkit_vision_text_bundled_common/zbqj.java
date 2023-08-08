package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

final class zbqj<E> extends zbqd<E> {

    /* renamed from: e */
    public static final zbqd<Object> f71602e = new zbqj(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f71603c;

    /* renamed from: d */
    public final transient int f71604d;

    public zbqj(Object[] objArr, int i) {
        this.f71603c = objArr;
        this.f71604d = i;
    }

    /* renamed from: e */
    public final int mo84936e(Object[] objArr, int i) {
        System.arraycopy(this.f71603c, 0, objArr, 0, this.f71604d);
        return this.f71604d;
    }

    public final E get(int i) {
        C29679rr.m120993a(i, this.f71604d, "index");
        E e = this.f71603c[i];
        e.getClass();
        return e;
    }

    /* renamed from: h */
    public final int mo84937h() {
        return this.f71604d;
    }

    /* renamed from: i */
    public final int mo84938i() {
        return 0;
    }

    /* renamed from: q */
    public final Object[] mo84941q() {
        return this.f71603c;
    }

    public final int size() {
        return this.f71604d;
    }
}
