package com.contentsquare.android.sdk;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.contentsquare.android.sdk.od */
public final class C14599od {

    /* renamed from: c */
    public static final C14599od f36115c = new C14599od();

    /* renamed from: a */
    public final C14178a9 f36116a = new C14355g2();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C14398h8<?>> f36117b = new ConcurrentHashMap();

    /* renamed from: d */
    public static C14599od m62876d() {
        return f36115c;
    }

    /* renamed from: a */
    public <T> C14398h8<T> mo36104a(Class<T> cls) {
        C14566o3.m62806h(cls, "messageType");
        C14398h8<T> h8Var = this.f36117b.get(cls);
        if (h8Var != null) {
            return h8Var;
        }
        C14398h8<T> a = this.f36116a.mo34525a(cls);
        C14398h8<?> b = mo36105b(cls, a);
        return b != null ? b : a;
    }

    /* renamed from: b */
    public C14398h8<?> mo36105b(Class<?> cls, C14398h8<?> h8Var) {
        C14566o3.m62806h(cls, "messageType");
        C14566o3.m62806h(h8Var, "schema");
        return this.f36117b.putIfAbsent(cls, h8Var);
    }

    /* renamed from: c */
    public <T> C14398h8<T> mo36106c(T t) {
        return mo36104a(t.getClass());
    }

    /* renamed from: e */
    public <T> void mo36107e(T t, C14475k6 k6Var, C14787v2 v2Var) {
        mo36106c(t).mo35221i(t, k6Var, v2Var);
    }
}
