package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.b0 */
public final class C34676b0 extends C34699q {

    /* renamed from: b */
    public final String f83911b;

    /* renamed from: c */
    public final String f83912c;

    public C34676b0(String str, String str2) {
        super(ParsedResultType.URI);
        this.f83911b = m141375i(str);
        this.f83912c = str2;
    }

    /* renamed from: g */
    public static boolean m141374g(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return C34702t.m141534e(str, i2, indexOf - i2);
    }

    /* renamed from: i */
    public static String m141375i(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf < 0 || m141374g(trim, indexOf)) {
            return "http://".concat(trim);
        }
        return trim;
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(30);
        C34699q.m141521c(this.f83912c, sb);
        C34699q.m141521c(this.f83911b, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo102520e() {
        return this.f83912c;
    }

    /* renamed from: f */
    public String mo102521f() {
        return this.f83911b;
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo102522h() {
        return C34678c0.m141384r(this.f83911b);
    }
}
