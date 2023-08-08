package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.g */
public final class C34809g extends C34810h {

    /* renamed from: d */
    public static final int f84481d = 4;

    public C34809g(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo102980d() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(mo102985b().mo103005f(4, 4));
        mo102983g(sb, 8, length);
        return mo102985b().mo103000a(sb, 48);
    }
}
