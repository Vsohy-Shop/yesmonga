package com.google.zxing.datamatrix.encoder;

import androidx.compose.p004ui.graphics.vector.C15369g;

/* renamed from: com.google.zxing.datamatrix.encoder.m */
public final class C34751m extends C34741c {
    /* renamed from: a */
    public void mo102782a(C34746h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo102811j()) {
                break;
            }
            char d = hVar.mo102805d();
            hVar.f84183f++;
            mo102785d(d, sb);
            if (sb.length() % 3 == 0) {
                C34741c.m141766g(hVar, sb);
                if (C34748j.m141831o(hVar.mo102806e(), hVar.f84183f, mo102783b()) != mo102783b()) {
                    hVar.mo102817p(0);
                    break;
                }
            }
        }
        mo102786f(hVar, sb);
    }

    /* renamed from: b */
    public int mo102783b() {
        return 3;
    }

    /* renamed from: d */
    public int mo102785d(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C34748j.m141822f(c);
        } else {
            sb.append((char) ((c - C15369g.f37994t) + 14));
        }
        return 1;
    }

    /* renamed from: f */
    public void mo102786f(C34746h hVar, StringBuilder sb) {
        hVar.mo102818q();
        int b = hVar.mo102809h().mo102823b() - hVar.mo102802a();
        hVar.f84183f -= sb.length();
        if (hVar.mo102808g() > 1 || b > 1 || hVar.mo102808g() != b) {
            hVar.mo102820s(254);
        }
        if (hVar.mo102807f() < 0) {
            hVar.mo102817p(0);
        }
    }
}
