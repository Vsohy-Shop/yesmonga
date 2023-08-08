package com.google.firebase.perf.logging;

/* renamed from: com.google.firebase.perf.logging.b */
public final class C33364b {

    /* renamed from: a */
    public static final String f81045a = "https://console.firebase.google.com";

    /* renamed from: b */
    public static final String f81046b = "android-ide";

    /* renamed from: c */
    public static final String f81047c = "perf-android-sdk";

    /* renamed from: a */
    public static String m134462a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{m134465d(str, str2), str3, f81047c, f81046b});
    }

    /* renamed from: b */
    public static String m134463b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{m134465d(str, str2), f81047c, f81046b});
    }

    /* renamed from: c */
    public static String m134464c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{m134465d(str, str2), str3, f81047c, f81046b});
    }

    /* renamed from: d */
    public static String m134465d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", new Object[]{f81045a, str, str2});
    }
}
