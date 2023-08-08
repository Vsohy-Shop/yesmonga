package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.hg */
public abstract class C41310hg<T> {

    /* renamed from: a */
    public Map<String, C41310hg<?>> f104661a;

    /* renamed from: a */
    public C41735z8 mo135434a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("Attempting to access Native Method ");
        sb.append(str);
        sb.append(" on unsupported type.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public C41310hg<?> mo135435b(String str) {
        Map<String, C41310hg<?>> map = this.f104661a;
        if (map != null) {
            return map.get(str);
        }
        return C41431mg.f104800h;
    }

    /* renamed from: c */
    public abstract T mo135436c();

    /* renamed from: d */
    public final Iterator<C41310hg<?>> mo135437d() {
        Map<String, C41310hg<?>> map = this.f104661a;
        if (map == null) {
            return new C41286gg((C41262fg) null);
        }
        return new C41238eg(this, map.keySet().iterator());
    }

    /* renamed from: e */
    public Iterator<C41310hg<?>> mo135438e() {
        return new C41286gg((C41262fg) null);
    }

    /* renamed from: f */
    public final void mo135439f(String str, C41310hg<?> hgVar) {
        if (this.f104661a == null) {
            this.f104661a = new HashMap();
        }
        this.f104661a.put(str, hgVar);
    }

    /* renamed from: g */
    public boolean mo135440g(String str) {
        return false;
    }

    /* renamed from: h */
    public final boolean mo135441h(String str) {
        Map<String, C41310hg<?>> map = this.f104661a;
        if (map == null || !map.containsKey(str)) {
            return false;
        }
        return true;
    }

    public abstract String toString();
}
