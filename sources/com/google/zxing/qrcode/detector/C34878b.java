package com.google.zxing.qrcode.detector;

import com.google.zxing.C34763m;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.qrcode.detector.b */
public final class C34878b {

    /* renamed from: a */
    public final C34710b f84762a;

    /* renamed from: b */
    public final List<C34877a> f84763b = new ArrayList(5);

    /* renamed from: c */
    public final int f84764c;

    /* renamed from: d */
    public final int f84765d;

    /* renamed from: e */
    public final int f84766e;

    /* renamed from: f */
    public final int f84767f;

    /* renamed from: g */
    public final float f84768g;

    /* renamed from: h */
    public final int[] f84769h;

    /* renamed from: i */
    public final C34763m f84770i;

    public C34878b(C34710b bVar, int i, int i2, int i3, int i4, float f, C34763m mVar) {
        this.f84762a = bVar;
        this.f84764c = i;
        this.f84765d = i2;
        this.f84766e = i3;
        this.f84767f = i4;
        this.f84768g = f;
        this.f84769h = new int[3];
        this.f84770i = mVar;
    }

    /* renamed from: a */
    public static float m142508a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    public final float mo103211b(int i, int i2, int i3, int i4) {
        C34710b bVar = this.f84762a;
        int k = bVar.mo102670k();
        int[] iArr = this.f84769h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo102666h(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo102666h(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < k && bVar.mo102666h(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != k && iArr[1] <= i3) {
                while (i8 < k && !bVar.mo102666h(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && mo103213d(iArr)) {
                    return m142508a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: c */
    public C34877a mo103212c() throws NotFoundException {
        int i;
        C34877a e;
        C34877a e2;
        int i2 = this.f84764c;
        int i3 = this.f84767f;
        int i4 = this.f84766e + i2;
        int i5 = this.f84765d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f84762a.mo102666h(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (!this.f84762a.mo102666h(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 != 2) {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                } else if (mo103213d(iArr) && (e2 = mo103214e(iArr, i7, i8)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                }
                i8++;
            }
            if (mo103213d(iArr) && (e = mo103214e(iArr, i7, i4)) != null) {
                return e;
            }
        }
        if (!this.f84763b.isEmpty()) {
            return this.f84763b.get(0);
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: d */
    public final boolean mo103213d(int[] iArr) {
        float f = this.f84768g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C34877a mo103214e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m142508a(iArr, i2);
        float b = mo103211b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C34877a next : this.f84763b) {
            if (next.mo103209f(f, b, a)) {
                return next.mo103210g(b, a, f);
            }
        }
        C34877a aVar = new C34877a(a, b, f);
        this.f84763b.add(aVar);
        C34763m mVar = this.f84770i;
        if (mVar == null) {
            return null;
        }
        mVar.mo102888a(aVar);
        return null;
    }
}
