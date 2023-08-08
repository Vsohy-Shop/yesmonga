package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.h */
public abstract class C34810h extends C34812j {

    /* renamed from: c */
    public static final int f84482c = 40;

    public C34810h(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    public static void m142125e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* renamed from: f */
    public final void mo102982f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo102983g(sb, i, length);
    }

    /* renamed from: g */
    public final void mo102983g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo102985b().mo103005f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m142125e(sb, i2);
    }
}
