package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.a */
public final class C34739a implements C34745g {
    /* renamed from: c */
    public static char m141759c(char c, char c2) {
        if (C34748j.m141823g(c) && C34748j.m141823g(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    /* renamed from: a */
    public void mo102782a(C34746h hVar) {
        if (C34748j.m141817a(hVar.mo102806e(), hVar.f84183f) >= 2) {
            hVar.mo102820s(m141759c(hVar.mo102806e().charAt(hVar.f84183f), hVar.mo102806e().charAt(hVar.f84183f + 1)));
            hVar.f84183f += 2;
            return;
        }
        char d = hVar.mo102805d();
        int o = C34748j.m141831o(hVar.mo102806e(), hVar.f84183f, mo102783b());
        if (o != mo102783b()) {
            if (o == 1) {
                hVar.mo102820s(C34748j.f84193b);
                hVar.mo102817p(1);
            } else if (o == 2) {
                hVar.mo102820s(C34748j.f84199h);
                hVar.mo102817p(2);
            } else if (o == 3) {
                hVar.mo102820s(C34748j.f84198g);
                hVar.mo102817p(3);
            } else if (o == 4) {
                hVar.mo102820s(C34748j.f84200i);
                hVar.mo102817p(4);
            } else if (o == 5) {
                hVar.mo102820s(C34748j.f84194c);
                hVar.mo102817p(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(o)));
            }
        } else if (C34748j.m141824h(d)) {
            hVar.mo102820s(C34748j.f84195d);
            hVar.mo102820s((char) ((d - 128) + 1));
            hVar.f84183f++;
        } else {
            hVar.mo102820s((char) (d + 1));
            hVar.f84183f++;
        }
    }

    /* renamed from: b */
    public int mo102783b() {
        return 0;
    }
}
