package com.google.zxing.oned;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.a */
public final class C34775a extends C34792q {

    /* renamed from: d */
    public static final float f84343d = 2.0f;

    /* renamed from: e */
    public static final float f84344e = 1.5f;

    /* renamed from: f */
    public static final String f84345f = "0123456789-$:/.+ABCD";

    /* renamed from: g */
    public static final char[] f84346g = f84345f.toCharArray();

    /* renamed from: h */
    public static final int[] f84347h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: i */
    public static final int f84348i = 3;

    /* renamed from: j */
    public static final char[] f84349j = {C15369g.f37994t, 'B', C15369g.f37986l, 'D'};

    /* renamed from: a */
    public final StringBuilder f84350a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f84351b = new int[80];

    /* renamed from: c */
    public int f84352c = 0;

    /* renamed from: h */
    public static boolean m141976h(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C34761k mo102904b(int r11, com.google.zxing.common.C34709a r12, java.util.Map<com.google.zxing.DecodeHintType, ?> r13) throws com.google.zxing.NotFoundException {
        /*
            r10 = this;
            int[] r0 = r10.f84351b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.mo102907k(r12)
            int r12 = r10.mo102906j()
            java.lang.StringBuilder r0 = r10.f84350a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.mo102908l(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f84350a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f84350a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f84349j
            char[] r6 = f84346g
            char r2 = r6[r2]
            boolean r2 = m141976h(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f84352c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f84351b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = r1
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f84351b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f84352c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x005d:
            r10.mo102909m(r12)
            r0 = r1
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f84350a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f84350a
            char[] r3 = f84346g
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f84350a
            char r0 = r0.charAt(r1)
            char[] r2 = f84349j
            boolean r0 = m141976h(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f84350a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = m141976h(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f84350a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f84350a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f84350a
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = r1
            r0 = r13
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f84351b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f84351b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            com.google.zxing.k r0 = new com.google.zxing.k
            java.lang.StringBuilder r2 = r10.f84350a
            java.lang.String r2 = r2.toString()
            com.google.zxing.l[] r3 = new com.google.zxing.C34762l[r6]
            com.google.zxing.l r4 = new com.google.zxing.l
            float r11 = (float) r11
            r4.<init>(r13, r11)
            r3[r1] = r4
            com.google.zxing.l r13 = new com.google.zxing.l
            r13.<init>(r12, r11)
            r3[r5] = r13
            com.google.zxing.BarcodeFormat r11 = com.google.zxing.BarcodeFormat.CODABAR
            r12 = 0
            r0.<init>(r2, r12, r3, r11)
            return r0
        L_0x00f2:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x00f7:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x00fc:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x0101:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C34775a.mo102904b(int, com.google.zxing.common.a, java.util.Map):com.google.zxing.k");
    }

    /* renamed from: i */
    public final void mo102905i(int i) {
        int[] iArr = this.f84351b;
        int i2 = this.f84352c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f84352c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f84351b = iArr2;
        }
    }

    /* renamed from: j */
    public final int mo102906j() throws NotFoundException {
        for (int i = 1; i < this.f84352c; i += 2) {
            int l = mo102908l(i);
            if (l != -1 && m141976h(f84349j, f84346g[l])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f84351b[i3];
                }
                if (i == 1 || this.f84351b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: k */
    public final void mo102907k(C34709a aVar) throws NotFoundException {
        int i = 0;
        this.f84352c = 0;
        int n = aVar.mo102648n(0);
        int o = aVar.mo102649o();
        if (n < o) {
            boolean z = true;
            while (n < o) {
                if (aVar.mo102645k(n) != z) {
                    i++;
                } else {
                    mo102905i(i);
                    z = !z;
                    i = 1;
                }
                n++;
            }
            mo102905i(i);
            return;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: l */
    public final int mo102908l(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.f84352c) {
            return -1;
        }
        int[] iArr = this.f84351b;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            if ((i17 & 1) == 0) {
                i2 = i10;
            } else {
                i2 = i14;
            }
            i15 >>= 1;
            if (iArr[i + i17] > i2) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = f84347h;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }

    /* renamed from: m */
    public final void mo102909m(int i) throws NotFoundException {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f84350a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f84347h[this.f84350a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f84351b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            float f = ((float) iArr[i8]) / ((float) iArr2[i8]);
            int i10 = iArr[i9];
            int i11 = iArr2[i9];
            float f2 = (f + (((float) i10) / ((float) i11))) / 2.0f;
            fArr2[i9] = f2;
            fArr[i8] = f2;
            fArr[i9] = ((((float) i10) * 2.0f) + 1.5f) / ((float) i11);
        }
        loop3:
        while (true) {
            int i12 = f84347h[this.f84350a.charAt(i2)];
            int i13 = 6;
            while (i13 >= 0) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                float f3 = (float) this.f84351b[i + i13];
                if (f3 >= fArr2[i14] && f3 <= fArr[i14]) {
                    i12 >>= 1;
                    i13--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.m141229a();
    }
}
