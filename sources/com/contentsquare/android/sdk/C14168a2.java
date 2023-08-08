package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.a2 */
public final class C14168a2 {

    /* renamed from: a */
    public static final Class<?> f35039a = m60807c();

    /* renamed from: a */
    public static C14787v2 m60805a() {
        C14787v2 b = m60806b("getEmptyRegistry");
        return b != null ? b : C14787v2.f36669d;
    }

    /* renamed from: b */
    public static final C14787v2 m60806b(String str) {
        Class<?> cls = f35039a;
        if (cls == null) {
            return null;
        }
        try {
            return (C14787v2) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class<?> m60807c() {
        try {
            return Class.forName("com.contentsquare.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
