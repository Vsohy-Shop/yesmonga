package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.protobuf.a2 */
public final class C34325a2 {

    /* renamed from: c */
    public static final C34325a2 f83197c = new C34325a2();

    /* renamed from: a */
    public final C34376h2 f83198a = new C34356e1();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C34372g2<?>> f83199b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C34325a2 m138828a() {
        return f83197c;
    }

    /* renamed from: b */
    public int mo100874b() {
        int i = 0;
        for (C34372g2 next : this.f83199b.values()) {
            if (next instanceof C34429o1) {
                i += ((C34429o1) next).mo101467x();
            }
        }
        return i;
    }

    /* renamed from: c */
    public <T> boolean mo100875c(T t) {
        return mo100882j(t).mo101116c(t);
    }

    /* renamed from: d */
    public <T> void mo100876d(T t) {
        mo100882j(t).mo101115b(t);
    }

    /* renamed from: e */
    public <T> void mo100877e(T t, C34366f2 f2Var) throws IOException {
        mo100878f(t, f2Var, C34368g0.m139242d());
    }

    /* renamed from: f */
    public <T> void mo100878f(T t, C34366f2 f2Var, C34368g0 g0Var) throws IOException {
        mo100882j(t).mo101122i(t, f2Var, g0Var);
    }

    /* renamed from: g */
    public C34372g2<?> mo100879g(Class<?> cls, C34372g2<?> g2Var) {
        C34471v0.m140574e(cls, "messageType");
        C34471v0.m140574e(g2Var, "schema");
        return this.f83199b.putIfAbsent(cls, g2Var);
    }

    /* renamed from: h */
    public C34372g2<?> mo100880h(Class<?> cls, C34372g2<?> g2Var) {
        C34471v0.m140574e(cls, "messageType");
        C34471v0.m140574e(g2Var, "schema");
        return this.f83199b.put(cls, g2Var);
    }

    /* renamed from: i */
    public <T> C34372g2<T> mo100881i(Class<T> cls) {
        C34471v0.m140574e(cls, "messageType");
        C34372g2<T> g2Var = this.f83199b.get(cls);
        if (g2Var != null) {
            return g2Var;
        }
        C34372g2<T> a = this.f83198a.mo101038a(cls);
        C34372g2<?> g = mo100879g(cls, a);
        if (g != null) {
            return g;
        }
        return a;
    }

    /* renamed from: j */
    public <T> C34372g2<T> mo100882j(T t) {
        return mo100881i(t.getClass());
    }

    /* renamed from: k */
    public <T> void mo100883k(T t, Writer writer) throws IOException {
        mo100882j(t).mo101121h(t, writer);
    }
}
