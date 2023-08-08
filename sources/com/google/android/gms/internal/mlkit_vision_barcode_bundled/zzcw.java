package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzcw extends zzcz {
    private final int zzc;
    private final int zzd;

    public zzcw(byte[] bArr, int i, int i2) {
        super(bArr);
        zzdc.m161076X(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    /* renamed from: e */
    public final byte mo123182e(int i) {
        zzdc.m161081o0(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    /* renamed from: h */
    public final byte mo123183h(int i) {
        return this.zza[this.zzc + i];
    }

    /* renamed from: k */
    public final int mo123184k() {
        return this.zzd;
    }

    /* renamed from: q */
    public final void mo123185q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }

    /* renamed from: t0 */
    public final int mo123186t0() {
        return this.zzc;
    }
}
