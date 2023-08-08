package com.google.zxing.aztec.detector;

import com.carrefour.fid.android.shared.constant.C28539g;
import com.google.zxing.C34762l;
import com.google.zxing.NotFoundException;
import com.google.zxing.aztec.C34630a;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34719h;
import com.google.zxing.common.detector.C34713a;
import com.google.zxing.common.detector.C34715c;
import com.google.zxing.common.reedsolomon.C34723a;
import com.google.zxing.common.reedsolomon.C34725c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.C11626x;

/* renamed from: com.google.zxing.aztec.detector.a */
public final class C34634a {

    /* renamed from: g */
    public static final int[] f83773g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C34710b f83774a;

    /* renamed from: b */
    public boolean f83775b;

    /* renamed from: c */
    public int f83776c;

    /* renamed from: d */
    public int f83777d;

    /* renamed from: e */
    public int f83778e;

    /* renamed from: f */
    public int f83779f;

    /* renamed from: com.google.zxing.aztec.detector.a$a */
    public static final class C34635a {

        /* renamed from: a */
        public final int f83780a;

        /* renamed from: b */
        public final int f83781b;

        public C34635a(int i, int i2) {
            this.f83780a = i;
            this.f83781b = i2;
        }

        /* renamed from: a */
        public int mo102441a() {
            return this.f83780a;
        }

        /* renamed from: b */
        public int mo102442b() {
            return this.f83781b;
        }

        /* renamed from: c */
        public C34762l mo102443c() {
            return new C34762l((float) mo102441a(), (float) mo102442b());
        }

        public String toString() {
            return "<" + this.f83780a + ' ' + this.f83781b + C11626x.f28915f;
        }
    }

    public C34634a(C34710b bVar) {
        this.f83774a = bVar;
    }

    /* renamed from: c */
    public static float m141256c(C34762l lVar, C34762l lVar2) {
        return C34713a.m141630a(lVar.mo102883c(), lVar.mo102884d(), lVar2.mo102883c(), lVar2.mo102884d());
    }

    /* renamed from: d */
    public static float m141257d(C34635a aVar, C34635a aVar2) {
        return C34713a.m141631b(aVar.mo102441a(), aVar.mo102442b(), aVar2.mo102441a(), aVar2.mo102442b());
    }

