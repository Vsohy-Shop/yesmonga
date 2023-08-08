package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.d */
public final class C34679d extends C34699q {

    /* renamed from: b */
    public final String[] f83917b;

    /* renamed from: c */
    public final String[] f83918c;

    /* renamed from: d */
    public final String f83919d;

    /* renamed from: e */
    public final String[] f83920e;

    /* renamed from: f */
    public final String[] f83921f;

    /* renamed from: g */
    public final String[] f83922g;

    /* renamed from: h */
    public final String[] f83923h;

    /* renamed from: i */
    public final String f83924i;

    /* renamed from: j */
    public final String f83925j;

    /* renamed from: k */
    public final String[] f83926k;

    /* renamed from: l */
    public final String[] f83927l;

    /* renamed from: m */
    public final String f83928m;

    /* renamed from: n */
    public final String f83929n;

    /* renamed from: o */
    public final String f83930o;

    /* renamed from: p */
    public final String[] f83931p;

    /* renamed from: q */
    public final String[] f83932q;

    public C34679d(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, (String[]) null, (String) null, strArr2, strArr3, strArr4, strArr5, (String) null, (String) null, strArr6, strArr7, (String) null, (String) null, (String) null, (String[]) null, (String[]) null);
    }

    /* renamed from: a */
    public String mo102515a() {
        StringBuilder sb = new StringBuilder(100);
        C34699q.m141522d(this.f83917b, sb);
        C34699q.m141522d(this.f83918c, sb);
        C34699q.m141521c(this.f83919d, sb);
        C34699q.m141521c(this.f83930o, sb);
        C34699q.m141521c(this.f83928m, sb);
        C34699q.m141522d(this.f83926k, sb);
        C34699q.m141522d(this.f83920e, sb);
        C34699q.m141522d(this.f83922g, sb);
        C34699q.m141521c(this.f83924i, sb);
        C34699q.m141522d(this.f83931p, sb);
        C34699q.m141521c(this.f83929n, sb);
        C34699q.m141522d(this.f83932q, sb);
        C34699q.m141521c(this.f83925j, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String[] mo102525e() {
        return this.f83927l;
    }

    /* renamed from: f */
    public String[] mo102526f() {
        return this.f83926k;
    }

    /* renamed from: g */
    public String mo102527g() {
        return this.f83929n;
    }

    /* renamed from: h */
    public String[] mo102528h() {
        return this.f83923h;
    }

    /* renamed from: i */
    public String[] mo102529i() {
        return this.f83922g;
    }

    /* renamed from: j */
    public String[] mo102530j() {
        return this.f83932q;
    }

    /* renamed from: k */
    public String mo102531k() {
        return this.f83924i;
    }

    /* renamed from: l */
    public String[] mo102532l() {
        return this.f83917b;
    }

    /* renamed from: m */
    public String[] mo102533m() {
        return this.f83918c;
    }

    /* renamed from: n */
    public String mo102534n() {
        return this.f83925j;
    }

    /* renamed from: o */
    public String mo102535o() {
        return this.f83928m;
    }

    /* renamed from: p */
    public String[] mo102536p() {
        return this.f83920e;
    }

    /* renamed from: q */
    public String[] mo102537q() {
        return this.f83921f;
    }

    /* renamed from: r */
    public String mo102538r() {
        return this.f83919d;
    }

    /* renamed from: s */
    public String mo102539s() {
        return this.f83930o;
    }

    /* renamed from: t */
    public String[] mo102540t() {
        return this.f83931p;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34679d(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        String[] strArr11 = strArr3;
        String[] strArr12 = strArr4;
        String[] strArr13 = strArr5;
        String[] strArr14 = strArr6;
        String[] strArr15 = strArr7;
        String[] strArr16 = strArr8;
        if (strArr11 != null && strArr12 != null && strArr11.length != strArr12.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        } else if (strArr13 != null && strArr14 != null && strArr13.length != strArr14.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        } else if (strArr15 == null || strArr16 == null || strArr15.length == strArr16.length) {
            this.f83917b = strArr;
            this.f83918c = strArr2;
            this.f83919d = str;
            this.f83920e = strArr11;
            this.f83921f = strArr12;
            this.f83922g = strArr13;
            this.f83923h = strArr14;
            this.f83924i = str2;
            this.f83925j = str3;
            this.f83926k = strArr15;
            this.f83927l = strArr16;
            this.f83928m = str4;
            this.f83929n = str5;
            this.f83930o = str6;
            this.f83931p = strArr9;
            this.f83932q = strArr10;
        } else {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
    }
}
