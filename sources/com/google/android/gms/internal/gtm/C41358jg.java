package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.jg */
public final class C41358jg extends C41310hg<Double> {

    /* renamed from: c */
    public static final Map<String, C41735z8> f104710c;

    /* renamed from: b */
    public final Double f104711b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C41185cb.f104495a);
        hashMap.put("toString", new C41258fc());
        f104710c = Collections.unmodifiableMap(hashMap);
    }

    public C41358jg(Double d) {
        C40843u.m166202l(d);
        this.f104711b = d;
    }

    /* renamed from: a */
    public final C41735z8 mo135434a(String str) {
        if (mo135440g(str)) {
            return f104710c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type DoubleWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f104711b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41358jg)) {
            return false;
        }
        return this.f104711b.equals(((C41358jg) obj).f104711b);
    }

    /* renamed from: g */
    public final boolean mo135440g(String str) {
        return f104710c.containsKey(str);
    }

    /* renamed from: i */
    public final Double mo135515i() {
        return this.f104711b;
    }

    public final String toString() {
        return this.f104711b.toString();
    }
}
