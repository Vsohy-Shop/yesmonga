package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.datatransport.runtime.logging.a */
public final class C40195a {

    /* renamed from: a */
    public static final String f102451a = "TRuntime.";

    /* renamed from: b */
    public static final int f102452b = 23;

    /* renamed from: a */
    public static String m163490a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    public static void m163491b(String str, String str2) {
        m163496g(str);
    }

    /* renamed from: c */
    public static void m163492c(String str, String str2, Object obj) {
        if (Log.isLoggable(m163496g(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: d */
    public static void m163493d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(m163496g(str), 3)) {
            String.format(str2, new Object[]{obj, obj2});
        }
    }

    /* renamed from: e */
    public static void m163494e(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m163496g(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: f */
    public static void m163495f(String str, String str2, Throwable th) {
        m163496g(str);
    }

    /* renamed from: g */
    public static String m163496g(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m163490a(f102451a, str);
        }
        return f102451a + str;
    }

    /* renamed from: h */
    public static void m163497h(String str, String str2, Object obj) {
        if (Log.isLoggable(m163496g(str), 4)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: i */
    public static void m163498i(String str, String str2, Object obj) {
        if (Log.isLoggable(m163496g(str), 5)) {
            String.format(str2, new Object[]{obj});
        }
    }
}
