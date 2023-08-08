package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h5 */
public final class C38938h5 {

    /* renamed from: f */
    public static final C38938h5 f98861f = new C38938h5(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f98862a;

    /* renamed from: b */
    public int[] f98863b;

    /* renamed from: c */
    public Object[] f98864c;

    /* renamed from: d */
    public int f98865d;

    /* renamed from: e */
    public boolean f98866e;

    public C38938h5(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f98865d = -1;
        this.f98862a = i;
        this.f98863b = iArr;
        this.f98864c = objArr;
        this.f98866e = z;
    }

    /* renamed from: c */
    public static C38938h5 m160536c() {
        return f98861f;
    }

    /* renamed from: d */
    public static C38938h5 m160537d(C38938h5 h5Var, C38938h5 h5Var2) {
        int i = h5Var.f98862a + h5Var2.f98862a;
        int[] copyOf = Arrays.copyOf(h5Var.f98863b, i);
        System.arraycopy(h5Var2.f98863b, 0, copyOf, h5Var.f98862a, h5Var2.f98862a);
        Object[] copyOf2 = Arrays.copyOf(h5Var.f98864c, i);
        System.arraycopy(h5Var2.f98864c, 0, copyOf2, h5Var.f98862a, h5Var2.f98862a);
        return new C38938h5(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static C38938h5 m160538e() {
        return new C38938h5(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo122920a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f98865d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f98862a; i6++) {
            int i7 = this.f98863b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f98864c[i6]).longValue();
                    i = C39056u1.m160858d(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int d = C39056u1.m160858d(i8 << 3);
                    int k = ((zzdc) this.f98864c[i6]).mo123184k();
                    i5 += d + C39056u1.m160858d(k) + k;
                } else if (i9 == 3) {
                    int c = C39056u1.m160857c(i8);
                    i3 = c + c;
                    i2 = ((C38938h5) this.f98864c[i6]).mo122920a();
                } else if (i9 == 5) {
                    ((Integer) this.f98864c[i6]).intValue();
                    i = C39056u1.m160858d(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzep.m161100a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f98864c[i6]).longValue();
                i3 = C39056u1.m160858d(i8 << 3);
                i2 = C39056u1.m160859e(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f98865d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo122921b() {
        int i = this.f98865d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f98862a; i3++) {
            int i4 = this.f98863b[i3];
            int d = C39056u1.m160858d(8);
            int k = ((zzdc) this.f98864c[i3]).mo123184k();
            i2 += d + d + C39056u1.m160858d(16) + C39056u1.m160858d(i4 >>> 3) + C39056u1.m160858d(24) + C39056u1.m160858d(k) + k;
        }
        this.f98865d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C38938h5)) {
            return false;
        }
        C38938h5 h5Var = (C38938h5) obj;
        int i = this.f98862a;
        if (i == h5Var.f98862a) {
            int[] iArr = this.f98863b;
            int[] iArr2 = h5Var.f98863b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f98864c;
                    Object[] objArr2 = h5Var.f98864c;
                    int i3 = this.f98862a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo122923f() {
        this.f98866e = false;
    }

    /* renamed from: g */
    public final void mo122924g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f98862a; i2++) {
            C39094y3.m160985b(sb, i, String.valueOf(this.f98863b[i2] >>> 3), this.f98864c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo122925h(int i, Object obj) {
        int i2;
        if (this.f98866e) {
            int i3 = this.f98862a;
            int[] iArr = this.f98863b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f98863b = Arrays.copyOf(iArr, i4);
                this.f98864c = Arrays.copyOf(this.f98864c, i4);
            }
            int[] iArr2 = this.f98863b;
            int i5 = this.f98862a;
            iArr2[i5] = i;
            this.f98864c[i5] = obj;
            this.f98862a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f98862a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f98863b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f98864c;
        int i7 = this.f98862a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo122927i(C39065v1 v1Var) throws IOException {
        for (int i = 0; i < this.f98862a; i++) {
            v1Var.mo123072I(this.f98863b[i] >>> 3, this.f98864c[i]);
        }
    }

    /* renamed from: j */
    public final void mo122928j(C39065v1 v1Var) throws IOException {
        if (this.f98862a != 0) {
            for (int i = 0; i < this.f98862a; i++) {
                int i2 = this.f98863b[i];
                Object obj = this.f98864c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    v1Var.mo123069F(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    v1Var.mo123099y(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    v1Var.mo123090p(i3, (zzdc) obj);
                } else if (i4 == 3) {
                    v1Var.mo123081f(i3);
                    ((C38938h5) obj).mo122928j(v1Var);
                    v1Var.mo123094t(i3);
                } else if (i4 == 5) {
                    v1Var.mo123097w(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzep.m161100a());
                }
            }
        }
    }

    public C38938h5() {
        this(0, new int[8], new Object[8], true);
    }
}
