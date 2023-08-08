package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.analytics.C35551h;
import java.math.BigDecimal;

/* renamed from: com.urbanairship.analytics.q */
public class C35571q {
    @C0359n0

    /* renamed from: h */
    public static final String f87936h = "search";
    @C0359n0

    /* renamed from: i */
    public static final String f87937i = "search";

    /* renamed from: j */
    public static final String f87938j = "ltv";

    /* renamed from: k */
    public static final String f87939k = "type";

    /* renamed from: l */
    public static final String f87940l = "query";

    /* renamed from: m */
    public static final String f87941m = "category";

    /* renamed from: n */
    public static final String f87942n = "id";

    /* renamed from: o */
    public static final String f87943o = "total_results";
    @C0359n0

    /* renamed from: a */
    public final String f87944a;
    @C0363p0

    /* renamed from: b */
    public BigDecimal f87945b;
    @C0363p0

    /* renamed from: c */
    public String f87946c;
    @C0363p0

    /* renamed from: d */
    public String f87947d;
    @C0363p0

    /* renamed from: e */
    public String f87948e;
    @C0363p0

    /* renamed from: f */
    public String f87949f;

    /* renamed from: g */
    public long f87950g;

    public C35571q(@C0359n0 String str) {
        this.f87944a = str;
    }

    /* renamed from: b */
    public static C35571q m146819b() {
        return new C35571q("search");
    }

    @C0359n0
    /* renamed from: a */
    public C35551h mo106566a() {
        C35551h.C35553b u = C35551h.m146685u(this.f87944a);
        BigDecimal bigDecimal = this.f87945b;
        if (bigDecimal != null) {
            u.mo106509t(bigDecimal);
            u.mo106503n("ltv", true);
        } else {
            u.mo106503n("ltv", false);
        }
        String str = this.f87946c;
        if (str != null) {
            u.mo106502m("type", str);
        }
        String str2 = this.f87947d;
        if (str2 != null) {
            u.mo106502m("query", str2);
        }
        String str3 = this.f87948e;
        if (str3 != null) {
            u.mo106502m("category", str3);
        }
        String str4 = this.f87949f;
        if (str4 != null) {
            u.mo106502m("id", str4);
        }
        u.mo106500k(f87943o, this.f87950g);
        u.mo106513x("search");
        return u.mo106504o();
    }

    @C0359n0
    /* renamed from: c */
    public C35571q mo106567c(String str) {
        this.f87948e = str;
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public C35571q mo106568d(String str) {
        this.f87949f = str;
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C35571q mo106569e(String str) {
        this.f87947d = str;
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C35571q mo106570f(long j) {
        this.f87950g = j;
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C35571q mo106571g(String str) {
        this.f87946c = str;
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C35571q mo106572h(double d) {
        return mo106575k(BigDecimal.valueOf(d));
    }

    @C0359n0
    /* renamed from: i */
    public C35571q mo106573i(int i) {
        return mo106575k(new BigDecimal(i));
    }

    @C0359n0
    /* renamed from: j */
    public C35571q mo106574j(@C0363p0 String str) {
        if (str != null && str.length() != 0) {
            return mo106575k(new BigDecimal(str));
        }
        this.f87945b = null;
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C35571q mo106575k(@C0363p0 BigDecimal bigDecimal) {
        this.f87945b = bigDecimal;
        return this;
    }
}
