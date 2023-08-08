package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.ig */
public final class C41334ig extends C41310hg<Boolean> {

    /* renamed from: c */
    public static final Map<String, C41735z8> f104677c;

    /* renamed from: b */
    public final Boolean f104678b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C41185cb.f104495a);
        hashMap.put("toString", new C41258fc());
        f104677c = Collections.unmodifiableMap(hashMap);
    }

    public C41334ig(Boolean bool) {
        C40843u.m166202l(bool);
        this.f104678b = bool;
    }

    /* renamed from: a */
    public final C41735z8 mo135434a(String str) {
        if (mo135440g(str)) {
            return f104677c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type BooleanWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f104678b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41334ig)) {
            return false;
        }
        if (((C41334ig) obj).f104678b == this.f104678b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo135440g(String str) {
        return f104677c.containsKey(str);
    }

    /* renamed from: i */
    public final Boolean mo135499i() {
        return this.f104678b;
    }

    public final String toString() {
        return this.f104678b.toString();
    }
}
