package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.p9 */
public final class C14615p9 {

    /* renamed from: a */
    public static boolean f36182a;

    /* renamed from: b */
    public static final Class<?> f36183b = m62950b("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f36184c = (!f36182a && m62950b("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    public static Class<?> m62949a() {
        return f36183b;
    }

    /* renamed from: b */
    public static <T> Class<T> m62950b(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m62951c() {
        return f36182a || (f36183b != null && !f36184c);
    }
}
