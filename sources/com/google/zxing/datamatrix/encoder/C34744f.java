package com.google.zxing.datamatrix.encoder;

import com.google.firebase.perf.metrics.C33381i;

/* renamed from: com.google.zxing.datamatrix.encoder.f */
public final class C34744f implements C34745g {
    /* renamed from: c */
    public static void m141787c(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C34748j.m141822f(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: d */
    public static String m141788d(CharSequence charSequence, int i) {
        char c;
        char c2;
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c3 = 0;
            if (length >= 2) {
                c = charSequence.charAt(i + 1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = charSequence.charAt(i + 2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (c << 12) + (c2 << 6) + c3;
            char c4 = (char) ((i2 >> 8) & 255);
            char c5 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c4);
            }
            if (length >= 3) {
                sb.append(c5);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    public static void m141789e(C34746h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo102818q();
                    int b = hVar.mo102809h().mo102823b() - hVar.mo102802a();
                    int g = hVar.mo102808g();
                    if (g > b) {
                        hVar.mo102819r(hVar.mo102802a() + 1);
                        b = hVar.mo102809h().mo102823b() - hVar.mo102802a();
                    }
                    if (g <= b && b <= 2) {
                        hVar.mo102817p(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String d = m141788d(charSequence, 0);
                    if (!(!hVar.mo102811j()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo102819r(hVar.mo102802a() + i);
                        if (hVar.mo102809h().mo102823b() - hVar.mo102802a() >= 3) {
                            hVar.mo102819r(hVar.mo102802a() + d.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo102813l();
                        hVar.f84183f -= i;
                    } else {
                        hVar.mo102821t(d);
                    }
                    hVar.mo102817p(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo102817p(0);
        }
    }

    /* renamed from: a */
    public void mo102782a(C34746h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo102811j()) {
                break;
            }
            m141787c(hVar.mo102805d(), sb);
            hVar.f84183f++;
            if (sb.length() >= 4) {
                hVar.mo102821t(m141788d(sb, 0));
                sb.delete(0, 4);
                if (C34748j.m141831o(hVar.mo102806e(), hVar.f84183f, mo102783b()) != mo102783b()) {
                    hVar.mo102817p(0);
                    break;
                }
            }
        }
        sb.append(C33381i.f81115x);
        m141789e(hVar, sb);
    }

    /* renamed from: b */
    public int mo102783b() {
        return 4;
    }
}
