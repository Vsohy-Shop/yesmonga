package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41202d4;
import com.google.android.gms.internal.gtm.C41560s1;
import com.google.android.gms.internal.gtm.C41607u0;
import com.google.android.gms.internal.gtm.C41611u4;
import com.urbanairship.analytics.C35557k;

@C40974d0
/* renamed from: com.google.android.gms.analytics.a */
public class C40371a extends BroadcastReceiver {
    @C0363p0

    /* renamed from: a */
    public static Boolean f102899a;

    /* renamed from: b */
    public static boolean m164210b(@RecentlyNonNull Context context) {
        C40843u.m166202l(context);
        Boolean bool = f102899a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean i = C41611u4.m168473i(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f102899a = Boolean.valueOf(i);
        return i;
    }

    /* renamed from: a */
    public void mo133256a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(@RecentlyNonNull Context context, @C0363p0 Intent intent) {
        C41607u0 g = C41607u0.m168444g(context);
        C41202d4 m = g.mo135902m();
        if (intent == null) {
            m.mo135762y("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra(C35557k.f87781a);
        String action = intent.getAction();
        m.mo135760w("CampaignTrackingReceiver received", action);
        if (!C35557k.f87782b.equals(action) || TextUtils.isEmpty(stringExtra)) {
            m.mo135762y("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        mo133256a(context, stringExtra);
        g.mo135899j();
        g.mo135899j();
        int f = C41560s1.m168319f();
        if (stringExtra.length() > f) {
            m.mo135731B("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(f));
            stringExtra = stringExtra.substring(0, f);
        }
        g.mo135896f().mo135693c0(stringExtra, new C40400l(this, goAsync()));
    }
}
