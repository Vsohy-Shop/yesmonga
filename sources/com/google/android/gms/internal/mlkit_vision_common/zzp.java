package com.google.android.gms.internal.mlkit_vision_common;

final class zzp<E> extends zzo<E> {

    /* renamed from: e */
    public static final zzo<Object> f100610e = new zzp(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f100611c;

    /* renamed from: d */
    public final transient int f100612d;

    public zzp(Object[] objArr, int i) {
        this.f100611c = objArr;
        this.f100612d = i;
    }

    /* renamed from: e */
    public final int mo123376e(Object[] objArr, int i) {
        System.arraycopy(this.f100611c, 0, objArr, 0, this.f100612d);
        return this.f100612d;
    }

    public final E get(int i) {
        C39162f4.m161213a(i, this.f100612d, "index");
        E e = this.f100611c[i];
        e.getClass();
        return e;
    }

    /* renamed from: h */
    public final int mo123377h() {
        return this.f100612d;
    }

    /* renamed from: i */
    public final int mo123378i() {
        return 0;
    }

    /* renamed from: q */
    public final Object[] mo123381q() {
        return this.f100611c;
    }

    public final int size() {
        return this.f100612d;
    }
}
