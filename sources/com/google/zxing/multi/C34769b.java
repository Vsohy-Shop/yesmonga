package com.google.zxing.multi;

import com.google.zxing.C34644b;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.multi.b */
public final class C34769b implements C34770c {

    /* renamed from: b */
    public static final int f84308b = 100;

    /* renamed from: c */
    public static final int f84309c = 4;

    /* renamed from: d */
    public static final C34761k[] f84310d = new C34761k[0];

    /* renamed from: a */
    public final C34760j f84311a;

    public C34769b(C34760j jVar) {
        this.f84311a = jVar;
    }

    /* renamed from: c */
    public static C34761k m141956c(C34761k kVar, int i, int i2) {
        C34762l[] f = kVar.mo102877f();
        if (f == null) {
            return kVar;
        }
        C34762l[] lVarArr = new C34762l[f.length];
        for (int i3 = 0; i3 < f.length; i3++) {
            C34762l lVar = f[i3];
            if (lVar != null) {
                lVarArr[i3] = new C34762l(lVar.mo102883c() + ((float) i), lVar.mo102884d() + ((float) i2));
            }
        }
        C34761k kVar2 = new C34761k(kVar.mo102878g(), kVar.mo102875d(), kVar.mo102874c(), lVarArr, kVar.mo102873b(), kVar.mo102879h());
        kVar2.mo102880i(kVar.mo102876e());
        return kVar2;
    }

    /* renamed from: a */
    public final void mo102893a(C34644b bVar, Map<DecodeHintType, ?> map, List<C34761k> list, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        int i7;
        C34644b bVar2 = bVar;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        if (i10 <= 4) {
            try {
                C34761k a = this.f84311a.mo102419a(bVar2, map);
                Iterator<C34761k> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo102878g().equals(a.mo102878g())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(m141956c(a, i8, i9));
                } else {
                    List<C34761k> list2 = list;
                }
                C34762l[] f3 = a.mo102877f();
                if (f3 != null && f3.length != 0) {
                    int e = bVar.mo102481e();
                    int d = bVar.mo102480d();
                    float f4 = (float) e;
                    float f5 = 0.0f;
                    float f6 = (float) d;
                    float f7 = 0.0f;
                    for (C34762l lVar : f3) {
                        if (lVar != null) {
                            float c = lVar.mo102883c();
                            float d2 = lVar.mo102884d();
                            if (c < f4) {
                                f4 = c;
                            }
                            if (d2 < f6) {
                                f6 = d2;
                            }
                            if (c > f7) {
                                f7 = c;
                            }
                            if (d2 > f5) {
                                f5 = d2;
                            }
                        }
                    }
                    if (f4 > 100.0f) {
                        f = f7;
                        f2 = f6;
                        i5 = d;
                        i4 = e;
                        mo102893a(bVar2.mo102477a(0, 0, (int) f4, d), map, list, i, i2, i10 + 1);
                    } else {
                        f = f7;
                        f2 = f6;
                        i5 = d;
                        i4 = e;
                    }
                    if (f2 > 100.0f) {
                        int i11 = (int) f2;
                        i6 = i4;
                        mo102893a(bVar2.mo102477a(0, 0, i6, i11), map, list, i, i2, i10 + 1);
                    } else {
                        i6 = i4;
                    }
                    float f8 = f;
                    if (f8 < ((float) (i6 - 100))) {
                        int i12 = (int) f8;
                        i7 = i5;
                        mo102893a(bVar2.mo102477a(i12, 0, i6 - i12, i7), map, list, i8 + i12, i2, i10 + 1);
                    } else {
                        i7 = i5;
                    }
                    if (f5 < ((float) (i7 - 100))) {
                        int i13 = (int) f5;
                        mo102893a(bVar2.mo102477a(0, i13, i6, i7 - i13), map, list, i, i9 + i13, i10 + 1);
                    }
                }
            } catch (ReaderException unused) {
            }
        }
    }

    /* renamed from: b */
    public C34761k[] mo102894b(C34644b bVar) throws NotFoundException {
        return mo102895d(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: d */
    public C34761k[] mo102895d(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        mo102893a(bVar, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (C34761k[]) arrayList.toArray(f84310d);
        }
        throw NotFoundException.m141229a();
    }
}
