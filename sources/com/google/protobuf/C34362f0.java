package com.google.protobuf;

/* renamed from: com.google.protobuf.f0 */
public final class C34362f0 {

    /* renamed from: a */
    public static final String f83260a = "com.google.protobuf.ExtensionRegistry";

    /* renamed from: b */
    public static final Class<?> f83261b = m139183e();

    /* renamed from: a */
    public static C34368g0 m139179a() {
        C34368g0 c = m139181c("newInstance");
        if (c != null) {
            return c;
        }
        return new C34368g0();
    }

    /* renamed from: b */
    public static C34368g0 m139180b() {
        C34368g0 c = m139181c("getEmptyRegistry");
        if (c != null) {
            return c;
        }
        return C34368g0.f83278f;
    }

    /* renamed from: c */
    public static final C34368g0 m139181c(String str) {
        Class<?> cls = f83261b;
        if (cls == null) {
            return null;
        }
        try {
            return (C34368g0) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m139182d(C34368g0 g0Var) {
        Class<?> cls = f83261b;
        if (cls == null || !cls.isAssignableFrom(g0Var.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static Class<?> m139183e() {
        try {
            return Class.forName(f83260a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
