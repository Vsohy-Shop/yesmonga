package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.analytics.C35551h;
import java.math.BigDecimal;

/* renamed from: com.urbanairship.analytics.m */
public class C35567m {

    /* renamed from: A */
    public static final String f87859A = "medium";
    @C0359n0

    /* renamed from: m */
    public static final String f87860m = "media";
    @C0359n0

    /* renamed from: n */
    public static final String f87861n = "browsed_content";
    @C0359n0

    /* renamed from: o */
    public static final String f87862o = "consumed_content";
    @C0359n0

    /* renamed from: p */
    public static final String f87863p = "starred_content";
    @C0359n0

    /* renamed from: q */
    public static final String f87864q = "shared_content";

    /* renamed from: r */
    public static final String f87865r = "ltv";

    /* renamed from: s */
    public static final String f87866s = "id";

    /* renamed from: t */
    public static final String f87867t = "category";

    /* renamed from: u */
    public static final String f87868u = "description";

    /* renamed from: v */
    public static final String f87869v = "type";

    /* renamed from: w */
    public static final String f87870w = "feature";

    /* renamed from: x */
    public static final String f87871x = "author";

    /* renamed from: y */
    public static final String f87872y = "published_date";

    /* renamed from: z */
    public static final String f87873z = "source";
    @C0359n0

    /* renamed from: a */
    public final String f87874a;
    @C0363p0

    /* renamed from: b */
    public BigDecimal f87875b;
    @C0363p0

    /* renamed from: c */
    public String f87876c;
    @C0363p0

    /* renamed from: d */
    public String f87877d;
    @C0363p0

    /* renamed from: e */
    public String f87878e;
    @C0363p0

    /* renamed from: f */
    public String f87879f;
    @C0363p0

    /* renamed from: g */
    public String f87880g;
    @C0363p0

    /* renamed from: h */
    public String f87881h;

    /* renamed from: i */
    public boolean f87882i;

    /* renamed from: j */
    public boolean f87883j;
    @C0363p0

    /* renamed from: k */
    public String f87884k;
    @C0363p0

    /* renamed from: l */
    public String f87885l;

    public C35567m(@C0359n0 String str, @C0363p0 BigDecimal bigDecimal) {
        this.f87874a = str;
        this.f87875b = bigDecimal;
    }

    @C0359n0
    /* renamed from: b */
    public static C35567m m146776b() {
        return new C35567m(f87861n, (BigDecimal) null);
    }

    @C0359n0
    /* renamed from: c */
    public static C35567m m146777c() {
        return new C35567m(f87862o, (BigDecimal) null);
    }

    @C0359n0
    /* renamed from: d */
    public static C35567m m146778d(double d) {
        return new C35567m(f87862o, BigDecimal.valueOf(d));
    }

    @C0359n0
    /* renamed from: e */
    public static C35567m m146779e(int i) {
        return new C35567m(f87862o, new BigDecimal(i));
    }

    @C0359n0
    /* renamed from: f */
    public static C35567m m146780f(@C0363p0 String str) {
        if (str == null || str.length() == 0) {
            return new C35567m(f87862o, (BigDecimal) null);
        }
        return new C35567m(f87862o, new BigDecimal(str));
    }

    @C0359n0
    /* renamed from: g */
    public static C35567m m146781g(@C0363p0 BigDecimal bigDecimal) {
        return new C35567m(f87862o, bigDecimal);
    }

    @C0359n0
    /* renamed from: h */
    public static C35567m m146782h() {
        return new C35567m(f87864q, (BigDecimal) null);
    }

    @C0359n0
    /* renamed from: i */
    public static C35567m m146783i(@C0363p0 String str, @C0363p0 String str2) {
        return new C35567m(f87864q, str, str2);
    }

    @C0359n0
    /* renamed from: j */
    public static C35567m m146784j() {
        return new C35567m(f87863p, (BigDecimal) null);
    }

    @C0359n0
    /* renamed from: a */
    public C35551h mo106545a() {
        C35551h.C35553b u = C35551h.m146685u(this.f87874a);
        BigDecimal bigDecimal = this.f87875b;
        if (bigDecimal != null) {
            u.mo106509t(bigDecimal);
            u.mo106503n("ltv", true);
        } else {
            u.mo106503n("ltv", false);
        }
        String str = this.f87876c;
        if (str != null) {
            u.mo106502m("id", str);
        }
        String str2 = this.f87877d;
        if (str2 != null) {
            u.mo106502m("category", str2);
        }
        String str3 = this.f87878e;
        if (str3 != null) {
            u.mo106502m("description", str3);
        }
        String str4 = this.f87879f;
        if (str4 != null) {
            u.mo106502m("type", str4);
        }
        if (this.f87883j) {
            u.mo106503n(f87870w, this.f87882i);
        }
        String str5 = this.f87880g;
        if (str5 != null) {
            u.mo106502m("author", str5);
        }
        String str6 = this.f87881h;
        if (str6 != null) {
            u.mo106502m(f87872y, str6);
        }
        String str7 = this.f87884k;
        if (str7 != null) {
            u.mo106502m("source", str7);
        }
        String str8 = this.f87885l;
        if (str8 != null) {
            u.mo106502m("medium", str8);
        }
        u.mo106513x("media");
        return u.mo106504o();
    }

    @C0359n0
    /* renamed from: k */
    public C35567m mo106546k(@C0363p0 String str) {
        this.f87880g = str;
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C35567m mo106547l(@C0363p0 String str) {
        this.f87877d = str;
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C35567m mo106548m(@C0363p0 String str) {
        this.f87878e = str;
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C35567m mo106549n(boolean z) {
        this.f87882i = z;
        this.f87883j = true;
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C35567m mo106550o(@C0363p0 String str) {
        this.f87876c = str;
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public C35567m mo106551p(@C0363p0 String str) {
        this.f87881h = str;
        return this;
    }

    @C0359n0
    /* renamed from: q */
    public C35567m mo106552q(@C0363p0 String str) {
        this.f87879f = str;
        return this;
    }

    public C35567m(@C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        this.f87874a = str;
        this.f87884k = str2;
        this.f87885l = str3;
    }
}
