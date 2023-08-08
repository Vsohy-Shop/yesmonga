package com.google.android.gms.internal.measurement;

final class zzju extends zzjx {
    private final int zzc;

    public zzju(byte[] bArr, int i, int i2) {
        super(bArr);
        zzka.m171360A(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* renamed from: W */
    public final int mo137590W() {
        return 0;
    }

    /* renamed from: e */
    public final byte mo137591e(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: h */
    public final byte mo137592h(int i) {
        return this.zza[i];
    }

    /* renamed from: i */
    public final int mo137593i() {
        return this.zzc;
    }
}
