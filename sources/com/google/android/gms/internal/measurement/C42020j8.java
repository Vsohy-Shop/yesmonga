package com.google.android.gms.internal.measurement;

import com.google.android.material.color.C31234i;
import java.io.IOException;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.measurement.j8 */
public final class C42020j8 {
    /* renamed from: a */
    public static int m170344a(byte[] bArr, int i, C42002i8 i8Var) throws zzll {
        int j = m170353j(bArr, i, i8Var);
        int i2 = i8Var.f106210a;
        if (i2 < 0) {
            throw zzll.m171375d();
        } else if (i2 > bArr.length - j) {
            throw zzll.m171377f();
        } else if (i2 == 0) {
            i8Var.f106212c = zzka.f106708a;
            return j;
        } else {
            i8Var.f106212c = zzka.m171361M(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m170345b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
    }

    /* renamed from: c */
    public static int m170346c(C41987hb hbVar, byte[] bArr, int i, int i2, int i3, C42002i8 i8Var) throws IOException {
        Object f = hbVar.mo136568f();
        int n = m170357n(f, hbVar, bArr, i, i2, i3, i8Var);
        hbVar.mo136565c(f);
        i8Var.f106212c = f;
        return n;
    }

    /* renamed from: d */
    public static int m170347d(C41987hb hbVar, byte[] bArr, int i, int i2, C42002i8 i8Var) throws IOException {
        Object f = hbVar.mo136568f();
        int o = m170358o(f, hbVar, bArr, i, i2, i8Var);
        hbVar.mo136565c(f);
        i8Var.f106212c = f;
        return o;
    }

    /* renamed from: e */
    public static int m170348e(C41987hb hbVar, int i, byte[] bArr, int i2, int i3, C42296z9 z9Var, C42002i8 i8Var) throws IOException {
        int d = m170347d(hbVar, bArr, i2, i3, i8Var);
        z9Var.add(i8Var.f106212c);
        while (d < i3) {
            int j = m170353j(bArr, d, i8Var);
            if (i != i8Var.f106210a) {
                break;
            }
            d = m170347d(hbVar, bArr, j, i3, i8Var);
            z9Var.add(i8Var.f106212c);
        }
        return d;
    }

    /* renamed from: f */
    public static int m170349f(byte[] bArr, int i, C42296z9 z9Var, C42002i8 i8Var) throws IOException {
        C42194t9 t9Var = (C42194t9) z9Var;
        int j = m170353j(bArr, i, i8Var);
        int i2 = i8Var.f106210a + j;
        while (j < i2) {
            j = m170353j(bArr, j, i8Var);
            t9Var.mo137313U(i8Var.f106210a);
        }
        if (j == i2) {
            return j;
        }
        throw zzll.m171377f();
    }

    /* renamed from: g */
    public static int m170350g(byte[] bArr, int i, C42002i8 i8Var) throws zzll {
        int j = m170353j(bArr, i, i8Var);
        int i2 = i8Var.f106210a;
        if (i2 < 0) {
            throw zzll.m171375d();
        } else if (i2 == 0) {
            i8Var.f106212c = "";
            return j;
        } else {
            i8Var.f106212c = new String(bArr, j, i2, C41860aa.f105996b);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m170351h(byte[] bArr, int i, C42002i8 i8Var) throws zzll {
        int i2;
        int i3;
        int j = m170353j(bArr, i, i8Var);
        int i4 = i8Var.f106210a;
        if (i4 < 0) {
            throw zzll.m171375d();
        } else if (i4 == 0) {
            i8Var.f106212c = "";
            return j;
        } else {
            int i5 = C42078mc.f106298b;
            int length = bArr.length;
            if ((((length - j) - i4) | j | i4) >= 0) {
                int i6 = j + i4;
                char[] cArr = new char[i4];
                int i7 = 0;
                while (i2 < i6) {
                    byte b = bArr[i2];
                    if (!C42024jc.m170417d(b)) {
                        break;
                    }
                    j = i2 + 1;
                    cArr[i3] = (char) b;
                    i7 = i3 + 1;
                }
                while (i2 < i6) {
                    int i8 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (C42024jc.m170417d(b2)) {
                        int i9 = i3 + 1;
                        cArr[i3] = (char) b2;
                        i2 = i8;
                        while (true) {
                            i3 = i9;
                            if (i2 >= i6) {
                                break;
                            }
                            byte b3 = bArr[i2];
                            if (!C42024jc.m170417d(b3)) {
                                break;
                            }
                            i2++;
                            i9 = i3 + 1;
                            cArr[i3] = (char) b3;
                        }
                    } else if (b2 < -32) {
                        if (i8 < i6) {
                            C42024jc.m170416c(b2, bArr[i8], cArr, i3);
                            i2 = i8 + 1;
                            i3++;
                        } else {
                            throw zzll.m171374c();
                        }
                    } else if (b2 < -16) {
                        if (i8 < i6 - 1) {
                            int i10 = i8 + 1;
                            C42024jc.m170415b(b2, bArr[i8], bArr[i10], cArr, i3);
                            i2 = i10 + 1;
                            i3++;
                        } else {
                            throw zzll.m171374c();
                        }
                    } else if (i8 < i6 - 2) {
                        int i11 = i8 + 1;
                        byte b4 = bArr[i8];
                        int i12 = i11 + 1;
                        C42024jc.m170414a(b2, b4, bArr[i11], bArr[i12], cArr, i3);
                        i3 += 2;
                        i2 = i12 + 1;
                    } else {
                        throw zzll.m171374c();
                    }
                }
                i8Var.f106212c = new String(cArr, 0, i3);
                return i6;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(j), Integer.valueOf(i4)}));
        }
    }

    /* renamed from: i */
    public static int m170352i(int i, byte[] bArr, int i2, int i3, C42298zb zbVar, C42002i8 i8Var) throws zzll {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m170356m(bArr, i2, i8Var);
                zbVar.mo137531j(i, Long.valueOf(i8Var.f106211b));
                return m;
            } else if (i4 == 1) {
                zbVar.mo137531j(i, Long.valueOf(m170359p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m170353j(bArr, i2, i8Var);
                int i5 = i8Var.f106210a;
                if (i5 < 0) {
                    throw zzll.m171375d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        zbVar.mo137531j(i, zzka.f106708a);
                    } else {
                        zbVar.mo137531j(i, zzka.m171361M(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzll.m171377f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C42298zb f = C42298zb.m171288f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m170353j(bArr, i2, i8Var);
                    int i8 = i8Var.f106210a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m170352i(i7, bArr, j2, i3, f, i8Var);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzll.m171376e();
                }
                zbVar.mo137531j(i, f);
                return i2;
            } else if (i4 == 5) {
                zbVar.mo137531j(i, Integer.valueOf(m170345b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzll.m171373b();
            }
        } else {
            throw zzll.m171373b();
        }
    }

    /* renamed from: j */
    public static int m170353j(byte[] bArr, int i, C42002i8 i8Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m170354k(b, bArr, i2, i8Var);
        }
        i8Var.f106210a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m170354k(int i, byte[] bArr, int i2, C42002i8 i8Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            i8Var.f106210a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i8Var.f106210a = i5 | (b2 << DateTimeFieldType.f30624Y);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << DateTimeFieldType.f30624Y);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            i8Var.f106210a = i7 | (b3 << DateTimeFieldType.f30608J0);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << DateTimeFieldType.f30608J0);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            i8Var.f106210a = i9 | (b4 << C31234i.C31240f.f75184f);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << C31234i.C31240f.f75184f);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                i8Var.f106210a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m170355l(int i, byte[] bArr, int i2, int i3, C42296z9 z9Var, C42002i8 i8Var) {
        C42194t9 t9Var = (C42194t9) z9Var;
        int j = m170353j(bArr, i2, i8Var);
        t9Var.mo137313U(i8Var.f106210a);
        while (j < i3) {
            int j2 = m170353j(bArr, j, i8Var);
            if (i != i8Var.f106210a) {
                break;
            }
            j = m170353j(bArr, j2, i8Var);
            t9Var.mo137313U(i8Var.f106210a);
        }
        return j;
    }

    /* renamed from: m */
    public static int m170356m(byte[] bArr, int i, C42002i8 i8Var) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            i8Var.f106211b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            byte b3 = b2;
            i3 = i5;
            b = b3;
        }
        i8Var.f106211b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m170357n(Object obj, C41987hb hbVar, byte[] bArr, int i, int i2, int i3, C42002i8 i8Var) throws IOException {
        int F = ((C42297za) hbVar).mo137498F(obj, bArr, i, i2, i3, i8Var);
        i8Var.f106212c = obj;
        return F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m170358o(java.lang.Object r6, com.google.android.gms.internal.measurement.C41987hb r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.C42002i8 r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m170354k(r9, r8, r0, r11)
            int r9 = r11.f106210a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo136571i(r1, r2, r3, r4, r5)
            r11.f106212c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.zzll r6 = com.google.android.gms.internal.measurement.zzll.m171377f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42020j8.m170358o(java.lang.Object, com.google.android.gms.internal.measurement.hb, byte[], int, int, com.google.android.gms.internal.measurement.i8):int");
    }

    /* renamed from: p */
    public static long m170359p(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
