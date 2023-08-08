package com.google.android.gms.internal.gtm;

final class zzsx extends zzta {
    private final int zzc;
    private final int zzd;

    public zzsx(byte[] bArr, int i, int i2) {
        super(bArr);
        zztd.m168977H(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    /* renamed from: e */
    public final byte mo136142e(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
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
    public final byte mo136143h(int i) {
        return this.zza[this.zzc + i];
    }

    /* renamed from: i */
    public final int mo136144i() {
        return this.zzd;
    }

    /* renamed from: k */
    public final void mo136145k(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i3);
    }

    /* renamed from: k0 */
    public final int mo136146k0() {
        return this.zzc;
    }
}
