package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1 */
public final class C39038s1 extends C39056u1 {

    /* renamed from: d */
    public final byte[] f98936d;

    /* renamed from: e */
    public final int f98937e;

    /* renamed from: f */
    public int f98938f;

    public C39038s1(byte[] bArr, int i, int i2) {
        super((C39047t1) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f98936d = bArr;
                this.f98938f = 0;
                this.f98937e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: H */
    public final void mo123031H(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f98936d, this.f98938f, i2);
            this.f98938f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f98938f), Integer.valueOf(this.f98937e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: I */
    public final void mo123032I(String str) throws IOException {
        int i = this.f98938f;
        try {
            int d = C39056u1.m160858d(str.length() * 3);
            int d2 = C39056u1.m160858d(str.length());
            if (d2 == d) {
                int i2 = i + d2;
                this.f98938f = i2;
                int d3 = C39060u5.m160886d(str, this.f98936d, i2, this.f98937e - i2);
                this.f98938f = i;
                mo123047x((d3 - i) - d2);
                this.f98938f = d3;
                return;
            }
            mo123047x(C39060u5.m160887e(str));
            byte[] bArr = this.f98936d;
            int i3 = this.f98938f;
            this.f98938f = C39060u5.m160886d(str, bArr, i3, this.f98937e - i3);
        } catch (zzhn e) {
            this.f98938f = i;
            mo123060h(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdi(e2);
        }
    }

    /* renamed from: j */
    public final int mo123033j() {
        return this.f98937e - this.f98938f;
    }

    /* renamed from: k */
    public final void mo123034k(byte b) throws IOException {
        try {
            byte[] bArr = this.f98936d;
            int i = this.f98938f;
            this.f98938f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f98938f), Integer.valueOf(this.f98937e), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo123035l(int i, boolean z) throws IOException {
        mo123047x(i << 3);
        mo123034k(z ? (byte) 1 : 0);
    }

    /* renamed from: m */
    public final void mo123036m(int i, zzdc zzdc) throws IOException {
        mo123047x((i << 3) | 2);
        mo123047x(zzdc.mo123184k());
        zzdc.mo123193Q(this);
    }

    /* renamed from: n */
    public final void mo123037n(int i, int i2) throws IOException {
        mo123047x((i << 3) | 5);
        mo123038o(i2);
    }

    /* renamed from: o */
    public final void mo123038o(int i) throws IOException {
        try {
            byte[] bArr = this.f98936d;
            int i2 = this.f98938f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f98938f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f98938f), Integer.valueOf(this.f98937e), 1}), e);
        }
    }

    /* renamed from: p */
    public final void mo123039p(int i, long j) throws IOException {
        mo123047x((i << 3) | 1);
        mo123040q(j);
    }

    /* renamed from: q */
    public final void mo123040q(long j) throws IOException {
        try {
            byte[] bArr = this.f98936d;
            int i = this.f98938f;
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
            this.f98938f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f98938f), Integer.valueOf(this.f98937e), 1}), e);
        }
    }

    /* renamed from: r */
    public final void mo123041r(int i, int i2) throws IOException {
        mo123047x(i << 3);
        mo123042s(i2);
    }

    /* renamed from: s */
    public final void mo123042s(int i) throws IOException {
        if (i >= 0) {
            mo123047x(i);
        } else {
            mo123049z((long) i);
        }
    }

    /* renamed from: t */
    public final void mo123043t(byte[] bArr, int i, int i2) throws IOException {
        mo123031H(bArr, 0, i2);
    }

    /* renamed from: u */
    public final void mo123044u(int i, String str) throws IOException {
        mo123047x((i << 3) | 2);
        mo123032I(str);
    }

    /* renamed from: v */
    public final void mo123045v(int i, int i2) throws IOException {
        mo123047x((i << 3) | i2);
    }

    /* renamed from: w */
    public final void mo123046w(int i, int i2) throws IOException {
        mo123047x(i << 3);
        mo123047x(i2);
    }

    /* renamed from: x */
    public final void mo123047x(int i) throws IOException {
        if (C39056u1.f98944c) {
            int i2 = C38874b1.f98808a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f98936d;
            int i3 = this.f98938f;
            this.f98938f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f98936d;
            int i4 = this.f98938f;
            this.f98938f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f98938f), Integer.valueOf(this.f98937e), 1}), e);
        }
    }

    /* renamed from: y */
    public final void mo123048y(int i, long j) throws IOException {
        mo123047x(i << 3);
        mo123049z(j);
    }

    /* renamed from: z */
    public final void mo123049z(long j) throws IOException {
        if (!C39056u1.f98944c || this.f98937e - this.f98938f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f98936d;
                int i = this.f98938f;
                this.f98938f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f98936d;
                int i2 = this.f98938f;
                this.f98938f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzdi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f98938f), Integer.valueOf(this.f98937e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f98936d;
                int i3 = this.f98938f;
                this.f98938f = i3 + 1;
                C39024q5.m160729s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f98936d;
            int i4 = this.f98938f;
            this.f98938f = i4 + 1;
            C39024q5.m160729s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
