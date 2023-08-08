package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.C40983i;

/* renamed from: com.google.android.gms.internal.gtm.w5 */
public final class C41660w5 {
    /* renamed from: a */
    public static void m168643a(String str, Context context) {
        C41493p6.m168149a(str);
        if (C40983i.m166633a(context, new RuntimeException(str))) {
            C41493p6.m168152d("Crash reported successfully.");
        } else {
            C41493p6.m168152d("Failed to report crash");
        }
    }

    /* renamed from: b */
    public static void m168644b(String str, Throwable th, Context context) {
        C41493p6.m168150b(str, th);
        if (C40983i.m166633a(context, th)) {
            C41493p6.m168152d("Crash reported successfully.");
        } else {
            C41493p6.m168152d("Failed to report crash");
        }
    }

    /* renamed from: c */
    public static void m168645c(String str, Context context) {
        C41493p6.m168153e(str);
        if (C40983i.m166633a(context, new RuntimeException(str))) {
            C41493p6.m168152d("Crash reported successfully.");
        } else {
            C41493p6.m168152d("Failed to report crash");
        }
    }
}
