package com.google.zxing.qrcode.encoder;

import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.zxing.qrcode.encoder.b */
public final class C34883b {

    /* renamed from: a */
    public final byte[][] f84780a;

    /* renamed from: b */
    public final int f84781b;

    /* renamed from: c */
    public final int f84782c;

    public C34883b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f84780a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f84781b = i;
        this.f84782c = i2;
    }

    /* renamed from: a */
    public void mo103234a(byte b) {
        for (byte[] fill : this.f84780a) {
            Arrays.fill(fill, b);
        }
    }

    /* renamed from: b */
    public byte mo103235b(int i, int i2) {
        return this.f84780a[i2][i];
    }

    /* renamed from: c */
    public byte[][] mo103236c() {
        return this.f84780a;
    }

    /* renamed from: d */
    public int mo103237d() {
        return this.f84782c;
    }

    /* renamed from: e */
    public int mo103238e() {
        return this.f84781b;
    }

    /* renamed from: f */
    public void mo103239f(int i, int i2, byte b) {
        this.f84780a[i2][i] = b;
    }

    /* renamed from: g */
    public void mo103240g(int i, int i2, int i3) {
        this.f84780a[i2][i] = (byte) i3;
    }

    /* renamed from: h */
    public void mo103241h(int i, int i2, boolean z) {
        this.f84780a[i2][i] = z ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f84781b * 2 * this.f84782c) + 2);
        for (int i = 0; i < this.f84782c; i++) {
            byte[] bArr = this.f84780a[i];
            for (int i2 = 0; i2 < this.f84781b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append(GlideException.C22148a.f56917d);
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
