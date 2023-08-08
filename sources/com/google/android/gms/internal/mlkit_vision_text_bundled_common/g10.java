package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class g10 {

    /* renamed from: c */
    public static final g10 f71256c = new g10();

    /* renamed from: d */
    public static final /* synthetic */ int f71257d = 0;

    /* renamed from: a */
    public final k10 f71258a = new o00();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, j10<?>> f71259b = new ConcurrentHashMap();

    /* renamed from: a */
    public static g10 m120414a() {
        return f71256c;
    }

    /* renamed from: b */
    public final <T> j10<T> mo84636b(Class<T> cls) {
        C29909xz.m121348f(cls, "messageType");
        j10<T> j10 = this.f71259b.get(cls);
        if (j10 == null) {
            j10 = this.f71258a.mo84702a(cls);
            C29909xz.m121348f(cls, "messageType");
            C29909xz.m121348f(j10, "schema");
            j10<T> putIfAbsent = this.f71259b.putIfAbsent(cls, j10);
            if (putIfAbsent == null) {
                return j10;
            }
            return putIfAbsent;
        }
        return j10;
    }
}
