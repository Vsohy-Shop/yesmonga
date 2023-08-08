package com.google.android.gms.internal.location;

final class zzbt<E> extends zzbs<E> {

    /* renamed from: e */
    public static final zzbs<Object> f105968e = new zzbt(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f105969c;

    /* renamed from: d */
    public final transient int f105970d;

    public zzbt(Object[] objArr, int i) {
        this.f105969c = objArr;
        this.f105970d = i;
    }

    public final E get(int i) {
        C41780k0.m169054a(i, this.f105970d, "index");
        return this.f105969c[i];
    }

    /* renamed from: h */
    public final Object[] mo136287h() {
        return this.f105969c;
    }

    /* renamed from: i */
    public final int mo136288i() {
        return 0;
    }

    /* renamed from: k */
    public final int mo136290k() {
        return this.f105970d;
    }

    /* renamed from: r */
    public final boolean mo136292r() {
        return false;
    }

    public final int size() {
        return this.f105970d;
    }

    /* renamed from: w */
    public final int mo136298w(Object[] objArr, int i) {
        System.arraycopy(this.f105969c, 0, objArr, 0, this.f105970d);
        return this.f105970d;
    }
}
