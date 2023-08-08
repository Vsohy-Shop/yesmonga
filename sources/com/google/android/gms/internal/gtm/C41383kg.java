package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.kg */
public final class C41383kg extends C41310hg<C41735z8> {

    /* renamed from: c */
    public static final Map<String, C41735z8> f104766c;

    /* renamed from: b */
    public final C41735z8 f104767b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C41185cb.f104495a);
        f104766c = Collections.unmodifiableMap(hashMap);
    }

    public C41383kg(C41735z8 z8Var) {
        this.f104767b = z8Var;
    }

    /* renamed from: a */
    public final C41735z8 mo135434a(String str) {
        if (mo135440g(str)) {
            return f104766c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type InstructionReference.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f104767b;
    }

    /* renamed from: e */
    public final Iterator<C41310hg<?>> mo135438e() {
        return mo135437d();
    }

    /* renamed from: g */
    public final boolean mo135440g(String str) {
        return f104766c.containsKey(str);
    }

    /* renamed from: i */
    public final C41735z8 mo135582i() {
        return this.f104767b;
    }

    public final String toString() {
        return this.f104767b.toString();
    }
}
