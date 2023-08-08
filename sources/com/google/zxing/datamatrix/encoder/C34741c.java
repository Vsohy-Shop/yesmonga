package com.google.zxing.datamatrix.encoder;

import androidx.compose.p004ui.graphics.vector.C15369g;

/* renamed from: com.google.zxing.datamatrix.encoder.c */
public class C34741c implements C34745g {
    /* renamed from: e */
    public static String m141765e(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* renamed from: g */
    public static void m141766g(C34746h hVar, StringBuilder sb) {
        hVar.mo102821t(m141765e(sb, 0));
        sb.delete(0, 3);
    }

    /* renamed from: a */
    public void mo102782a(C34746h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo102811j()) {
                break;
            }
            char d = hVar.mo102805d();
            hVar.f84183f++;
            int d2 = mo102785d(d, sb);
            int a = hVar.mo102802a() + ((sb.length() / 3) << 1);
            hVar.mo102819r(a);
            int b = hVar.mo102809h().mo102823b() - a;
            if (hVar.mo102811j()) {
                if (sb.length() % 3 == 0 && C34748j.m141831o(hVar.mo102806e(), hVar.f84183f, mo102783b()) != mo102783b()) {
                    hVar.mo102817p(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && b != 2) {
                    d2 = mo102784c(hVar, sb, sb2, d2);
                }
                while (sb.length() % 3 == 1 && (d2 > 3 || b != 1)) {
                    d2 = mo102784c(hVar, sb, sb2, d2);
                }
            }
        }
        mo102786f(hVar, sb);
    }

    /* renamed from: b */
    public int mo102783b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo102784c(C34746h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f84183f--;
        int d = mo102785d(hVar.mo102805d(), sb2);
        hVar.mo102813l();
        return d;
    }

    /* renamed from: d */
    public int mo102785d(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - C15369g.f37994t) + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c <= 127) {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo102785d((char) (c - 128), sb) + 2;
        }
    }

    /* renamed from: f */
    public void mo102786f(C34746h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = hVar.mo102802a() + ((sb.length() / 3) << 1);
        hVar.mo102819r(a);
        int b = hVar.mo102809h().mo102823b() - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m141766g(hVar, sb);
            }
            if (hVar.mo102811j()) {
                hVar.mo102820s(254);
            }
        } else if (b == 1 && length == 1) {
            while (sb.length() >= 3) {
                m141766g(hVar, sb);
            }
            if (hVar.mo102811j()) {
                hVar.mo102820s(254);
            }
            hVar.f84183f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m141766g(hVar, sb);
            }
            if (b > 0 || hVar.mo102811j()) {
                hVar.mo102820s(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.mo102817p(0);
    }
}
