package com.urbanairship.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.util.C9669o0;

/* renamed from: com.urbanairship.analytics.k */
public class C35557k extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f87781a = "referrer";

    /* renamed from: b */
    public static final String f87782b = "com.android.vending.INSTALL_REFERRER";

    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        Autopilot.m146142e(context);
        if (!UAirship.m146184O() && !UAirship.m146182M()) {
            C36059m.m148409e("InstallReceiver - unable to track install referrer, takeOff not called.", new Object[0]);
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra(f87781a);
            if (C9669o0.m36224e(stringExtra) || !f87782b.equals(intent.getAction())) {
                C36059m.m148406b("missing referrer or invalid action.", new Object[0]);
                return;
            }
            UAirship.m146188Y().mo106221g().mo106423J(new C35556j(stringExtra));
        }
    }
}
