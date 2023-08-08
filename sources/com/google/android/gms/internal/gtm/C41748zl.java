package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.gtm.zl */
public final class C41748zl {

    /* renamed from: f */
    public static final C41748zl f105328f = new C41748zl(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f105329a;

    /* renamed from: b */
    public int[] f105330b;

    /* renamed from: c */
    public Object[] f105331c;

    /* renamed from: d */
    public int f105332d;

    /* renamed from: e */
    public boolean f105333e;

    public C41748zl(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f105332d = -1;
        this.f105329a = i;
        this.f105330b = iArr;
        this.f105331c = objArr;
        this.f105333e = z;
    }

    /* renamed from: c */
    public static C41748zl m168947c() {
        return f105328f;
    }

    /* renamed from: d */
    public static C41748zl m168948d(C41748zl zlVar, C41748zl zlVar2) {
        int i = zlVar.f105329a + zlVar2.f105329a;
        int[] copyOf = Arrays.copyOf(zlVar.f105330b, i);
        System.arraycopy(zlVar2.f105330b, 0, copyOf, zlVar.f105329a, zlVar2.f105329a);
        Object[] copyOf2 = Arrays.copyOf(zlVar.f105331c, i);
        System.arraycopy(zlVar2.f105331c, 0, copyOf2, zlVar.f105329a, zlVar2.f105329a);
        return new C41748zl(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static C41748zl m168949e() {
        return new C41748zl(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo136126a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f105332d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f105329a; i6++) {
            int i7 = this.f105330b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f105331c[i6]).longValue();
                    i = C41144ai.m167094d(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int d = C41144ai.m167094d(i8 << 3);
                    int i10 = ((zztd) this.f105331c[i6]).mo136144i();
                    i5 += d + C41144ai.m167094d(i10) + i10;
                } else if (i9 == 3) {
                    int c = C41144ai.m167093c(i8);
                    i3 = c + c;
                    i2 = ((C41748zl) this.f105331c[i6]).mo136126a();
                } else if (i9 == 5) {
                    ((Integer) this.f105331c[i6]).intValue();
                    i = C41144ai.m167094d(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzvk.m168994a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f105331c[i6]).longValue();
                i3 = C41144ai.m167094d(i8 << 3);
                i2 = C41144ai.m167095e(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f105332d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo136127b() {
        int i = this.f105332d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f105329a; i3++) {
            int i4 = this.f105330b[i3];
            int d = C41144ai.m167094d(8);
            int i5 = ((zztd) this.f105331c[i3]).mo136144i();
            i2 += d + d + C41144ai.m167094d(16) + C41144ai.m167094d(i4 >>> 3) + C41144ai.m167094d(24) + C41144ai.m167094d(i5) + i5;
        }
        this.f105332d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C41748zl)) {
            return false;
        }
        C41748zl zlVar = (C41748zl) obj;
        int i = this.f105329a;
        if (i == zlVar.f105329a) {
            int[] iArr = this.f105330b;
            int[] iArr2 = zlVar.f105330b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f105331c;
                    Object[] objArr2 = zlVar.f105331c;
                    int i3 = this.f105329a;
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
    public final void mo136129f() {
        this.f105333e = false;
    }

    /* renamed from: g */
    public final void mo136130g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f105329a; i2++) {
            C41675wk.m168684b(sb, i, String.valueOf(this.f105330b[i2] >>> 3), this.f105331c[i2]);
        }
    }

    /* renamed from: h */
    public final void mo136131h(int i, Object obj) {
        int i2;
        if (this.f105333e) {
            int i3 = this.f105329a;
            int[] iArr = this.f105330b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f105330b = Arrays.copyOf(iArr, i4);
                this.f105331c = Arrays.copyOf(this.f105331c, i4);
            }
            int[] iArr2 = this.f105330b;
            int i5 = this.f105329a;
            iArr2[i5] = i;
            this.f105331c[i5] = obj;
            this.f105329a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f105329a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f105330b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f105331c;
        int i7 = this.f105329a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo136133i(C41168bi biVar) throws IOException {
        for (int i = 0; i < this.f105329a; i++) {
            biVar.mo135078I(this.f105330b[i] >>> 3, this.f105331c[i]);
        }
    }

    /* renamed from: j */
    public final void mo136134j(C41168bi biVar) throws IOException {
        if (this.f105329a != 0) {
            for (int i = 0; i < this.f105329a; i++) {
                int i2 = this.f105330b[i];
                Object obj = this.f105331c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    biVar.mo135075F(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    biVar.mo135105y(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    biVar.mo135096p(i3, (zztd) obj);
                } else if (i4 == 3) {
                    biVar.mo135087f(i3);
                    ((C41748zl) obj).mo136134j(biVar);
                    biVar.mo135100t(i3);
                } else if (i4 == 5) {
                    biVar.mo135103w(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzvk.m168994a());
                }
            }
        }
    }

    public C41748zl() {
        this(0, new int[8], new Object[8], true);
    }
}
