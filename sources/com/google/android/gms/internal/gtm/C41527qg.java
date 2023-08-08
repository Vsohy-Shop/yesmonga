package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.qg */
public final class C41527qg extends C41310hg<Map<String, C41310hg<?>>> {

    /* renamed from: c */
    public static final Map<String, C41735z8> f104910c;

    /* renamed from: b */
    public boolean f104911b = false;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C41185cb.f104495a);
        f104910c = Collections.unmodifiableMap(hashMap);
    }

    public C41527qg(Map<String, C41310hg<?>> map) {
        this.f104661a = (Map) C40843u.m166202l(map);
    }

    /* renamed from: a */
    public final C41735z8 mo135434a(String str) {
        if (mo135440g(str)) {
            return f104910c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type ListWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final C41310hg<?> mo135435b(String str) {
        C41310hg<?> b = super.mo135435b(str);
        return b == null ? C41431mg.f104800h : b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f104661a;
    }

    /* renamed from: e */
    public final Iterator<C41310hg<?>> mo135438e() {
        return mo135437d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41527qg)) {
            return false;
        }
        return this.f104661a.entrySet().equals(((C41527qg) obj).f104661a.entrySet());
    }

    /* renamed from: g */
    public final boolean mo135440g(String str) {
        return f104910c.containsKey(str);
    }

    /* renamed from: i */
    public final Map<String, C41310hg<?>> mo135785i() {
        return this.f104661a;
    }

    /* renamed from: j */
    public final void mo135786j() {
        this.f104911b = true;
    }

    /* renamed from: k */
    public final boolean mo135787k() {
        return this.f104911b;
    }

    public final String toString() {
        return this.f104661a.toString();
    }
}
