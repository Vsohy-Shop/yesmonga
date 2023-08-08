package com.google.zxing.aztec.encoder;

import com.google.zxing.common.C34709a;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34726d;

/* renamed from: com.google.zxing.aztec.encoder.c */
public final class C34638c {

    /* renamed from: a */
    public static final int f83789a = 33;

    /* renamed from: b */
    public static final int f83790b = 0;

    /* renamed from: c */
    public static final int f83791c = 32;

    /* renamed from: d */
    public static final int f83792d = 4;

    /* renamed from: e */
    public static final int[] f83793e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    public static int[] m141289a(C34709a aVar, int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int o = aVar.mo102649o() / i;
        for (int i4 = 0; i4 < o; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (aVar.mo102645k((i4 * i) + i6)) {
                    i3 = 1 << ((i - i6) - 1);
                } else {
                    i3 = 0;
                }
                i5 |= i3;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    /* renamed from: b */
    public static void m141290b(C34710b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo102677v(i5, i4);
                bVar.mo102677v(i5, i6);
                bVar.mo102677v(i4, i5);
                bVar.mo102677v(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo102677v(i7, i7);
        int i8 = i7 + 1;
        bVar.mo102677v(i8, i7);
        bVar.mo102677v(i7, i8);
        int i9 = i + i2;
        bVar.mo102677v(i9, i7);
        bVar.mo102677v(i9, i8);
        bVar.mo102677v(i9, i9 - 1);
    }

    /* renamed from: c */
    public static void m141291c(C34710b bVar, boolean z, int i, C34709a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.mo102645k(i3)) {
                    bVar.mo102677v(i4, i2 - 5);
                }
                if (aVar.mo102645k(i3 + 7)) {
                    bVar.mo102677v(i2 + 5, i4);
                }
                if (aVar.mo102645k(20 - i3)) {
                    bVar.mo102677v(i4, i2 + 5);
                }
                if (aVar.mo102645k(27 - i3)) {
                    bVar.mo102677v(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.mo102645k(i3)) {
                bVar.mo102677v(i5, i2 - 7);
            }
            if (aVar.mo102645k(i3 + 10)) {
                bVar.mo102677v(i2 + 7, i5);
            }
            if (aVar.mo102645k(29 - i3)) {
                bVar.mo102677v(i5, i2 + 7);
            }
            if (aVar.mo102645k(39 - i3)) {
                bVar.mo102677v(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: d */
    public static C34636a m141292d(byte[] bArr) {
        return m141293e(bArr, 33, 0);
    }

    /* renamed from: e */
    public static C34636a m141293e(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C34709a aVar;
        int i6;
        int i7;
        boolean z2;
        int i8;
        C34709a a = new C34639d(bArr).mo102457a();
        int i9 = 11;
        int o = ((a.mo102649o() * i) / 100) + 11;
        int o2 = a.mo102649o() + o;
        int i10 = 32;
        boolean z3 = 0;
        boolean z4 = true;
        if (i2 != 0) {
            if (i2 < 0) {
                z = true;
            } else {
                z = false;
            }
            i4 = Math.abs(i2);
            if (z) {
                i10 = 4;
            }
            if (i4 <= i10) {
                i5 = m141298j(i4, z);
                i3 = f83793e[i4];
                int i11 = i5 - (i5 % i3);
                aVar = m141297i(a, i3);
                if (aVar.mo102649o() + o > i11) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && aVar.mo102649o() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C34709a aVar2 = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 <= 32) {
                if (i12 <= 3) {
                    z2 = z4;
                } else {
                    z2 = z3;
                }
                if (z2) {
                    i8 = i12 + 1;
                } else {
                    i8 = i12;
                }
                int j = m141298j(i8, z2);
                if (o2 <= j) {
                    if (aVar2 == null || i13 != f83793e[i8]) {
                        int i14 = f83793e[i8];
                        i13 = i14;
                        aVar2 = m141297i(a, i14);
                    }
                    int i15 = j - (j % i13);
                    if ((!z2 || aVar2.mo102649o() <= (i13 << 6)) && aVar2.mo102649o() + o <= i15) {
                        aVar = aVar2;
                        i3 = i13;
                        z = z2;
                        i4 = i8;
                        i5 = j;
                    }
                }
                i12++;
                z4 = z4;
                z3 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C34709a f = m141294f(aVar, i5, i3);
        int o3 = aVar.mo102649o() / i3;
        C34709a g = m141295g(z, i4, o3);
        if (!z) {
            i9 = 14;
        }
        int i16 = i9 + (i4 << 2);
        int[] iArr = new int[i16];
        int i17 = 2;
        if (z) {
            for (int i18 = z3; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
            i6 = i16;
        } else {
            int i19 = i16 / 2;
            i6 = i16 + 1 + (((i19 - 1) / 15) * 2);
            int i20 = i6 / 2;
            for (int i21 = z3; i21 < i19; i21++) {
                int i22 = (i21 / 15) + i21;
                iArr[(i19 - i21) - (z4 ? 1 : 0)] = (i20 - i22) - 1;
                iArr[i19 + i21] = i22 + i20 + z4;
            }
        }
        C34710b bVar = new C34710b(i6);
        int i23 = z3;
        int i24 = i23;
        while (i23 < i4) {
            int i25 = (i4 - i23) << i17;
            if (z) {
                i7 = 9;
            } else {
                i7 = 12;
            }
            int i26 = i25 + i7;
            int i27 = z3;
            while (i27 < i26) {
                int i28 = i27 << 1;
                while (z3 < i17) {
                    if (f.mo102645k(i24 + i28 + z3)) {
                        int i29 = i23 << 1;
                        bVar.mo102677v(iArr[i29 + z3], iArr[i29 + i27]);
                    }
                    if (f.mo102645k((i26 << 1) + i24 + i28 + z3)) {
                        int i30 = i23 << 1;
                        bVar.mo102677v(iArr[i30 + i27], iArr[((i16 - 1) - i30) - z3]);
                    }
                    if (f.mo102645k((i26 << 2) + i24 + i28 + z3)) {
                        int i31 = (i16 - 1) - (i23 << 1);
                        bVar.mo102677v(iArr[i31 - z3], iArr[i31 - i27]);
                    }
                    if (f.mo102645k((i26 * 6) + i24 + i28 + z3)) {
                        int i32 = i23 << 1;
                        bVar.mo102677v(iArr[((i16 - 1) - i32) - i27], iArr[i32 + z3]);
                    }
                    z3++;
                    i17 = 2;
                }
                i27++;
                z3 = 0;
                i17 = 2;
            }
            i24 += i26 << 3;
            i23++;
            z3 = 0;
            i17 = 2;
        }
        m141291c(bVar, z, i6, g);
        if (z) {
            m141290b(bVar, i6 / 2, 5);
        } else {
            int i33 = i6 / 2;
            m141290b(bVar, i33, 7);
            int i34 = 0;
            int i35 = 0;
            while (i35 < (i16 / 2) - 1) {
                for (int i36 = i33 & 1; i36 < i6; i36 += 2) {
                    int i37 = i33 - i34;
                    bVar.mo102677v(i37, i36);
                    int i38 = i33 + i34;
                    bVar.mo102677v(i38, i36);
                    bVar.mo102677v(i36, i37);
                    bVar.mo102677v(i36, i38);
                }
                i35 += 15;
                i34 += 16;
            }
        }
        C34636a aVar3 = new C34636a();
        aVar3.mo102451g(z);
        aVar3.mo102454j(i6);
        aVar3.mo102452h(i4);
        aVar3.mo102450f(o3);
        aVar3.mo102453i(bVar);
        return aVar3;
    }

    /* renamed from: f */
    public static C34709a m141294f(C34709a aVar, int i, int i2) {
        C34726d dVar = new C34726d(m141296h(i2));
        int i3 = i / i2;
        int[] a = m141289a(aVar, i2, i3);
        dVar.mo102740b(a, i3 - (aVar.mo102649o() / i2));
        C34709a aVar2 = new C34709a();
        aVar2.mo102638e(0, i % i2);
        for (int e : a) {
            aVar2.mo102638e(e, i2);
        }
        return aVar2;
    }

    /* renamed from: g */
    public static C34709a m141295g(boolean z, int i, int i2) {
        C34709a aVar = new C34709a();
        if (z) {
            aVar.mo102638e(i - 1, 2);
            aVar.mo102638e(i2 - 1, 6);
            return m141294f(aVar, 28, 4);
        }
        aVar.mo102638e(i - 1, 5);
        aVar.mo102638e(i2 - 1, 11);
        return m141294f(aVar, 40, 4);
    }

    /* renamed from: h */
    public static C34723a m141296h(int i) {
        if (i == 4) {
            return C34723a.f84116k;
        }
        if (i == 6) {
            return C34723a.f84115j;
        }
        if (i == 8) {
            return C34723a.f84119n;
        }
        if (i == 10) {
            return C34723a.f84114i;
        }
        if (i == 12) {
            return C34723a.f84113h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* renamed from: i */
    public static C34709a m141297i(C34709a aVar, int i) {
        C34709a aVar2 = new C34709a();
        int o = aVar.mo102649o();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < o) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= o || aVar.mo102645k(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.mo102638e(i7, i);
            } else if (i7 == 0) {
                aVar2.mo102638e(i4 | 1, i);
            } else {
                aVar2.mo102638e(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return aVar2;
    }

    /* renamed from: j */
    public static int m141298j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
