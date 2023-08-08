package com.bumptech.glide.request.target;

import androidx.annotation.C0359n0;
import com.bumptech.glide.util.C22635o;

@Deprecated
/* renamed from: com.bumptech.glide.request.target.n */
public abstract class C22582n<Z> extends C22565b<Z> {

    /* renamed from: b */
    public final int f57943b;

    /* renamed from: c */
    public final int f57944c;

    public C22582n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: d */
    public void mo65588d(@C0359n0 C22583o oVar) {
    }

    /* renamed from: p */
    public final void mo65595p(@C0359n0 C22583o oVar) {
        if (C22635o.m102648w(this.f57943b, this.f57944c)) {
            oVar.mo66710e(this.f57943b, this.f57944c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f57943b + " and height: " + this.f57944c + ", either provide dimensions in the constructor or call override()");
    }

    public C22582n(int i, int i2) {
        this.f57943b = i;
        this.f57944c = i2;
    }
}
