package com.google.android.gms.internal.mlkit_vision_barcode;

final class zzco<E> extends zzcc<E> {

    /* renamed from: e */
    public static final zzcc<Object> f98398e = new zzco(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f98399c;

    /* renamed from: d */
    public final transient int f98400d;

    public zzco(Object[] objArr, int i) {
        this.f98399c = objArr;
        this.f98400d = i;
    }

    /* renamed from: e */
    public final int mo122629e(Object[] objArr, int i) {
        System.arraycopy(this.f98399c, 0, objArr, i, this.f98400d);
        return i + this.f98400d;
    }

    public final E get(int i) {
        C38728p.m160094a(i, this.f98400d, "index");
        E e = this.f98399c[i];
        e.getClass();
        return e;
    }

    /* renamed from: h */
    public final int mo122630h() {
        return this.f98400d;
    }

    /* renamed from: i */
    public final int mo122631i() {
        return 0;
    }

    /* renamed from: q */
    public final Object[] mo122634q() {
        return this.f98399c;
    }

    public final int size() {
        return this.f98400d;
    }
}
