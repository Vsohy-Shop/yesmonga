package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0380x0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.stats.C30993d;

/* renamed from: com.google.android.gms.internal.gtm.k4 */
public final class C41371k4 {

    /* renamed from: a */
    public static final Object f104741a = new Object();

    /* renamed from: b */
    public static C30993d f104742b;

    /* renamed from: c */
    public static Boolean f104743c;

    /* renamed from: a */
    public static boolean m167930a(Context context) {
        C40843u.m166202l(context);
        Boolean bool = f104743c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean i = C41611u4.m168473i(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f104743c = Boolean.valueOf(i);
        return i;
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: b */
    public static final void m167931b(Context context, Intent intent) {
        C41607u0 g = C41607u0.m168444g(context);
        C41202d4 m = g.mo135902m();
        if (intent == null) {
            m.mo135762y("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        g.mo135899j();
        m.mo135760w("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean h = C41491p4.m168141h(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (f104741a) {
                context.startService(intent2);
                if (h) {
                    try {
                        if (f104742b == null) {
                            C30993d dVar = new C30993d(context, 1, "Analytics WakeLock");
                            f104742b = dVar;
                            dVar.mo87683d(false);
                        }
                        f104742b.mo87680a(1000);
                    } catch (SecurityException unused) {
                        m.mo135762y("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
