package com.google.android.gms.internal.gtm;

import com.google.android.material.color.C31234i;
import java.io.IOException;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.gtm.ch */
public final class C41191ch {
    /* renamed from: a */
    public static int m167275a(byte[] bArr, int i, C41167bh bhVar) throws zzvk {
        int j = m167284j(bArr, i, bhVar);
        int i2 = bhVar.f104464a;
        if (i2 < 0) {
            throw zzvk.m168999f();
        } else if (i2 > bArr.length - j) {
            throw zzvk.m169002j();
        } else if (i2 == 0) {
            bhVar.f104466c = zztd.f105744a;
            return j;
        } else {
            bhVar.f104466c = zztd.m168979W(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m167276b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
    }

    /* renamed from: c */
    public static int m167277c(C41315hl hlVar, byte[] bArr, int i, int i2, int i3, C41167bh bhVar) throws IOException {
        C41699xk xkVar = (C41699xk) hlVar;
        Object f = xkVar.mo135460f();
        int I = xkVar.mo136065I(f, bArr, i, i2, i3, bhVar);
        xkVar.mo135457c(f);
        bhVar.f104466c = f;
        return I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m167278d(com.google.android.gms.internal.gtm.C41315hl r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.gtm.C41167bh r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m167285k(r8, r7, r0, r10)
            int r8 = r10.f104464a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo135460f()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo135463i(r1, r2, r3, r4, r5)
            r6.mo135457c(r9)
            r10.f104466c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.gtm.zzvk r6 = com.google.android.gms.internal.gtm.zzvk.m169002j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41191ch.m167278d(com.google.android.gms.internal.gtm.hl, byte[], int, int, com.google.android.gms.internal.gtm.bh):int");
    }

    /* renamed from: e */
    public static int m167279e(C41315hl<?> hlVar, int i, byte[] bArr, int i2, int i3, C41626uj<?> ujVar, C41167bh bhVar) throws IOException {
        int d = m167278d(hlVar, bArr, i2, i3, bhVar);
        ujVar.add(bhVar.f104466c);
        while (d < i3) {
            int j = m167284j(bArr, d, bhVar);
            if (i != bhVar.f104464a) {
                break;
            }
            d = m167278d(hlVar, bArr, j, i3, bhVar);
            ujVar.add(bhVar.f104466c);
        }
        return d;
    }

    /* renamed from: f */
    public static int m167280f(byte[] bArr, int i, C41626uj<?> ujVar, C41167bh bhVar) throws IOException {
        C41458nj njVar = (C41458nj) ujVar;
        int j = m167284j(bArr, i, bhVar);
        int i2 = bhVar.f104464a + j;
        while (j < i2) {
            j = m167284j(bArr, j, bhVar);
            njVar.mo135665U(bhVar.f104464a);
        }
        if (j == i2) {
            return j;
        }
        throw zzvk.m169002j();
    }

    /* renamed from: g */
    public static int m167281g(byte[] bArr, int i, C41167bh bhVar) throws zzvk {
        int j = m167284j(bArr, i, bhVar);
        int i2 = bhVar.f104464a;
        if (i2 < 0) {
            throw zzvk.m168999f();
        } else if (i2 == 0) {
            bhVar.f104466c = "";
            return j;
        } else {
            bhVar.f104466c = new String(bArr, j, i2, C41650vj.f105169a);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m167282h(byte[] bArr, int i, C41167bh bhVar) throws zzvk {
        int j = m167284j(bArr, i, bhVar);
        int i2 = bhVar.f104464a;
        if (i2 < 0) {
            throw zzvk.m168999f();
        } else if (i2 == 0) {
            bhVar.f104466c = "";
            return j;
        } else {
            bhVar.f104466c = C41461nm.m168095d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    public static int m167283i(int i, byte[] bArr, int i2, int i3, C41748zl zlVar, C41167bh bhVar) throws zzvk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m167287m(bArr, i2, bhVar);
                zlVar.mo136131h(i, Long.valueOf(bhVar.f104465b));
                return m;
            } else if (i4 == 1) {
                zlVar.mo136131h(i, Long.valueOf(m167289o(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m167284j(bArr, i2, bhVar);
                int i5 = bhVar.f104464a;
                if (i5 < 0) {
                    throw zzvk.m168999f();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        zlVar.mo136131h(i, zztd.f105744a);
                    } else {
                        zlVar.mo136131h(i, zztd.m168979W(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzvk.m169002j();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C41748zl e = C41748zl.m168949e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m167284j(bArr, i2, bhVar);
                    int i8 = bhVar.f104464a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m167283i(i8, bArr, j2, i3, e, bhVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzvk.m169000g();
                }
                zlVar.mo136131h(i, e);
                return i2;
            } else if (i4 == 5) {
                zlVar.mo136131h(i, Integer.valueOf(m167276b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzvk.m168996c();
            }
        } else {
            throw zzvk.m168996c();
        }
    }

    /* renamed from: j */
    public static int m167284j(byte[] bArr, int i, C41167bh bhVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m167285k(b, bArr, i2, bhVar);
        }
        bhVar.f104464a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m167285k(int i, byte[] bArr, int i2, C41167bh bhVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            bhVar.f104464a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            bhVar.f104464a = i5 | (b2 << DateTimeFieldType.f30624Y);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << DateTimeFieldType.f30624Y);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            bhVar.f104464a = i7 | (b3 << DateTimeFieldType.f30608J0);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << DateTimeFieldType.f30608J0);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            bhVar.f104464a = i9 | (b4 << C31234i.C31240f.f75184f);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << C31234i.C31240f.f75184f);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                bhVar.f104464a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    public static int m167286l(int i, byte[] bArr, int i2, int i3, C41626uj<?> ujVar, C41167bh bhVar) {
        C41458nj njVar = (C41458nj) ujVar;
        int j = m167284j(bArr, i2, bhVar);
        njVar.mo135665U(bhVar.f104464a);
        while (j < i3) {
            int j2 = m167284j(bArr, j, bhVar);
            if (i != bhVar.f104464a) {
                break;
            }
            j = m167284j(bArr, j2, bhVar);
            njVar.mo135665U(bhVar.f104464a);
        }
        return j;
    }

    /* renamed from: m */
    public static int m167287m(byte[] bArr, int i, C41167bh bhVar) {
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
            bhVar.f104465b = j2;
            return i3;
        }
        bhVar.f104465b = j;
        return i2;
    }

    /* renamed from: n */
    public static int m167288n(int i, byte[] bArr, int i2, int i3, C41167bh bhVar) throws zzvk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m167287m(bArr, i2, bhVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m167284j(bArr, i2, bhVar) + bhVar.f104464a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m167284j(bArr, i2, bhVar);
                    i6 = bhVar.f104464a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m167288n(i6, bArr, i2, i3, bhVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzvk.m169000g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzvk.m168996c();
            }
        } else {
            throw zzvk.m168996c();
        }
    }

    /* renamed from: o */
    public static long m167289o(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
