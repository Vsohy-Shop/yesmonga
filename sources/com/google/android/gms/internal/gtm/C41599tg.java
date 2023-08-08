package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.tg */
public final class C41599tg extends C41310hg<String> {

    /* renamed from: c */
    public static final Map<String, C41735z8> f105016c;

    /* renamed from: b */
    public final String f105017b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("charAt", new C41570sb());
        hashMap.put("concat", new C41594tb());
        hashMap.put("hasOwnProperty", C41185cb.f104495a);
        hashMap.put("indexOf", new C41618ub());
        hashMap.put("lastIndexOf", new C41642vb());
        hashMap.put("match", new C41666wb());
        hashMap.put("replace", new C41690xb());
        hashMap.put("search", new C41714yb());
        hashMap.put("slice", new C41738zb());
        hashMap.put("split", new C41138ac());
        hashMap.put("substring", new C41162bc());
        hashMap.put("toLocaleLowerCase", new C41186cc());
        hashMap.put("toLocaleUpperCase", new C41210dc());
        hashMap.put("toLowerCase", new C41234ec());
        hashMap.put("toUpperCase", new C41282gc());
        hashMap.put("toString", new C41258fc());
        hashMap.put("trim", new C41306hc());
        f105016c = Collections.unmodifiableMap(hashMap);
    }

    public C41599tg(String str) {
        C40843u.m166202l(str);
        this.f105017b = str;
    }

    /* renamed from: a */
    public final C41735z8 mo135434a(String str) {
        if (mo135440g(str)) {
            return f105016c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type ListWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f105017b;
    }

    /* renamed from: e */
    public final Iterator<C41310hg<?>> mo135438e() {
        return new C41575sg(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41599tg)) {
            return false;
        }
        return this.f105017b.equals(((C41599tg) obj).f105017b);
    }

    /* renamed from: g */
    public final boolean mo135440g(String str) {
        return f105016c.containsKey(str);
    }

    /* renamed from: i */
    public final C41310hg<?> mo135862i(int i) {
        if (i < 0 || i >= this.f105017b.length()) {
            return C41431mg.f104800h;
        }
        return new C41599tg(String.valueOf(this.f105017b.charAt(i)));
    }

    /* renamed from: k */
    public final String mo135863k() {
        return this.f105017b;
    }

    public final String toString() {
        return this.f105017b.toString();
    }
}
