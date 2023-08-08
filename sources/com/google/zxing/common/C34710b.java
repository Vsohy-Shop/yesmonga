package com.google.zxing.common;

import com.bumptech.glide.load.engine.GlideException;
import java.util.Arrays;

/* renamed from: com.google.zxing.common.b */
public final class C34710b implements Cloneable {

    /* renamed from: a */
    public final int f84054a;

    /* renamed from: b */
    public final int f84055b;

    /* renamed from: c */
    public final int f84056c;

    /* renamed from: d */
    public final int[] f84057d;

    public C34710b(int i) {
        this(i, i);
    }

    /* renamed from: s */
    public static C34710b m141589s(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i2 < str.length()) {
                if (str.charAt(i2) == 10 || str.charAt(i2) == 13) {
                    if (i3 > i4) {
                        if (i == -1) {
                            i = i3 - i4;
                        } else if (i3 - i4 != i) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i5++;
                        i4 = i3;
                    }
                    i2++;
                } else {
                    if (str.substring(i2, str2.length() + i2).equals(str2)) {
                        i2 += str2.length();
                        zArr[i3] = true;
                    } else if (str.substring(i2, str3.length() + i2).equals(str3)) {
                        i2 += str3.length();
                        zArr[i3] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i2));
                    }
                    i3++;
                }
            }
            if (i3 > i4) {
                if (i == -1) {
                    i = i3 - i4;
                } else if (i3 - i4 != i) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i5++;
            }
            C34710b bVar = new C34710b(i, i5);
            for (int i6 = 0; i6 < i3; i6++) {
                if (zArr[i6]) {
                    bVar.mo102677v(i6 % i, i6 / i);
                }
            }
            return bVar;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: t */
    public static C34710b m141590t(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        C34710b bVar = new C34710b(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    bVar.mo102677v(i2, i);
                }
            }
        }
        return bVar;
    }

    /* renamed from: A */
    public void mo102655A(int i, C34709a aVar) {
        int[] l = aVar.mo102646l();
        int[] iArr = this.f84057d;
        int i2 = this.f84056c;
        System.arraycopy(l, 0, iArr, i * i2, i2);
    }

    /* renamed from: B */
    public String mo102656B(String str, String str2) {
        return mo102660b(str, str2, "\n");
    }

    @Deprecated
    /* renamed from: C */
    public String mo102657C(String str, String str2, String str3) {
        return mo102660b(str, str2, str3);
    }

    /* renamed from: D */
    public void mo102658D(int i, int i2) {
        int i3 = (i2 * this.f84056c) + (i / 32);
        int[] iArr = this.f84057d;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    /* renamed from: E */
    public void mo102659E(C34710b bVar) {
        if (this.f84054a == bVar.mo102674o() && this.f84055b == bVar.mo102670k() && this.f84056c == bVar.mo102672m()) {
            C34709a aVar = new C34709a(this.f84054a);
            for (int i = 0; i < this.f84055b; i++) {
                int i2 = this.f84056c * i;
                int[] l = bVar.mo102671l(i, aVar).mo102646l();
                for (int i3 = 0; i3 < this.f84056c; i3++) {
                    int[] iArr = this.f84057d;
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] ^ l[i3];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    /* renamed from: b */
    public final String mo102660b(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(this.f84055b * (this.f84054a + 1));
        for (int i = 0; i < this.f84055b; i++) {
            for (int i2 = 0; i2 < this.f84054a; i2++) {
                if (mo102666h(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb.append(str4);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public void mo102661c() {
        int length = this.f84057d.length;
        for (int i = 0; i < length; i++) {
            this.f84057d[i] = 0;
        }
    }

    /* renamed from: e */
    public C34710b clone() {
        return new C34710b(this.f84054a, this.f84055b, this.f84056c, (int[]) this.f84057d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34710b)) {
            return false;
        }
        C34710b bVar = (C34710b) obj;
        if (this.f84054a == bVar.f84054a && this.f84055b == bVar.f84055b && this.f84056c == bVar.f84056c && Arrays.equals(this.f84057d, bVar.f84057d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo102665f(int i, int i2) {
        int i3 = (i2 * this.f84056c) + (i / 32);
        int[] iArr = this.f84057d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: h */
    public boolean mo102666h(int i, int i2) {
        if (((this.f84057d[(i2 * this.f84056c) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f84054a;
        return (((((((i * 31) + i) * 31) + this.f84055b) * 31) + this.f84056c) * 31) + Arrays.hashCode(this.f84057d);
    }

    /* renamed from: i */
    public int[] mo102668i() {
        int length = this.f84057d.length - 1;
        while (length >= 0 && this.f84057d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f84056c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f84057d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: j */
    public int[] mo102669j() {
        int i = this.f84054a;
        int i2 = this.f84055b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f84055b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f84056c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f84057d[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: k */
    public int mo102670k() {
        return this.f84055b;
    }

    /* renamed from: l */
    public C34709a mo102671l(int i, C34709a aVar) {
        if (aVar == null || aVar.mo102649o() < this.f84054a) {
            aVar = new C34709a(this.f84054a);
        } else {
            aVar.mo102640f();
        }
        int i2 = i * this.f84056c;
        for (int i3 = 0; i3 < this.f84056c; i3++) {
            aVar.mo102631A(i3 << 5, this.f84057d[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: m */
    public int mo102672m() {
        return this.f84056c;
    }

    /* renamed from: n */
    public int[] mo102673n() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f84057d;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f84056c;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: o */
    public int mo102674o() {
        return this.f84054a;
    }

    public String toString() {
        return mo102656B("X ", GlideException.C22148a.f56917d);
    }

    /* renamed from: u */
    public void mo102676u() {
        int o = mo102674o();
        int k = mo102670k();
        C34709a aVar = new C34709a(o);
        C34709a aVar2 = new C34709a(o);
        for (int i = 0; i < (k + 1) / 2; i++) {
            aVar = mo102671l(i, aVar);
            int i2 = (k - 1) - i;
            aVar2 = mo102671l(i2, aVar2);
            aVar.mo102653v();
            aVar2.mo102653v();
            mo102655A(i, aVar2);
            mo102655A(i2, aVar);
        }
    }

    /* renamed from: v */
    public void mo102677v(int i, int i2) {
        int i3 = (i2 * this.f84056c) + (i / 32);
        int[] iArr = this.f84057d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: x */
    public void mo102678x(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f84055b || i5 > this.f84054a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f84056c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f84057d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public C34710b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f84054a = i;
        this.f84055b = i2;
        int i3 = (i + 31) / 32;
        this.f84056c = i3;
        this.f84057d = new int[(i3 * i2)];
    }

    public C34710b(int i, int i2, int i3, int[] iArr) {
        this.f84054a = i;
        this.f84055b = i2;
        this.f84056c = i3;
        this.f84057d = iArr;
    }
}
