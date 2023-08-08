package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.d */
public final class C34806d extends C34810h {

    /* renamed from: d */
    public static final int f84471d = 8;

    /* renamed from: e */
    public static final int f84472e = 2;

    /* renamed from: f */
    public static final int f84473f = 10;

    public C34806d(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo102980d() throws NotFoundException, FormatException {
        if (mo102986c().mo102649o() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo102982f(sb, 8);
            int f = mo102985b().mo103005f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo102985b().mo103005f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo102985b().mo103002c(60, (String) null).mo102991b());
            return sb.toString();
        }
        throw NotFoundException.m141229a();
    }
}
