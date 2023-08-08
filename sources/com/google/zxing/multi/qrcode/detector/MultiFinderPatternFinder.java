package com.google.zxing.multi.qrcode.detector;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.C34762l;
import com.google.zxing.C34763m;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import com.google.zxing.qrcode.detector.C34880d;
import com.google.zxing.qrcode.detector.C34881e;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class MultiFinderPatternFinder extends FinderPatternFinder {

    /* renamed from: j */
    public static final C34881e[] f84314j = new C34881e[0];

    /* renamed from: k */
    public static final C34880d[] f84315k = new C34880d[0];

    /* renamed from: l */
    public static final C34880d[][] f84316l = new C34880d[0][];

    /* renamed from: m */
    public static final float f84317m = 180.0f;

    /* renamed from: n */
    public static final float f84318n = 9.0f;

    /* renamed from: o */
    public static final float f84319o = 0.05f;

    /* renamed from: p */
    public static final float f84320p = 0.5f;

    public static final class ModuleSizeComparator implements Serializable, Comparator<C34880d> {
        private ModuleSizeComparator() {
        }

        /* renamed from: a */
        public int compare(C34880d dVar, C34880d dVar2) {
            double i = (double) (dVar2.mo103228i() - dVar.mo103228i());
            if (i < 0.0d) {
                return -1;
            }
            return i > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(C34710b bVar, C34763m mVar) {
        super(bVar, mVar);
    }

    /* renamed from: s */
    public C34881e[] mo102898s(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z;
        if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        C34710b k = mo103200k();
        int k2 = k.mo102670k();
        int o = k.mo102674o();
        int i = (k2 * 3) / C14092c.f34503B0;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < k2; i2 += i) {
            mo103193b(iArr);
            int i3 = 0;
            for (int i4 = 0; i4 < o; i4++) {
                if (k.mo102666h(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else if (i3 != 4) {
                    i3++;
                    iArr[i3] = iArr[i3] + 1;
                } else if (!FinderPatternFinder.m142488h(iArr) || !mo103202m(iArr, i2, i4)) {
                    mo103206q(iArr);
                    i3 = 3;
                } else {
                    mo103193b(iArr);
                    i3 = 0;
                }
            }
            if (FinderPatternFinder.m142488h(iArr)) {
                mo103202m(iArr, i2, o);
            }
        }
        C34880d[][] t = mo102899t();
        ArrayList arrayList = new ArrayList();
        for (C34880d[] dVarArr : t) {
            C34762l.m141933e(dVarArr);
            arrayList.add(new C34881e(dVarArr));
        }
        if (arrayList.isEmpty()) {
            return f84314j;
        }
        return (C34881e[]) arrayList.toArray(f84314j);
    }

    /* renamed from: t */
    public final C34880d[][] mo102899t() throws NotFoundException {
        List<C34880d> l = mo103201l();
        int size = l.size();
        int i = 3;
        if (size >= 3) {
            char c = 0;
            if (size == 3) {
                return new C34880d[][]{(C34880d[]) l.toArray(f84315k)};
            }
            Collections.sort(l, new ModuleSizeComparator());
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < size - 2) {
                C34880d dVar = l.get(i2);
                if (dVar != null) {
                    int i3 = i2 + 1;
                    while (i3 < size - 1) {
                        C34880d dVar2 = l.get(i3);
                        if (dVar2 != null) {
                            float i4 = (dVar.mo103228i() - dVar2.mo103228i()) / Math.min(dVar.mo103228i(), dVar2.mo103228i());
                            float f = 0.5f;
                            float f2 = 0.05f;
                            if (Math.abs(dVar.mo103228i() - dVar2.mo103228i()) > 0.5f && i4 >= 0.05f) {
                                break;
                            }
                            int i5 = i3 + 1;
                            while (i5 < size) {
                                C34880d dVar3 = l.get(i5);
                                if (dVar3 != null) {
                                    float i6 = (dVar2.mo103228i() - dVar3.mo103228i()) / Math.min(dVar2.mo103228i(), dVar3.mo103228i());
                                    if (Math.abs(dVar2.mo103228i() - dVar3.mo103228i()) > f && i6 >= f2) {
                                        break;
                                    }
                                    C34880d[] dVarArr = new C34880d[i];
                                    dVarArr[c] = dVar;
                                    dVarArr[1] = dVar2;
                                    dVarArr[2] = dVar3;
                                    C34762l.m141933e(dVarArr);
                                    C34881e eVar = new C34881e(dVarArr);
                                    float b = C34762l.m141932b(eVar.mo103230b(), eVar.mo103229a());
                                    float b2 = C34762l.m141932b(eVar.mo103231c(), eVar.mo103229a());
                                    float b3 = C34762l.m141932b(eVar.mo103230b(), eVar.mo103231c());
                                    float i7 = (b + b3) / (dVar.mo103228i() * 2.0f);
                                    if (i7 <= 180.0f && i7 >= 9.0f && Math.abs((b - b3) / Math.min(b, b3)) < 0.1f) {
                                        double d = (double) b;
                                        double d2 = (double) b3;
                                        float sqrt = (float) Math.sqrt((d * d) + (d2 * d2));
                                        if (Math.abs((b2 - sqrt) / Math.min(b2, sqrt)) < 0.1f) {
                                            arrayList.add(dVarArr);
                                        }
                                    }
                                }
                                i5++;
                                i = 3;
                                c = 0;
                                f = 0.5f;
                                f2 = 0.05f;
                            }
                        }
                        i3++;
                        i = 3;
                        c = 0;
                    }
                }
                i2++;
                i = 3;
                c = 0;
            }
            if (!arrayList.isEmpty()) {
                return (C34880d[][]) arrayList.toArray(f84316l);
            }
            throw NotFoundException.m141229a();
        }
        throw NotFoundException.m141229a();
    }
}
