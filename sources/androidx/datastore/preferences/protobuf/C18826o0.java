package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.o0 */
public final class C18826o0 {

    /* renamed from: a */
    public static final String f47967a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* renamed from: b */
    public static final Class<?> f47968b = m87084e();

    /* renamed from: a */
    public static C18836p0 m87080a() {
        if (f47968b != null) {
            try {
                return m87082c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new C18836p0();
    }

    /* renamed from: b */
    public static C18836p0 m87081b() {
        if (f47968b != null) {
            try {
                return m87082c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C18836p0.f47978g;
    }

    /* renamed from: c */
    public static final C18836p0 m87082c(String str) throws Exception {
        return (C18836p0) f47968b.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: d */
    public static boolean m87083d(C18836p0 p0Var) {
        Class<?> cls = f47968b;
        if (cls == null || !cls.isAssignableFrom(p0Var.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static Class<?> m87084e() {
        try {
            return Class.forName(f47967a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
