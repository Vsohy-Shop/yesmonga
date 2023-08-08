package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.z5 */
public class C14920z5 {

    /* renamed from: a */
    public static String f36989a = "https://mobile-production.content-square.net/android/config/v2/";

    /* renamed from: a */
    public static String m64191a(String str) {
        return str + "/mobile/" + "v2" + "/" + "events";
    }

    /* renamed from: b */
    public static String m64192b(String str, String str2) {
        return str2 + str + ".json";
    }

    /* renamed from: c */
    public static String m64193c(String str) {
        return m64192b(str, f36989a);
    }

    /* renamed from: d */
    public static String m64194d(String str) {
        return str + "/snapshots/" + "v2" + "/snapshot";
    }
}
