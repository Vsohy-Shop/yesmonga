package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import java.util.HashMap;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.analytics.ecommerce.b */
public class C40382b {
    @RecentlyNonNull

    /* renamed from: b */
    public static final String f102934b = "detail";
    @RecentlyNonNull

    /* renamed from: c */
    public static final String f102935c = "click";
    @RecentlyNonNull

    /* renamed from: d */
    public static final String f102936d = "add";
    @RecentlyNonNull

    /* renamed from: e */
    public static final String f102937e = "remove";
    @RecentlyNonNull

    /* renamed from: f */
    public static final String f102938f = "checkout";
    @RecentlyNonNull

    /* renamed from: g */
    public static final String f102939g = "checkout_option";
    @RecentlyNonNull
    @Deprecated

    /* renamed from: h */
    public static final String f102940h = "checkout_options";
    @RecentlyNonNull

    /* renamed from: i */
    public static final String f102941i = "purchase";
    @RecentlyNonNull

    /* renamed from: j */
    public static final String f102942j = "refund";

    /* renamed from: a */
    public Map<String, String> f102943a = new HashMap();

    public C40382b(@RecentlyNonNull String str) {
        mo133326l("&pa", str);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public C40382b mo133315a(@RecentlyNonNull String str) {
        mo133326l("&col", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public C40382b mo133316b(int i) {
        mo133326l("&cos", Integer.toString(i));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C40382b mo133317c(@RecentlyNonNull String str) {
        mo133326l("&pal", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public C40382b mo133318d(@RecentlyNonNull String str) {
        mo133326l("&pls", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public C40382b mo133319e(@RecentlyNonNull String str) {
        mo133326l("&ta", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public C40382b mo133320f(@RecentlyNonNull String str) {
        mo133326l("&tcc", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public C40382b mo133321g(@RecentlyNonNull String str) {
        mo133326l("&ti", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public C40382b mo133322h(double d) {
        mo133326l("&tr", Double.toString(d));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public C40382b mo133323i(double d) {
        mo133326l("&ts", Double.toString(d));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: j */
    public C40382b mo133324j(double d) {
        mo133326l("&tt", Double.toString(d));
        return this;
    }

    @RecentlyNonNull
    @C40974d0
    /* renamed from: k */
    public final Map<String, String> mo133325k() {
        return new HashMap(this.f102943a);
    }

    /* renamed from: l */
    public final void mo133326l(String str, String str2) {
        C40843u.m166203m(str, "Name should be non-null");
        this.f102943a.put(str, str2);
    }

    @RecentlyNonNull
    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f102943a.entrySet()) {
            if (((String) next.getKey()).startsWith("&")) {
                hashMap.put(((String) next.getKey()).substring(1), (String) next.getValue());
            } else {
                hashMap.put((String) next.getKey(), (String) next.getValue());
            }
        }
        return C40407s.m164504b(hashMap);
    }
}
