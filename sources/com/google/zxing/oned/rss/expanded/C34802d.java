package com.google.zxing.oned.rss.expanded;

import androidx.compose.runtime.ComposerKt;
import androidx.core.location.C17699g;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.LoyaltyBonusListFragment;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import com.google.zxing.common.detector.C34713a;
import com.google.zxing.oned.C34779d;
import com.google.zxing.oned.C34792q;
import com.google.zxing.oned.rss.C34794a;
import com.google.zxing.oned.rss.C34795b;
import com.google.zxing.oned.rss.C34796c;
import com.google.zxing.oned.rss.C34821f;
import com.google.zxing.oned.rss.expanded.decoders.C34812j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.zxing.oned.rss.expanded.d */
public final class C34802d extends C34794a {

    /* renamed from: A */
    public static final int f84446A = 11;

    /* renamed from: o */
    public static final int[] f84447o = {7, 5, 4, 3, 1};

    /* renamed from: p */
    public static final int[] f84448p = {4, 20, 52, 104, 204};

    /* renamed from: q */
    public static final int[] f84449q = {0, C14092c.f34659u0, 1388, 2948, 3988};

    /* renamed from: r */
    public static final int[][] f84450r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: s */
    public static final int[][] f84451s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{C17699g.f46051u, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, C14092c.f34527J, 197, LoyaltyConstantsKt.LOYALTY_MAX_WIDTH, 85, 44, C14092c.f34515F}, new int[]{185, 133, C14092c.f34554S, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, C14092c.f34536M}, new int[]{46, 138, 203, 187, 139, ComposerKt.f22650t, LoyaltyBonusListFragment.f60703y, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, C14092c.f34532K1, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, C14092c.f34572Y, ComposerKt.f22644n, 184, 130, 179, 115}, new int[]{134, C14092c.f34557T, 151, 31, 93, 68, 204, 190}, new int[]{C34779d.f84376g, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, C14092c.f34560U, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, ComposerKt.f22652v, 199, HideBottomViewOnScrollBehavior.f74656f}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, C14092c.f34545P, 100, 89}};

    /* renamed from: t */
    public static final int f84452t = 0;

    /* renamed from: u */
    public static final int f84453u = 1;

    /* renamed from: v */
    public static final int f84454v = 2;

    /* renamed from: w */
    public static final int f84455w = 3;

    /* renamed from: x */
    public static final int f84456x = 4;

    /* renamed from: y */
    public static final int f84457y = 5;

    /* renamed from: z */
    public static final int[][] f84458z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: k */
    public final List<C34800b> f84459k = new ArrayList(11);

    /* renamed from: l */
    public final List<C34801c> f84460l = new ArrayList();

    /* renamed from: m */
    public final int[] f84461m = new int[2];

    /* renamed from: n */
    public boolean f84462n;

    /* renamed from: A */
    public static int m142085A(C34709a aVar, int i) {
        if (aVar.mo102645k(i)) {
            return aVar.mo102647m(aVar.mo102648n(i));
        }
        return aVar.mo102648n(aVar.mo102647m(i));
    }

    /* renamed from: C */
    public static boolean m142086C(C34796c cVar, boolean z, boolean z2) {
        return cVar.mo102934c() != 0 || !z || !z2;
    }

    /* renamed from: D */
    public static boolean m142087D(Iterable<C34800b> iterable, Iterable<C34801c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C34801c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C34801c next = it.next();
                Iterator<C34800b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C34800b next2 = it2.next();
                    Iterator<C34800b> it3 = next.mo102952a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: E */
    public static boolean m142088E(List<C34800b> list) {
        boolean z;
        for (int[] iArr : f84458z) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo102945a().mo102934c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G */
    public static void m142089G(Collection<C34800b> collection, Collection<C34801c> collection2) {
        boolean z;
        Iterator<C34801c> it = collection2.iterator();
        while (it.hasNext()) {
            C34801c next = it.next();
            if (next.mo102952a().size() != collection.size()) {
                Iterator<C34800b> it2 = next.mo102952a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: I */
    public static void m142090I(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: w */
    public static C34761k m142091w(List<C34800b> list) throws NotFoundException, FormatException {
        String d = C34812j.m142131a(C34799a.m142077a(list)).mo102980d();
        C34762l[] a = list.get(0).mo102945a().mo102932a();
        C34762l[] a2 = list.get(list.size() - 1).mo102945a().mo102932a();
        return new C34761k(d, (byte[]) null, new C34762l[]{a[0], a[1], a2[0], a2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* renamed from: B */
    public List<C34801c> mo102958B() {
        return this.f84460l;
    }

    /* renamed from: F */
    public final C34796c mo102959F(C34709a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f84461m[0] - 1;
            while (i5 >= 0 && !aVar.mo102645k(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f84461m;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f84461m;
            int i7 = iArr2[0];
            int n = aVar.mo102648n(iArr2[1] + 1);
            i2 = n;
            i3 = i7;
            i4 = n - this.f84461m[1];
        }
        int[] k = mo102922k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = i4;
        try {
            return new C34796c(C34794a.m142053r(k, f84450r), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public C34800b mo102960H(C34709a aVar, List<C34800b> list, int i) throws NotFoundException {
        boolean z;
        C34796c F;
        C34795b bVar;
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f84462n) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            mo102968z(aVar, list, i2);
            F = mo102959F(aVar, i, z);
            if (F == null) {
                i2 = m142085A(aVar, this.f84461m[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C34795b x = mo102966x(aVar, F, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo102948d()) {
            try {
                bVar = mo102966x(aVar, F, z, false);
            } catch (NotFoundException unused) {
                bVar = null;
            }
            return new C34800b(x, bVar, F);
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: J */
    public final void mo102961J(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f84460l.size()) {
                break;
            }
            C34801c cVar = this.f84460l.get(i2);
            if (cVar.mo102953b() > i) {
                z2 = cVar.mo102954c(this.f84459k);
                break;
            } else {
                z3 = cVar.mo102954c(this.f84459k);
                i2++;
            }
        }
        if (!z2 && !z3 && !m142087D(this.f84459k, this.f84460l)) {
            this.f84460l.add(i2, new C34801c(this.f84459k, i, z));
            m142089G(this.f84459k, this.f84460l);
        }
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f84459k.clear();
        this.f84462n = false;
        try {
            return m142091w(mo102967y(i, aVar));
        } catch (NotFoundException unused) {
            this.f84459k.clear();
            this.f84462n = true;
            return m142091w(mo102967y(i, aVar));
        }
    }

    public void reset() {
        this.f84459k.clear();
        this.f84460l.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102962s(int r11) throws com.google.zxing.NotFoundException {
        /*
            r10 = this;
            int[] r0 = r10.mo102925n()
            int r0 = com.google.zxing.common.detector.C34713a.m141633d(r0)
            int[] r1 = r10.mo102923l()
            int r1 = com.google.zxing.common.detector.C34713a.m141633d(r1)
            r2 = 4
            r3 = 1
            r4 = 0
            r5 = 13
            if (r0 <= r5) goto L_0x001a
            r7 = r3
            r6 = r4
            goto L_0x0021
        L_0x001a:
            if (r0 >= r2) goto L_0x001f
            r6 = r3
            r7 = r4
            goto L_0x0021
        L_0x001f:
            r6 = r4
            r7 = r6
        L_0x0021:
            if (r1 <= r5) goto L_0x0026
            r5 = r3
            r2 = r4
            goto L_0x002d
        L_0x0026:
            if (r1 >= r2) goto L_0x002b
            r2 = r3
            r5 = r4
            goto L_0x002d
        L_0x002b:
            r2 = r4
            r5 = r2
        L_0x002d:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r3) goto L_0x0036
            r11 = r3
            goto L_0x0037
        L_0x0036:
            r11 = r4
        L_0x0037:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003c
            r4 = r3
        L_0x003c:
            r9 = -1
            if (r8 == r9) goto L_0x0075
            if (r8 == 0) goto L_0x005c
            if (r8 != r3) goto L_0x0057
            if (r11 == 0) goto L_0x004e
            if (r4 != 0) goto L_0x0049
            r7 = r3
            goto L_0x006e
        L_0x0049:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x004e:
            if (r4 == 0) goto L_0x0052
            r5 = r3
            goto L_0x006e
        L_0x0052:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x0057:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x005c:
            if (r11 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x0067
            if (r0 >= r1) goto L_0x0064
            r5 = r3
            goto L_0x0083
        L_0x0064:
            r2 = r3
            r7 = r2
            goto L_0x006e
        L_0x0067:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x006c:
            if (r4 != 0) goto L_0x0070
        L_0x006e:
            r3 = r6
            goto L_0x0083
        L_0x0070:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x0075:
            if (r11 == 0) goto L_0x007f
            if (r4 != 0) goto L_0x007a
            goto L_0x0083
        L_0x007a:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x007f:
            if (r4 == 0) goto L_0x00c8
            r2 = r3
            goto L_0x006e
        L_0x0083:
            if (r3 == 0) goto L_0x0098
            if (r7 != 0) goto L_0x0093
            int[] r11 = r10.mo102925n()
            float[] r0 = r10.mo102926o()
            com.google.zxing.oned.rss.C34794a.m142051p(r11, r0)
            goto L_0x0098
        L_0x0093:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x0098:
            if (r7 == 0) goto L_0x00a5
            int[] r11 = r10.mo102925n()
            float[] r0 = r10.mo102926o()
            com.google.zxing.oned.rss.C34794a.m142050i(r11, r0)
        L_0x00a5:
            if (r2 == 0) goto L_0x00ba
            if (r5 != 0) goto L_0x00b5
            int[] r11 = r10.mo102923l()
            float[] r0 = r10.mo102926o()
            com.google.zxing.oned.rss.C34794a.m142051p(r11, r0)
            goto L_0x00ba
        L_0x00b5:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        L_0x00ba:
            if (r5 == 0) goto L_0x00c7
            int[] r11 = r10.mo102923l()
            float[] r0 = r10.mo102924m()
            com.google.zxing.oned.rss.C34794a.m142050i(r11, r0)
        L_0x00c7:
            return
        L_0x00c8:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m141229a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.C34802d.mo102962s(int):void");
    }

    /* renamed from: t */
    public final boolean mo102963t() {
        C34800b bVar = this.f84459k.get(0);
        C34795b b = bVar.mo102946b();
        C34795b c = bVar.mo102947c();
        if (c == null) {
            return false;
        }
        int a = c.mo102927a();
        int i = 2;
        for (int i2 = 1; i2 < this.f84459k.size(); i2++) {
            C34800b bVar2 = this.f84459k.get(i2);
            a += bVar2.mo102946b().mo102927a();
            i++;
            C34795b c2 = bVar2.mo102947c();
            if (c2 != null) {
                a += c2.mo102927a();
                i++;
            }
        }
        if (((i - 4) * 211) + (a % 211) == b.mo102928b()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final List<C34800b> mo102964u(List<C34801c> list, int i) throws NotFoundException {
        while (i < this.f84460l.size()) {
            C34801c cVar = this.f84460l.get(i);
            this.f84459k.clear();
            for (C34801c a : list) {
                this.f84459k.addAll(a.mo102952a());
            }
            this.f84459k.addAll(cVar.mo102952a());
            if (!m142088E(this.f84459k)) {
                i++;
            } else if (mo102963t()) {
                return this.f84459k;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return mo102964u(arrayList, i + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: v */
    public final List<C34800b> mo102965v(boolean z) {
        List<C34800b> list = null;
        if (this.f84460l.size() > 25) {
            this.f84460l.clear();
            return null;
        }
        this.f84459k.clear();
        if (z) {
            Collections.reverse(this.f84460l);
        }
        try {
            list = mo102964u(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f84460l);
        }
        return list;
    }

    /* renamed from: x */
    public C34795b mo102966x(C34709a aVar, C34796c cVar, boolean z, boolean z2) throws NotFoundException {
        int i;
        C34709a aVar2 = aVar;
        int[] j = mo102921j();
        for (int i2 = 0; i2 < j.length; i2++) {
            j[i2] = 0;
        }
        if (z2) {
            C34792q.m142037g(aVar, cVar.mo102933b()[0], j);
        } else {
            C34792q.m142036f(aVar, cVar.mo102933b()[1], j);
            int i3 = 0;
            for (int length = j.length - 1; i3 < length; length--) {
                int i4 = j[i3];
                j[i3] = j[length];
                j[length] = i4;
                i3++;
            }
        }
        float d = ((float) C34713a.m141633d(j)) / 17.0f;
        float f = ((float) (cVar.mo102933b()[1] - cVar.mo102933b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] n = mo102925n();
            int[] l = mo102923l();
            float[] o = mo102926o();
            float[] m = mo102924m();
            for (int i5 = 0; i5 < j.length; i5++) {
                float f2 = (((float) j[i5]) * 1.0f) / d;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw NotFoundException.m141229a();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw NotFoundException.m141229a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    n[i7] = i6;
                    o[i7] = f2 - ((float) i6);
                } else {
                    l[i7] = i6;
                    m[i7] = f2 - ((float) i6);
                }
            }
            mo102962s(17);
            int c = cVar.mo102934c() * 4;
            if (z) {
                i = 0;
            } else {
                i = 2;
            }
            int i8 = ((c + i) + (z2 ^ true ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = n.length - 1; length2 >= 0; length2--) {
                if (m142086C(cVar, z, z2)) {
                    i9 += n[length2] * f84451s[i8][length2 * 2];
                }
                i10 += n[length2];
            }
            int i11 = 0;
            for (int length3 = l.length - 1; length3 >= 0; length3--) {
                if (m142086C(cVar, z, z2)) {
                    i11 += l[length3] * f84451s[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) != 0 || i10 > 13 || i10 < 4) {
                throw NotFoundException.m141229a();
            }
            int i13 = (13 - i10) / 2;
            int i14 = f84447o[i13];
            return new C34795b((C34821f.m142170b(n, i14, true) * f84448p[i13]) + C34821f.m142170b(l, 9 - i14, false) + f84449q[i13], i12);
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: y */
    public List<C34800b> mo102967y(int i, C34709a aVar) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<C34800b> list = this.f84459k;
                list.add(mo102960H(aVar, list, i));
            } catch (NotFoundException e) {
                if (!this.f84459k.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (mo102963t()) {
            return this.f84459k;
        }
        boolean z2 = !this.f84460l.isEmpty();
        mo102961J(i, false);
        if (z2) {
            List<C34800b> v = mo102965v(false);
            if (v != null) {
                return v;
            }
            List<C34800b> v2 = mo102965v(true);
            if (v2 != null) {
                return v2;
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: z */
    public final void mo102968z(C34709a aVar, List<C34800b> list, int i) throws NotFoundException {
        boolean z;
        int[] k = mo102922k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int o = aVar.mo102649o();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).mo102945a().mo102933b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f84462n) {
            z = !z;
        }
        boolean z2 = false;
        while (i < o) {
            z2 = !aVar.mo102645k(i);
            if (!z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < o) {
            if (aVar.mo102645k(i) != z3) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m142090I(k);
                    }
                    if (C34794a.m142052q(k)) {
                        int[] iArr = this.f84461m;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m142090I(k);
                    }
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                k[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.m141229a();
    }
}
