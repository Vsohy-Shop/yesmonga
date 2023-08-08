package com.google.zxing.common.detector;

import com.google.zxing.C34762l;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;

@Deprecated
/* renamed from: com.google.zxing.common.detector.b */
public final class C34714b {

    /* renamed from: b */
    public static final int f84071b = 32;

    /* renamed from: a */
    public final C34710b f84072a;

    public C34714b(C34710b bVar) {
        this.f84072a = bVar;
    }

    /* renamed from: a */
    public final int[] mo102698a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 + i4) / 2;
        int i6 = i5;
        while (i6 >= i3) {
            C34710b bVar = this.f84072a;
            if (!z ? !bVar.mo102666h(i, i6) : !bVar.mo102666h(i6, i)) {
                int i7 = i6;
                while (true) {
                    i7--;
                    if (i7 < i3) {
                        break;
                    }
                    C34710b bVar2 = this.f84072a;
                    if (z) {
                        if (bVar2.mo102666h(i7, i)) {
                            break;
                        }
                    } else if (bVar2.mo102666h(i, i7)) {
                        break;
                    }
                }
                int i8 = i6 - i7;
                if (i7 < i3 || i8 > i2) {
                    break;
                }
                i6 = i7;
            } else {
                i6--;
            }
        }
        int i9 = i6 + 1;
        while (i5 < i4) {
            C34710b bVar3 = this.f84072a;
            if (!z ? !bVar3.mo102666h(i, i5) : !bVar3.mo102666h(i5, i)) {
                int i10 = i5;
                while (true) {
                    i10++;
                    if (i10 >= i4) {
                        break;
                    }
                    C34710b bVar4 = this.f84072a;
                    if (z) {
                        if (bVar4.mo102666h(i10, i)) {
                            break;
                        }
                    } else if (bVar4.mo102666h(i, i10)) {
                        break;
                    }
                }
                int i11 = i10 - i5;
                if (i10 >= i4 || i11 > i2) {
                    break;
                }
                i5 = i10;
            } else {
                i5++;
            }
        }
        int i12 = i5 - 1;
        if (i12 <= i9) {
            return null;
        }
        return new int[]{i9, i12};
    }

    /* renamed from: b */
    public C34762l[] mo102699b() throws NotFoundException {
        int k = this.f84072a.mo102670k();
        int o = this.f84072a.mo102674o();
        int i = k / 2;
        int i2 = o / 2;
        int max = Math.max(1, k / 256);
        int i3 = -max;
        int i4 = i2 / 2;
        int i5 = i2;
        int i6 = o;
        int i7 = i;
        int i8 = i3;
        int i9 = k;
        int i10 = max;
        int max2 = Math.max(1, o / 256);
        int i11 = -max2;
        int d = ((int) mo102700c(i5, 0, 0, i6, i7, i3, 0, i9, i4).mo102884d()) - 1;
        int i12 = max2;
        int i13 = i / 2;
        C34762l c = mo102700c(i5, i11, 0, i6, i7, 0, d, i9, i13);
        int c2 = ((int) c.mo102883c()) - 1;
        C34762l c3 = mo102700c(i5, i12, c2, i6, i7, 0, d, i9, i13);
        int c4 = ((int) c3.mo102883c()) + 1;
        C34762l c5 = mo102700c(i5, 0, c2, c4, i7, i10, d, i9, i4);
        return new C34762l[]{mo102700c(i5, 0, c2, c4, i7, i8, d, ((int) c5.mo102884d()) + 1, i2 / 4), c, c3, c5};
    }

    /* renamed from: c */
    public final C34762l mo102700c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws NotFoundException {
        int[] iArr;
        int i10 = i;
        int i11 = i5;
        int[] iArr2 = null;
        int i12 = i8;
        int i13 = i10;
        int i14 = i11;
        while (i14 < i12 && i14 >= i7 && i13 < i4 && i13 >= i3) {
            if (i2 == 0) {
                iArr = mo102698a(i14, i9, i3, i4, true);
            } else {
                iArr = mo102698a(i13, i9, i7, i8, false);
            }
            if (iArr != null) {
                i14 += i6;
                i13 += i2;
                iArr2 = iArr;
            } else if (iArr2 != null) {
                char c = 0;
                if (i2 == 0) {
                    int i15 = i14 - i6;
                    int i16 = iArr2[0];
                    if (i16 >= i10) {
                        return new C34762l((float) iArr2[1], (float) i15);
                    }
                    if (iArr2[1] <= i10) {
                        return new C34762l((float) i16, (float) i15);
                    }
                    if (i6 <= 0) {
                        c = 1;
                    }
                    return new C34762l((float) iArr2[c], (float) i15);
                }
                int i17 = i13 - i2;
                int i18 = iArr2[0];
                if (i18 >= i11) {
                    return new C34762l((float) i17, (float) iArr2[1]);
                }
                if (iArr2[1] <= i11) {
                    return new C34762l((float) i17, (float) i18);
                }
                float f = (float) i17;
                if (i2 >= 0) {
                    c = 1;
                }
                return new C34762l(f, (float) iArr2[c]);
            } else {
                throw NotFoundException.m141229a();
            }
        }
        throw NotFoundException.m141229a();
    }
}
