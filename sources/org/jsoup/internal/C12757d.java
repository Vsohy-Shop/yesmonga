package org.jsoup.internal;

import java.util.Locale;

/* renamed from: org.jsoup.internal.d */
public final class C12757d {
    /* renamed from: a */
    public static String m55098a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: b */
    public static String m55099b(String str) {
        return m55098a(str).trim();
    }

    /* renamed from: c */
    public static String m55100c(String str, boolean z) {
        return z ? m55098a(str) : m55099b(str);
    }
}
