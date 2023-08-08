package com.google.zxing.oned.rss;

import com.contentsquare.android.api.C14092c;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.C34763m;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import com.google.zxing.common.detector.C34713a;
import com.google.zxing.oned.C34792q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.oned.rss.e */
public final class C34798e extends C34794a {

    /* renamed from: m */
    public static final int[] f84431m = {1, 10, 34, 70, 126};

    /* renamed from: n */
    public static final int[] f84432n = {4, 20, 48, 81};

    /* renamed from: o */
    public static final int[] f84433o = {0, 161, C14092c.f34677y2, 2015, 2715};

    /* renamed from: p */
    public static final int[] f84434p = {0, 336, 1036, 1516};

    /* renamed from: q */
    public static final int[] f84435q = {8, 6, 4, 3, 1};

    /* renamed from: r */
    public static final int[] f84436r = {2, 4, 6, 8};

    /* renamed from: s */
    public static final int[][] f84437s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: k */
    public final List<C34797d> f84438k = new ArrayList();

    /* renamed from: l */
    public final List<C34797d> f84439l = new ArrayList();

    /* renamed from: s */
    public static void m142068s(Collection<C34797d> collection, C34797d dVar) {
        boolean z;
        if (dVar != null) {
            Iterator<C34797d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C34797d next = it.next();
                if (next.mo102928b() == dVar.mo102928b()) {
                    next.mo102939e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* renamed from: u */
    public static boolean m142069u(C34797d dVar, C34797d dVar2) {
        int a = (dVar.mo102927a() + (dVar2.mo102927a() * 16)) % 79;
        int c = (dVar.mo102938d().mo102934c() * 9) + dVar2.mo102938d().mo102934c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        if (a == c) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static C34761k m142070v(C34797d dVar, C34797d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo102928b()) * 4537077) + ((long) dVar2.mo102928b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C34762l[] a = dVar.mo102938d().mo102932a();
        C34762l[] a2 = dVar2.mo102938d().mo102932a();
        return new C34761k(sb.toString(), (byte[]) null, new C34762l[]{a[0], a[1], a2[0], a2[1]}, BarcodeFormat.RSS_14);
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        m142068s(this.f84438k, mo102942x(aVar, false, i, map));
        aVar.mo102653v();
        m142068s(this.f84439l, mo102942x(aVar, true, i, map));
        aVar.mo102653v();
        for (C34797d next : this.f84438k) {
            if (next.mo102937c() > 1) {
                for (C34797d next2 : this.f84439l) {
                    if (next2.mo102937c() > 1 && m142069u(next, next2)) {
                        return m142070v(next, next2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.m141229a();
    }

    public void reset() {
        this.f84438k.clear();
        this.f84439l.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102940t(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            r9 = this;
            int[] r0 = r9.mo102925n()
            int r0 = com.google.zxing.common.detector.C34713a.m141633d(r0)
            int[] r1 = r9.mo102923l()
            int r1 = com.google.zxing.common.detector.C34713a.m141633d(r1)
            r2 = 4
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L_0x0029
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r7 = r3
            r6 = r4
            goto L_0x0023
        L_0x001c:
            if (r0 >= r2) goto L_0x0021
            r6 = r3
            r7 = r4
            goto L_0x0023
        L_0x0021:
            r6 = r4
            r7 = r6
        L_0x0023:
            if (r1 <= r5) goto L_0x0026
            goto L_0x003c
        L_0x0026:
            if (r1 >= r2) goto L_0x0044
            goto L_0x0041
        L_0x0029:
            r5 = 11
            if (r0 <= r5) goto L_0x0030
            r7 = r3
            r6 = r4
            goto L_0x0038
        L_0x0030:
            r5 = 5
            if (r0 >= r5) goto L_0x0036
            r6 = r3
            r7 = r4
            goto L_0x0038
        L_0x0036:
            r6 = r4
            r7 = r6
        L_0x0038:
            r5 = 10
            if (r1 <= r5) goto L_0x003f
        L_0x003c:
            r5 = r3
            r2 = r4
            goto L_0x0046
        L_0x003f:
            if (r1 >= r2) goto L_0x0044
        L_0x0041:
            r2 = r3
            r5 = r4
            goto L_0x0046
        L_0x0044:
            r2 = r4
            r5 = r2
        L_0x0046:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004f
            r10 = r3
            goto L_0x0050
        L_0x004f:
            r10 = r4
        L_0x0050:
            r11 = r1 & 1
            if (r11 != r3) goto L_0x0055
            r4 = r3
        L_0x0055:
            r11 = -1
            if (r8 == r11) goto L_0x008e
            if (r8 == 0) goto L_0x0075
            if (r8 != r3) goto L_0x0070
            if (r10 == 0) goto L_0x0067
            if (r4 != 0) goto L_0x0062
            r7 = r3
            goto L_0x0087
        L_0x0062:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x0067:
            if (r4 == 0) goto L_0x006b
            r5 = r3
            goto L_0x0087
        L_0x006b:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x0070:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x0075:
            if (r10 == 0) goto L_0x0085
            if (r4 == 0) goto L_0x0080
            if (r0 >= r1) goto L_0x007d
            r5 = r3
            goto L_0x009c
        L_0x007d:
            r2 = r3
            r7 = r2
            goto L_0x0087
        L_0x0080:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x0085:
            if (r4 != 0) goto L_0x0089
        L_0x0087:
            r3 = r6
            goto L_0x009c
        L_0x0089:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x008e:
            if (r10 == 0) goto L_0x0098
            if (r4 != 0) goto L_0x0093
            goto L_0x009c
        L_0x0093:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x0098:
            if (r4 == 0) goto L_0x00e1
            r2 = r3
            goto L_0x0087
        L_0x009c:
            if (r3 == 0) goto L_0x00b1
            if (r7 != 0) goto L_0x00ac
            int[] r10 = r9.mo102925n()
            float[] r11 = r9.mo102926o()
            com.google.zxing.oned.rss.C34794a.m142051p(r10, r11)
            goto L_0x00b1
        L_0x00ac:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x00b1:
            if (r7 == 0) goto L_0x00be
            int[] r10 = r9.mo102925n()
            float[] r11 = r9.mo102926o()
            com.google.zxing.oned.rss.C34794a.m142050i(r10, r11)
        L_0x00be:
            if (r2 == 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00ce
            int[] r10 = r9.mo102923l()
            float[] r11 = r9.mo102926o()
            com.google.zxing.oned.rss.C34794a.m142051p(r10, r11)
            goto L_0x00d3
        L_0x00ce:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        L_0x00d3:
            if (r5 == 0) goto L_0x00e0
            int[] r10 = r9.mo102923l()
            float[] r11 = r9.mo102924m()
            com.google.zxing.oned.rss.C34794a.m142050i(r10, r11)
        L_0x00e0:
            return
        L_0x00e1:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m141229a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.C34798e.mo102940t(boolean, int):void");
    }

    /* renamed from: w */
    public final C34795b mo102941w(C34709a aVar, C34796c cVar, boolean z) throws NotFoundException {
        int i;
        int[] j = mo102921j();
        for (int i2 = 0; i2 < j.length; i2++) {
            j[i2] = 0;
        }
        if (z) {
            C34792q.m142037g(aVar, cVar.mo102933b()[0], j);
        } else {
            C34792q.m142036f(aVar, cVar.mo102933b()[1] + 1, j);
            int i3 = 0;
            for (int length = j.length - 1; i3 < length; length--) {
                int i4 = j[i3];
                j[i3] = j[length];
                j[length] = i4;
                i3++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float d = ((float) C34713a.m141633d(j)) / ((float) i);
        int[] n = mo102925n();
        int[] l = mo102923l();
        float[] o = mo102926o();
        float[] m = mo102924m();
        for (int i5 = 0; i5 < j.length; i5++) {
            float f = ((float) j[i5]) / d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                n[i7] = i6;
                o[i7] = f - ((float) i6);
            } else {
                l[i7] = i6;
                m[i7] = f - ((float) i6);
            }
        }
        mo102940t(z, i);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = n.length - 1; length2 >= 0; length2--) {
            int i10 = n[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = l.length - 1; length3 >= 0; length3--) {
            int i13 = l[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (z) {
            if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
                throw NotFoundException.m141229a();
            }
            int i15 = (12 - i9) / 2;
            int i16 = f84435q[i15];
            int i17 = 9 - i16;
            return new C34795b((C34821f.m142170b(n, i16, false) * f84431m[i15]) + C34821f.m142170b(l, i17, true) + f84433o[i15], i14);
        } else if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
            throw NotFoundException.m141229a();
        } else {
            int i18 = (10 - i12) / 2;
            int i19 = f84436r[i18];
            return new C34795b((C34821f.m142170b(l, 9 - i19, false) * f84432n[i18]) + C34821f.m142170b(n, i19, true) + f84434p[i18], i14);
        }
    }

    /* renamed from: x */
    public final C34797d mo102942x(C34709a aVar, boolean z, int i, Map<DecodeHintType, ?> map) {
        C34763m mVar;
        try {
            int[] y = mo102943y(aVar, z);
            C34796c z2 = mo102944z(aVar, i, z, y);
            if (map == null) {
                mVar = null;
            } else {
                mVar = (C34763m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            }
            if (mVar != null) {
                float f = ((float) (y[0] + y[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo102649o() - 1)) - f;
                }
                mVar.mo102888a(new C34762l(f, (float) i));
            }
            C34795b w = mo102941w(aVar, z2, true);
            C34795b w2 = mo102941w(aVar, z2, false);
            return new C34797d((w.mo102928b() * 1597) + w2.mo102928b(), w.mo102927a() + (w2.mo102927a() * 4), z2);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: y */
    public final int[] mo102943y(C34709a aVar, boolean z) throws NotFoundException {
        int[] k = mo102922k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int o = aVar.mo102649o();
        int i = 0;
        boolean z2 = false;
        while (i < o) {
            z2 = !aVar.mo102645k(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < o) {
            if (aVar.mo102645k(i) != z2) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 != 3) {
                    i2++;
                } else if (C34794a.m142052q(k)) {
                    return new int[]{i3, i};
                } else {
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                }
                k[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: z */
    public final C34796c mo102944z(C34709a aVar, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        int i3;
        boolean k = aVar.mo102645k(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && k != aVar.mo102645k(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] k2 = mo102922k();
        System.arraycopy(k2, 0, k2, 1, k2.length - 1);
        k2[0] = iArr[0] - i5;
        int r = C34794a.m142053r(k2, f84437s);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo102649o() - 1) - i6;
            i3 = (aVar.mo102649o() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C34796c(r, new int[]{i5, iArr[1]}, i3, i2, i);
    }
}
