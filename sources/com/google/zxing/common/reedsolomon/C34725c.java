package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.c */
public final class C34725c {

    /* renamed from: a */
    public final C34723a f84130a;

    public C34725c(C34723a aVar) {
        this.f84130a = aVar;
    }

    /* renamed from: a */
    public void mo102735a(int[] iArr, int i) throws ReedSolomonException {
        C34724b bVar = new C34724b(this.f84130a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C34723a aVar = this.f84130a;
            int c = bVar.mo102726c(aVar.mo102715c(aVar.mo102716d() + i3));
            iArr2[(i - 1) - i3] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            C34724b[] d = mo102738d(this.f84130a.mo102714b(i, 1), new C34724b(this.f84130a, iArr2), i);
            C34724b bVar2 = d[0];
            C34724b bVar3 = d[1];
            int[] b = mo102736b(bVar2);
            int[] c2 = mo102737c(bVar3, b);
            while (i2 < b.length) {
                int length = (iArr.length - 1) - this.f84130a.mo102721i(b[i2]);
                if (length >= 0) {
                    iArr[length] = C34723a.m141669a(iArr[length], c2[i2]);
                    i2++;
                } else {
                    throw new ReedSolomonException("Bad error location");
                }
            }
        }
    }

    /* renamed from: b */
    public final int[] mo102736b(C34724b bVar) throws ReedSolomonException {
        int f = bVar.mo102729f();
        int i = 0;
        if (f == 1) {
            return new int[]{bVar.mo102727d(1)};
        }
        int[] iArr = new int[f];
        for (int i2 = 1; i2 < this.f84130a.mo102718f() && i < f; i2++) {
            if (bVar.mo102726c(i2) == 0) {
                iArr[i] = this.f84130a.mo102720h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    public final int[] mo102737c(C34724b bVar, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int h = this.f84130a.mo102720h(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int j = this.f84130a.mo102722j(iArr[i4], h);
                    if ((j & 1) == 0) {
                        i = j | 1;
                    } else {
                        i = j & -2;
                    }
                    i3 = this.f84130a.mo102722j(i3, i);
                }
            }
            iArr2[i2] = this.f84130a.mo102722j(bVar.mo102726c(h), this.f84130a.mo102720h(i3));
            if (this.f84130a.mo102716d() != 0) {
                iArr2[i2] = this.f84130a.mo102722j(iArr2[i2], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final C34724b[] mo102738d(C34724b bVar, C34724b bVar2, int i) throws ReedSolomonException {
        if (bVar.mo102729f() < bVar2.mo102729f()) {
            C34724b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C34724b g = this.f84130a.mo102719g();
        C34724b e = this.f84130a.mo102717e();
        do {
            C34724b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C34724b bVar5 = e;
            C34724b bVar6 = g;
            g = bVar5;
            if (bVar.mo102729f() < i / 2) {
                int d = g.mo102727d(0);
                if (d != 0) {
                    int h = this.f84130a.mo102720h(d);
                    return new C34724b[]{g.mo102731h(h), bVar.mo102731h(h)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            } else if (!bVar.mo102730g()) {
                C34724b g2 = this.f84130a.mo102719g();
                int h2 = this.f84130a.mo102720h(bVar.mo102727d(bVar.mo102729f()));
                while (r11.mo102729f() >= bVar.mo102729f() && !r11.mo102730g()) {
                    int f = r11.mo102729f() - bVar.mo102729f();
                    int j = this.f84130a.mo102722j(r11.mo102727d(r11.mo102729f()), h2);
                    g2 = g2.mo102724a(this.f84130a.mo102714b(f, j));
                    r11 = r11.mo102724a(bVar.mo102733j(f, j));
                }
                e = g2.mo102732i(g).mo102724a(bVar6);
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        } while (r11.mo102729f() < bVar.mo102729f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
