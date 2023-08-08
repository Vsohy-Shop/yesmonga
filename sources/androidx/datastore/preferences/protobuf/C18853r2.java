package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: androidx.datastore.preferences.protobuf.r2 */
public final class C18853r2 {

    /* renamed from: c */
    public static final C18853r2 f47991c = new C18853r2();

    /* renamed from: a */
    public final C18914y2 f47992a = new C18859s1();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C18905x2<?>> f47993b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C18853r2 m87361a() {
        return f47991c;
    }

    /* renamed from: b */
    public int mo55366b() {
        int i = 0;
        for (C18905x2 next : this.f47993b.values()) {
            if (next instanceof C18700c2) {
                i += ((C18700c2) next).mo54482x();
            }
        }
        return i;
    }

    /* renamed from: c */
    public <T> boolean mo55367c(T t) {
        return mo55374j(t).mo54447c(t);
    }

    /* renamed from: d */
    public <T> void mo55368d(T t) {
        mo55374j(t).mo54446b(t);
    }

    /* renamed from: e */
    public <T> void mo55369e(T t, C18899w2 w2Var) throws IOException {
        mo55370f(t, w2Var, C18836p0.m87223d());
    }

    /* renamed from: f */
    public <T> void mo55370f(T t, C18899w2 w2Var, C18836p0 p0Var) throws IOException {
        mo55374j(t).mo54457h(t, w2Var, p0Var);
    }

    /* renamed from: g */
    public C18905x2<?> mo55371g(Class<?> cls, C18905x2<?> x2Var) {
        C18753i1.m86341e(cls, "messageType");
        C18753i1.m86341e(x2Var, "schema");
        return this.f47993b.putIfAbsent(cls, x2Var);
    }

    /* renamed from: h */
    public C18905x2<?> mo55372h(Class<?> cls, C18905x2<?> x2Var) {
        C18753i1.m86341e(cls, "messageType");
        C18753i1.m86341e(x2Var, "schema");
        return this.f47993b.put(cls, x2Var);
    }

    /* renamed from: i */
    public <T> C18905x2<T> mo55373i(Class<T> cls) {
        C18753i1.m86341e(cls, "messageType");
        C18905x2<T> x2Var = this.f47993b.get(cls);
        if (x2Var != null) {
            return x2Var;
        }
        C18905x2<T> a = this.f47992a.mo55381a(cls);
        C18905x2<?> g = mo55371g(cls, a);
        if (g != null) {
            return g;
        }
        return a;
    }

    /* renamed from: j */
    public <T> C18905x2<T> mo55374j(T t) {
        return mo55373i(t.getClass());
    }

    /* renamed from: k */
    public <T> void mo55375k(T t, Writer writer) throws IOException {
        mo55374j(t).mo54459i(t, writer);
    }
}
