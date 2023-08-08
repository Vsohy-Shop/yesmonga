package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.i */
public abstract class C34811i extends C34810h {
    public C34811i(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: h */
    public abstract void mo102978h(StringBuilder sb, int i);

    /* renamed from: i */
    public abstract int mo102979i(int i);

    /* renamed from: j */
    public final void mo102984j(StringBuilder sb, int i, int i2) {
        int f = mo102985b().mo103005f(i, i2);
        mo102978h(sb, f);
        int i3 = mo102979i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
