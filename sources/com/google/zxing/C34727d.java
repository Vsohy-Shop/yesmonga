package com.google.zxing;

/* renamed from: com.google.zxing.d */
public final class C34727d extends C34752e {

    /* renamed from: c */
    public final C34752e f84133c;

    public C34727d(C34752e eVar) {
        super(eVar.mo102834e(), eVar.mo102833b());
        this.f84133c = eVar;
    }

    /* renamed from: a */
    public C34752e mo102741a(int i, int i2, int i3, int i4) {
        return new C34727d(this.f84133c.mo102741a(i, i2, i3, i4));
    }

    /* renamed from: c */
    public byte[] mo102742c() {
        byte[] c = this.f84133c.mo102742c();
        int e = mo102834e() * mo102833b();
        byte[] bArr = new byte[e];
        for (int i = 0; i < e; i++) {
            bArr[i] = (byte) (255 - (c[i] & 255));
        }
        return bArr;
    }

    /* renamed from: d */
    public byte[] mo102743d(int i, byte[] bArr) {
        byte[] d = this.f84133c.mo102743d(i, bArr);
        int e = mo102834e();
        for (int i2 = 0; i2 < e; i2++) {
            d[i2] = (byte) (255 - (d[i2] & 255));
        }
        return d;
    }

    /* renamed from: f */
    public C34752e mo102744f() {
        return this.f84133c;
    }

    /* renamed from: g */
    public boolean mo102745g() {
        return this.f84133c.mo102745g();
    }

    /* renamed from: h */
    public boolean mo102746h() {
        return this.f84133c.mo102746h();
    }

    /* renamed from: i */
    public C34752e mo102747i() {
        return new C34727d(this.f84133c.mo102747i());
    }

    /* renamed from: j */
    public C34752e mo102748j() {
        return new C34727d(this.f84133c.mo102748j());
    }
}
