package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p1 */
public final class C39011p1 extends C39029r1 {

    /* renamed from: c */
    public final byte[] f98909c;

    /* renamed from: d */
    public int f98910d;

    /* renamed from: e */
    public int f98911e;

    /* renamed from: f */
    public int f98912f = Integer.MAX_VALUE;

    public /* synthetic */ C39011p1(byte[] bArr, int i, int i2, boolean z, C39002o1 o1Var) {
        super((C39020q1) null);
        this.f98909c = bArr;
        this.f98910d = 0;
    }

    /* renamed from: c */
    public final int mo122997c(int i) throws zzep {
        int i2 = this.f98912f;
        this.f98912f = 0;
        int i3 = this.f98910d + this.f98911e;
        this.f98910d = i3;
        if (i3 > 0) {
            this.f98911e = i3;
            this.f98910d = 0;
        } else {
            this.f98911e = 0;
        }
        return i2;
    }
}
