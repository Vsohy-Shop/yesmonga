package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p0 */
public class C18836p0 {

    /* renamed from: b */
    public static volatile boolean f47973b = false;

    /* renamed from: c */
    public static boolean f47974c = true;

    /* renamed from: d */
    public static final String f47975d = "androidx.datastore.preferences.protobuf.Extension";

    /* renamed from: e */
    public static final Class<?> f47976e = m87226h();

    /* renamed from: f */
    public static volatile C18836p0 f47977f;

    /* renamed from: g */
    public static final C18836p0 f47978g = new C18836p0(true);

    /* renamed from: a */
    public final Map<C18837a, GeneratedMessageLite.C18641h<?, ?>> f47979a;

    /* renamed from: androidx.datastore.preferences.protobuf.p0$a */
    public static final class C18837a {

        /* renamed from: a */
        public final Object f47980a;

        /* renamed from: b */
        public final int f47981b;

        public C18837a(Object obj, int i) {
            this.f47980a = obj;
            this.f47981b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C18837a)) {
                return false;
            }
            C18837a aVar = (C18837a) obj;
            if (this.f47980a == aVar.f47980a && this.f47981b == aVar.f47981b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f47980a) * 65535) + this.f47981b;
        }
    }

    public C18836p0() {
        this.f47979a = new HashMap();
    }

    /* renamed from: d */
    public static C18836p0 m87223d() {
        C18836p0 p0Var = f47977f;
        if (p0Var == null) {
            synchronized (C18836p0.class) {
                p0Var = f47977f;
                if (p0Var == null) {
                    if (f47974c) {
                        p0Var = C18826o0.m87081b();
                    } else {
                        p0Var = f47978g;
                    }
                    f47977f = p0Var;
                }
            }
        }
        return p0Var;
    }

    /* renamed from: f */
    public static boolean m87224f() {
        return f47973b;
    }

    /* renamed from: g */
    public static C18836p0 m87225g() {
        if (f47974c) {
            return C18826o0.m87080a();
        }
        return new C18836p0();
    }

    /* renamed from: h */
    public static Class<?> m87226h() {
        try {
            return Class.forName(f47975d);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static void m87227i(boolean z) {
        f47973b = z;
    }

    /* renamed from: a */
    public final void mo55301a(C18817n0<?, ?> n0Var) {
        if (GeneratedMessageLite.C18641h.class.isAssignableFrom(n0Var.getClass())) {
            mo55302b((GeneratedMessageLite.C18641h) n0Var);
        }
        if (f47974c && C18826o0.m87083d(this)) {
            try {
                getClass().getMethod("add", new Class[]{f47976e}).invoke(this, new Object[]{n0Var});
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", new Object[]{n0Var}), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo55302b(GeneratedMessageLite.C18641h<?, ?> hVar) {
        this.f47979a.put(new C18837a(hVar.mo54078h(), hVar.mo54075d()), hVar);
    }

    /* renamed from: c */
    public <ContainingType extends C18920z1> GeneratedMessageLite.C18641h<ContainingType, ?> mo55303c(ContainingType containingtype, int i) {
        return this.f47979a.get(new C18837a(containingtype, i));
    }

    /* renamed from: e */
    public C18836p0 mo55304e() {
        return new C18836p0(this);
    }

    public C18836p0(C18836p0 p0Var) {
        if (p0Var == f47978g) {
            this.f47979a = Collections.emptyMap();
        } else {
            this.f47979a = Collections.unmodifiableMap(p0Var.f47979a);
        }
    }

    public C18836p0(boolean z) {
        this.f47979a = Collections.emptyMap();
    }
}
