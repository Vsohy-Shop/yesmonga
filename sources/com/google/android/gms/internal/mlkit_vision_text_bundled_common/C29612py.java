package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.py */
public final class C29612py extends C29686ry {

    /* renamed from: e */
    public final byte[] f71409e;

    /* renamed from: f */
    public final int f71410f;

    /* renamed from: g */
    public int f71411g;

    public C29612py(byte[] bArr, int i, int i2) {
        super((C29649qy) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f71409e = bArr;
                this.f71411g = 0;
                this.f71410f = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: A */
    public final void mo84765A(int i, int i2) throws IOException {
        mo84767C((i << 3) | i2);
    }

    /* renamed from: B */
    public final void mo84766B(int i, int i2) throws IOException {
        mo84767C(i << 3);
        mo84767C(i2);
    }

    /* renamed from: C */
    public final void mo84767C(int i) throws IOException {
        if (C29686ry.f71443c) {
            int i2 = C29759tx.f71479a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f71409e;
            int i3 = this.f71411g;
            this.f71411g = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f71409e;
            int i4 = this.f71411g;
            this.f71411g = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zbwv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f71411g), Integer.valueOf(this.f71410f), 1}), e);
        }
    }

    /* renamed from: D */
    public final void mo84768D(int i, long j) throws IOException {
        mo84767C(i << 3);
        mo84769E(j);
    }

    /* renamed from: E */
    public final void mo84769E(long j) throws IOException {
        if (!C29686ry.f71443c || this.f71410f - this.f71411g < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f71409e;
                int i = this.f71411g;
                this.f71411g = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f71409e;
                int i2 = this.f71411g;
                this.f71411g = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zbwv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f71411g), Integer.valueOf(this.f71410f), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f71409e;
                int i3 = this.f71411g;
                this.f71411g = i3 + 1;
                C29725t.m121147s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f71409e;
            int i4 = this.f71411g;
            this.f71411g = i4 + 1;
            C29725t.m121147s(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: K */
    public final void mo84770K(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f71409e, this.f71411g, i2);
            this.f71411g += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zbwv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f71411g), Integer.valueOf(this.f71410f), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: l */
    public final int mo84771l() {
        return this.f71410f - this.f71411g;
    }

    /* renamed from: m */
    public final void mo84772m(byte b) throws IOException {
        try {
            byte[] bArr = this.f71409e;
            int i = this.f71411g;
            this.f71411g = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zbwv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f71411g), Integer.valueOf(this.f71410f), 1}), e);
        }
    }

    /* renamed from: n */
    public final void mo84773n(int i, boolean z) throws IOException {
        mo84767C(i << 3);
        mo84772m(z ? (byte) 1 : 0);
    }

    /* renamed from: o */
    public final void mo84774o(int i, zbwp zbwp) throws IOException {
        mo84767C((i << 3) | 2);
        mo84775p(zbwp);
    }

    /* renamed from: p */
    public final void mo84775p(zbwp zbwp) throws IOException {
        mo84767C(zbwp.mo84991i());
        zbwp.mo84996w(this);
    }

    /* renamed from: q */
    public final void mo84776q(int i, int i2) throws IOException {
        mo84767C((i << 3) | 5);
        mo84777r(i2);
    }

    /* renamed from: r */
    public final void mo84777r(int i) throws IOException {
        try {
            byte[] bArr = this.f71409e;
            int i2 = this.f71411g;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f71411g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zbwv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f71411g), Integer.valueOf(this.f71410f), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo84778s(int i, long j) throws IOException {
        mo84767C((i << 3) | 1);
        mo84779t(j);
    }

    /* renamed from: t */
    public final void mo84779t(long j) throws IOException {
        try {
            byte[] bArr = this.f71409e;
            int i = this.f71411g;
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
            this.f71411g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zbwv(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f71411g), Integer.valueOf(this.f71410f), 1}), e);
        }
    }

    /* renamed from: u */
    public final void mo84780u(int i, int i2) throws IOException {
        mo84767C(i << 3);
        mo84781v(i2);
    }

    /* renamed from: v */
    public final void mo84781v(int i) throws IOException {
        if (i >= 0) {
            mo84767C(i);
        } else {
            mo84769E((long) i);
        }
    }

    /* renamed from: w */
    public final void mo84782w(byte[] bArr, int i, int i2) throws IOException {
        mo84770K(bArr, 0, i2);
    }

    /* renamed from: x */
    public final void mo84783x(x00 x00) throws IOException {
        mo84767C(x00.mo84727b());
        x00.mo84732f(this);
    }

    /* renamed from: y */
    public final void mo84784y(int i, String str) throws IOException {
        mo84767C((i << 3) | 2);
        mo84785z(str);
    }

    /* renamed from: z */
    public final void mo84785z(String str) throws IOException {
        int i = this.f71411g;
        try {
            int f = C29686ry.m121015f(str.length() * 3);
            int f2 = C29686ry.m121015f(str.length());
            if (f2 == f) {
                int i2 = i + f2;
                this.f71411g = i2;
                int b = C29873x.m121296b(str, this.f71409e, i2, this.f71410f - i2);
                this.f71411g = i;
                mo84767C((b - i) - f2);
                this.f71411g = b;
                return;
            }
            mo84767C(C29873x.m121297c(str));
            byte[] bArr = this.f71409e;
            int i3 = this.f71411g;
            this.f71411g = C29873x.m121296b(str, bArr, i3, this.f71410f - i3);
        } catch (zbaaw e) {
            this.f71411g = i;
            mo84815j(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zbwv(e2);
        }
    }
}
