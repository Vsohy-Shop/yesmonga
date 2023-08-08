package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.analytics.C35551h;
import java.math.BigDecimal;

/* renamed from: com.urbanairship.analytics.o */
public class C35569o {

    /* renamed from: A */
    public static final String f87895A = "source";

    /* renamed from: B */
    public static final String f87896B = "medium";

    /* renamed from: C */
    public static final String f87897C = "wishlist_name";

    /* renamed from: D */
    public static final String f87898D = "wishlist_id";
    @C0359n0

    /* renamed from: n */
    public static final String f87899n = "retail";
    @C0359n0

    /* renamed from: o */
    public static final String f87900o = "browsed";
    @C0359n0

    /* renamed from: p */
    public static final String f87901p = "added_to_cart";
    @C0359n0

    /* renamed from: q */
    public static final String f87902q = "starred_product";
    @C0359n0

    /* renamed from: r */
    public static final String f87903r = "shared_product";
    @C0359n0

    /* renamed from: s */
    public static final String f87904s = "purchased";
    @C0359n0

    /* renamed from: t */
    public static final String f87905t = "wishlist";

    /* renamed from: u */
    public static final String f87906u = "ltv";

    /* renamed from: v */
    public static final String f87907v = "id";

    /* renamed from: w */
    public static final String f87908w = "category";

    /* renamed from: x */
    public static final String f87909x = "description";

    /* renamed from: y */
    public static final String f87910y = "brand";

    /* renamed from: z */
    public static final String f87911z = "new_item";
    @C0359n0

    /* renamed from: a */
    public final String f87912a;
    @C0363p0

    /* renamed from: b */
    public BigDecimal f87913b;
    @C0363p0

    /* renamed from: c */
    public String f87914c;
    @C0363p0

    /* renamed from: d */
    public String f87915d;
    @C0363p0

    /* renamed from: e */
    public String f87916e;
    @C0363p0

    /* renamed from: f */
    public String f87917f;
    @C0363p0

    /* renamed from: g */
    public String f87918g;
    @C0363p0

    /* renamed from: h */
    public String f87919h;
    @C0363p0

    /* renamed from: i */
    public String f87920i;
    @C0363p0

    /* renamed from: j */
    public String f87921j;
    @C0363p0

    /* renamed from: k */
    public String f87922k;

    /* renamed from: l */
    public boolean f87923l;

    /* renamed from: m */
    public boolean f87924m;

    public C35569o(@C0359n0 String str) {
        this.f87912a = str;
    }

    @C0359n0
    /* renamed from: b */
    public static C35569o m146797b() {
        return new C35569o(f87901p);
    }

    @C0359n0
    /* renamed from: c */
    public static C35569o m146798c() {
        return new C35569o(f87900o);
    }

    @C0359n0
    /* renamed from: d */
    public static C35569o m146799d() {
        return new C35569o(f87904s);
    }

    @C0359n0
    /* renamed from: e */
    public static C35569o m146800e() {
        return new C35569o(f87903r);
    }

    @C0359n0
    /* renamed from: f */
    public static C35569o m146801f(@C0363p0 String str, @C0363p0 String str2) {
        return new C35569o(f87903r, str, str2, (String) null, (String) null);
    }

    @C0359n0
    /* renamed from: g */
    public static C35569o m146802g() {
        return new C35569o(f87902q);
    }

    @C0359n0
    /* renamed from: h */
    public static C35569o m146803h() {
        return new C35569o(f87905t);
    }

    @C0359n0
    /* renamed from: i */
    public static C35569o m146804i(@C0363p0 String str, @C0363p0 String str2) {
        return new C35569o(f87905t, (String) null, (String) null, str, str2);
    }

    @C0359n0
    /* renamed from: a */
    public C35551h mo106555a() {
        C35551h.C35553b u = C35551h.m146685u(this.f87912a);
        BigDecimal bigDecimal = this.f87913b;
        if (bigDecimal != null) {
            u.mo106509t(bigDecimal);
        }
        if (!f87904s.equals(this.f87912a) || this.f87913b == null) {
            u.mo106503n("ltv", false);
        } else {
            u.mo106503n("ltv", true);
        }
        String str = this.f87914c;
        if (str != null) {
            u.mo106514y(str);
        }
        String str2 = this.f87915d;
        if (str2 != null) {
            u.mo106502m("id", str2);
        }
        String str3 = this.f87916e;
        if (str3 != null) {
            u.mo106502m("category", str3);
        }
        String str4 = this.f87917f;
        if (str4 != null) {
            u.mo106502m("description", str4);
        }
        String str5 = this.f87918g;
        if (str5 != null) {
            u.mo106502m("brand", str5);
        }
        if (this.f87924m) {
            u.mo106503n(f87911z, this.f87923l);
        }
        String str6 = this.f87919h;
        if (str6 != null) {
            u.mo106502m("source", str6);
        }
        String str7 = this.f87920i;
        if (str7 != null) {
            u.mo106502m("medium", str7);
        }
        String str8 = this.f87921j;
        if (str8 != null) {
            u.mo106502m(f87897C, str8);
        }
        String str9 = this.f87922k;
        if (str9 != null) {
            u.mo106502m(f87898D, str9);
        }
        u.mo106513x(f87899n);
        return u.mo106504o();
    }

    @C0359n0
    /* renamed from: j */
    public C35569o mo106556j(@C0363p0 String str) {
        this.f87918g = str;
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C35569o mo106557k(@C0363p0 String str) {
        this.f87916e = str;
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C35569o mo106558l(@C0363p0 String str) {
        this.f87917f = str;
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C35569o mo106559m(@C0363p0 String str) {
        this.f87915d = str;
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C35569o mo106560n(boolean z) {
        this.f87923l = z;
        this.f87924m = true;
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C35569o mo106561o(@C0363p0 String str) {
        this.f87914c = str;
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public C35569o mo106562p(double d) {
        return mo106565s(BigDecimal.valueOf(d));
    }

    @C0359n0
    /* renamed from: q */
    public C35569o mo106563q(int i) {
        return mo106565s(new BigDecimal(i));
    }

    @C0359n0
    /* renamed from: r */
    public C35569o mo106564r(@C0363p0 String str) {
        if (str != null && str.length() != 0) {
            return mo106565s(new BigDecimal(str));
        }
        this.f87913b = null;
        return this;
    }

    @C0359n0
    /* renamed from: s */
    public C35569o mo106565s(@C0363p0 BigDecimal bigDecimal) {
        this.f87913b = bigDecimal;
        return this;
    }

    public C35569o(@C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5) {
        this.f87912a = str;
        this.f87919h = str2;
        this.f87920i = str3;
        this.f87921j = str4;
        this.f87922k = str5;
    }
}
