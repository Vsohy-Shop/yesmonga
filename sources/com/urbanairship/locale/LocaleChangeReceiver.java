package com.urbanairship.locale;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LocaleChangeReceiver extends BroadcastReceiver {
    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        if (intent != null && "android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            if (UAirship.m146184O() || UAirship.m146182M()) {
                Autopilot.m146142e(context);
                UAirship.m146188Y().mo106231v().mo18869e();
                return;
            }
            C36059m.m148409e("LocaleChangedReceiver - unable to receive intent, takeOff not called.", new Object[0]);
        }
    }
}
