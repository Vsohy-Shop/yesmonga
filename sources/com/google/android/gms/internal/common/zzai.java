package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
final class zzai extends zzag {

    /* renamed from: e */
    public static final zzag f104413e = new zzai(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f104414c;

    /* renamed from: d */
    public final transient int f104415d;

    public zzai(Object[] objArr, int i) {
        this.f104414c = objArr;
        this.f104415d = i;
    }

    /* renamed from: e */
    public final int mo134943e(Object[] objArr, int i) {
        System.arraycopy(this.f104414c, 0, objArr, 0, this.f104415d);
        return this.f104415d;
    }

    public final Object get(int i) {
        C41124z.m166998a(i, this.f104415d, "index");
        Object obj = this.f104414c[i];
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    public final int mo134944h() {
        return this.f104415d;
    }

    /* renamed from: i */
    public final int mo134945i() {
        return 0;
    }

    /* renamed from: r */
    public final boolean mo134949r() {
        return false;
    }

    public final int size() {
        return this.f104415d;
    }

    /* renamed from: w */
    public final Object[] mo134955w() {
        return this.f104414c;
    }
}
