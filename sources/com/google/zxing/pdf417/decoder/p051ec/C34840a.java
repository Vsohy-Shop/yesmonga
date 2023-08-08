package com.google.zxing.pdf417.decoder.p051ec;

import com.google.zxing.ChecksumException;

/* renamed from: com.google.zxing.pdf417.decoder.ec.a */
public final class C34840a {

    /* renamed from: a */
    public final C34841b f84616a = C34841b.f84617f;

    /* renamed from: a */
    public int mo103090a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        C34842c cVar = new C34842c(this.f84616a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo103105b(this.f84616a.mo103096c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C34842c d = this.f84616a.mo103097d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f84616a.mo103096c((iArr.length - 1) - length);
                C34841b bVar = this.f84616a;
                d = d.mo103111h(new C34842c(bVar, new int[]{bVar.mo103103j(0, c), 1}));
            }
        }
        C34842c[] d2 = mo103093d(this.f84616a.mo103095b(i, 1), new C34842c(this.f84616a, iArr3), i);
        C34842c cVar2 = d2[0];
        C34842c cVar3 = d2[1];
        int[] b2 = mo103091b(cVar2);
        int[] c2 = mo103092c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f84616a.mo103101h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f84616a.mo103103j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw ChecksumException.m141224a();
            }
        }
        return b2.length;
    }

    /* renamed from: b */
    public final int[] mo103091b(C34842c cVar) throws ChecksumException {
        int e = cVar.mo103108e();
        int[] iArr = new int[e];
        int i = 0;
        for (int i2 = 1; i2 < this.f84616a.mo103098e() && i < e; i2++) {
            if (cVar.mo103105b(i2) == 0) {
                iArr[i] = this.f84616a.mo103100g(i2);
                i++;
            }
        }
        if (i == e) {
            return iArr;
        }
        throw ChecksumException.m141224a();
    }

    /* renamed from: c */
    public final int[] mo103092c(C34842c cVar, C34842c cVar2, int[] iArr) {
        int e = cVar2.mo103108e();
        int[] iArr2 = new int[e];
        for (int i = 1; i <= e; i++) {
            iArr2[e - i] = this.f84616a.mo103102i(i, cVar2.mo103106c(i));
        }
        C34842c cVar3 = new C34842c(this.f84616a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f84616a.mo103100g(iArr[i2]);
            iArr3[i2] = this.f84616a.mo103102i(this.f84616a.mo103103j(0, cVar.mo103105b(g)), this.f84616a.mo103100g(cVar3.mo103105b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    public final C34842c[] mo103093d(C34842c cVar, C34842c cVar2, int i) throws ChecksumException {
        if (cVar.mo103108e() < cVar2.mo103108e()) {
            C34842c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C34842c f = this.f84616a.mo103099f();
        C34842c d = this.f84616a.mo103097d();
        while (true) {
            C34842c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C34842c cVar5 = d;
            C34842c cVar6 = f;
            f = cVar5;
            if (cVar.mo103108e() < i / 2) {
                int c = f.mo103106c(0);
                if (c != 0) {
                    int g = this.f84616a.mo103100g(c);
                    return new C34842c[]{f.mo103110g(g), cVar.mo103110g(g)};
                }
                throw ChecksumException.m141224a();
            } else if (!cVar.mo103109f()) {
                C34842c f2 = this.f84616a.mo103099f();
                int g2 = this.f84616a.mo103100g(cVar.mo103106c(cVar.mo103108e()));
                while (r11.mo103108e() >= cVar.mo103108e() && !r11.mo103109f()) {
                    int e = r11.mo103108e() - cVar.mo103108e();
                    int i2 = this.f84616a.mo103102i(r11.mo103106c(r11.mo103108e()), g2);
                    f2 = f2.mo103104a(this.f84616a.mo103095b(e, i2));
                    r11 = r11.mo103114k(cVar.mo103112i(e, i2));
                }
                d = f2.mo103111h(f).mo103114k(cVar6).mo103113j();
            } else {
                throw ChecksumException.m141224a();
            }
        }
    }
}
