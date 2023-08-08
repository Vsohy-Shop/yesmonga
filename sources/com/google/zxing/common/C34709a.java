package com.google.zxing.common;

import com.usabilla.sdk.ubform.sdk.field.model.common.MaskModel;
import java.util.Arrays;
import okhttp3.internal.p013ws.WebSocketProtocol;

/* renamed from: com.google.zxing.common.a */
public final class C34709a implements Cloneable {

    /* renamed from: a */
    public int[] f84052a;

    /* renamed from: b */
    public int f84053b;

    public C34709a() {
        this.f84053b = 0;
        this.f84052a = new int[1];
    }

    /* renamed from: u */
    public static int[] m141568u(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: A */
    public void mo102631A(int i, int i2) {
        this.f84052a[i / 32] = i2;
    }

    /* renamed from: B */
    public void mo102632B(int i, int i2) {
        int i3;
        if (i2 < i || i < 0 || i2 > this.f84053b) {
            throw new IllegalArgumentException();
        } else if (i2 != i) {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int[] iArr = this.f84052a;
                iArr[i7] = i9 | iArr[i7];
            }
        }
    }

    /* renamed from: C */
    public void mo102633C(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo102645k(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: D */
    public void mo102634D(C34709a aVar) {
        if (this.f84053b == aVar.f84053b) {
            int i = 0;
            while (true) {
                int[] iArr = this.f84052a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f84052a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: b */
    public void mo102635b(boolean z) {
        mo102643i(this.f84053b + 1);
        if (z) {
            int[] iArr = this.f84052a;
            int i = this.f84053b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f84053b++;
    }

    /* renamed from: c */
    public void mo102636c(C34709a aVar) {
        int i = aVar.f84053b;
        mo102643i(this.f84053b + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo102635b(aVar.mo102645k(i2));
        }
    }

    /* renamed from: e */
    public void mo102638e(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        mo102643i(this.f84053b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo102635b(z);
            i2--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34709a)) {
            return false;
        }
        C34709a aVar = (C34709a) obj;
        if (this.f84053b != aVar.f84053b || !Arrays.equals(this.f84052a, aVar.f84052a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo102640f() {
        int length = this.f84052a.length;
        for (int i = 0; i < length; i++) {
            this.f84052a[i] = 0;
        }
    }

    /* renamed from: h */
    public C34709a clone() {
        return new C34709a((int[]) this.f84052a.clone(), this.f84053b);
    }

    public int hashCode() {
        return (this.f84053b * 31) + Arrays.hashCode(this.f84052a);
    }

    /* renamed from: i */
    public final void mo102643i(int i) {
        if (i > (this.f84052a.length << 5)) {
            int[] u = m141568u(i);
            int[] iArr = this.f84052a;
            System.arraycopy(iArr, 0, u, 0, iArr.length);
            this.f84052a = u;
        }
    }

    /* renamed from: j */
    public void mo102644j(int i) {
        int[] iArr = this.f84052a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    /* renamed from: k */
    public boolean mo102645k(int i) {
        return ((1 << (i & 31)) & this.f84052a[i / 32]) != 0;
    }

    /* renamed from: l */
    public int[] mo102646l() {
        return this.f84052a;
    }

    /* renamed from: m */
    public int mo102647m(int i) {
        int i2 = this.f84053b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f84052a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f84052a;
            if (i3 == iArr.length) {
                return this.f84053b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f84053b;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    /* renamed from: n */
    public int mo102648n(int i) {
        int i2 = this.f84053b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.f84052a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f84052a;
            if (i3 == iArr.length) {
                return this.f84053b;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f84053b;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    /* renamed from: o */
    public int mo102649o() {
        return this.f84053b;
    }

    /* renamed from: s */
    public int mo102650s() {
        return (this.f84053b + 7) / 8;
    }

    /* renamed from: t */
    public boolean mo102651t(int i, int i2, boolean z) {
        int i3;
        if (i2 < i || i < 0 || i2 > this.f84053b) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i10 = this.f84052a[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
            }
            return true;
        }
    }

    public String toString() {
        char c;
        int i = this.f84053b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f84053b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (mo102645k(i2)) {
                c = MaskModel.f27490e;
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: v */
    public void mo102653v() {
        int[] iArr = new int[this.f84052a.length];
        int i = (this.f84053b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f84052a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i4 = this.f84053b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f84052a = iArr;
    }

    /* renamed from: x */
    public void mo102654x(int i) {
        int[] iArr = this.f84052a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public C34709a(int i) {
        this.f84053b = i;
        this.f84052a = m141568u(i);
    }

    public C34709a(int[] iArr, int i) {
        this.f84052a = iArr;
        this.f84053b = i;
    }
}
