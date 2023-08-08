package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.f */
public abstract class C34808f extends C34811i {

    /* renamed from: d */
    public static final int f84479d = 5;

    /* renamed from: e */
    public static final int f84480e = 15;

    public C34808f(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo102980d() throws NotFoundException {
        if (mo102986c().mo102649o() == 60) {
            StringBuilder sb = new StringBuilder();
            mo102982f(sb, 5);
            mo102984j(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.m141229a();
    }
}
