package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.C0359n0;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.odml.image.d */
public class C31846d {

    /* renamed from: a */
    public final ByteBuffer f77672a;

    /* renamed from: b */
    public final int f77673b;

    /* renamed from: c */
    public final int f77674c;

    /* renamed from: d */
    public final int f77675d;

    /* renamed from: e */
    public int f77676e = 0;

    /* renamed from: f */
    public Rect f77677f;

    public C31846d(@C0359n0 ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.f77672a = byteBuffer;
        this.f77673b = i;
        this.f77674c = i2;
        this.f77675d = i3;
        this.f77677f = new Rect(0, 0, i, i2);
    }

    @C0359n0
    /* renamed from: a */
    public C31850h mo92354a() {
        return new C31850h(new C31860o(this.f77672a, this.f77675d), this.f77676e, this.f77677f, 0, this.f77673b, this.f77674c);
    }

    @C0359n0
    /* renamed from: b */
    public C31846d mo92355b(int i) {
        C31850h.m129227g(i);
        this.f77676e = i;
        return this;
    }
}
