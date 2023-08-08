package com.google.zxing.common;

import com.google.zxing.C34629a;
import com.google.zxing.C34752e;
import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.common.i */
public final class C34720i extends C34718g {

    /* renamed from: i */
    public static final int f84091i = 3;

    /* renamed from: j */
    public static final int f84092j = 8;

    /* renamed from: k */
    public static final int f84093k = 7;

    /* renamed from: l */
    public static final int f84094l = 40;

    /* renamed from: m */
    public static final int f84095m = 24;

    /* renamed from: h */
    public C34710b f84096h;

    public C34720i(C34752e eVar) {
        super(eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[][] m141655i(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 8
            int r3 = r21 + -8
            int r4 = r20 + -8
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            r9 = r8
        L_0x001c:
            if (r9 >= r1) goto L_0x00b1
            int r10 = r9 << 3
            if (r10 <= r3) goto L_0x0023
            r10 = r3
        L_0x0023:
            r11 = r8
        L_0x0024:
            if (r11 >= r0) goto L_0x00a8
            int r12 = r11 << 3
            if (r12 <= r4) goto L_0x002b
            r12 = r4
        L_0x002b:
            int r13 = r10 * r20
            int r13 = r13 + r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = r8
            r15 = r14
            r16 = r15
            r8 = r12
        L_0x0035:
            if (r14 >= r2) goto L_0x0073
            r7 = r16
            r5 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x004d
            int r16 = r13 + r5
            byte r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            if (r2 >= r8) goto L_0x0045
            r8 = r2
        L_0x0045:
            if (r2 <= r7) goto L_0x0048
            r7 = r2
        L_0x0048:
            int r5 = r5 + 1
            r2 = 8
            goto L_0x003a
        L_0x004d:
            int r2 = r7 - r8
            r5 = 24
            if (r2 <= r5) goto L_0x0069
        L_0x0053:
            int r14 = r14 + 1
            int r13 = r13 + r20
            r2 = 8
            if (r14 >= r2) goto L_0x0069
            r5 = 0
        L_0x005c:
            if (r5 >= r2) goto L_0x0053
            int r16 = r13 + r5
            byte r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            int r5 = r5 + 1
            r2 = 8
            goto L_0x005c
        L_0x0069:
            r2 = 1
            int r14 = r14 + r2
            int r13 = r13 + r20
            r16 = r7
            r7 = r2
            r2 = 8
            goto L_0x0035
        L_0x0073:
            r2 = r7
            int r5 = r15 >> 6
            int r7 = r16 - r8
            r12 = 24
            if (r7 > r12) goto L_0x009a
            int r5 = r8 / 2
            if (r9 <= 0) goto L_0x009a
            if (r11 <= 0) goto L_0x009a
            int r7 = r9 + -1
            r7 = r6[r7]
            r12 = r7[r11]
            r13 = r6[r9]
            int r14 = r11 + -1
            r13 = r13[r14]
            r15 = 2
            int r13 = r13 * r15
            int r12 = r12 + r13
            r7 = r7[r14]
            int r12 = r12 + r7
            int r7 = r12 / 4
            if (r8 >= r7) goto L_0x009b
            r5 = r7
            goto L_0x009b
        L_0x009a:
            r15 = 2
        L_0x009b:
            r7 = r6[r9]
            r7[r11] = r5
            int r11 = r11 + 1
            r7 = r2
            r5 = r15
            r2 = 8
            r8 = 0
            goto L_0x0024
        L_0x00a8:
            r15 = r5
            r2 = r7
            int r9 = r9 + 1
            r2 = 8
            r8 = 0
            goto L_0x001c
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.C34720i.m141655i(byte[], int, int, int, int):int[][]");
    }

    /* renamed from: j */
    public static void m141656j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C34710b bVar) {
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i4 - 8;
        int i10 = i3 - 8;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = i11 << 3;
            if (i12 > i9) {
                i5 = i9;
            } else {
                i5 = i12;
            }
            int k = m141657k(i11, i8 - 3);
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = i13 << 3;
                if (i14 > i10) {
                    i6 = i10;
                } else {
                    i6 = i14;
                }
                int k2 = m141657k(i13, i7 - 3);
                int i15 = 0;
                for (int i16 = -2; i16 <= 2; i16++) {
                    int[] iArr2 = iArr[k + i16];
                    i15 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[2 + k2];
                }
                m141658l(bArr, i6, i5, i15 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: k */
    public static int m141657k(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return i > i2 ? i2 : i;
    }

    /* renamed from: l */
    public static void m141658l(byte[] bArr, int i, int i2, int i3, int i4, C34710b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo102677v(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C34629a mo102410a(C34752e eVar) {
        return new C34720i(eVar);
    }

    /* renamed from: b */
    public C34710b mo102411b() throws NotFoundException {
        C34710b bVar = this.f84096h;
        if (bVar != null) {
            return bVar;
        }
        C34752e e = mo102414e();
        int e2 = e.mo102834e();
        int b = e.mo102833b();
        if (e2 < 40 || b < 40) {
            this.f84096h = super.mo102411b();
        } else {
            byte[] c = e.mo102742c();
            int i = e2 >> 3;
            if ((e2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = b >> 3;
            if ((b & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] i5 = m141655i(c, i2, i4, e2, b);
            C34710b bVar2 = new C34710b(e2, b);
            m141656j(c, i2, i4, e2, b, i5, bVar2);
            this.f84096h = bVar2;
        }
        return this.f84096h;
    }
}
