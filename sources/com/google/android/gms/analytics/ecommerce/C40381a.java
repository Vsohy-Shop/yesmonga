package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.analytics.C40401m;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.onetrust.otpublishers.headless.Public.OTCCPAGeolocationConstants;
import java.util.HashMap;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.analytics.ecommerce.a */
public class C40381a {

    /* renamed from: a */
    public Map<String, String> f102933a = new HashMap();

    @RecentlyNonNull
    /* renamed from: a */
    public C40381a mo133301a(@RecentlyNonNull String str) {
        mo133313m("br", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public C40381a mo133302b(@RecentlyNonNull String str) {
        mo133313m(OTCCPAGeolocationConstants.f85214CA, str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C40381a mo133303c(@RecentlyNonNull String str) {
        mo133313m("cc", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public C40381a mo133304d(int i, @RecentlyNonNull String str) {
        mo133313m(C40401m.m164476c(i), str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public C40381a mo133305e(int i, int i2) {
        mo133313m(C40401m.m164479f(i), Integer.toString(i2));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public C40381a mo133306f(@RecentlyNonNull String str) {
        mo133313m("id", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public C40381a mo133307g(@RecentlyNonNull String str) {
        mo133313m(SearchView.f2053T1, str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: h */
    public C40381a mo133308h(int i) {
        mo133313m("ps", Integer.toString(i));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public C40381a mo133309i(double d) {
        mo133313m("pr", Double.toString(d));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: j */
    public C40381a mo133310j(int i) {
        mo133313m("qt", Integer.toString(i));
        return this;
    }

    @RecentlyNonNull
    /* renamed from: k */
    public C40381a mo133311k(@RecentlyNonNull String str) {
        mo133313m("va", str);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: l */
    public final Map<String, String> mo133312l(@RecentlyNonNull String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f102933a.entrySet()) {
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

    /* renamed from: m */
    public final void mo133313m(String str, String str2) {
        C40843u.m166203m(str, "Name should be non-null");
        this.f102933a.put(str, str2);
    }

    @RecentlyNonNull
    public String toString() {
        return C40407s.m164504b(this.f102933a);
    }
}
