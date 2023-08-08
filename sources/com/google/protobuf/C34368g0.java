package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.g0 */
public class C34368g0 {

    /* renamed from: b */
    public static volatile boolean f83274b = false;

    /* renamed from: c */
    public static boolean f83275c = true;

    /* renamed from: d */
    public static final String f83276d = "com.google.protobuf.Extension";

    /* renamed from: e */
    public static volatile C34368g0 f83277e;

    /* renamed from: f */
    public static final C34368g0 f83278f = new C34368g0(true);

    /* renamed from: a */
    public final Map<C34370b, GeneratedMessageLite.C34268g<?, ?>> f83279a;

    /* renamed from: com.google.protobuf.g0$a */
    public static class C34369a {

        /* renamed from: a */
        public static final Class<?> f83280a = m139250a();

        /* renamed from: a */
        public static Class<?> m139250a() {
            try {
                return Class.forName(C34368g0.f83276d);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.google.protobuf.g0$b */
    public static final class C34370b {

        /* renamed from: a */
        public final Object f83281a;

        /* renamed from: b */
        public final int f83282b;

        public C34370b(Object obj, int i) {
            this.f83281a = obj;
            this.f83282b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C34370b)) {
                return false;
            }
            C34370b bVar = (C34370b) obj;
            if (this.f83281a == bVar.f83281a && this.f83282b == bVar.f83282b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f83281a) * 65535) + this.f83282b;
        }
    }

    public C34368g0() {
        this.f83279a = new HashMap();
    }

    /* renamed from: d */
    public static C34368g0 m139242d() {
        C34368g0 g0Var = f83277e;
        if (g0Var == null) {
            synchronized (C34368g0.class) {
                g0Var = f83277e;
                if (g0Var == null) {
                    if (f83275c) {
                        g0Var = C34362f0.m139180b();
                    } else {
                        g0Var = f83278f;
                    }
                    f83277e = g0Var;
                }
            }
        }
        return g0Var;
    }

    /* renamed from: f */
    public static boolean m139243f() {
        return f83274b;
    }

    /* renamed from: g */
    public static C34368g0 m139244g() {
        if (f83275c) {
            return C34362f0.m139179a();
        }
        return new C34368g0();
    }

    /* renamed from: h */
    public static void m139245h(boolean z) {
        f83274b = z;
    }

    /* renamed from: a */
    public final void mo101100a(C34355e0<?, ?> e0Var) {
        if (GeneratedMessageLite.C34268g.class.isAssignableFrom(e0Var.getClass())) {
            mo101101b((GeneratedMessageLite.C34268g) e0Var);
        }
        if (f83275c && C34362f0.m139182d(this)) {
            try {
                getClass().getMethod("add", new Class[]{C34369a.f83280a}).invoke(this, new Object[]{e0Var});
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", new Object[]{e0Var}), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo101101b(GeneratedMessageLite.C34268g<?, ?> gVar) {
        this.f83279a.put(new C34370b(gVar.mo100505h(), gVar.mo100502d()), gVar);
    }

    /* renamed from: c */
    public <ContainingType extends C34412l1> GeneratedMessageLite.C34268g<ContainingType, ?> mo101102c(ContainingType containingtype, int i) {
        return this.f83279a.get(new C34370b(containingtype, i));
    }

    /* renamed from: e */
    public C34368g0 mo101103e() {
        return new C34368g0(this);
    }

    public C34368g0(C34368g0 g0Var) {
        if (g0Var == f83278f) {
            this.f83279a = Collections.emptyMap();
        } else {
            this.f83279a = Collections.unmodifiableMap(g0Var.f83279a);
        }
    }

    public C34368g0(boolean z) {
        this.f83279a = Collections.emptyMap();
    }
}
