package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.g0 */
public final class C34686g0 extends C34699q {

    /* renamed from: b */
    public final String f83957b;

    /* renamed from: c */
    public final String f83958c;

    /* renamed from: d */
    public final String f83959d;

    /* renamed from: e */
    public final String f83960e;

    /* renamed from: f */
    public final String f83961f;

    /* renamed from: g */
    public final String f83962g;

    /* renamed from: h */
    public final int f83963h;

    /* renamed from: i */
    public final char f83964i;

    /* renamed from: j */
    public final String f83965j;

    public C34686g0(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(ParsedResultType.VIN);
        this.f83957b = str;
        this.f83958c = str2;
        this.f83959d = str3;
        this.f83960e = str4;
        this.f83961f = str5;
        this.f83962g = str6;
        this.f83963h = i;
        this.f83964i = c;
        this.f83965j = str7;
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f83958c);
        sb.append(' ');
        sb.append(this.f83959d);
        sb.append(' ');
        sb.append(this.f83960e);
        sb.append(10);
        String str = this.f83961f;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f83963h);
        sb.append(' ');
        sb.append(this.f83964i);
        sb.append(' ');
        sb.append(this.f83965j);
        sb.append(10);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo102559e() {
        return this.f83961f;
    }

    /* renamed from: f */
    public int mo102560f() {
        return this.f83963h;
    }

    /* renamed from: g */
    public char mo102561g() {
        return this.f83964i;
    }

    /* renamed from: h */
    public String mo102562h() {
        return this.f83965j;
    }

    /* renamed from: i */
    public String mo102563i() {
        return this.f83957b;
    }

    /* renamed from: j */
    public String mo102564j() {
        return this.f83962g;
    }

    /* renamed from: k */
    public String mo102565k() {
        return this.f83959d;
    }

    /* renamed from: l */
    public String mo102566l() {
        return this.f83960e;
    }

    /* renamed from: m */
    public String mo102567m() {
        return this.f83958c;
    }
}
