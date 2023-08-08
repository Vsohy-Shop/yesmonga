package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.C21868ah;
import com.urbanairship.analytics.C35557k;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
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
                AFLogger.AFKeystoreWrapper("MultipleInstallBroadcastReceiver called");
                C21868ah.valueOf().values(context, intent);
                for (ResolveInfo next : context.getPackageManager().queryBroadcastReceivers(new Intent(C35557k.f87782b), 0)) {
                    String action = intent.getAction();
                    if (next.activityInfo.packageName.equals(context.getPackageName()) && C35557k.f87782b.equals(action) && !getClass().getName().equals(next.activityInfo.name)) {
                        StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
                        sb.append(next.activityInfo.name);
                        AFLogger.AFKeystoreWrapper(sb.toString());
                        try {
                            ((BroadcastReceiver) Class.forName(next.activityInfo.name).newInstance()).onReceive(context, intent);
                        } catch (Throwable th2) {
                            StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                            sb2.append(next.activityInfo.name);
                            AFLogger.AFKeystoreWrapper(sb2.toString(), th2);
                        }
                    }
                }
                return;
            }
            C21868ah.valueOf().AFInAppEventType(context, str);
        }
    }
}
