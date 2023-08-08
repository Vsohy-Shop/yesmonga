package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.gtm.dl */
public final class C41219dl {

    /* renamed from: c */
    public static final C41219dl f104548c = new C41219dl();

    /* renamed from: a */
    public final C41339il f104549a = new C41459nk();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C41315hl<?>> f104550b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C41219dl m167407a() {
        return f104548c;
    }

    /* renamed from: b */
    public final <T> C41315hl<T> mo135299b(Class<T> cls) {
        C41650vj.m168604f(cls, "messageType");
        C41315hl<T> hlVar = this.f104550b.get(cls);
        if (hlVar == null) {
            hlVar = this.f104549a.mo135501a(cls);
            C41650vj.m168604f(cls, "messageType");
            C41650vj.m168604f(hlVar, "schema");
            C41315hl<T> putIfAbsent = this.f104550b.putIfAbsent(cls, hlVar);
            if (putIfAbsent == null) {
                return hlVar;
            }
            return putIfAbsent;
        }
        return hlVar;
    }
}
