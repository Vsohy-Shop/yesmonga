package com.google.zxing.qrcode.detector;

import com.google.zxing.C34762l;
import com.google.zxing.C34763m;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34717f;
import com.google.zxing.common.C34719h;
import com.google.zxing.common.C34721j;
import com.google.zxing.common.detector.C34713a;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.detector.c */
public class C34879c {

    /* renamed from: a */
    public final C34710b f84771a;

    /* renamed from: b */
    public C34763m f84772b;

    public C34879c(C34710b bVar) {
        this.f84771a = bVar;
    }

    /* renamed from: c */
    public static int m142513c(C34762l lVar, C34762l lVar2, C34762l lVar3, float f) throws NotFoundException {
        int c = ((C34713a.m141632c(C34762l.m141932b(lVar, lVar2) / f) + C34713a.m141632c(C34762l.m141932b(lVar, lVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: d */
    public static C34721j m142514d(C34762l lVar, C34762l lVar2, C34762l lVar3, C34762l lVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (lVar4 != null) {
            f2 = lVar4.mo102883c();
            f = lVar4.mo102884d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (lVar2.mo102883c() - lVar.mo102883c()) + lVar3.mo102883c();
            f = (lVar2.mo102884d() - lVar.mo102884d()) + lVar3.mo102884d();
            f3 = f4;
        }
        return C34721j.m141661b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, lVar.mo102883c(), lVar.mo102884d(), lVar2.mo102883c(), lVar2.mo102884d(), f2, f, lVar3.mo102883c(), lVar3.mo102884d());
    }

    /* renamed from: k */
    public static C34710b m142515k(C34710b bVar, C34721j jVar, int i) throws NotFoundException {
        return C34719h.m141651b().mo102706d(bVar, i, i, jVar);
    }

    /* renamed from: a */
    public final float mo103215a(C34762l lVar, C34762l lVar2, C34762l lVar3) {
        return (mo103216b(lVar, lVar2) + mo103216b(lVar, lVar3)) / 2.0f;
    }

    /* renamed from: b */
    public final float mo103216b(C34762l lVar, C34762l lVar2) {
        float m = mo103224m((int) lVar.mo102883c(), (int) lVar.mo102884d(), (int) lVar2.mo102883c(), (int) lVar2.mo102884d());
        float m2 = mo103224m((int) lVar2.mo102883c(), (int) lVar2.mo102884d(), (int) lVar.mo102883c(), (int) lVar.mo102884d());
        if (Float.isNaN(m)) {
            return m2 / 7.0f;
        }
        if (Float.isNaN(m2)) {
            return m / 7.0f;
        }
        return (m + m2) / 14.0f;
    }

    /* renamed from: e */
    public C34717f mo103217e() throws NotFoundException, FormatException {
        return mo103218f((Map<DecodeHintType, ?>) null);
    }

    /* renamed from: f */
    public final C34717f mo103218f(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        C34763m mVar;
        if (map == null) {
            mVar = null;
        } else {
            mVar = (C34763m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        this.f84772b = mVar;
        return mo103222j(new FinderPatternFinder(this.f84771a, this.f84772b).mo103197f(map));
    }

    /* renamed from: g */
    public final C34877a mo103219g(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f84771a.mo102674o() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f84771a.mo102670k() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C34878b(this.f84771a, max, max2, min, min2, f, this.f84772b).mo103212c();
            }
            throw NotFoundException.m141229a();
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: h */
    public final C34710b mo103220h() {
        return this.f84771a;
    }

    /* renamed from: i */
    public final C34763m mo103221i() {
        return this.f84772b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.zxing.common.C34717f mo103222j(com.google.zxing.qrcode.detector.C34881e r11) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r10 = this;
            com.google.zxing.qrcode.detector.d r0 = r11.mo103230b()
            com.google.zxing.qrcode.detector.d r1 = r11.mo103231c()
            com.google.zxing.qrcode.detector.d r11 = r11.mo103229a()
            float r2 = r10.mo103215a(r0, r1, r11)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x009e
            int r4 = m142513c(r0, r1, r11, r2)
            com.google.zxing.qrcode.decoder.g r5 = com.google.zxing.qrcode.decoder.C34873g.m142473g(r4)
            int r6 = r5.mo103182e()
            int r6 = r6 + -7
            int[] r5 = r5.mo103181d()
            int r5 = r5.length
            r7 = 4
            if (r5 <= 0) goto L_0x0073
            float r5 = r1.mo102883c()
            float r8 = r0.mo102883c()
            float r5 = r5 - r8
            float r8 = r11.mo102883c()
            float r5 = r5 + r8
            float r8 = r1.mo102884d()
            float r9 = r0.mo102884d()
            float r8 = r8 - r9
            float r9 = r11.mo102884d()
            float r8 = r8 + r9
            r9 = 1077936128(0x40400000, float:3.0)
            float r6 = (float) r6
            float r9 = r9 / r6
            float r3 = r3 - r9
            float r6 = r0.mo102883c()
            float r9 = r0.mo102883c()
            float r5 = r5 - r9
            float r5 = r5 * r3
            float r6 = r6 + r5
            int r5 = (int) r6
            float r6 = r0.mo102884d()
            float r9 = r0.mo102884d()
            float r8 = r8 - r9
            float r3 = r3 * r8
            float r6 = r6 + r3
            int r3 = (int) r6
            r6 = r7
        L_0x0066:
            r8 = 16
            if (r6 > r8) goto L_0x0073
            float r8 = (float) r6
            com.google.zxing.qrcode.detector.a r2 = r10.mo103219g(r2, r5, r3, r8)     // Catch:{ NotFoundException -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            int r6 = r6 << 1
            goto L_0x0066
        L_0x0073:
            r2 = 0
        L_0x0074:
            com.google.zxing.common.j r3 = m142514d(r0, r1, r11, r2, r4)
            com.google.zxing.common.b r5 = r10.f84771a
            com.google.zxing.common.b r3 = m142515k(r5, r3, r4)
            r4 = 3
            r5 = 2
            r6 = 0
            r8 = 1
            if (r2 != 0) goto L_0x008d
            com.google.zxing.l[] r2 = new com.google.zxing.C34762l[r4]
            r2[r6] = r11
            r2[r8] = r0
            r2[r5] = r1
            goto L_0x0098
        L_0x008d:
            com.google.zxing.l[] r7 = new com.google.zxing.C34762l[r7]
            r7[r6] = r11
            r7[r8] = r0
            r7[r5] = r1
            r7[r4] = r2
            r2 = r7
        L_0x0098:
            com.google.zxing.common.f r11 = new com.google.zxing.common.f
            r11.<init>(r3, r2)
            return r11
        L_0x009e:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.C34879c.mo103222j(com.google.zxing.qrcode.detector.e):com.google.zxing.common.f");
    }

    /* renamed from: l */
    public final float mo103223l(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        C34879c cVar;
        boolean z3;
        boolean z4 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i8 < i6) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i7 < i5) {
            i16 = 1;
        }
        int i17 = i6 + i9;
        int i18 = i8;
        int i19 = i7;
        int i20 = 0;
        while (true) {
            if (i18 == i17) {
                i10 = i17;
                i11 = i14;
                break;
            }
            if (z) {
                i12 = i19;
            } else {
                i12 = i18;
            }
            if (z) {
                i13 = i18;
            } else {
                i13 = i19;
            }
            if (i20 == z4) {
                z2 = z;
                z3 = z4;
                i10 = i17;
                cVar = this;
            } else {
                cVar = this;
                z2 = z;
                i10 = i17;
                z3 = false;
            }
            if (z3 == cVar.f84771a.mo102666h(i12, i13)) {
                if (i20 == 2) {
                    return C34713a.m141631b(i18, i19, i8, i7);
                }
                i20++;
            }
            i15 += abs2;
            if (i15 > 0) {
                if (i19 == i5) {
                    i11 = 2;
                    break;
                }
                i19 += i16;
                i15 -= abs;
            }
            i18 += i9;
            i17 = i10;
            z = z2;
            z4 = true;
            i14 = 2;
        }
        if (i20 == i11) {
            return C34713a.m141631b(i10, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: m */
    public final float mo103224m(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float l = mo103223l(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else if (i5 >= this.f84771a.mo102674o()) {
            f = ((float) ((this.f84771a.mo102674o() - 1) - i)) / ((float) (i5 - i));
            i5 = this.f84771a.mo102674o() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i7 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i7 < 0) {
            f2 = f3 / ((float) (i2 - i7));
        } else if (i7 >= this.f84771a.mo102670k()) {
            f2 = ((float) ((this.f84771a.mo102670k() - 1) - i2)) / ((float) (i7 - i2));
            i6 = this.f84771a.mo102670k() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (l + mo103223l(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
    }
}
