package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.b */
public final class C34804b extends C34808f {
    public C34804b(C34709a aVar) {
        super(aVar);
    }

    /* renamed from: h */
    public void mo102978h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    /* renamed from: i */
    public int mo102979i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
