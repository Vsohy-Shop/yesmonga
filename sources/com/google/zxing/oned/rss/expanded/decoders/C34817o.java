package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.o */
public final class C34817o extends C34818p {

    /* renamed from: d */
    public static final int f84493d = 10;

    /* renamed from: b */
    public final int f84494b;

    /* renamed from: c */
    public final int f84495c;

    public C34817o(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.m141227a();
        }
        this.f84494b = i2;
        this.f84495c = i3;
    }

    /* renamed from: b */
    public int mo102994b() {
        return this.f84494b;
    }

    /* renamed from: c */
    public int mo102995c() {
        return this.f84495c;
    }

    /* renamed from: d */
    public int mo102996d() {
        return (this.f84494b * 10) + this.f84495c;
    }

    /* renamed from: e */
    public boolean mo102997e() {
        return this.f84494b == 10;
    }

    /* renamed from: f */
    public boolean mo102998f() {
        return this.f84495c == 10;
    }
}
