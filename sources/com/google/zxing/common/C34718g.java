package com.google.zxing.common;

import com.google.zxing.C34629a;
import com.google.zxing.C34752e;
import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.common.g */
public class C34718g extends C34629a {

    /* renamed from: d */
    public static final int f84084d = 5;

    /* renamed from: e */
    public static final int f84085e = 3;

    /* renamed from: f */
    public static final int f84086f = 32;

    /* renamed from: g */
    public static final byte[] f84087g = new byte[0];

    /* renamed from: b */
    public byte[] f84088b = f84087g;

    /* renamed from: c */
    public final int[] f84089c = new int[32];

    public C34718g(C34752e eVar) {
        super(eVar);
    }

    /* renamed from: g */
    public static int m141645g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 > length / 16) {
            int i12 = i3 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: a */
    public C34629a mo102410a(C34752e eVar) {
        return new C34718g(eVar);
    }

    /* renamed from: b */
    public C34710b mo102411b() throws NotFoundException {
        C34752e e = mo102414e();
        int e2 = e.mo102834e();
        int b = e.mo102833b();
        C34710b bVar = new C34710b(e2, b);
        mo102709h(e2);
        int[] iArr = this.f84089c;
        for (int i = 1; i < 5; i++) {
            byte[] d = e.mo102743d((b * i) / 5, this.f84088b);
            int i2 = (e2 << 2) / 5;
            for (int i3 = e2 / 5; i3 < i2; i3++) {
                int i4 = (d[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m141645g(iArr);
        byte[] c = e.mo102742c();
        for (int i5 = 0; i5 < b; i5++) {
            int i6 = i5 * e2;
            for (int i7 = 0; i7 < e2; i7++) {
                if ((c[i6 + i7] & 255) < g) {
                    bVar.mo102677v(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public C34709a mo102412c(int i, C34709a aVar) throws NotFoundException {
        C34752e e = mo102414e();
        int e2 = e.mo102834e();
        if (aVar == null || aVar.mo102649o() < e2) {
            aVar = new C34709a(e2);
        } else {
            aVar.mo102640f();
        }
        mo102709h(e2);
        byte[] d = e.mo102743d(i, this.f84088b);
        int[] iArr = this.f84089c;
        for (int i2 = 0; i2 < e2; i2++) {
            int i3 = (d[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m141645g(iArr);
        if (e2 < 3) {
            for (int i4 = 0; i4 < e2; i4++) {
                if ((d[i4] & 255) < g) {
                    aVar.mo102654x(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = d[1] & 255;
            byte b2 = d[0] & 255;
            byte b3 = b;
            while (i5 < e2 - 1) {
                int i6 = i5 + 1;
                byte b4 = d[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < g) {
                    aVar.mo102654x(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }

    /* renamed from: h */
    public final void mo102709h(int i) {
        if (this.f84088b.length < i) {
            this.f84088b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f84089c[i2] = 0;
        }
    }
}
