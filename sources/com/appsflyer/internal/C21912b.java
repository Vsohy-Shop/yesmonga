package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.appsflyer.internal.b */
final class C21912b {
    private IntentFilter AFKeystoreWrapper = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.b$c */
    public static final class C21913c {
        static final C21912b AFInAppEventType = new C21912b();
    }

    /* renamed from: com.appsflyer.internal.b$e */
    public static final class C21914e {
        final String AFInAppEventType;
        final float AFKeystoreWrapper;

        public C21914e(float f, String str) {
            this.AFKeystoreWrapper = f;
            this.AFInAppEventType = str;
        }
    }

    @NonNull
    public final C21914e AFInAppEventParameterName(Context context) {
        boolean z;
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.AFKeystoreWrapper);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra == 2) {
                        str = "usb";
                    } else if (intExtra != 4) {
                        str = "other";
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.C32532b.f78971t, -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C21914e(f, str);
    }
}
