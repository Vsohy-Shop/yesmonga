package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.C34873g;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* renamed from: com.google.zxing.qrcode.encoder.f */
public final class C34888f {

    /* renamed from: f */
    public static final int f84797f = 8;

    /* renamed from: a */
    public Mode f84798a;

    /* renamed from: b */
    public ErrorCorrectionLevel f84799b;

    /* renamed from: c */
    public C34873g f84800c;

    /* renamed from: d */
    public int f84801d = -1;

    /* renamed from: e */
    public C34883b f84802e;

    /* renamed from: f */
    public static boolean m142594f(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public ErrorCorrectionLevel mo103243a() {
        return this.f84799b;
    }

    /* renamed from: b */
    public int mo103244b() {
        return this.f84801d;
    }

    /* renamed from: c */
    public C34883b mo103245c() {
        return this.f84802e;
    }

    /* renamed from: d */
    public Mode mo103246d() {
        return this.f84798a;
    }

    /* renamed from: e */
    public C34873g mo103247e() {
        return this.f84800c;
    }

    /* renamed from: g */
    public void mo103248g(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f84799b = errorCorrectionLevel;
    }

    /* renamed from: h */
    public void mo103249h(int i) {
        this.f84801d = i;
    }

    /* renamed from: i */
    public void mo103250i(C34883b bVar) {
        this.f84802e = bVar;
    }

    /* renamed from: j */
    public void mo103251j(Mode mode) {
        this.f84798a = mode;
    }

    /* renamed from: k */
    public void mo103252k(C34873g gVar) {
        this.f84800c = gVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f84798a);
        sb.append("\n ecLevel: ");
        sb.append(this.f84799b);
        sb.append("\n version: ");
        sb.append(this.f84800c);
        sb.append("\n maskPattern: ");
        sb.append(this.f84801d);
        if (this.f84802e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f84802e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
