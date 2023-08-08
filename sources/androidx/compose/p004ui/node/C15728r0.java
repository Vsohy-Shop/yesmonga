package androidx.compose.p004ui.node;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.r0 */
public final class C15728r0 {
    /* renamed from: b */
    public static final void m70505b(int i, int i2, C15722p pVar, C15687g gVar) {
        while (pVar.mo45172b()) {
            int d = pVar.mo45174d();
            int d2 = pVar.mo45174d();
            int d3 = pVar.mo45174d();
            while (i > d3) {
                i--;
                gVar.remove(i);
            }
            while (i2 > d2) {
                i2--;
                gVar.mo45008c(i, i2);
            }
            while (true) {
                int i3 = d - 1;
                if (d > 0) {
                    i--;
                    i2--;
                    gVar.mo45007b(i, i2);
                    d = i3;
                }
            }
        }
        while (i > 0) {
            i--;
            gVar.remove(i);
        }
        while (i2 > 0) {
            i2--;
            gVar.mo45008c(i, i2);
        }
    }

    /* renamed from: c */
    public static final boolean m70506c(int i, int i2, int i3, int i4, C15687g gVar, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        int[] iArr4 = iArr2;
        int i12 = i5;
        int i13 = (i2 - i10) - (i4 - i11);
        if (i13 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && C15673c.m70142e(iArr4, i15 + 1) < C15673c.m70142e(iArr4, i15 - 1))) {
                i7 = C15673c.m70142e(iArr4, i15 + 1);
                i6 = i7;
            } else {
                i7 = C15673c.m70142e(iArr4, i15 - 1);
                i6 = i7 - 1;
            }
            int i16 = i4 - ((i2 - i6) - i15);
            if (i12 == 0 || i6 != i7) {
                i8 = i16;
            } else {
                i8 = i16 + 1;
            }
            while (true) {
                if (i6 > i10 && i16 > i11) {
                    if (!gVar.mo45006a(i6 - 1, i16 - 1)) {
                        break;
                    }
                    i6--;
                    i16--;
                } else {
                    C15687g gVar2 = gVar;
                }
            }
            C15687g gVar22 = gVar;
            C15673c.m70145h(iArr4, i15, i6);
            if (!z || (i9 = i13 - i15) < i14 || i9 > i12) {
                int[] iArr5 = iArr;
            } else if (C15673c.m70142e(iArr, i9) >= i6) {
                m70509f(i6, i16, i7, i8, true, iArr3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final C15722p m70507d(int i, int i2, C15687g gVar) {
        int i3 = i;
        int i4 = i2;
        int i5 = ((i3 + i4) + 1) / 2;
        C15722p pVar = new C15722p(i5 * 3);
        C15722p pVar2 = new C15722p(i5 * 4);
        pVar2.mo45176f(0, i3, 0, i4);
        int i6 = (i5 * 2) + 1;
        int[] b = C15673c.m70139b(new int[i6]);
        int[] b2 = C15673c.m70139b(new int[i6]);
        int[] c = C15711m1.m70416c(new int[5]);
        while (pVar2.mo45172b()) {
            int d = pVar2.mo45174d();
            int d2 = pVar2.mo45174d();
            int d3 = pVar2.mo45174d();
            int d4 = pVar2.mo45174d();
            int i7 = d4;
            int i8 = d3;
            int[] iArr = b;
            int[] iArr2 = b;
            int i9 = d2;
            int[] iArr3 = b2;
            int[] iArr4 = b2;
            int i10 = d;
            if (m70511h(d4, d3, d2, d, gVar, iArr, iArr3, c)) {
                if (C15711m1.m70419g(c) > 0) {
                    C15711m1.m70414a(c, pVar);
                }
                pVar2.mo45176f(i7, C15711m1.m70424l(c), i9, C15711m1.m70425m(c));
                pVar2.mo45176f(C15711m1.m70420h(c), i8, C15711m1.m70421i(c), i10);
            }
            int i11 = i;
            b = iArr2;
            b2 = iArr4;
        }
        pVar.mo45178h();
        pVar.mo45175e(i, i4, 0);
        return pVar;
    }

    /* renamed from: e */
    public static final void m70508e(int i, int i2, @C12579k C15687g gVar) {
        Intrinsics.checkNotNullParameter(gVar, C10108c.f27778C);
        m70505b(i, i2, m70507d(i, i2, gVar), gVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, int[]] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m70509f(int r1, int r2, int r3, int r4, boolean r5, @org.jetbrains.annotations.C12579k int[] r6) {
        /*
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r6[r0] = r1
            r1 = 1
            r6[r1] = r2
            r1 = 2
            r6[r1] = r3
            r1 = 3
            r6[r1] = r4
            r1 = 4
            r6[r1] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.C15728r0.m70509f(int, int, int, int, boolean, int[]):void");
    }

    /* renamed from: g */
    public static final boolean m70510g(int i, int i2, int i3, int i4, C15687g gVar, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i4;
        int[] iArr4 = iArr;
        int i12 = i5;
        int i13 = (i10 - i) - (i11 - i3);
        if (Math.abs(i13) % 2 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && C15673c.m70142e(iArr4, i15 + 1) > C15673c.m70142e(iArr4, i15 - 1))) {
                i7 = C15673c.m70142e(iArr4, i15 + 1);
                i6 = i7;
            } else {
                i7 = C15673c.m70142e(iArr4, i15 - 1);
                i6 = i7 + 1;
            }
            int i16 = (i3 + (i6 - i)) - i15;
            if (i12 == 0 || i6 != i7) {
                i8 = i16;
            } else {
                i8 = i16 - 1;
            }
            while (true) {
                if (i6 < i10 && i16 < i11) {
                    if (!gVar.mo45006a(i6, i16)) {
                        break;
                    }
                    i6++;
                    i16++;
                } else {
                    C15687g gVar2 = gVar;
                }
            }
            C15687g gVar22 = gVar;
            C15673c.m70145h(iArr4, i15, i6);
            if (!z || (i9 = i13 - i15) < i14 + 1 || i9 > i12 - 1) {
                int[] iArr5 = iArr2;
            } else if (C15673c.m70142e(iArr2, i9) <= i6) {
                m70509f(i7, i8, i6, i16, false, iArr3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m70511h(int i, int i2, int i3, int i4, C15687g gVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i;
        int i6 = i2;
        int i7 = i6 - i5;
        int i8 = i4 - i3;
        if (i7 >= 1 && i8 >= 1) {
            int i9 = ((i7 + i8) + 1) / 2;
            C15673c.m70145h(iArr, 1, i5);
            C15673c.m70145h(iArr2, 1, i6);
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10;
                if (m70510g(i, i2, i3, i4, gVar, iArr, iArr2, i10, iArr3) || m70506c(i, i2, i3, i4, gVar, iArr, iArr2, i11, iArr3)) {
                    return true;
                }
                i10 = i11 + 1;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final void m70512i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
