package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.pdf417.encoder.a */
public final class C34849a {

    /* renamed from: a */
    public final C34850b[] f84652a;

    /* renamed from: b */
    public int f84653b;

    /* renamed from: c */
    public final int f84654c;

    /* renamed from: d */
    public final int f84655d;

    public C34849a(int i, int i2) {
        C34850b[] bVarArr = new C34850b[i];
        this.f84652a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f84652a[i3] = new C34850b(((i2 + 4) * 17) + 1);
        }
        this.f84655d = i2 * 17;
        this.f84654c = i;
        this.f84653b = -1;
    }

    /* renamed from: a */
    public C34850b mo103132a() {
        return this.f84652a[this.f84653b];
    }

    /* renamed from: b */
    public byte[][] mo103133b() {
        return mo103134c(1, 1);
    }

    /* renamed from: c */
    public byte[][] mo103134c(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f84655d * i;
        iArr[0] = this.f84654c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i3 = this.f84654c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f84652a[i4 / i2].mo103138b(i);
        }
        return bArr;
    }

    /* renamed from: d */
    public void mo103135d(int i, int i2, byte b) {
        this.f84652a[i2].mo103139c(i, b);
    }

    /* renamed from: e */
    public void mo103136e() {
        this.f84653b++;
    }
}
