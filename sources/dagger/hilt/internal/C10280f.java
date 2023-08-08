package dagger.hilt.internal;

/* renamed from: dagger.hilt.internal.f */
public final class C10280f {
    /* renamed from: a */
    public static void m38505a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static <T> T m38506b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m38507c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m38508d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
