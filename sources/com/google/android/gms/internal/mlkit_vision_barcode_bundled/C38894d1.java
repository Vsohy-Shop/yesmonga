package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.material.color.C31234i;
import java.io.IOException;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d1 */
public final class C38894d1 {
    /* renamed from: a */
    public static int m160429a(byte[] bArr, int i, C38884c1 c1Var) throws zzep {
        int j = m160438j(bArr, i, c1Var);
        int i2 = c1Var.f98809a;
        if (i2 < 0) {
            throw zzep.m161103d();
        } else if (i2 > bArr.length - j) {
            throw zzep.m161105g();
        } else if (i2 == 0) {
            c1Var.f98811c = zzdc.f99077a;
            return j;
        } else {
            c1Var.f98811c = zzdc.m161077f0(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m160430b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
    }

    /* renamed from: c */
    public static int m160431c(C39014p4 p4Var, byte[] bArr, int i, int i2, int i3, C38884c1 c1Var) throws IOException {
        C39103z3 z3Var = (C39103z3) p4Var;
        Object f = z3Var.mo122792f();
        int D = z3Var.mo123139D(f, bArr, i, i2, i3, c1Var);
        z3Var.mo122789c(f);
        c1Var.f98811c = f;
        return D;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m160432d(com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39014p4 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38884c1 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m160439k(r8, r7, r0, r10)
            int r8 = r10.f98809a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo122792f()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo122791e(r1, r2, r3, r4, r5)
            r6.mo122789c(r9)
            r10.f98811c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzep r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzep.m161105g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38894d1.m160432d(com.google.android.gms.internal.mlkit_vision_barcode_bundled.p4, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.c1):int");
    }

    /* renamed from: e */
    public static int m160433e(C39014p4<?> p4Var, int i, byte[] bArr, int i2, int i3, C39075w2<?> w2Var, C38884c1 c1Var) throws IOException {
        int d = m160432d(p4Var, bArr, i2, i3, c1Var);
        w2Var.add(c1Var.f98811c);
        while (d < i3) {
            int j = m160438j(bArr, d, c1Var);
            if (i != c1Var.f98809a) {
                break;
            }
            d = m160432d(p4Var, bArr, j, i3, c1Var);
            w2Var.add(c1Var.f98811c);
        }
        return d;
    }

    /* renamed from: f */
    public static int m160434f(byte[] bArr, int i, C39075w2<?> w2Var, C38884c1 c1Var) throws IOException {
        C39012p2 p2Var = (C39012p2) w2Var;
        int j = m160438j(bArr, i, c1Var);
        int i2 = c1Var.f98809a + j;
        while (j < i2) {
            j = m160438j(bArr, j, c1Var);
            p2Var.mo123002k(c1Var.f98809a);
        }
        if (j == i2) {
            return j;
        }
        throw zzep.m161105g();
    }

    /* renamed from: g */
    public static int m160435g(byte[] bArr, int i, C38884c1 c1Var) throws zzep {
        int j = m160438j(bArr, i, c1Var);
        int i2 = c1Var.f98809a;
        if (i2 < 0) {
            throw zzep.m161103d();
        } else if (i2 == 0) {
            c1Var.f98811c = "";
            return j;
        } else {
            c1Var.f98811c = new String(bArr, j, i2, C39084x2.f98960a);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m160436h(byte[] bArr, int i, C38884c1 c1Var) throws zzep {
        int j = m160438j(bArr, i, c1Var);
        int i2 = c1Var.f98809a;
        if (i2 < 0) {
            throw zzep.m161103d();
        } else if (i2 == 0) {
            c1Var.f98811c = "";
            return j;
        } else {
            c1Var.f98811c = C39060u5.m160889g(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    public static int m160437i(int i, byte[] bArr, int i2, int i3, C38938h5 h5Var, C38884c1 c1Var) throws zzep {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m160441m(bArr, i2, c1Var);
                h5Var.mo122925h(i, Long.valueOf(c1Var.f98810b));
                return m;
            } else if (i4 == 1) {
                h5Var.mo122925h(i, Long.valueOf(m160443o(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m160438j(bArr, i2, c1Var);
                int i5 = c1Var.f98809a;
                if (i5 < 0) {
                    throw zzep.m161103d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        h5Var.mo122925h(i, zzdc.f99077a);
                    } else {
                        h5Var.mo122925h(i, zzdc.m161077f0(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzep.m161105g();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C38938h5 e = C38938h5.m160538e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m160438j(bArr, i2, c1Var);
                    int i8 = c1Var.f98809a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m160437i(i8, bArr, j2, i3, e, c1Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzep.m161104e();
                }
                h5Var.mo122925h(i, e);
                return i2;
            } else if (i4 == 5) {
                h5Var.mo122925h(i, Integer.valueOf(m160430b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzep.m161101b();
            }
        } else {
            throw zzep.m161101b();
        }
    }

    /* renamed from: j */
    public static int m160438j(byte[] bArr, int i, C38884c1 c1Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m160439k(b, bArr, i2, c1Var);
        }
        c1Var.f98809a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m160439k(int i, byte[] bArr, int i2, C38884c1 c1Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c1Var.f98809a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c1Var.f98809a = i5 | (b2 << DateTimeFieldType.f30624Y);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << DateTimeFieldType.f30624Y);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1Var.f98809a = i7 | (b3 << DateTimeFieldType.f30608J0);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << DateTimeFieldType.f30608J0);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1Var.f98809a = i9 | (b4 << C31234i.C31240f.f75184f);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << C31234i.C31240f.f75184f);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c1Var.f98809a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m160440l(int i, byte[] bArr, int i2, int i3, C39075w2<?> w2Var, C38884c1 c1Var) {
        C39012p2 p2Var = (C39012p2) w2Var;
        int j = m160438j(bArr, i2, c1Var);
        p2Var.mo123002k(c1Var.f98809a);
        while (j < i3) {
            int j2 = m160438j(bArr, j, c1Var);
            if (i != c1Var.f98809a) {
                break;
            }
            j = m160438j(bArr, j2, c1Var);
            p2Var.mo123002k(c1Var.f98809a);
        }
        return j;
    }

    /* renamed from: m */
    public static int m160441m(byte[] bArr, int i, C38884c1 c1Var) {
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
            c1Var.f98810b = j2;
            return i3;
        }
        c1Var.f98810b = j;
        return i2;
    }

    /* renamed from: n */
    public static int m160442n(int i, byte[] bArr, int i2, int i3, C38884c1 c1Var) throws zzep {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m160441m(bArr, i2, c1Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m160438j(bArr, i2, c1Var) + c1Var.f98809a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m160438j(bArr, i2, c1Var);
                    i6 = c1Var.f98809a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m160442n(i6, bArr, i2, i3, c1Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzep.m161104e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzep.m161101b();
            }
        } else {
            throw zzep.m161101b();
        }
    }

    /* renamed from: o */
    public static long m160443o(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
