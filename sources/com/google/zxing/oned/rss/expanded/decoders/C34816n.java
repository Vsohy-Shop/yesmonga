package com.google.zxing.oned.rss.expanded.decoders;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.n */
public final class C34816n extends C34818p {

    /* renamed from: b */
    public final String f84490b;

    /* renamed from: c */
    public final int f84491c;

    /* renamed from: d */
    public final boolean f84492d;

    public C34816n(int i, String str) {
        super(i);
        this.f84490b = str;
        this.f84492d = false;
        this.f84491c = 0;
    }

    /* renamed from: b */
    public String mo102991b() {
        return this.f84490b;
    }

    /* renamed from: c */
    public int mo102992c() {
        return this.f84491c;
    }

    /* renamed from: d */
    public boolean mo102993d() {
        return this.f84492d;
    }

    public C34816n(int i, String str, int i2) {
        super(i);
        this.f84492d = true;
        this.f84491c = i2;
        this.f84490b = str;
    }
}
