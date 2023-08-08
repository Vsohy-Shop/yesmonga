package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.v */
public abstract class C30237v<T> implements Iterator<T> {

    /* renamed from: a */
    public int f72262a;

    /* renamed from: b */
    public int f72263b;

    /* renamed from: c */
    public int f72264c = -1;

    /* renamed from: d */
    public final /* synthetic */ zzbc f72265d;

    public /* synthetic */ C30237v(zzbc zzbc, C30225u uVar) {
        this.f72265d = zzbc;
        this.f72262a = zzbc.f72398e;
        this.f72263b = zzbc.mo85424e();
    }

    /* renamed from: b */
    public abstract T mo85301b(int i);

    /* renamed from: c */
    public final void mo85352c() {
        if (this.f72265d.f72398e != this.f72262a) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f72263b >= 0;
    }

    public final T next() {
        mo85352c();
        if (hasNext()) {
            int i = this.f72263b;
            this.f72264c = i;
            T b = mo85301b(i);
            this.f72263b = this.f72265d.mo85426f(this.f72263b);
            return b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        mo85352c();
        if (this.f72264c >= 0) {
            z = true;
        } else {
            z = false;
        }
        C29997b.m121590d(z, "no calls to next() since the last call to remove()");
        this.f72262a += 32;
        zzbc zzbc = this.f72265d;
        zzbc.remove(zzbc.f72396c[this.f72264c]);
        this.f72263b--;
        this.f72264c = -1;
    }
}
