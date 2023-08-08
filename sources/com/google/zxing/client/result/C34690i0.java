package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.i0 */
public final class C34690i0 extends C34699q {

    /* renamed from: b */
    public final String f83974b;

    /* renamed from: c */
    public final String f83975c;

    /* renamed from: d */
    public final String f83976d;

    /* renamed from: e */
    public final boolean f83977e;

    /* renamed from: f */
    public final String f83978f;

    /* renamed from: g */
    public final String f83979g;

    /* renamed from: h */
    public final String f83980h;

    /* renamed from: i */
    public final String f83981i;

    public C34690i0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(80);
        C34699q.m141521c(this.f83974b, sb);
        C34699q.m141521c(this.f83975c, sb);
        C34699q.m141521c(this.f83976d, sb);
        C34699q.m141521c(Boolean.toString(this.f83977e), sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo102577e() {
        return this.f83979g;
    }

    /* renamed from: f */
    public String mo102578f() {
        return this.f83980h;
    }

    /* renamed from: g */
    public String mo102579g() {
        return this.f83978f;
    }

    /* renamed from: h */
    public String mo102580h() {
        return this.f83975c;
    }

    /* renamed from: i */
    public String mo102581i() {
        return this.f83976d;
    }

    /* renamed from: j */
    public String mo102582j() {
        return this.f83981i;
    }

    /* renamed from: k */
    public String mo102583k() {
        return this.f83974b;
    }

    /* renamed from: l */
    public boolean mo102584l() {
        return this.f83977e;
    }

    public C34690i0(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, (String) null, (String) null, (String) null, (String) null);
    }

    public C34690i0(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.WIFI);
        this.f83974b = str2;
        this.f83975c = str;
        this.f83976d = str3;
        this.f83977e = z;
        this.f83978f = str4;
        this.f83979g = str5;
        this.f83980h = str6;
        this.f83981i = str7;
    }
}
