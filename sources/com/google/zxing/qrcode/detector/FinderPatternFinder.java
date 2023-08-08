package com.google.zxing.qrcode.detector;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.C34762l;
import com.google.zxing.C34763m;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FinderPatternFinder {

    /* renamed from: f */
    public static final int f84752f = 2;

    /* renamed from: g */
    public static final EstimatedModuleComparator f84753g = new EstimatedModuleComparator();

    /* renamed from: h */
    public static final int f84754h = 3;

    /* renamed from: i */
    public static final int f84755i = 97;

    /* renamed from: a */
    public final C34710b f84756a;

    /* renamed from: b */
    public final List<C34880d> f84757b;

    /* renamed from: c */
    public boolean f84758c;

    /* renamed from: d */
    public final int[] f84759d;

    /* renamed from: e */
    public final C34763m f84760e;

    public static final class EstimatedModuleComparator implements Serializable, Comparator<C34880d> {
        private EstimatedModuleComparator() {
        }

        /* renamed from: a */
        public int compare(C34880d dVar, C34880d dVar2) {
            return Float.compare(dVar.mo103228i(), dVar2.mo103228i());
        }
    }

    public FinderPatternFinder(C34710b bVar) {
        this(bVar, (C34763m) null);
    }

    /* renamed from: a */
    public static float m142487a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: h */
    public static boolean m142488h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m142489i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static double m142490r(C34880d dVar, C34880d dVar2) {
        double c = (double) (dVar.mo102883c() - dVar2.mo102883c());
        double d = (double) (dVar.mo102884d() - dVar2.mo102884d());
        return (c * c) + (d * d);
    }

    /* renamed from: b */
    public final void mo103193b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* renamed from: c */
    public final boolean mo103194c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = mo103199j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f84756a.mo102666h(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f84756a.mo102666h(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f84756a.mo102666h(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int k = this.f84756a.mo102670k();
        int o = this.f84756a.mo102674o();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 < k && (i5 = i2 + i7) < o && this.f84756a.mo102666h(i5, i8)) {
                j[2] = j[2] + 1;
                i7++;
            }
        }
        while (true) {
            int i9 = i + i7;
            if (i9 < k && (i4 = i2 + i7) < o && !this.f84756a.mo102666h(i4, i9)) {
                j[3] = j[3] + 1;
                i7++;
            }
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 < k && (i3 = i2 + i7) < o && this.f84756a.mo102666h(i3, i10)) {
                j[4] = j[4] + 1;
                i7++;
            }
        }
        if (j[4] == 0) {
            return false;
        }
        return m142489i(j);
    }

    /* renamed from: d */
    public final float mo103195d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        C34710b bVar = this.f84756a;
        int o = bVar.mo102674o();
        int[] j = mo103199j();
        int i8 = i;
        while (i8 >= 0 && bVar.mo102666h(i8, i2)) {
            j[2] = j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !bVar.mo102666h(i8, i2)) {
            int i9 = j[1];
            if (i9 > i3) {
                break;
            }
            j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && j[1] <= i3) {
            while (i8 >= 0 && bVar.mo102666h(i8, i2) && (i7 = j[0]) <= i3) {
                j[0] = i7 + 1;
                i8--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < o && bVar.mo102666h(i10, i2)) {
                j[2] = j[2] + 1;
                i10++;
            }
            if (i10 == o) {
                return Float.NaN;
            }
            while (i10 < o && !bVar.mo102666h(i10, i2) && (i6 = j[3]) < i3) {
                j[3] = i6 + 1;
                i10++;
            }
            if (i10 != o && j[3] < i3) {
                while (i10 < o && bVar.mo102666h(i10, i2) && (i5 = j[4]) < i3) {
                    j[4] = i5 + 1;
                    i10++;
                }
                int i11 = j[4];
                if (i11 < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + i11) - i4) * 5 < i4 && m142488h(j)) {
                    return m142487a(j, i10);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: e */
    public final float mo103196e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        C34710b bVar = this.f84756a;
        int k = bVar.mo102670k();
        int[] j = mo103199j();
        int i8 = i;
        while (i8 >= 0 && bVar.mo102666h(i2, i8)) {
            j[2] = j[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !bVar.mo102666h(i2, i8)) {
            int i9 = j[1];
            if (i9 > i3) {
                break;
            }
            j[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && j[1] <= i3) {
            while (i8 >= 0 && bVar.mo102666h(i2, i8) && (i7 = j[0]) <= i3) {
                j[0] = i7 + 1;
                i8--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < k && bVar.mo102666h(i2, i10)) {
                j[2] = j[2] + 1;
                i10++;
            }
            if (i10 == k) {
                return Float.NaN;
            }
            while (i10 < k && !bVar.mo102666h(i2, i10) && (i6 = j[3]) < i3) {
                j[3] = i6 + 1;
                i10++;
            }
            if (i10 != k && j[3] < i3) {
                while (i10 < k && bVar.mo102666h(i2, i10) && (i5 = j[4]) < i3) {
                    j[4] = i5 + 1;
                    i10++;
                }
                int i11 = j[4];
                if (i11 < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + i11) - i4) * 5 < i4 * 2 && m142488h(j)) {
                    return m142487a(j, i10);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: f */
    public final C34881e mo103197f(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z;
        if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        int k = this.f84756a.mo102670k();
        int o = this.f84756a.mo102674o();
        int i = (k * 3) / C14092c.f34503B0;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < k && !z2) {
            mo103193b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < o) {
                if (this.f84756a.mo102666h(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m142488h(iArr)) {
                        mo103206q(iArr);
                    } else if (mo103202m(iArr, i2, i3)) {
                        if (this.f84758c) {
                            z2 = mo103204o();
                        } else {
                            int g = mo103198g();
                            int i5 = iArr[2];
                            if (g > i5) {
                                i2 += (g - i5) - 2;
                                i3 = o - 1;
                            }
                        }
                        mo103193b(iArr);
                        i = 2;
                        i4 = 0;
                    } else {
                        mo103206q(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m142488h(iArr) && mo103202m(iArr, i2, o)) {
                i = iArr[0];
                if (this.f84758c) {
                    z2 = mo103204o();
                }
            }
            i2 += i;
        }
        C34880d[] p = mo103205p();
        C34762l.m141933e(p);
        return new C34881e(p);
    }

    /* renamed from: g */
    public final int mo103198g() {
        if (this.f84757b.size() <= 1) {
            return 0;
        }
        C34880d dVar = null;
        for (C34880d next : this.f84757b) {
            if (next.mo103227h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f84758c = true;
                    return ((int) (Math.abs(dVar.mo102883c() - next.mo102883c()) - Math.abs(dVar.mo102884d() - next.mo102884d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: j */
    public final int[] mo103199j() {
        mo103193b(this.f84759d);
        return this.f84759d;
    }

    /* renamed from: k */
    public final C34710b mo103200k() {
        return this.f84756a;
    }

    /* renamed from: l */
    public final List<C34880d> mo103201l() {
        return this.f84757b;
    }

    /* renamed from: m */
    public final boolean mo103202m(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m142487a(iArr, i2);
        float e = mo103196e(i, a, iArr[2], i3);
        if (!Float.isNaN(e)) {
            int i4 = (int) e;
            float d = mo103195d(a, i4, iArr[2], i3);
            if (!Float.isNaN(d) && mo103194c(i4, (int) d)) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f84757b.size()) {
                        break;
                    }
                    C34880d dVar = this.f84757b.get(i5);
                    if (dVar.mo103225f(f, e, d)) {
                        this.f84757b.set(i5, dVar.mo103226g(e, d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C34880d dVar2 = new C34880d(d, e, f);
                    this.f84757b.add(dVar2);
                    C34763m mVar = this.f84760e;
                    if (mVar != null) {
                        mVar.mo102888a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: n */
    public final boolean mo103203n(int[] iArr, int i, int i2, boolean z) {
        return mo103202m(iArr, i, i2);
    }

    /* renamed from: o */
    public final boolean mo103204o() {
        int size = this.f84757b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C34880d next : this.f84757b) {
            if (next.mo103227h() >= 2) {
                i++;
                f2 += next.mo103228i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C34880d i2 : this.f84757b) {
            f += Math.abs(i2.mo103228i() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final C34880d[] mo103205p() throws NotFoundException {
        if (this.f84757b.size() >= 3) {
            this.f84757b.sort(f84753g);
            double[] dArr = new double[3];
            C34880d[] dVarArr = new C34880d[3];
            int i = 0;
            double d = Double.MAX_VALUE;
            while (i < this.f84757b.size() - 2) {
                C34880d dVar = this.f84757b.get(i);
                float i2 = dVar.mo103228i();
                i++;
                int i3 = i;
                while (i3 < this.f84757b.size() - 1) {
                    C34880d dVar2 = this.f84757b.get(i3);
                    double r = m142490r(dVar, dVar2);
                    i3++;
                    for (int i4 = i3; i4 < this.f84757b.size(); i4++) {
                        C34880d dVar3 = this.f84757b.get(i4);
                        if (dVar3.mo103228i() <= 1.4f * i2) {
                            dArr[0] = r;
                            dArr[1] = m142490r(dVar2, dVar3);
                            dArr[2] = m142490r(dVar, dVar3);
                            Arrays.sort(dArr);
                            double abs = Math.abs(dArr[2] - (dArr[1] * 2.0d)) + Math.abs(dArr[2] - (dArr[0] * 2.0d));
                            if (abs < d) {
                                dVarArr[0] = dVar;
                                dVarArr[1] = dVar2;
                                dVarArr[2] = dVar3;
                                d = abs;
                            }
                        }
                    }
                }
            }
            if (d != Double.MAX_VALUE) {
                return dVarArr;
            }
            throw NotFoundException.m141229a();
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: q */
    public final void mo103206q(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public FinderPatternFinder(C34710b bVar, C34763m mVar) {
        this.f84756a = bVar;
        this.f84757b = new ArrayList();
        this.f84759d = new int[5];
        this.f84760e = mVar;
    }
}
