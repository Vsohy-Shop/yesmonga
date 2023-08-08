package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.e */
public final class C18712e {

    /* renamed from: a */
    public static final Class<?> f47845a = m85798a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f47846b;

    static {
        boolean z;
        if (m85798a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f47846b = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m85798a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m85799b() {
        return f47845a;
    }

    /* renamed from: c */
    public static boolean m85800c() {
        return f47845a != null && !f47846b;
    }
}
