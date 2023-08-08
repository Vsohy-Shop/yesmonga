package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0348i1;

/* renamed from: com.google.firebase.messaging.r0 */
public final class C33224r0 {

    /* renamed from: a */
    public static final String f80779a = "com.google.firebase.messaging";

    /* renamed from: a */
    public static SharedPreferences m134033a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @C0348i1
    /* renamed from: b */
    public static boolean m134034b(Context context) {
        return m134033a(context).getBoolean("proxy_notification_initialized", false);
    }

    @C0348i1
    /* renamed from: c */
    public static void m134035c(Context context, boolean z) {
        SharedPreferences.Editor edit = m134033a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
