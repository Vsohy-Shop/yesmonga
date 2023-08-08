package com.google.android.gms.internal.mlkit_vision_text_common;

final class zzcd<E> extends zzbm<E> {

    /* renamed from: e */
    public static final zzbm<Object> f72407e = new zzcd(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f72408c;

    /* renamed from: d */
    public final transient int f72409d;

    public zzcd(Object[] objArr, int i) {
        this.f72408c = objArr;
        this.f72409d = i;
    }

    /* renamed from: e */
    public final int mo85447e(Object[] objArr, int i) {
        System.arraycopy(this.f72408c, 0, objArr, 0, this.f72409d);
        return this.f72409d;
    }

    public final E get(int i) {
        C29997b.m121587a(i, this.f72409d, "index");
        E e = this.f72408c[i];
        e.getClass();
        return e;
    }

    /* renamed from: h */
    public final int mo85448h() {
        return this.f72409d;
    }

    /* renamed from: i */
    public final int mo85449i() {
        return 0;
    }

    /* renamed from: q */
    public final Object[] mo85452q() {
        return this.f72408c;
    }

    public final int size() {
        return this.f72409d;
    }
}
