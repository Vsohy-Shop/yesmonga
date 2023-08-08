package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u8 */
public final class C42210u8 extends C42244w8 {

    /* renamed from: c */
    public final byte[] f106448c;

    /* renamed from: d */
    public int f106449d;

    /* renamed from: e */
    public int f106450e;

    /* renamed from: f */
    public int f106451f = Integer.MAX_VALUE;

    public /* synthetic */ C42210u8(byte[] bArr, int i, int i2, boolean z, C42193t8 t8Var) {
        super((C42227v8) null);
        this.f106448c = bArr;
        this.f106449d = 0;
    }

    /* renamed from: c */
    public final int mo137341c(int i) throws zzll {
        int i2 = this.f106451f;
        this.f106451f = 0;
        int i3 = this.f106449d + this.f106450e;
        this.f106449d = i3;
        if (i3 > 0) {
            this.f106450e = i3;
            this.f106449d = i3 - i3;
        } else {
            this.f106450e = 0;
        }
        return i2;
    }
}
