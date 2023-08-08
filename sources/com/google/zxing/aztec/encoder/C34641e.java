package com.google.zxing.aztec.encoder;

import com.google.zxing.common.C34709a;
import kotlin.text.C11626x;

/* renamed from: com.google.zxing.aztec.encoder.e */
public final class C34641e extends C34643g {

    /* renamed from: c */
    public final short f83805c;

    /* renamed from: d */
    public final short f83806d;

    public C34641e(C34643g gVar, int i, int i2) {
        super(gVar);
        this.f83805c = (short) i;
        this.f83806d = (short) i2;
    }

    /* renamed from: c */
    public void mo102455c(C34709a aVar, byte[] bArr) {
        aVar.mo102638e(this.f83805c, this.f83806d);
    }

    public String toString() {
        short s = this.f83805c;
        short s2 = this.f83806d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f83806d)).substring(1) + C11626x.f28915f;
    }
}
