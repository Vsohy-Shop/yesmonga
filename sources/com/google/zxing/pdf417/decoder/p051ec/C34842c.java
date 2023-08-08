package com.google.zxing.pdf417.decoder.p051ec;

/* renamed from: com.google.zxing.pdf417.decoder.ec.c */
public final class C34842c {

    /* renamed from: a */
    public final C34841b f84623a;

    /* renamed from: b */
    public final int[] f84624b;

    public C34842c(C34841b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f84623a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f84624b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f84624b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f84624b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C34842c mo103104a(C34842c cVar) {
        if (!this.f84623a.equals(cVar.f84623a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo103109f()) {
            return cVar;
        } else {
            if (cVar.mo103109f()) {
                return this;
            }
            int[] iArr = this.f84624b;
            int[] iArr2 = cVar.f84624b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f84623a.mo103094a(iArr2[i - length], iArr[i]);
            }
            return new C34842c(this.f84623a, iArr4);
        }
    }

    /* renamed from: b */
    public int mo103105b(int i) {
        if (i == 0) {
            return mo103106c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f84624b) {
                i2 = this.f84623a.mo103094a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f84624b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C34841b bVar = this.f84623a;
            i3 = bVar.mo103094a(bVar.mo103102i(i, i3), this.f84624b[i4]);
        }
        return i3;
    }

    /* renamed from: c */
    public int mo103106c(int i) {
        int[] iArr = this.f84624b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int[] mo103107d() {
        return this.f84624b;
    }

    /* renamed from: e */
    public int mo103108e() {
        return this.f84624b.length - 1;
    }

    /* renamed from: f */
    public boolean mo103109f() {
        return this.f84624b[0] == 0;
    }

    /* renamed from: g */
    public C34842c mo103110g(int i) {
        if (i == 0) {
            return this.f84623a.mo103099f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f84624b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f84623a.mo103102i(this.f84624b[i2], i);
        }
        return new C34842c(this.f84623a, iArr);
    }

    /* renamed from: h */
    public C34842c mo103111h(C34842c cVar) {
        if (!this.f84623a.equals(cVar.f84623a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo103109f() || cVar.mo103109f()) {
            return this.f84623a.mo103099f();
        } else {
            int[] iArr = this.f84624b;
            int length = iArr.length;
            int[] iArr2 = cVar.f84624b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C34841b bVar = this.f84623a;
                    iArr3[i4] = bVar.mo103094a(iArr3[i4], bVar.mo103102i(i2, iArr2[i3]));
                }
            }
            return new C34842c(this.f84623a, iArr3);
        }
    }

    /* renamed from: i */
    public C34842c mo103112i(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f84623a.mo103099f();
        } else {
            int length = this.f84624b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f84623a.mo103102i(this.f84624b[i3], i2);
            }
            return new C34842c(this.f84623a, iArr);
        }
    }

    /* renamed from: j */
    public C34842c mo103113j() {
        int length = this.f84624b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f84623a.mo103103j(0, this.f84624b[i]);
        }
        return new C34842c(this.f84623a, iArr);
    }

    /* renamed from: k */
    public C34842c mo103114k(C34842c cVar) {
        if (!this.f84623a.equals(cVar.f84623a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.mo103109f()) {
            return this;
        } else {
            return mo103104a(cVar.mo103113j());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo103108e() * 8);
        for (int e = mo103108e(); e >= 0; e--) {
            int c = mo103106c(e);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e == 0 || c != 1) {
                    sb.append(c);
                }
                if (e != 0) {
                    if (e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
