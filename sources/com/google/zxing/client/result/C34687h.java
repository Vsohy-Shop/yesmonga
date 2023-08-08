package com.google.zxing.client.result;

import androidx.core.net.C17767c;

/* renamed from: com.google.zxing.client.result.h */
public final class C34687h extends C34699q {

    /* renamed from: b */
    public final String[] f83966b;

    /* renamed from: c */
    public final String[] f83967c;

    /* renamed from: d */
    public final String[] f83968d;

    /* renamed from: e */
    public final String f83969e;

    /* renamed from: f */
    public final String f83970f;

    public C34687h(String str) {
        this(new String[]{str}, (String[]) null, (String[]) null, (String) null, (String) null);
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(30);
        C34699q.m141522d(this.f83966b, sb);
        C34699q.m141522d(this.f83967c, sb);
        C34699q.m141522d(this.f83968d, sb);
        C34699q.m141521c(this.f83969e, sb);
        C34699q.m141521c(this.f83970f, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String[] mo102568e() {
        return this.f83968d;
    }

    /* renamed from: f */
    public String mo102569f() {
        return this.f83970f;
    }

    /* renamed from: g */
    public String[] mo102570g() {
        return this.f83967c;
    }

    @Deprecated
    /* renamed from: h */
    public String mo102571h() {
        String[] strArr = this.f83966b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    /* renamed from: i */
    public String mo102572i() {
        return C17767c.f46167b;
    }

    /* renamed from: j */
    public String mo102573j() {
        return this.f83969e;
    }

    /* renamed from: k */
    public String[] mo102574k() {
        return this.f83966b;
    }

    public C34687h(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.f83898b);
        this.f83966b = strArr;
        this.f83967c = strArr2;
        this.f83968d = strArr3;
        this.f83969e = str;
        this.f83970f = str2;
    }
}
