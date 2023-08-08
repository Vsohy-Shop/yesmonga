package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f4 */
public final class C38917f4 {

    /* renamed from: c */
    public static final C38917f4 f98843c = new C38917f4();

    /* renamed from: a */
    public final C39023q4 f98844a = new C39013p3();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C39014p4<?>> f98845b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C38917f4 m160495a() {
        return f98843c;
    }

    /* renamed from: b */
    public final <T> C39014p4<T> mo122883b(Class<T> cls) {
        C39084x2.m160970f(cls, "messageType");
        C39014p4<T> p4Var = this.f98845b.get(cls);
        if (p4Var == null) {
            p4Var = this.f98844a.mo123007a(cls);
            C39084x2.m160970f(cls, "messageType");
            C39084x2.m160970f(p4Var, "schema");
            C39014p4<T> putIfAbsent = this.f98845b.putIfAbsent(cls, p4Var);
            if (putIfAbsent == null) {
                return p4Var;
            }
            return putIfAbsent;
        }
        return p4Var;
    }
}
