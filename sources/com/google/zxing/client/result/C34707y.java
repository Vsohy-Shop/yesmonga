package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.y */
public final class C34707y extends C34699q {

    /* renamed from: b */
    public final String f84019b;

    /* renamed from: c */
    public final String f84020c;

    /* renamed from: d */
    public final String f84021d;

    public C34707y(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f84019b = str;
        this.f84020c = str2;
        this.f84021d = str3;
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(20);
        C34699q.m141521c(this.f84019b, sb);
        C34699q.m141521c(this.f84021d, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo102626e() {
        return this.f84019b;
    }

    /* renamed from: f */
    public String mo102627f() {
        return this.f84020c;
    }

    /* renamed from: g */
    public String mo102628g() {
        return this.f84021d;
    }
}
