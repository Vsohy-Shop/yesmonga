package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import java.util.HashMap;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.analytics.ecommerce.c */
public class C40383c {
    @RecentlyNonNull

    /* renamed from: b */
    public static final String f102944b = "click";
    @RecentlyNonNull

    /* renamed from: c */
    public static final String f102945c = "view";

    /* renamed from: a */
    public Map<String, String> f102946a = new HashMap();

    @RecentlyNonNull
    /* renamed from: a */
    public C40383c mo133328a(@RecentlyNonNull String str) {
        mo133333f("cr", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public C40383c mo133329b(@RecentlyNonNull String str) {
        mo133333f("id", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C40383c mo133330c(@RecentlyNonNull String str) {
        mo133333f(SearchView.f2053T1, str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public C40383c mo133331d(@RecentlyNonNull String str) {
        mo133333f("ps", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public final Map<String, String> mo133332e(@RecentlyNonNull String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f102946a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) next.getKey());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            hashMap.put(str2, (String) next.getValue());
        }
        return hashMap;
    }

    /* renamed from: f */
    public final void mo133333f(String str, String str2) {
        C40843u.m166203m(str, "Name should be non-null");
        this.f102946a.put(str, str2);
    }

    @RecentlyNonNull
    public String toString() {
        return C40407s.m164504b(this.f102946a);
    }
}
