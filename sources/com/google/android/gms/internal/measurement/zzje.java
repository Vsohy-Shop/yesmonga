package com.google.android.gms.internal.measurement;

final class zzje extends zzja {

    /* renamed from: f */
    public static final zzja f106697f = new zzje(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f106698d;

    /* renamed from: e */
    public final transient int f106699e;

    public zzje(Object[] objArr, int i) {
        this.f106698d = objArr;
        this.f106699e = i;
    }

    /* renamed from: e */
    public final int mo137554e(Object[] objArr, int i) {
        System.arraycopy(this.f106698d, 0, objArr, 0, this.f106699e);
        return this.f106699e;
    }

    public final Object get(int i) {
        C42090n7.m170597a(i, this.f106699e, "index");
        Object obj = this.f106698d[i];
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    public final int mo137555h() {
        return this.f106699e;
    }

    /* renamed from: i */
    public final int mo137556i() {
        return 0;
    }

    /* renamed from: q */
    public final Object[] mo137559q() {
        return this.f106698d;
    }

    public final int size() {
        return this.f106699e;
    }
}
