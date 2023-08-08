package com.google.protobuf;

/* renamed from: com.google.protobuf.e */
public final class C34354e {

    /* renamed from: a */
    public static boolean f83250a;

    /* renamed from: b */
    public static final Class<?> f83251b = m139156a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f83252c;

    static {
        boolean z;
        if (f83250a || m139156a("org.robolectric.Robolectric") == null) {
            z = false;
        } else {
            z = true;
        }
        f83252c = z;
    }

    /* renamed from: a */
    public static <T> Class<T> m139156a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m139157b() {
        return f83251b;
    }

    /* renamed from: c */
    public static boolean m139158c() {
        return f83250a || (f83251b != null && !f83252c);
    }
}
