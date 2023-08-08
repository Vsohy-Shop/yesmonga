package com.google.zxing.pdf417.decoder;

import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.pdf417.C34830a;
import com.google.zxing.pdf417.decoder.p051ec.C34840a;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.zxing.pdf417.decoder.i */
public final class C34846i {

    /* renamed from: a */
    public static final int f84630a = 2;

    /* renamed from: b */
    public static final int f84631b = 3;

    /* renamed from: c */
    public static final int f84632c = 512;

    /* renamed from: d */
    public static final C34840a f84633d = new C34840a();

    /* renamed from: a */
    public static C34837c m142343a(C34844g gVar) throws NotFoundException {
        int[] j;
        if (gVar == null || (j = gVar.mo103126j()) == null) {
            return null;
        }
        int p = m142358p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C34838d[] d = gVar.mo103119d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            int i5 = j[length];
            i += p - i5;
            if (i5 > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return gVar.mo103116a().mo103054a(i2, i, gVar.mo103127k());
    }

    /* renamed from: b */
    public static void m142344b(C34839e eVar, C34836b[][] bVarArr) throws NotFoundException {
        C34836b bVar = bVarArr[0][1];
        int[] b = bVar.mo103052b();
        int j = (eVar.mo103081j() * eVar.mo103083l()) - m142360r(eVar.mo103082k());
        if (b.length == 0) {
            if (j <= 0 || j > 928) {
                throw NotFoundException.m141229a();
            }
            bVar.mo103053c(j);
        } else if (b[0] != j) {
            bVar.mo103053c(j);
        }
    }

    /* renamed from: c */
    public static int m142345c(C34710b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        if (z) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo102666h(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    public static boolean m142346d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    public static int m142347e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f84633d.mo103090a(iArr, i, iArr2);
        }
        throw ChecksumException.m141224a();
    }

    /* renamed from: f */
    public static C34836b[][] m142348f(C34839e eVar) {
        int c;
        int l = eVar.mo103083l();
        int[] iArr = new int[2];
        iArr[1] = eVar.mo103081j() + 2;
        iArr[0] = l;
        C34836b[][] bVarArr = (C34836b[][]) Array.newInstance(C34836b.class, iArr);
        for (C34836b[] bVarArr2 : bVarArr) {
            int i = 0;
            while (true) {
                if (i >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i] = new C34836b();
                i++;
            }
        }
        int i2 = 0;
        for (C34843f fVar : eVar.mo103086o()) {
            if (fVar != null) {
                for (C34838d dVar : fVar.mo103119d()) {
                    if (dVar != null && (c = dVar.mo103065c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i2].mo103053c(dVar.mo103067e());
                    }
                }
            }
            i2++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    public static C34712d m142349g(C34839e eVar) throws FormatException, ChecksumException, NotFoundException {
        C34836b[][] f = m142348f(eVar);
        m142344b(eVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(eVar.mo103083l() * eVar.mo103081j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < eVar.mo103083l(); i++) {
            int i2 = 0;
            while (i2 < eVar.mo103081j()) {
                int i3 = i2 + 1;
                int[] b = f[i][i3].mo103052b();
                int j = (eVar.mo103081j() * i) + i2;
                if (b.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (b.length == 1) {
                    iArr[j] = b[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(b);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m142350h(eVar.mo103082k(), iArr, C34830a.m142211c(arrayList), C34830a.m142211c(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static C34712d m142350h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m142352j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw ChecksumException.m141224a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw ChecksumException.m141224a();
                    }
                }
            } else {
                throw ChecksumException.m141224a();
            }
        }
    }

    /* renamed from: i */
    public static C34712d m142351i(C34710b bVar, C34762l lVar, C34762l lVar2, C34762l lVar3, C34762l lVar4, int i, int i2) throws NotFoundException, FormatException, ChecksumException {
        C34837c cVar;
        C34839e v;
        boolean z;
        int i3;
        C34843f gVar;
        boolean z2;
        int i4;
        int i5;
        C34843f fVar;
        int i6;
        int i7;
        C34837c cVar2 = new C34837c(bVar, lVar, lVar2, lVar3, lVar4);
        C34844g gVar2 = null;
        boolean z3 = true;
        C34844g gVar3 = null;
        boolean z4 = true;
        while (true) {
            cVar = cVar2;
            if (lVar != null) {
                gVar2 = m142361s(bVar, cVar, lVar, true, i, i2);
            }
            if (lVar3 != null) {
                gVar3 = m142361s(bVar, cVar, lVar3, false, i, i2);
            }
            v = m142364v(gVar2, gVar3);
            if (v != null) {
                cVar2 = v.mo103084m();
                if (!z4 || cVar2 == null || (cVar2.mo103060g() >= cVar.mo103060g() && cVar2.mo103058e() <= cVar.mo103058e())) {
                    v.mo103087p(cVar);
                    int j = v.mo103081j() + 1;
                    v.mo103088q(0, gVar2);
                    v.mo103088q(j, gVar3);
                } else {
                    z4 = false;
                }
            } else {
                throw NotFoundException.m141229a();
            }
        }
        v.mo103087p(cVar);
        int j2 = v.mo103081j() + 1;
        v.mo103088q(0, gVar2);
        v.mo103088q(j2, gVar3);
        if (gVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        int i8 = i;
        int i9 = i2;
        int i10 = 1;
        while (i10 <= j2) {
            if (z) {
                i3 = i10;
            } else {
                i3 = j2 - i10;
            }
            if (v.mo103085n(i3) == null) {
                if (i3 == 0 || i3 == j2) {
                    if (i3 == 0) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    gVar = new C34844g(cVar, z2);
                } else {
                    gVar = new C34843f(cVar);
                }
                C34843f fVar2 = gVar;
                v.mo103088q(i3, fVar2);
                int i11 = -1;
                int g = cVar.mo103060g();
                int i12 = -1;
                while (g <= cVar.mo103058e()) {
                    int t = m142362t(v, i3, g, z);
                    if (t >= 0 && t <= cVar.mo103057d()) {
                        i7 = t;
                    } else if (i12 != i11) {
                        i7 = i12;
                    } else {
                        i6 = i12;
                        i5 = g;
                        i4 = i11;
                        fVar = fVar2;
                        i12 = i6;
                        g = i5 + 1;
                        fVar2 = fVar;
                        i11 = i4;
                    }
                    i6 = i12;
                    int i13 = g;
                    i4 = i11;
                    fVar = fVar2;
                    C34838d k = m142353k(bVar, cVar.mo103059f(), cVar.mo103057d(), z, i7, i13, i8, i9);
                    i5 = i13;
                    if (k != null) {
                        fVar.mo103121f(i5, k);
                        i8 = Math.min(i8, k.mo103068f());
                        i9 = Math.max(i9, k.mo103068f());
                        i12 = i7;
                        g = i5 + 1;
                        fVar2 = fVar;
                        i11 = i4;
                    }
                    i12 = i6;
                    g = i5 + 1;
                    fVar2 = fVar;
                    i11 = i4;
                }
            }
            i10++;
            z3 = true;
        }
        return m142349g(v);
    }

    /* renamed from: j */
    public static C34712d m142352j(int[] iArr, int i, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m142347e(iArr, iArr2, i2);
            m142366x(iArr, i2);
            C34712d b = DecodedBitStreamParser.m142249b(iArr, String.valueOf(i));
            b.mo102695m(Integer.valueOf(e));
            b.mo102694l(Integer.valueOf(iArr2.length));
            return b;
        }
        throw FormatException.m141227a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = com.google.zxing.pdf417.decoder.C34845h.m142341d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.pdf417.decoder.C34838d m142353k(com.google.zxing.common.C34710b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m142345c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m142359q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = com.google.zxing.common.detector.C34713a.m141633d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m142346d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = com.google.zxing.pdf417.decoder.C34845h.m142341d(r7)
            int r9 = com.google.zxing.pdf417.C34830a.m142210b(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            com.google.zxing.pdf417.decoder.d r8 = new com.google.zxing.pdf417.decoder.d
            int r7 = m142356n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C34846i.m142353k(com.google.zxing.common.b, int, int, boolean, int, int, int, int):com.google.zxing.pdf417.decoder.d");
    }

    /* renamed from: l */
    public static C34835a m142354l(C34844g gVar, C34844g gVar2) {
        C34835a i;
        C34835a i2;
        if (gVar == null || (i = gVar.mo103125i()) == null) {
            if (gVar2 == null) {
                return null;
            }
            return gVar2.mo103125i();
        } else if (gVar2 == null || (i2 = gVar2.mo103125i()) == null || i.mo103046a() == i2.mo103046a() || i.mo103047b() == i2.mo103047b() || i.mo103048c() == i2.mo103048c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public static int[] m142355m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    public static int m142356n(int i) {
        return m142357o(m142355m(i));
    }

    /* renamed from: o */
    public static int m142357o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    public static int m142358p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    public static int[] m142359q(C34710b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        int[] iArr = new int[8];
        if (z) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo102666h(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    public static int m142360r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    public static C34844g m142361s(C34710b bVar, C34837c cVar, C34762l lVar, boolean z, int i, int i2) {
        int i3;
        int i4;
        boolean z2 = z;
        C34844g gVar = new C34844g(cVar, z2);
        for (int i5 = 0; i5 < 2; i5++) {
            if (i5 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i6 = i3;
            int c = (int) lVar.mo102883c();
            int d = (int) lVar.mo102884d();
            while (d <= cVar.mo103058e() && d >= cVar.mo103060g()) {
                C34838d k = m142353k(bVar, 0, bVar.mo102674o(), z, c, d, i, i2);
                if (k != null) {
                    gVar.mo103121f(d, k);
                    if (z2) {
                        i4 = k.mo103066d();
                    } else {
                        i4 = k.mo103064b();
                    }
                    c = i4;
                }
                d += i6;
            }
        }
        return gVar;
    }

    /* renamed from: t */
    public static int m142362t(C34839e eVar, int i, int i2, boolean z) {
        int i3;
        C34838d dVar;
        int i4;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i5 = i - i3;
        if (m142363u(eVar, i5)) {
            dVar = eVar.mo103085n(i5).mo103117b(i2);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            C34838d c = eVar.mo103085n(i).mo103118c(i2);
            if (c == null) {
                if (m142363u(eVar, i5)) {
                    c = eVar.mo103085n(i5).mo103118c(i2);
                }
                if (c == null) {
                    int i6 = 0;
                    while (true) {
                        i -= i3;
                        if (m142363u(eVar, i)) {
                            for (C34838d dVar2 : eVar.mo103085n(i).mo103119d()) {
                                if (dVar2 != null) {
                                    if (z) {
                                        i4 = dVar2.mo103064b();
                                    } else {
                                        i4 = dVar2.mo103066d();
                                    }
                                    return i4 + (i3 * i6 * (dVar2.mo103064b() - dVar2.mo103066d()));
                                }
                            }
                            i6++;
                        } else {
                            C34837c m = eVar.mo103084m();
                            if (z) {
                                return m.mo103059f();
                            }
                            return m.mo103057d();
                        }
                    }
                } else if (z) {
                    return c.mo103064b();
                } else {
                    return c.mo103066d();
                }
            } else if (z) {
                return c.mo103066d();
            } else {
                return c.mo103064b();
            }
        } else if (z) {
            return dVar.mo103064b();
        } else {
            return dVar.mo103066d();
        }
    }

    /* renamed from: u */
    public static boolean m142363u(C34839e eVar, int i) {
        return i >= 0 && i <= eVar.mo103081j() + 1;
    }

    /* renamed from: v */
    public static C34839e m142364v(C34844g gVar, C34844g gVar2) throws NotFoundException {
        C34835a l;
        if ((gVar == null && gVar2 == null) || (l = m142354l(gVar, gVar2)) == null) {
            return null;
        }
        return new C34839e(l, C34837c.m142263j(m142343a(gVar), m142343a(gVar2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r9.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        throw r1;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m142365w(com.google.zxing.pdf417.decoder.C34836b[][] r9) {
        /*
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0007:
            int r3 = r9.length     // Catch:{ all -> 0x0063 }
            if (r2 >= r3) goto L_0x005b
            java.lang.String r3 = "Row %2d: "
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0063 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0063 }
            r5[r1] = r6     // Catch:{ all -> 0x0063 }
            r0.format(r3, r5)     // Catch:{ all -> 0x0063 }
            r3 = r1
        L_0x0019:
            r5 = r9[r2]     // Catch:{ all -> 0x0063 }
            int r6 = r5.length     // Catch:{ all -> 0x0063 }
            if (r3 >= r6) goto L_0x0051
            r5 = r5[r3]     // Catch:{ all -> 0x0063 }
            int[] r6 = r5.mo103052b()     // Catch:{ all -> 0x0063 }
            int r6 = r6.length     // Catch:{ all -> 0x0063 }
            if (r6 != 0) goto L_0x002e
            java.lang.String r5 = "        "
            r6 = 0
            r0.format(r5, r6)     // Catch:{ all -> 0x0063 }
            goto L_0x004e
        L_0x002e:
            java.lang.String r6 = "%4d(%2d)"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0063 }
            int[] r8 = r5.mo103052b()     // Catch:{ all -> 0x0063 }
            r8 = r8[r1]     // Catch:{ all -> 0x0063 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0063 }
            r7[r1] = r8     // Catch:{ all -> 0x0063 }
            int[] r8 = r5.mo103052b()     // Catch:{ all -> 0x0063 }
            r8 = r8[r1]     // Catch:{ all -> 0x0063 }
            java.lang.Integer r5 = r5.mo103051a(r8)     // Catch:{ all -> 0x0063 }
            r7[r4] = r5     // Catch:{ all -> 0x0063 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0063 }
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0051:
            java.lang.String r3 = "%n"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0063 }
            r0.format(r3, r4)     // Catch:{ all -> 0x0063 }
            int r2 = r2 + 1
            goto L_0x0007
        L_0x005b:
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0063 }
            r0.close()
            return r9
        L_0x0063:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            r9.addSuppressed(r0)
        L_0x006e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.C34846i.m142365w(com.google.zxing.pdf417.decoder.b[][]):java.lang.String");
    }

    /* renamed from: x */
    public static void m142366x(int[] iArr, int i) throws FormatException {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.m141227a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.m141227a();
            }
        } else {
            throw FormatException.m141227a();
        }
    }
}
