package com.google.zxing.datamatrix.detector;

import com.google.zxing.C34762l;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34717f;
import com.google.zxing.common.C34719h;
import com.google.zxing.common.detector.C34715c;

/* renamed from: com.google.zxing.datamatrix.detector.a */
public final class C34738a {

    /* renamed from: a */
    public final C34710b f84168a;

    /* renamed from: b */
    public final C34715c f84169b;

    public C34738a(C34710b bVar) throws NotFoundException {
        this.f84168a = bVar;
        this.f84169b = new C34715c(bVar);
    }

    /* renamed from: f */
    public static C34762l m141749f(C34762l lVar, float f, float f2) {
        float f3;
        float f4;
        float c = lVar.mo102883c();
        float d = lVar.mo102884d();
        if (c < f) {
            f3 = c - 1.0f;
        } else {
            f3 = c + 1.0f;
        }
        if (d < f2) {
            f4 = d - 1.0f;
        } else {
            f4 = d + 1.0f;
        }
        return new C34762l(f3, f4);
    }

    /* renamed from: g */
    public static C34710b m141750g(C34710b bVar, C34762l lVar, C34762l lVar2, C34762l lVar3, C34762l lVar4, int i, int i2) throws NotFoundException {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C34719h.m141651b().mo102705c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, lVar.mo102883c(), lVar.mo102884d(), lVar4.mo102883c(), lVar4.mo102884d(), lVar3.mo102883c(), lVar3.mo102884d(), lVar2.mo102883c(), lVar2.mo102884d());
    }

    /* renamed from: h */
    public static C34762l m141751h(C34762l lVar, C34762l lVar2, int i) {
        float f = (float) (i + 1);
        return new C34762l(lVar.mo102883c() + ((lVar2.mo102883c() - lVar.mo102883c()) / f), lVar.mo102884d() + ((lVar2.mo102884d() - lVar.mo102884d()) / f));
    }

    /* renamed from: a */
    public final C34762l mo102775a(C34762l[] lVarArr) {
        C34762l lVar = lVarArr[0];
        C34762l lVar2 = lVarArr[1];
        C34762l lVar3 = lVarArr[2];
        C34762l lVar4 = lVarArr[3];
        int j = mo102781j(lVar, lVar4);
        C34762l h = m141751h(lVar, lVar2, (mo102781j(lVar2, lVar4) + 1) << 2);
        C34762l h2 = m141751h(lVar3, lVar2, (j + 1) << 2);
        int j2 = mo102781j(h, lVar4);
        int j3 = mo102781j(h2, lVar4);
        float f = (float) (j2 + 1);
        C34762l lVar5 = new C34762l(lVar4.mo102883c() + ((lVar3.mo102883c() - lVar2.mo102883c()) / f), lVar4.mo102884d() + ((lVar3.mo102884d() - lVar2.mo102884d()) / f));
        float f2 = (float) (j3 + 1);
        C34762l lVar6 = new C34762l(lVar4.mo102883c() + ((lVar.mo102883c() - lVar2.mo102883c()) / f2), lVar4.mo102884d() + ((lVar.mo102884d() - lVar2.mo102884d()) / f2));
        if (!mo102779e(lVar5)) {
            if (mo102779e(lVar6)) {
                return lVar6;
            }
            return null;
        } else if (mo102779e(lVar6) && mo102781j(h, lVar5) + mo102781j(h2, lVar5) <= mo102781j(h, lVar6) + mo102781j(h2, lVar6)) {
            return lVar6;
        } else {
            return lVar5;
        }
    }

    /* renamed from: b */
    public C34717f mo102776b() throws NotFoundException {
        int i;
        int i2;
        C34762l[] d = mo102778d(mo102777c(this.f84169b.mo102703c()));
        C34762l a = mo102775a(d);
        d[3] = a;
        if (a != null) {
            C34762l[] i3 = mo102780i(d);
            C34762l lVar = i3[0];
            C34762l lVar2 = i3[1];
            C34762l lVar3 = i3[2];
            C34762l lVar4 = i3[3];
            int j = mo102781j(lVar, lVar4) + 1;
            int j2 = mo102781j(lVar3, lVar4) + 1;
            if ((j & 1) == 1) {
                j++;
            }
            if ((j2 & 1) == 1) {
                j2++;
            }
            if (j * 4 >= j2 * 7 || j2 * 4 >= j * 7) {
                i2 = j;
                i = j2;
            } else {
                i2 = Math.max(j, j2);
                i = i2;
            }
            return new C34717f(m141750g(this.f84168a, lVar, lVar2, lVar3, lVar4, i2, i), new C34762l[]{lVar, lVar2, lVar3, lVar4});
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: c */
    public final C34762l[] mo102777c(C34762l[] lVarArr) {
        C34762l lVar = lVarArr[0];
        C34762l lVar2 = lVarArr[1];
        C34762l lVar3 = lVarArr[3];
        C34762l lVar4 = lVarArr[2];
        int j = mo102781j(lVar, lVar2);
        int j2 = mo102781j(lVar2, lVar3);
        int j3 = mo102781j(lVar3, lVar4);
        int j4 = mo102781j(lVar4, lVar);
        C34762l[] lVarArr2 = {lVar4, lVar, lVar2, lVar3};
        if (j > j2) {
            lVarArr2[0] = lVar;
            lVarArr2[1] = lVar2;
            lVarArr2[2] = lVar3;
            lVarArr2[3] = lVar4;
            j = j2;
        }
        if (j > j3) {
            lVarArr2[0] = lVar2;
            lVarArr2[1] = lVar3;
            lVarArr2[2] = lVar4;
            lVarArr2[3] = lVar;
        } else {
            j3 = j;
        }
        if (j3 > j4) {
            lVarArr2[0] = lVar3;
            lVarArr2[1] = lVar4;
            lVarArr2[2] = lVar;
            lVarArr2[3] = lVar2;
        }
        return lVarArr2;
    }

    /* renamed from: d */
    public final C34762l[] mo102778d(C34762l[] lVarArr) {
        C34762l lVar = lVarArr[0];
        C34762l lVar2 = lVarArr[1];
        C34762l lVar3 = lVarArr[2];
        C34762l lVar4 = lVarArr[3];
        int j = (mo102781j(lVar, lVar4) + 1) << 2;
        if (mo102781j(m141751h(lVar2, lVar3, j), lVar) < mo102781j(m141751h(lVar3, lVar2, j), lVar4)) {
            lVarArr[0] = lVar;
            lVarArr[1] = lVar2;
            lVarArr[2] = lVar3;
            lVarArr[3] = lVar4;
        } else {
            lVarArr[0] = lVar2;
            lVarArr[1] = lVar3;
            lVarArr[2] = lVar4;
            lVarArr[3] = lVar;
        }
        return lVarArr;
    }

    /* renamed from: e */
    public final boolean mo102779e(C34762l lVar) {
        return lVar.mo102883c() >= 0.0f && lVar.mo102883c() < ((float) this.f84168a.mo102674o()) && lVar.mo102884d() > 0.0f && lVar.mo102884d() < ((float) this.f84168a.mo102670k());
    }

    /* renamed from: i */
    public final C34762l[] mo102780i(C34762l[] lVarArr) {
        C34762l lVar = lVarArr[0];
        C34762l lVar2 = lVarArr[1];
        C34762l lVar3 = lVarArr[2];
        C34762l lVar4 = lVarArr[3];
        C34762l h = m141751h(lVar, lVar2, (mo102781j(lVar3, lVar4) + 1) << 2);
        C34762l h2 = m141751h(lVar3, lVar2, (mo102781j(lVar, lVar4) + 1) << 2);
        int j = mo102781j(h, lVar4) + 1;
        int j2 = mo102781j(h2, lVar4) + 1;
        if ((j & 1) == 1) {
            j++;
        }
        if ((j2 & 1) == 1) {
            j2++;
        }
        float c = (((lVar.mo102883c() + lVar2.mo102883c()) + lVar3.mo102883c()) + lVar4.mo102883c()) / 4.0f;
        float d = (((lVar.mo102884d() + lVar2.mo102884d()) + lVar3.mo102884d()) + lVar4.mo102884d()) / 4.0f;
        C34762l f = m141749f(lVar, c, d);
        C34762l f2 = m141749f(lVar2, c, d);
        C34762l f3 = m141749f(lVar3, c, d);
        C34762l f4 = m141749f(lVar4, c, d);
        int i = j2 << 2;
        int i2 = j << 2;
        return new C34762l[]{m141751h(m141751h(f, f2, i), f4, i2), m141751h(m141751h(f2, f, i), f3, i2), m141751h(m141751h(f3, f4, i), f2, i2), m141751h(m141751h(f4, f3, i), f, i2)};
    }

    /* renamed from: j */
    public final int mo102781j(C34762l lVar, C34762l lVar2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int c = (int) lVar.mo102883c();
        int d = (int) lVar.mo102884d();
        int c2 = (int) lVar2.mo102883c();
        int d2 = (int) lVar2.mo102884d();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(d2 - d) > Math.abs(c2 - c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i8 = d;
            d = c;
            c = i8;
            int i9 = d2;
            d2 = c2;
            c2 = i9;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i10 = (-abs) / 2;
        if (d < d2) {
            i = 1;
        } else {
            i = -1;
        }
        if (c >= c2) {
            i7 = -1;
        }
        C34710b bVar = this.f84168a;
        if (z) {
            i2 = d;
        } else {
            i2 = c;
        }
        if (z) {
            i3 = c;
        } else {
            i3 = d;
        }
        boolean h = bVar.mo102666h(i2, i3);
        while (c != c2) {
            C34710b bVar2 = this.f84168a;
            if (z) {
                i4 = d;
            } else {
                i4 = c;
            }
            if (z) {
                i5 = c;
            } else {
                i5 = d;
            }
            boolean h2 = bVar2.mo102666h(i4, i5);
            if (h2 != h) {
                i6++;
                h = h2;
            }
            i10 += abs2;
            if (i10 > 0) {
                if (d == d2) {
                    break;
                }
                d += i;
                i10 -= abs;
            }
            c += i7;
        }
        return i6;
    }
}
