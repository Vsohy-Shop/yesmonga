package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.k0 */
public abstract class C38664k0<T> implements Iterator<T> {

    /* renamed from: a */
    public int f97979a;

    /* renamed from: b */
    public int f97980b;

    /* renamed from: c */
    public int f97981c = -1;

    /* renamed from: d */
    public final /* synthetic */ zzbs f97982d;

    public /* synthetic */ C38664k0(zzbs zzbs, C38651j0 j0Var) {
        this.f97982d = zzbs;
        this.f97979a = zzbs.f98389e;
        this.f97980b = zzbs.mo122606e();
    }

    /* renamed from: b */
    public abstract T mo122322b(int i);

    /* renamed from: c */
    public final void mo122393c() {
        if (this.f97982d.f98389e != this.f97979a) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f97980b >= 0;
    }

    public final T next() {
        mo122393c();
        if (hasNext()) {
            int i = this.f97980b;
            this.f97981c = i;
            T b = mo122322b(i);
            this.f97980b = this.f97982d.mo122608f(this.f97980b);
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        mo122393c();
        if (this.f97981c >= 0) {
            z = true;
        } else {
            z = false;
        }
        C38728p.m160097d(z, "no calls to next() since the last call to remove()");
        this.f97979a += 32;
        zzbs zzbs = this.f97982d;
        zzbs.remove(zzbs.f98387c[this.f97981c]);
        this.f97980b--;
        this.f97981c = -1;
    }
}
