package com.google.zxing.client.result;

import kotlin.text.C11626x;

/* renamed from: com.google.zxing.client.result.v */
public final class C34704v extends C34699q {

    /* renamed from: b */
    public final String[] f84015b;

    /* renamed from: c */
    public final String[] f84016c;

    /* renamed from: d */
    public final String f84017d;

    /* renamed from: e */
    public final String f84018e;

    public C34704v(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f84015b = new String[]{str};
        this.f84016c = new String[]{str2};
        this.f84017d = str3;
        this.f84018e = str4;
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(100);
        C34699q.m141522d(this.f84015b, sb);
        C34699q.m141521c(this.f84017d, sb);
        C34699q.m141521c(this.f84018e, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo102619e() {
        return this.f84018e;
    }

    /* renamed from: f */
    public String[] mo102620f() {
        return this.f84015b;
    }

    /* renamed from: g */
    public String mo102621g() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z2 = true;
        boolean z3 = true;
        for (int i = 0; i < this.f84015b.length; i++) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f84015b[i]);
            String[] strArr = this.f84016c;
            if (!(strArr == null || strArr[i] == null)) {
                sb.append(";via=");
                sb.append(this.f84016c[i]);
            }
        }
        if (this.f84018e != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f84017d == null) {
            z2 = false;
        }
        if (z || z2) {
            sb.append('?');
            if (z) {
                sb.append("body=");
                sb.append(this.f84018e);
            }
            if (z2) {
                if (z) {
                    sb.append(C11626x.f28913d);
                }
                sb.append("subject=");
                sb.append(this.f84017d);
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public String mo102622h() {
        return this.f84017d;
    }

    /* renamed from: i */
    public String[] mo102623i() {
        return this.f84016c;
    }

    public C34704v(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f84015b = strArr;
        this.f84016c = strArr2;
        this.f84017d = str;
        this.f84018e = str2;
    }
}
