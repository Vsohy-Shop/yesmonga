package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

final class zbwi extends zbwm {
    private final int zbc;

    public zbwi(byte[] bArr, int i, int i2) {
        super(bArr);
        zbwp.m121495A(0, i2, bArr.length);
        this.zbc = i2;
    }

    /* renamed from: X */
    public final int mo84988X() {
        return 0;
    }

    /* renamed from: e */
    public final byte mo84989e(int i) {
        int i2 = this.zbc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zba[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: h */
    public final byte mo84990h(int i) {
        return this.zba[i];
    }

    /* renamed from: i */
    public final int mo84991i() {
        return this.zbc;
    }
}
