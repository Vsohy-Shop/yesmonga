package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C34645c;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.zxing.datamatrix.encoder.h */
public final class C34746h {

    /* renamed from: a */
    public final String f84178a;

    /* renamed from: b */
    public SymbolShapeHint f84179b;

    /* renamed from: c */
    public C34645c f84180c;

    /* renamed from: d */
    public C34645c f84181d;

    /* renamed from: e */
    public final StringBuilder f84182e;

    /* renamed from: f */
    public int f84183f;

    /* renamed from: g */
    public int f84184g;

    /* renamed from: h */
    public C34749k f84185h;

    /* renamed from: i */
    public int f84186i;

    public C34746h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f84178a = sb.toString();
        this.f84179b = SymbolShapeHint.FORCE_NONE;
        this.f84182e = new StringBuilder(str.length());
        this.f84184g = -1;
    }

    /* renamed from: a */
    public int mo102802a() {
        return this.f84182e.length();
    }

    /* renamed from: b */
    public StringBuilder mo102803b() {
        return this.f84182e;
    }

    /* renamed from: c */
    public char mo102804c() {
        return this.f84178a.charAt(this.f84183f);
    }

    /* renamed from: d */
    public char mo102805d() {
        return this.f84178a.charAt(this.f84183f);
    }

    /* renamed from: e */
    public String mo102806e() {
        return this.f84178a;
    }

    /* renamed from: f */
    public int mo102807f() {
        return this.f84184g;
    }

    /* renamed from: g */
    public int mo102808g() {
        return mo102810i() - this.f84183f;
    }

    /* renamed from: h */
    public C34749k mo102809h() {
        return this.f84185h;
    }

    /* renamed from: i */
    public final int mo102810i() {
        return this.f84178a.length() - this.f84186i;
    }

    /* renamed from: j */
    public boolean mo102811j() {
        return this.f84183f < mo102810i();
    }

    /* renamed from: k */
    public void mo102812k() {
        this.f84184g = -1;
    }

    /* renamed from: l */
    public void mo102813l() {
        this.f84185h = null;
    }

    /* renamed from: m */
    public void mo102814m(C34645c cVar, C34645c cVar2) {
        this.f84180c = cVar;
        this.f84181d = cVar2;
    }

    /* renamed from: n */
    public void mo102815n(int i) {
        this.f84186i = i;
    }

    /* renamed from: o */
    public void mo102816o(SymbolShapeHint symbolShapeHint) {
        this.f84179b = symbolShapeHint;
    }

    /* renamed from: p */
    public void mo102817p(int i) {
        this.f84184g = i;
    }

    /* renamed from: q */
    public void mo102818q() {
        mo102819r(mo102802a());
    }

    /* renamed from: r */
    public void mo102819r(int i) {
        C34749k kVar = this.f84185h;
        if (kVar == null || i > kVar.mo102823b()) {
            this.f84185h = C34749k.m141835o(i, this.f84179b, this.f84180c, this.f84181d, true);
        }
    }

    /* renamed from: s */
    public void mo102820s(char c) {
        this.f84182e.append(c);
    }

    /* renamed from: t */
    public void mo102821t(String str) {
        this.f84182e.append(str);
    }
}
