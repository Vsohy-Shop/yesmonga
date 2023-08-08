package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.k */
public final class C29392k {

    /* renamed from: f */
    public static final C29392k f71308f = new C29392k(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f71309a;

    /* renamed from: b */
    public int[] f71310b;

    /* renamed from: c */
    public Object[] f71311c;

    /* renamed from: d */
    public int f71312d;

    /* renamed from: e */
    public boolean f71313e;

    public C29392k(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f71312d = -1;
        this.f71309a = i;
        this.f71310b = iArr;
        this.f71311c = objArr;
        this.f71313e = z;
    }

    /* renamed from: c */
    public static C29392k m120586c() {
        return f71308f;
    }

    /* renamed from: d */
    public static C29392k m120587d(C29392k kVar, C29392k kVar2) {
        int i = kVar.f71309a + kVar2.f71309a;
        int[] copyOf = Arrays.copyOf(kVar.f71310b, i);
        System.arraycopy(kVar2.f71310b, 0, copyOf, kVar.f71309a, kVar2.f71309a);
        Object[] copyOf2 = Arrays.copyOf(kVar.f71311c, i);
        System.arraycopy(kVar2.f71311c, 0, copyOf2, kVar.f71309a, kVar2.f71309a);
        return new C29392k(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static C29392k m120588e() {
        return new C29392k(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo84693a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f71312d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f71309a; i6++) {
            int i7 = this.f71310b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f71311c[i6]).longValue();
                    i = C29686ry.m121015f(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int f = C29686ry.m121015f(i8 << 3);
                    int i10 = ((zbwp) this.f71311c[i6]).mo84991i();
                    i5 += f + C29686ry.m121015f(i10) + i10;
                } else if (i9 == 3) {
                    int e = C29686ry.m121014e(i8);
                    i3 = e + e;
                    i2 = ((C29392k) this.f71311c[i6]).mo84693a();
                } else if (i9 == 5) {
                    ((Integer) this.f71311c[i6]).intValue();
                    i = C29686ry.m121015f(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zbye.m121509a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f71311c[i6]).longValue();
                i3 = C29686ry.m121015f(i8 << 3);
                i2 = C29686ry.m121016g(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f71312d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo84694b() {
        int i = this.f71312d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f71309a; i3++) {
            int i4 = this.f71310b[i3];
            int f = C29686ry.m121015f(8);
            int i5 = ((zbwp) this.f71311c[i3]).mo84991i();
            i2 += f + f + C29686ry.m121015f(16) + C29686ry.m121015f(i4 >>> 3) + C29686ry.m121015f(24) + C29686ry.m121015f(i5) + i5;
        }
        this.f71312d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C29392k)) {
            return false;
        }
        C29392k kVar = (C29392k) obj;
        int i = this.f71309a;
        if (i == kVar.f71309a) {
            int[] iArr = this.f71310b;
            int[] iArr2 = kVar.f71310b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f71311c;
                    Object[] objArr2 = kVar.f71311c;
                    int i3 = this.f71309a;
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
    public final void mo84696f() {
        this.f71313e = false;
    }

    /* renamed from: g */
    public final void mo84697g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f71309a; i2++) {
            z00.m121429b(sb, i, String.valueOf(this.f71310b[i2] >>> 3), this.f71311c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo84698h(int i, Object obj) {
        int i2;
        if (this.f71313e) {
            int i3 = this.f71309a;
            int[] iArr = this.f71310b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f71310b = Arrays.copyOf(iArr, i4);
                this.f71311c = Arrays.copyOf(this.f71311c, i4);
            }
            int[] iArr2 = this.f71310b;
            int i5 = this.f71309a;
            iArr2[i5] = i;
            this.f71311c[i5] = obj;
            this.f71309a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f71309a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f71310b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f71311c;
        int i7 = this.f71309a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo84700i(C29947z zVar) throws IOException {
        for (int i = 0; i < this.f71309a; i++) {
            zVar.mo84869r(this.f71310b[i] >>> 3, this.f71311c[i]);
        }
    }

    /* renamed from: j */
    public final void mo84701j(C29947z zVar) throws IOException {
        if (this.f71309a != 0) {
            for (int i = 0; i < this.f71309a; i++) {
                int i2 = this.f71310b[i];
                Object obj = this.f71311c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zVar.mo84843D(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zVar.mo84854c(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zVar.mo84856e(i3, (zbwp) obj);
                } else if (i4 == 3) {
                    zVar.mo84850K(i3);
                    ((C29392k) obj).mo84701j(zVar);
                    zVar.mo84875x(i3);
                } else if (i4 == 5) {
                    zVar.mo84858g(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zbye.m121509a());
                }
            }
        }
    }

    public C29392k() {
        this(0, new int[8], new Object[8], true);
    }
}
