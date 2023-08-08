package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.util.C22635o;

/* renamed from: com.bumptech.glide.request.target.e */
public abstract class C22568e<T> implements C22584p<T> {

    /* renamed from: a */
    public final int f57906a;

    /* renamed from: b */
    public final int f57907b;
    @C0363p0

    /* renamed from: c */
    public C22557e f57908c;

    public C22568e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void mo65585a() {
    }

    /* renamed from: b */
    public void mo65586b() {
    }

    /* renamed from: c */
    public void mo65587c() {
    }

    /* renamed from: d */
    public final void mo65588d(@C0359n0 C22583o oVar) {
    }

    /* renamed from: g */
    public void mo65589g(@C0363p0 Drawable drawable) {
    }

    @C0363p0
    public final C22557e getRequest() {
        return this.f57908c;
    }

    /* renamed from: n */
    public final void mo65593n(@C0363p0 C22557e eVar) {
        this.f57908c = eVar;
    }

    /* renamed from: o */
    public void mo65594o(@C0363p0 Drawable drawable) {
    }

    /* renamed from: p */
    public final void mo65595p(@C0359n0 C22583o oVar) {
        oVar.mo66710e(this.f57906a, this.f57907b);
    }

    public C22568e(int i, int i2) {
        if (C22635o.m102648w(i, i2)) {
            this.f57906a = i;
            this.f57907b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
