package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.j */
public abstract class C34812j {

    /* renamed from: a */
    public final C34709a f84483a;

    /* renamed from: b */
    public final C34820r f84484b;

    public C34812j(C34709a aVar) {
        this.f84483a = aVar;
        this.f84484b = new C34820r(aVar);
    }

    /* renamed from: a */
    public static C34812j m142131a(C34709a aVar) {
        if (aVar.mo102645k(1)) {
            return new C34809g(aVar);
        }
        if (!aVar.mo102645k(2)) {
            return new C34813k(aVar);
        }
        int g = C34820r.m142152g(aVar, 1, 4);
        if (g == 4) {
            return new C34803a(aVar);
        }
        if (g == 5) {
            return new C34804b(aVar);
        }
        int g2 = C34820r.m142152g(aVar, 1, 5);
        if (g2 == 12) {
            return new C34805c(aVar);
        }
        if (g2 == 13) {
            return new C34806d(aVar);
        }
        switch (C34820r.m142152g(aVar, 1, 7)) {
            case 56:
                return new C34807e(aVar, "310", "11");
            case 57:
                return new C34807e(aVar, "320", "11");
            case 58:
                return new C34807e(aVar, "310", "13");
            case 59:
                return new C34807e(aVar, "320", "13");
            case 60:
                return new C34807e(aVar, "310", "15");
            case 61:
                return new C34807e(aVar, "320", "15");
            case 62:
                return new C34807e(aVar, "310", "17");
            case 63:
                return new C34807e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    /* renamed from: b */
    public final C34820r mo102985b() {
        return this.f84484b;
    }

    /* renamed from: c */
    public final C34709a mo102986c() {
        return this.f84483a;
    }

    /* renamed from: d */
    public abstract String mo102980d() throws NotFoundException, FormatException;
}
