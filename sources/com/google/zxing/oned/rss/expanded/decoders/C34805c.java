package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.c */
public final class C34805c extends C34810h {

    /* renamed from: d */
    public static final int f84469d = 8;

    /* renamed from: e */
    public static final int f84470e = 2;

    public C34805c(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo102980d() throws NotFoundException, FormatException {
        if (mo102986c().mo102649o() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo102982f(sb, 8);
            int f = mo102985b().mo103005f(48, 2);
            sb.append("(392");
            sb.append(f);
            sb.append(')');
            sb.append(mo102985b().mo103002c(50, (String) null).mo102991b());
            return sb.toString();
        }
        throw NotFoundException.m141229a();
    }
}
