package com.google.android.datatransport.runtime.dagger.internal;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.o */
public final class C40153o {
    /* renamed from: a */
    public static <T> void m163382a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m163383b(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: c */
    public static <T> T m163384c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static <T> T m163385d(T t, String str, Object obj) {
        String str2;
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            if (obj instanceof Class) {
                str2 = ((Class) obj).getCanonicalName();
            } else {
                str2 = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace("%s", str2));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }
}
