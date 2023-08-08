package com.google.zxing.common.reedsolomon;

import androidx.compose.p004ui.graphics.vector.C15369g;

/* renamed from: com.google.zxing.common.reedsolomon.b */
public final class C34724b {

    /* renamed from: a */
    public final C34723a f84128a;

    /* renamed from: b */
    public final int[] f84129b;

    public C34724b(C34723a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f84128a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f84129b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f84129b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f84129b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C34724b mo102724a(C34724b bVar) {
        if (!this.f84128a.equals(bVar.f84128a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo102730g()) {
            return bVar;
        } else {
            if (bVar.mo102730g()) {
                return this;
            }
            int[] iArr = this.f84129b;
            int[] iArr2 = bVar.f84129b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C34723a.m141669a(iArr2[i - length], iArr[i]);
            }
            return new C34724b(this.f84128a, iArr4);
        }
    }

    /* renamed from: b */
    public C34724b[] mo102725b(C34724b bVar) {
        if (!this.f84128a.equals(bVar.f84128a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo102730g()) {
            C34724b g = this.f84128a.mo102719g();
            int h = this.f84128a.mo102720h(bVar.mo102727d(bVar.mo102729f()));
            C34724b bVar2 = this;
            while (bVar2.mo102729f() >= bVar.mo102729f() && !bVar2.mo102730g()) {
                int f = bVar2.mo102729f() - bVar.mo102729f();
                int j = this.f84128a.mo102722j(bVar2.mo102727d(bVar2.mo102729f()), h);
                C34724b j2 = bVar.mo102733j(f, j);
                g = g.mo102724a(this.f84128a.mo102714b(f, j));
                bVar2 = bVar2.mo102724a(j2);
            }
            return new C34724b[]{g, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* renamed from: c */
    public int mo102726c(int i) {
        if (i == 0) {
            return mo102727d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f84129b) {
                i2 = C34723a.m141669a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f84129b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C34723a.m141669a(this.f84128a.mo102722j(i, i3), this.f84129b[i4]);
        }
        return i3;
    }

    /* renamed from: d */
    public int mo102727d(int i) {
        int[] iArr = this.f84129b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: e */
    public int[] mo102728e() {
        return this.f84129b;
    }

    /* renamed from: f */
    public int mo102729f() {
        return this.f84129b.length - 1;
    }

    /* renamed from: g */
    public boolean mo102730g() {
        return this.f84129b[0] == 0;
    }

    /* renamed from: h */
    public C34724b mo102731h(int i) {
        if (i == 0) {
            return this.f84128a.mo102719g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f84129b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f84128a.mo102722j(this.f84129b[i2], i);
        }
        return new C34724b(this.f84128a, iArr);
    }

    /* renamed from: i */
    public C34724b mo102732i(C34724b bVar) {
        if (!this.f84128a.equals(bVar.f84128a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo102730g() || bVar.mo102730g()) {
            return this.f84128a.mo102719g();
        } else {
            int[] iArr = this.f84129b;
            int length = iArr.length;
            int[] iArr2 = bVar.f84129b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C34723a.m141669a(iArr3[i4], this.f84128a.mo102722j(i2, iArr2[i3]));
                }
            }
            return new C34724b(this.f84128a, iArr3);
        }
    }

    /* renamed from: j */
    public C34724b mo102733j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f84128a.mo102719g();
        } else {
            int length = this.f84129b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f84128a.mo102722j(this.f84129b[i3], i2);
            }
            return new C34724b(this.f84128a, iArr);
        }
    }

    public String toString() {
        if (mo102730g()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(mo102729f() * 8);
        for (int f = mo102729f(); f >= 0; f--) {
            int d = mo102727d(f);
            if (d != 0) {
                if (d < 0) {
                    if (f == mo102729f()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.f84128a.mo102721i(d);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append(C15369g.f37993s);
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (f != 0) {
                    if (f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
