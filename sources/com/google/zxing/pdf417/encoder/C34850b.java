package com.google.zxing.pdf417.encoder;

/* renamed from: com.google.zxing.pdf417.encoder.b */
public final class C34850b {

    /* renamed from: a */
    public final byte[] f84656a;

    /* renamed from: b */
    public int f84657b = 0;

    public C34850b(int i) {
        this.f84656a = new byte[i];
    }

    /* renamed from: a */
    public void mo103137a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f84657b;
            this.f84657b = i3 + 1;
            mo103140d(i3, z);
        }
    }

    /* renamed from: b */
    public byte[] mo103138b(int i) {
        int length = this.f84656a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f84656a[i2 / i];
        }
        return bArr;
    }

    /* renamed from: c */
    public void mo103139c(int i, byte b) {
        this.f84656a[i] = b;
    }

    /* renamed from: d */
    public final void mo103140d(int i, boolean z) {
        this.f84656a[i] = z ? (byte) 1 : 0;
    }
}
