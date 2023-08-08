package com.google.zxing.client.result;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.zxing.client.result.k */
public final class C34693k extends C34699q {

    /* renamed from: q */
    public static final String f83983q = "KG";

    /* renamed from: r */
    public static final String f83984r = "LB";

    /* renamed from: b */
    public final String f83985b;

    /* renamed from: c */
    public final String f83986c;

    /* renamed from: d */
    public final String f83987d;

    /* renamed from: e */
    public final String f83988e;

    /* renamed from: f */
    public final String f83989f;

    /* renamed from: g */
    public final String f83990g;

    /* renamed from: h */
    public final String f83991h;

    /* renamed from: i */
    public final String f83992i;

    /* renamed from: j */
    public final String f83993j;

    /* renamed from: k */
    public final String f83994k;

    /* renamed from: l */
    public final String f83995l;

    /* renamed from: m */
    public final String f83996m;

    /* renamed from: n */
    public final String f83997n;

    /* renamed from: o */
    public final String f83998o;

    /* renamed from: p */
    public final Map<String, String> f83999p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34693k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.f83985b = str;
        this.f83986c = str2;
        this.f83987d = str3;
        this.f83988e = str4;
        this.f83989f = str5;
        this.f83990g = str6;
        this.f83991h = str7;
        this.f83992i = str8;
        this.f83993j = str9;
        this.f83994k = str10;
        this.f83995l = str11;
        this.f83996m = str12;
        this.f83997n = str13;
        this.f83998o = str14;
        this.f83999p = map;
    }

    /* renamed from: a */
    public String mo102515a() {
        return String.valueOf(this.f83985b);
    }

    /* renamed from: e */
    public String mo102587e() {
        return this.f83991h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34693k)) {
            return false;
        }
        C34693k kVar = (C34693k) obj;
        if (!Objects.equals(this.f83986c, kVar.f83986c) || !Objects.equals(this.f83987d, kVar.f83987d) || !Objects.equals(this.f83988e, kVar.f83988e) || !Objects.equals(this.f83989f, kVar.f83989f) || !Objects.equals(this.f83991h, kVar.f83991h) || !Objects.equals(this.f83992i, kVar.f83992i) || !Objects.equals(this.f83993j, kVar.f83993j) || !Objects.equals(this.f83994k, kVar.f83994k) || !Objects.equals(this.f83995l, kVar.f83995l) || !Objects.equals(this.f83996m, kVar.f83996m) || !Objects.equals(this.f83997n, kVar.f83997n) || !Objects.equals(this.f83998o, kVar.f83998o) || !Objects.equals(this.f83999p, kVar.f83999p)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo102589f() {
        return this.f83992i;
    }

    /* renamed from: g */
    public String mo102590g() {
        return this.f83988e;
    }

    /* renamed from: h */
    public String mo102591h() {
        return this.f83990g;
    }

    public int hashCode() {
        return (((((((((((Objects.hashCode(this.f83986c) ^ Objects.hashCode(this.f83987d)) ^ Objects.hashCode(this.f83988e)) ^ Objects.hashCode(this.f83989f)) ^ Objects.hashCode(this.f83991h)) ^ Objects.hashCode(this.f83992i)) ^ Objects.hashCode(this.f83993j)) ^ Objects.hashCode(this.f83994k)) ^ Objects.hashCode(this.f83995l)) ^ Objects.hashCode(this.f83996m)) ^ Objects.hashCode(this.f83997n)) ^ Objects.hashCode(this.f83998o)) ^ Objects.hashCode(this.f83999p);
    }

    /* renamed from: i */
    public String mo102593i() {
        return this.f83996m;
    }

    /* renamed from: j */
    public String mo102594j() {
        return this.f83998o;
    }

    /* renamed from: k */
    public String mo102595k() {
        return this.f83997n;
    }

    /* renamed from: l */
    public String mo102596l() {
        return this.f83986c;
    }

    /* renamed from: m */
    public String mo102597m() {
        return this.f83989f;
    }

    /* renamed from: n */
    public String mo102598n() {
        return this.f83985b;
    }

    /* renamed from: o */
    public String mo102599o() {
        return this.f83987d;
    }

    /* renamed from: p */
    public Map<String, String> mo102600p() {
        return this.f83999p;
    }

    /* renamed from: q */
    public String mo102601q() {
        return this.f83993j;
    }

    /* renamed from: r */
    public String mo102602r() {
        return this.f83995l;
    }

    /* renamed from: s */
    public String mo102603s() {
        return this.f83994k;
    }
}
