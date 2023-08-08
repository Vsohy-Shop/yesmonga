package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.material.color.C31234i;
import java.io.IOException;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zx */
public final class C29981zx {
    /* renamed from: a */
    public static int m121546a(byte[] bArr, int i, C29944yx yxVar) throws zbye {
        int j = m121555j(bArr, i, yxVar);
        int i2 = yxVar.f71561a;
        if (i2 < 0) {
            throw zbye.m121512d();
        } else if (i2 > bArr.length - j) {
            throw zbye.m121514g();
        } else if (i2 == 0) {
            yxVar.f71563c = zbwp.f71626a;
            return j;
        } else {
            yxVar.f71563c = zbwp.m121496M(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m121547b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
    }

    /* renamed from: c */
    public static int m121548c(j10 j10, byte[] bArr, int i, int i2, int i3, C29944yx yxVar) throws IOException {
        a10 a10 = (a10) j10;
        Object x = a10.mo84503x();
        int E = a10.mo84472E(x, bArr, i, i2, i3, yxVar);
        a10.mo84487e(x);
        yxVar.f71563c = x;
        return E;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m121549d(com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29944yx r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m121556k(r8, r7, r0, r10)
            int r8 = r10.f71561a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo84503x()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo84489g(r1, r2, r3, r4, r5)
            r6.mo84487e(r9)
            r10.f71563c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye.m121514g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29981zx.m121549d(com.google.android.gms.internal.mlkit_vision_text_bundled_common.j10, byte[], int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.yx):int");
    }

    /* renamed from: e */
    public static int m121550e(j10<?> j10, int i, byte[] bArr, int i2, int i3, C29872wz<?> wzVar, C29944yx yxVar) throws IOException {
        int d = m121549d(j10, bArr, i2, i3, yxVar);
        wzVar.add(yxVar.f71563c);
        while (d < i3) {
            int j = m121555j(bArr, d, yxVar);
            if (i != yxVar.f71561a) {
                break;
            }
            d = m121549d(j10, bArr, j, i3, yxVar);
            wzVar.add(yxVar.f71563c);
        }
        return d;
    }

    /* renamed from: f */
    public static int m121551f(byte[] bArr, int i, C29872wz<?> wzVar, C29944yx yxVar) throws IOException {
        C29539nz nzVar = (C29539nz) wzVar;
        int j = m121555j(bArr, i, yxVar);
        int i2 = yxVar.f71561a + j;
        while (j < i2) {
            j = m121555j(bArr, j, yxVar);
            nzVar.mo84749k(yxVar.f71561a);
        }
        if (j == i2) {
            return j;
        }
        throw zbye.m121514g();
    }

    /* renamed from: g */
    public static int m121552g(byte[] bArr, int i, C29944yx yxVar) throws zbye {
        int j = m121555j(bArr, i, yxVar);
        int i2 = yxVar.f71561a;
        if (i2 < 0) {
            throw zbye.m121512d();
        } else if (i2 == 0) {
            yxVar.f71563c = "";
            return j;
        } else {
            yxVar.f71563c = new String(bArr, j, i2, C29909xz.f71541a);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m121553h(byte[] bArr, int i, C29944yx yxVar) throws zbye {
        int j = m121555j(bArr, i, yxVar);
        int i2 = yxVar.f71561a;
        if (i2 < 0) {
            throw zbye.m121512d();
        } else if (i2 == 0) {
            yxVar.f71563c = "";
            return j;
        } else {
            yxVar.f71563c = C29873x.m121298d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    public static int m121554i(int i, byte[] bArr, int i2, int i3, C29392k kVar, C29944yx yxVar) throws zbye {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m121558m(bArr, i2, yxVar);
                kVar.mo84698h(i, Long.valueOf(yxVar.f71562b));
                return m;
            } else if (i4 == 1) {
                kVar.mo84698h(i, Long.valueOf(m121560o(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m121555j(bArr, i2, yxVar);
                int i5 = yxVar.f71561a;
                if (i5 < 0) {
                    throw zbye.m121512d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        kVar.mo84698h(i, zbwp.f71626a);
                    } else {
                        kVar.mo84698h(i, zbwp.m121496M(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zbye.m121514g();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C29392k e = C29392k.m120588e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m121555j(bArr, i2, yxVar);
                    int i8 = yxVar.f71561a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m121554i(i8, bArr, j2, i3, e, yxVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zbye.m121513e();
                }
                kVar.mo84698h(i, e);
                return i2;
            } else if (i4 == 5) {
                kVar.mo84698h(i, Integer.valueOf(m121547b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zbye.m121510b();
            }
        } else {
            throw zbye.m121510b();
        }
    }

    /* renamed from: j */
    public static int m121555j(byte[] bArr, int i, C29944yx yxVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m121556k(b, bArr, i2, yxVar);
        }
        yxVar.f71561a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m121556k(int i, byte[] bArr, int i2, C29944yx yxVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            yxVar.f71561a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            yxVar.f71561a = i5 | (b2 << DateTimeFieldType.f30624Y);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << DateTimeFieldType.f30624Y);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            yxVar.f71561a = i7 | (b3 << DateTimeFieldType.f30608J0);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << DateTimeFieldType.f30608J0);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            yxVar.f71561a = i9 | (b4 << C31234i.C31240f.f75184f);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << C31234i.C31240f.f75184f);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                yxVar.f71561a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m121557l(int i, byte[] bArr, int i2, int i3, C29872wz<?> wzVar, C29944yx yxVar) {
        C29539nz nzVar = (C29539nz) wzVar;
        int j = m121555j(bArr, i2, yxVar);
        nzVar.mo84749k(yxVar.f71561a);
        while (j < i3) {
            int j2 = m121555j(bArr, j, yxVar);
            if (i != yxVar.f71561a) {
                break;
            }
            j = m121555j(bArr, j2, yxVar);
            nzVar.mo84749k(yxVar.f71561a);
        }
        return j;
    }

    /* renamed from: m */
    public static int m121558m(byte[] bArr, int i, C29944yx yxVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            yxVar.f71562b = j2;
            return i3;
        }
        yxVar.f71562b = j;
        return i2;
    }

    /* renamed from: n */
    public static int m121559n(int i, byte[] bArr, int i2, int i3, C29944yx yxVar) throws zbye {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m121558m(bArr, i2, yxVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m121555j(bArr, i2, yxVar) + yxVar.f71561a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m121555j(bArr, i2, yxVar);
                    i6 = yxVar.f71561a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m121559n(i6, bArr, i2, i3, yxVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zbye.m121513e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zbye.m121510b();
            }
        } else {
            throw zbye.m121510b();
        }
    }

    /* renamed from: o */
    public static long m121560o(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
