package com.google.zxing.aztec.encoder;

import com.google.zxing.common.C34709a;
import kotlin.text.C11626x;

/* renamed from: com.google.zxing.aztec.encoder.b */
public final class C34637b extends C34643g {

    /* renamed from: c */
    public final short f83787c;

    /* renamed from: d */
    public final short f83788d;

    public C34637b(C34643g gVar, int i, int i2) {
        super(gVar);
        this.f83787c = (short) i;
        this.f83788d = (short) i2;
    }

    /* renamed from: c */
    public void mo102455c(C34709a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f83788d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo102638e(31, 5);
                    short s2 = this.f83788d;
                    if (s2 > 62) {
                        aVar.mo102638e(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo102638e(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo102638e(s2 - 31, 5);
                    }
                }
                aVar.mo102638e(bArr[this.f83787c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f83787c);
        sb.append("::");
        sb.append((this.f83787c + this.f83788d) - 1);
        sb.append(C11626x.f28915f);
        return sb.toString();
    }
}
