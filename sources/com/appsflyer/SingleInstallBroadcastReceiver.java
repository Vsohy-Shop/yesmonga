package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.C21868ah;
import com.urbanairship.analytics.C35557k;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            try {
                str = intent.getStringExtra(C35557k.f87781a);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper("error in BroadcastReceiver ", th);
                str = null;
            }
            if (str == null || C21868ah.valueOf(context).getString(C35557k.f87781a, (String) null) == null) {
                String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
                long currentTimeMillis = System.currentTimeMillis();
                if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= 2000) {
                    AFLogger.AFKeystoreWrapper("SingleInstallBroadcastReceiver called");
                    C21868ah.valueOf().values(context, intent);
                    AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            C21868ah.valueOf().AFInAppEventType(context, str);
        }
    }
}