    /* renamed from: e */
    public static C34762l[] m141258e(C34762l[] lVarArr, int i, int i2) {
        float f = ((float) i2) / (((float) i) * 2.0f);
        float c = lVarArr[0].mo102883c() - lVarArr[2].mo102883c();
        float d = lVarArr[0].mo102884d() - lVarArr[2].mo102884d();
        float c2 = (lVarArr[0].mo102883c() + lVarArr[2].mo102883c()) / 2.0f;
        float d2 = (lVarArr[0].mo102884d() + lVarArr[2].mo102884d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        C34762l lVar = new C34762l(c2 + f2, d2 + f3);
        C34762l lVar2 = new C34762l(c2 - f2, d2 - f3);
        float c3 = lVarArr[1].mo102883c() - lVarArr[3].mo102883c();
        float d3 = lVarArr[1].mo102884d() - lVarArr[3].mo102884d();
        float c4 = (lVarArr[1].mo102883c() + lVarArr[3].mo102883c()) / 2.0f;
        float d4 = (lVarArr[1].mo102884d() + lVarArr[3].mo102884d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new C34762l[]{lVar, new C34762l(c4 + f4, d4 + f5), lVar2, new C34762l(c4 - f4, d4 - f5)};
    }

    /* renamed from: i */
    public static int m141259i(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C34725c(C34723a.f84116k).mo102735a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.m141229a();
        }
    }

    /* renamed from: n */
    public static int m141260n(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f83773g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: a */
    public C34630a mo102427a() throws NotFoundException {
        return mo102428b(false);
    }

    /* renamed from: b */
    public C34630a mo102428b(boolean z) throws NotFoundException {
        C34762l[] g = mo102430g(mo102434l());
        if (z) {
            C34762l lVar = g[0];
            g[0] = g[2];
            g[2] = lVar;
        }
        mo102429f(g);
        C34710b bVar = this.f83774a;
        int i = this.f83779f;
        return new C34630a(mo102439r(bVar, g[i % 4], g[(i + 1) % 4], g[(i + 2) % 4], g[(i + 3) % 4]), mo102435m(g), this.f83775b, this.f83777d, this.f83776c);
    }

    /* renamed from: f */
    public final void mo102429f(C34762l[] lVarArr) throws NotFoundException {
        long j;
        long j2;
        if (!mo102437p(lVarArr[0]) || !mo102437p(lVarArr[1]) || !mo102437p(lVarArr[2]) || !mo102437p(lVarArr[3])) {
            throw NotFoundException.m141229a();
        }
        int i = this.f83778e * 2;
        int[] iArr = {mo102440s(lVarArr[0], lVarArr[1], i), mo102440s(lVarArr[1], lVarArr[2], i), mo102440s(lVarArr[2], lVarArr[3], i), mo102440s(lVarArr[3], lVarArr[0], i)};
        this.f83779f = m141260n(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f83779f + i2) % 4];
            if (this.f83775b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & C28539g.f69231G) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int i4 = m141259i(j3, this.f83775b);
        if (this.f83775b) {
            this.f83776c = (i4 >> 6) + 1;
            this.f83777d = (i4 & 63) + 1;
            return;
        }
        this.f83776c = (i4 >> 11) + 1;
        this.f83777d = (i4 & 2047) + 1;
    }

    /* renamed from: g */
    public final C34762l[] mo102430g(C34635a aVar) throws NotFoundException {
        boolean z;
        this.f83778e = 1;
        C34635a aVar2 = aVar;
        C34635a aVar3 = aVar2;
        C34635a aVar4 = aVar3;
        boolean z2 = true;
        while (this.f83778e < 9) {
            C34635a k = mo102433k(aVar, z2, 1, -1);
            C34635a k2 = mo102433k(aVar2, z2, 1, 1);
            C34635a k3 = mo102433k(aVar3, z2, -1, 1);
            C34635a k4 = mo102433k(aVar4, z2, -1, -1);
            if (this.f83778e > 2) {
                double d = (double) ((m141257d(k4, k) * ((float) this.f83778e)) / (m141257d(aVar4, aVar) * ((float) (this.f83778e + 2))));
                if (d < 0.75d || d > 1.25d || !mo102438q(k, k2, k3, k4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f83778e++;
            aVar4 = k4;
            aVar = k;
            aVar2 = k2;
            aVar3 = k3;
        }
        int i = this.f83778e;
        if (i == 5 || i == 7) {
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            this.f83775b = z;
            C34762l[] lVarArr = {new C34762l(((float) aVar.mo102441a()) + 0.5f, ((float) aVar.mo102442b()) - 0.5f), new C34762l(((float) aVar2.mo102441a()) + 0.5f, ((float) aVar2.mo102442b()) + 0.5f), new C34762l(((float) aVar3.mo102441a()) - 0.5f, ((float) aVar3.mo102442b()) + 0.5f), new C34762l(((float) aVar4.mo102441a()) - 0.5f, ((float) aVar4.mo102442b()) - 0.5f)};
            int i2 = this.f83778e;
            return m141258e(lVarArr, (i2 * 2) - 3, i2 * 2);
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: h */
    public final int mo102431h(C34635a aVar, C34635a aVar2) {
        float d = m141257d(aVar, aVar2);
        float a = ((float) (aVar2.mo102441a() - aVar.mo102441a())) / d;
        float b = ((float) (aVar2.mo102442b() - aVar.mo102442b())) / d;
        float a2 = (float) aVar.mo102441a();
        float b2 = (float) aVar.mo102442b();
        boolean h = this.f83774a.mo102666h(aVar.mo102441a(), aVar.mo102442b());
        int ceil = (int) Math.ceil((double) d);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f83774a.mo102666h(C34713a.m141632c(a2), C34713a.m141632c(b2)) != h) {
                i++;
            }
        }
        float f = ((float) i) / d;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        if (z == h) {
            return 1;
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo102432j() {
        if (this.f83775b) {
            return (this.f83776c * 4) + 11;
        }
        int i = this.f83776c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: k */
    public final C34635a mo102433k(C34635a aVar, boolean z, int i, int i2) {
        int a = aVar.mo102441a() + i;
        int b = aVar.mo102442b();
        while (true) {
            b += i2;
            if (!mo102436o(a, b) || this.f83774a.mo102666h(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (mo102436o(i32, i42) && this.f83774a.mo102666h(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (mo102436o(i5, i42) && this.f83774a.mo102666h(i5, i42) == z) {
            i42 += i2;
        }
        return new C34635a(i5, i42 - i2);
    }

    /* renamed from: l */
    public final C34635a mo102434l() {
        C34762l lVar;
        C34762l lVar2;
        C34762l lVar3;
        C34762l lVar4;
        C34762l lVar5;
        C34762l lVar6;
        C34762l lVar7;
        C34762l lVar8;
        try {
            C34762l[] c = new C34715c(this.f83774a).mo102703c();
            lVar3 = c[0];
            lVar2 = c[1];
            lVar = c[2];
            lVar4 = c[3];
        } catch (NotFoundException unused) {
            int o = this.f83774a.mo102674o() / 2;
            int k = this.f83774a.mo102670k() / 2;
            int i = o + 7;
            int i2 = k - 7;
            C34762l c2 = mo102433k(new C34635a(i, i2), false, 1, -1).mo102443c();
            int i3 = k + 7;
            C34762l c3 = mo102433k(new C34635a(i, i3), false, 1, 1).mo102443c();
            int i4 = o - 7;
            C34762l c4 = mo102433k(new C34635a(i4, i3), false, -1, 1).mo102443c();
            lVar4 = mo102433k(new C34635a(i4, i2), false, -1, -1).mo102443c();
            C34762l lVar9 = c3;
            lVar = c4;
            lVar3 = c2;
            lVar2 = lVar9;
        }
        int c5 = C34713a.m141632c((((lVar3.mo102883c() + lVar4.mo102883c()) + lVar2.mo102883c()) + lVar.mo102883c()) / 4.0f);
        int c6 = C34713a.m141632c((((lVar3.mo102884d() + lVar4.mo102884d()) + lVar2.mo102884d()) + lVar.mo102884d()) / 4.0f);
        try {
            C34762l[] c7 = new C34715c(this.f83774a, 15, c5, c6).mo102703c();
            lVar6 = c7[0];
            lVar5 = c7[1];
            lVar7 = c7[2];
            lVar8 = c7[3];
        } catch (NotFoundException unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            lVar6 = mo102433k(new C34635a(i5, i6), false, 1, -1).mo102443c();
            int i7 = c6 + 7;
            lVar5 = mo102433k(new C34635a(i5, i7), false, 1, 1).mo102443c();
            int i8 = c5 - 7;
            lVar7 = mo102433k(new C34635a(i8, i7), false, -1, 1).mo102443c();
            lVar8 = mo102433k(new C34635a(i8, i6), false, -1, -1).mo102443c();
        }
        return new C34635a(C34713a.m141632c((((lVar6.mo102883c() + lVar8.mo102883c()) + lVar5.mo102883c()) + lVar7.mo102883c()) / 4.0f), C34713a.m141632c((((lVar6.mo102884d() + lVar8.mo102884d()) + lVar5.mo102884d()) + lVar7.mo102884d()) / 4.0f));
    }

    /* renamed from: m */
    public final C34762l[] mo102435m(C34762l[] lVarArr) {
        return m141258e(lVarArr, this.f83778e * 2, mo102432j());
    }

    /* renamed from: o */
    public final boolean mo102436o(int i, int i2) {
        return i >= 0 && i < this.f83774a.mo102674o() && i2 > 0 && i2 < this.f83774a.mo102670k();
    }

    /* renamed from: p */
    public final boolean mo102437p(C34762l lVar) {
        return mo102436o(C34713a.m141632c(lVar.mo102883c()), C34713a.m141632c(lVar.mo102884d()));
    }

    /* renamed from: q */
    public final boolean mo102438q(C34635a aVar, C34635a aVar2, C34635a aVar3, C34635a aVar4) {
        C34635a aVar5 = new C34635a(aVar.mo102441a() - 3, aVar.mo102442b() + 3);
        C34635a aVar6 = new C34635a(aVar2.mo102441a() - 3, aVar2.mo102442b() - 3);
        C34635a aVar7 = new C34635a(aVar3.mo102441a() + 3, aVar3.mo102442b() - 3);
        C34635a aVar8 = new C34635a(aVar4.mo102441a() + 3, aVar4.mo102442b() + 3);
        int h = mo102431h(aVar8, aVar5);
        if (h != 0 && mo102431h(aVar5, aVar6) == h && mo102431h(aVar6, aVar7) == h && mo102431h(aVar7, aVar8) == h) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final C34710b mo102439r(C34710b bVar, C34762l lVar, C34762l lVar2, C34762l lVar3, C34762l lVar4) throws NotFoundException {
        C34719h b = C34719h.m141651b();
        int j = mo102432j();
        int i = j;
        int i2 = j;
        float f = ((float) j) / 2.0f;
        int i3 = this.f83778e;
        float f2 = f - ((float) i3);
        float f3 = f + ((float) i3);
        return b.mo102705c(bVar, i2, i, f2, f2, f3, f2, f3, f3, f2, f3, lVar.mo102883c(), lVar.mo102884d(), lVar2.mo102883c(), lVar2.mo102884d(), lVar3.mo102883c(), lVar3.mo102884d(), lVar4.mo102883c(), lVar4.mo102884d());
    }

    /* renamed from: s */
    public final int mo102440s(C34762l lVar, C34762l lVar2, int i) {
        float c = m141256c(lVar, lVar2);
        float f = c / ((float) i);
        float c2 = lVar.mo102883c();
        float d = lVar.mo102884d();
        float c3 = ((lVar2.mo102883c() - lVar.mo102883c()) * f) / c;
        float d2 = (f * (lVar2.mo102884d() - lVar.mo102884d())) / c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f83774a.mo102666h(C34713a.m141632c((f2 * c3) + c2), C34713a.m141632c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
