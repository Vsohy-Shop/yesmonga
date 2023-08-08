package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.analytics.C35551h;
import java.math.BigDecimal;

/* renamed from: com.urbanairship.analytics.a */
public class C35517a {
    @C0359n0

    /* renamed from: g */
    public static final String f87583g = "account";
    @C0359n0

    /* renamed from: h */
    public static final String f87584h = "registered_account";
    @C0359n0

    /* renamed from: i */
    public static final String f87585i = "logged_in";
    @C0359n0

    /* renamed from: j */
    public static final String f87586j = "logged_out";

    /* renamed from: k */
    public static final String f87587k = "ltv";

    /* renamed from: l */
    public static final String f87588l = "category";

    /* renamed from: m */
    public static final String f87589m = "user_id";

    /* renamed from: n */
    public static final String f87590n = "type";
    @C0359n0

    /* renamed from: a */
    public final String f87591a;

    /* renamed from: b */
    public BigDecimal f87592b;

    /* renamed from: c */
    public String f87593c;

    /* renamed from: d */
    public String f87594d;
    @C0363p0

    /* renamed from: e */
    public String f87595e;
    @C0363p0

    /* renamed from: f */
    public String f87596f;

    public C35517a(@C0359n0 String str) {
        this.f87591a = str;
    }

    @C0359n0
    /* renamed from: b */
    public static C35517a m146523b() {
        return new C35517a(f87585i);
    }

    @C0359n0
    /* renamed from: c */
    public static C35517a m146524c() {
        return new C35517a(f87586j);
    }

    @C0359n0
    /* renamed from: d */
    public static C35517a m146525d() {
        return new C35517a(f87584h);
    }

    @C0359n0
    /* renamed from: a */
    public C35551h mo106413a() {
        C35551h.C35553b u = C35551h.m146685u(this.f87591a);
        BigDecimal bigDecimal = this.f87592b;
        if (bigDecimal != null) {
            u.mo106509t(bigDecimal);
            u.mo106503n("ltv", true);
        } else {
            u.mo106503n("ltv", false);
        }
        String str = this.f87594d;
        if (str != null) {
            u.mo106514y(str);
        }
        String str2 = this.f87593c;
        if (str2 != null) {
            u.mo106502m("category", str2);
        }
        String str3 = this.f87595e;
        if (str3 != null) {
            u.mo106502m("user_id", str3);
        }
        String str4 = this.f87596f;
        if (str4 != null) {
            u.mo106502m("type", str4);
        }
        u.mo106513x(f87583g);
        return u.mo106504o();
    }

    @C0359n0
    /* renamed from: e */
    public C35517a mo106414e(@C0363p0 String str) {
        this.f87593c = str;
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C35517a mo106415f(@C0363p0 String str) {
        this.f87594d = str;
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C35517a mo106416g(String str) {
        this.f87596f = str;
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C35517a mo106417h(String str) {
        this.f87595e = str;
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public C35517a mo106418i(double d) {
        return mo106421l(BigDecimal.valueOf(d));
    }

    @C0359n0
    /* renamed from: j */
    public C35517a mo106419j(int i) {
        return mo106421l(new BigDecimal(i));
    }

    @C0359n0
    /* renamed from: k */
    public C35517a mo106420k(@C0363p0 String str) {
        if (str != null && str.length() != 0) {
            return mo106421l(new BigDecimal(str));
        }
        this.f87592b = null;
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C35517a mo106421l(@C0363p0 BigDecimal bigDecimal) {
        this.f87592b = bigDecimal;
        return this;
    }
}
