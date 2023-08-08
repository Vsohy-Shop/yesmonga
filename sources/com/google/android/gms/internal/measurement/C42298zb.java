package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.zb */
public final class C42298zb {

    /* renamed from: f */
    public static final C42298zb f106603f = new C42298zb(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f106604a;

    /* renamed from: b */
    public int[] f106605b;

    /* renamed from: c */
    public Object[] f106606c;

    /* renamed from: d */
    public int f106607d;

    /* renamed from: e */
    public boolean f106608e;

    public C42298zb(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f106607d = -1;
        this.f106604a = i;
        this.f106605b = iArr;
        this.f106606c = objArr;
        this.f106608e = z;
    }

    /* renamed from: c */
    public static C42298zb m171286c() {
        return f106603f;
    }

    /* renamed from: e */
    public static C42298zb m171287e(C42298zb zbVar, C42298zb zbVar2) {
        int i = zbVar.f106604a + zbVar2.f106604a;
        int[] copyOf = Arrays.copyOf(zbVar.f106605b, i);
        System.arraycopy(zbVar2.f106605b, 0, copyOf, zbVar.f106604a, zbVar2.f106604a);
        Object[] copyOf2 = Arrays.copyOf(zbVar.f106606c, i);
        System.arraycopy(zbVar2.f106606c, 0, copyOf2, zbVar.f106604a, zbVar2.f106604a);
        return new C42298zb(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C42298zb m171288f() {
        return new C42298zb(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo137523a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f106607d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f106604a; i6++) {
            int i7 = this.f106605b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f106606c[i6]).longValue();
                    i = C42295z8.m171215y(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = C42295z8.f106584d;
                    int i11 = ((zzka) this.f106606c[i6]).mo137593i();
                    i = C42295z8.m171215y(i8 << 3) + C42295z8.m171215y(i11) + i11;
                } else if (i9 == 3) {
                    int i12 = i8 << 3;
                    int i13 = C42295z8.f106584d;
                    i2 = ((C42298zb) this.f106606c[i6]).mo137523a();
                    int y = C42295z8.m171215y(i12);
                    i3 = y + y;
                } else if (i9 == 5) {
                    ((Integer) this.f106606c[i6]).intValue();
                    i = C42295z8.m171215y(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzll.m171372a());
                }
                i5 += i;
            } else {
                int i14 = i8 << 3;
                i2 = C42295z8.m171216z(((Long) this.f106606c[i6]).longValue());
                i3 = C42295z8.m171215y(i14);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f106607d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo137524b() {
        int i = this.f106607d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f106604a; i3++) {
            int i4 = C42295z8.f106584d;
            int i5 = ((zzka) this.f106606c[i3]).mo137593i();
            int y = C42295z8.m171215y(i5) + i5;
            int y2 = C42295z8.m171215y(16);
            int y3 = C42295z8.m171215y(this.f106605b[i3] >>> 3);
            int y4 = C42295z8.m171215y(8);
            i2 += y4 + y4 + y2 + y3 + C42295z8.m171215y(24) + y;
        }
        this.f106607d = i2;
        return i2;
    }

    /* renamed from: d */
    public final C42298zb mo137525d(C42298zb zbVar) {
        if (zbVar.equals(f106603f)) {
            return this;
        }
        mo137527g();
        int i = this.f106604a + zbVar.f106604a;
        mo137533l(i);
        System.arraycopy(zbVar.f106605b, 0, this.f106605b, this.f106604a, zbVar.f106604a);
        System.arraycopy(zbVar.f106606c, 0, this.f106606c, this.f106604a, zbVar.f106604a);
        this.f106604a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C42298zb)) {
            return false;
        }
        C42298zb zbVar = (C42298zb) obj;
        int i = this.f106604a;
        if (i == zbVar.f106604a) {
            int[] iArr = this.f106605b;
            int[] iArr2 = zbVar.f106605b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f106606c;
                    Object[] objArr2 = zbVar.f106606c;
                    int i3 = this.f106604a;
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

    /* renamed from: g */
    public final void mo137527g() {
        if (!this.f106608e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo137528h() {
        if (this.f106608e) {
            this.f106608e = false;
        }
    }

    public final int hashCode() {
        int i = this.f106604a;
        int i2 = i + 527;
        int[] iArr = this.f106605b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f106606c;
        int i7 = this.f106604a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    /* renamed from: i */
    public final void mo137530i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f106604a; i2++) {
            C42280ya.m171173b(sb, i, String.valueOf(this.f106605b[i2] >>> 3), this.f106606c[i2]);
        }
    }

    /* renamed from: j */
    public final void mo137531j(int i, Object obj) {
        mo137527g();
        mo137533l(this.f106604a + 1);
        int[] iArr = this.f106605b;
        int i2 = this.f106604a;
        iArr[i2] = i;
        this.f106606c[i2] = obj;
        this.f106604a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo137532k(C42112oc ocVar) throws IOException {
        if (this.f106604a != 0) {
            for (int i = 0; i < this.f106604a; i++) {
                int i2 = this.f106605b[i];
                Object obj = this.f106606c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ocVar.mo136542f(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ocVar.mo136534H(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ocVar.mo136551o(i4, (zzka) obj);
                } else if (i3 == 3) {
                    ocVar.mo136552p(i4);
                    ((C42298zb) obj).mo137532k(ocVar);
                    ocVar.mo136536U(i4);
                } else if (i3 == 5) {
                    ocVar.mo136557u(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzll.m171372a());
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo137533l(int i) {
        int[] iArr = this.f106605b;
        if (i > iArr.length) {
            int i2 = this.f106604a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f106605b = Arrays.copyOf(iArr, i);
            this.f106606c = Arrays.copyOf(this.f106606c, i);
        }
    }

    public C42298zb() {
        this(0, new int[8], new Object[8], true);
    }
}
