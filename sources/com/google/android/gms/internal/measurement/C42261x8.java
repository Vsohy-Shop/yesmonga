package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.x8 */
public final class C42261x8 extends C42295z8 {

    /* renamed from: e */
    public final byte[] f106493e;

    /* renamed from: f */
    public final int f106494f;

    /* renamed from: g */
    public int f106495g;

    public C42261x8(byte[] bArr, int i, int i2) {
        super((C42278y8) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f106493e = bArr;
                this.f106495g = 0;
                this.f106494f = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: B */
    public final void mo137455B(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f106493e, this.f106495g, i2);
            this.f106495g += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f106495g), Integer.valueOf(this.f106494f), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: C */
    public final void mo137456C(String str) throws IOException {
        int i = this.f106495g;
        try {
            int y = C42295z8.m171215y(str.length() * 3);
            int y2 = C42295z8.m171215y(str.length());
            if (y2 == y) {
                int i2 = i + y2;
                this.f106495g = i2;
                int b = C42078mc.m170566b(str, this.f106493e, i2, this.f106494f - i2);
                this.f106495g = i;
                mo137471r((b - i) - y2);
                this.f106495g = b;
                return;
            }
            mo137471r(C42078mc.m170567c(str));
            byte[] bArr = this.f106493e;
            int i3 = this.f106495g;
            this.f106495g = C42078mc.m170566b(str, bArr, i3, this.f106494f - i3);
        } catch (zzny e) {
            this.f106495g = i;
            mo137496b(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(e2);
        }
    }

    /* renamed from: d */
    public final int mo137457d() {
        return this.f106494f - this.f106495g;
    }

    /* renamed from: e */
    public final void mo137458e(byte b) throws IOException {
        try {
            byte[] bArr = this.f106493e;
            int i = this.f106495g;
            this.f106495g = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f106495g), Integer.valueOf(this.f106494f), 1}), e);
        }
    }

    /* renamed from: f */
    public final void mo137459f(int i, boolean z) throws IOException {
        mo137471r(i << 3);
        mo137458e(z ? (byte) 1 : 0);
    }

    /* renamed from: g */
    public final void mo137460g(int i, zzka zzka) throws IOException {
        mo137471r((i << 3) | 2);
        mo137471r(zzka.mo137593i());
        zzka.mo137598w(this);
    }

    /* renamed from: h */
    public final void mo137461h(int i, int i2) throws IOException {
        mo137471r((i << 3) | 5);
        mo137462i(i2);
    }

    /* renamed from: i */
    public final void mo137462i(int i) throws IOException {
        try {
            byte[] bArr = this.f106493e;
            int i2 = this.f106495g;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f106495g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f106495g), Integer.valueOf(this.f106494f), 1}), e);
        }
    }

    /* renamed from: j */
    public final void mo137463j(int i, long j) throws IOException {
        mo137471r((i << 3) | 1);
        mo137464k(j);
    }

    /* renamed from: k */
    public final void mo137464k(long j) throws IOException {
        try {
            byte[] bArr = this.f106493e;
            int i = this.f106495g;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f106495g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f106495g), Integer.valueOf(this.f106494f), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo137465l(int i, int i2) throws IOException {
        mo137471r(i << 3);
        mo137466m(i2);
    }

    /* renamed from: m */
    public final void mo137466m(int i) throws IOException {
        if (i >= 0) {
            mo137471r(i);
        } else {
            mo137473t((long) i);
        }
    }

    /* renamed from: n */
    public final void mo137467n(byte[] bArr, int i, int i2) throws IOException {
        mo137455B(bArr, 0, i2);
    }

    /* renamed from: o */
    public final void mo137468o(int i, String str) throws IOException {
        mo137471r((i << 3) | 2);
        mo137456C(str);
    }

    /* renamed from: p */
    public final void mo137469p(int i, int i2) throws IOException {
        mo137471r((i << 3) | i2);
    }

    /* renamed from: q */
    public final void mo137470q(int i, int i2) throws IOException {
        mo137471r(i << 3);
        mo137471r(i2);
    }

    /* renamed from: r */
    public final void mo137471r(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f106493e;
            int i2 = this.f106495g;
            this.f106495g = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f106493e;
            int i3 = this.f106495g;
            this.f106495g = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f106495g), Integer.valueOf(this.f106494f), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo137472s(int i, long j) throws IOException {
        mo137471r(i << 3);
        mo137473t(j);
    }

    /* renamed from: t */
    public final void mo137473t(long j) throws IOException {
        if (!C42295z8.f106583c || this.f106494f - this.f106495g < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f106493e;
                int i = this.f106495g;
                this.f106495g = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f106493e;
                int i2 = this.f106495g;
                this.f106495g = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f106495g), Integer.valueOf(this.f106494f), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f106493e;
                int i3 = this.f106495g;
                this.f106495g = i3 + 1;
                C42006ic.m170308s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f106493e;
            int i4 = this.f106495g;
            this.f106495g = i4 + 1;
            C42006ic.m170308s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
