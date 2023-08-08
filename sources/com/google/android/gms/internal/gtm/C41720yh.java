package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.gtm.yh */
public final class C41720yh extends C41144ai {

    /* renamed from: d */
    public final byte[] f105307d;

    /* renamed from: e */
    public final int f105308e;

    /* renamed from: f */
    public int f105309f;

    public C41720yh(byte[] bArr, int i, int i2) {
        super((C41744zh) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f105307d = bArr;
                this.f105309f = 0;
                this.f105308e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: H */
    public final void mo136109H(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f105307d, this.f105309f, i2);
            this.f105309f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f105309f), Integer.valueOf(this.f105308e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: I */
    public final void mo136110I(String str) throws IOException {
        int i = this.f105309f;
        try {
            int d = C41144ai.m167094d(str.length() * 3);
            int d2 = C41144ai.m167094d(str.length());
            if (d2 == d) {
                int i2 = i + d2;
                this.f105309f = i2;
                int b = C41461nm.m168093b(str, this.f105307d, i2, this.f105308e - i2);
                this.f105309f = i;
                mo135023x((b - i) - d2);
                this.f105309f = b;
                return;
            }
            mo135023x(C41461nm.m168094c(str));
            byte[] bArr = this.f105307d;
            int i3 = this.f105309f;
            this.f105309f = C41461nm.m168093b(str, bArr, i3, this.f105308e - i3);
        } catch (zzyc e) {
            this.f105309f = i;
            mo135008h(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zztm(e2);
        }
    }

    /* renamed from: j */
    public final int mo135009j() {
        return this.f105308e - this.f105309f;
    }

    /* renamed from: k */
    public final void mo135010k(byte b) throws IOException {
        try {
            byte[] bArr = this.f105307d;
            int i = this.f105309f;
            this.f105309f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f105309f), Integer.valueOf(this.f105308e), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo135011l(int i, boolean z) throws IOException {
        mo135023x(i << 3);
        mo135010k(z ? (byte) 1 : 0);
    }

    /* renamed from: m */
    public final void mo135012m(int i, zztd zztd) throws IOException {
        mo135023x((i << 3) | 2);
        mo135023x(zztd.mo136144i());
        zztd.mo136152y(this);
    }

    /* renamed from: n */
    public final void mo135013n(int i, int i2) throws IOException {
        mo135023x((i << 3) | 5);
        mo135014o(i2);
    }

    /* renamed from: o */
    public final void mo135014o(int i) throws IOException {
        try {
            byte[] bArr = this.f105307d;
            int i2 = this.f105309f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f105309f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f105309f), Integer.valueOf(this.f105308e), 1}), e);
        }
    }

    /* renamed from: p */
    public final void mo135015p(int i, long j) throws IOException {
        mo135023x((i << 3) | 1);
        mo135016q(j);
    }

    /* renamed from: q */
    public final void mo135016q(long j) throws IOException {
        try {
            byte[] bArr = this.f105307d;
            int i = this.f105309f;
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
            this.f105309f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f105309f), Integer.valueOf(this.f105308e), 1}), e);
        }
    }

    /* renamed from: r */
    public final void mo135017r(int i, int i2) throws IOException {
        mo135023x(i << 3);
        mo135018s(i2);
    }

    /* renamed from: s */
    public final void mo135018s(int i) throws IOException {
        if (i >= 0) {
            mo135023x(i);
        } else {
            mo135025z((long) i);
        }
    }

    /* renamed from: t */
    public final void mo135019t(byte[] bArr, int i, int i2) throws IOException {
        mo136109H(bArr, 0, i2);
    }

    /* renamed from: u */
    public final void mo135020u(int i, String str) throws IOException {
        mo135023x((i << 3) | 2);
        mo136110I(str);
    }

    /* renamed from: v */
    public final void mo135021v(int i, int i2) throws IOException {
        mo135023x((i << 3) | i2);
    }

    /* renamed from: w */
    public final void mo135022w(int i, int i2) throws IOException {
        mo135023x(i << 3);
        mo135023x(i2);
    }

    /* renamed from: x */
    public final void mo135023x(int i) throws IOException {
        if (C41144ai.f104443c) {
            int i2 = C41143ah.f104441a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f105307d;
            int i3 = this.f105309f;
            this.f105309f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f105307d;
            int i4 = this.f105309f;
            this.f105309f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f105309f), Integer.valueOf(this.f105308e), 1}), e);
        }
    }

    /* renamed from: y */
    public final void mo135024y(int i, long j) throws IOException {
        mo135023x(i << 3);
        mo135025z(j);
    }

    /* renamed from: z */
    public final void mo135025z(long j) throws IOException {
        if (!C41144ai.f104443c || this.f105308e - this.f105309f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f105307d;
                int i = this.f105309f;
                this.f105309f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f105307d;
                int i2 = this.f105309f;
                this.f105309f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zztm(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f105309f), Integer.valueOf(this.f105308e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f105307d;
                int i3 = this.f105309f;
                this.f105309f = i3 + 1;
                C41340im.m167761s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f105307d;
            int i4 = this.f105309f;
            this.f105309f = i4 + 1;
            C41340im.m167761s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
