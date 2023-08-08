package com.google.zxing.client.result;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.carrefour.fid.android.core.extension.C36306e;

/* renamed from: com.google.zxing.client.result.m */
public final class C34695m extends C34699q {

    /* renamed from: b */
    public final double f84000b;

    /* renamed from: c */
    public final double f84001c;

    /* renamed from: d */
    public final double f84002d;

    /* renamed from: e */
    public final String f84003e;

    public C34695m(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.f84000b = d;
        this.f84001c = d2;
        this.f84002d = d3;
        this.f84003e = str;
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f84000b);
        sb.append(", ");
        sb.append(this.f84001c);
        if (this.f84002d > 0.0d) {
            sb.append(", ");
            sb.append(this.f84002d);
            sb.append(C15369g.f37977c);
        }
        if (this.f84003e != null) {
            sb.append(C36306e.f89637a);
            sb.append(this.f84003e);
            sb.append(')');
        }
        return sb.toString();
    }

    /* renamed from: e */
    public double mo102605e() {
        return this.f84002d;
    }

    /* renamed from: f */
    public String mo102606f() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f84000b);
        sb.append(',');
        sb.append(this.f84001c);
        if (this.f84002d > 0.0d) {
            sb.append(',');
            sb.append(this.f84002d);
        }
        if (this.f84003e != null) {
            sb.append('?');
            sb.append(this.f84003e);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public double mo102607g() {
        return this.f84000b;
    }

    /* renamed from: h */
    public double mo102608h() {
        return this.f84001c;
    }

    /* renamed from: i */
    public String mo102609i() {
        return this.f84003e;
    }
}
