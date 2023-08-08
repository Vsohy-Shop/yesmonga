package com.onetrust.otpublishers.headless.Internal.Preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import java.util.Date;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Preferences.f */
public class C35016f {

    /* renamed from: a */
    public final Context f85173a;

    public C35016f(@C0359n0 Context context) {
        this.f85173a = context;
    }

    /* renamed from: a */
    public void mo104015a() {
        Date f;
        Date f2;
        SharedPreferences b = new C35014d(this.f85173a, "OTT_DEFAULT_USER").mo103965b();
        if (!b.contains("OT_IAB_TC_STR_CREATED_IN_MILLISECONDS") && b.contains("OT_IAB_TCStr_Created")) {
            String string = b.getString("OT_IAB_TCStr_Created", "");
            if (!C35020d.m143605J(string) && (f2 = C35020d.m143615f(string)) != null) {
                b.edit().putLong("OT_IAB_TC_STR_CREATED_IN_MILLISECONDS", f2.getTime()).apply();
                OTLogger.m143460o("TCStringDate", "Updating tc string created date in milliseconds,Date = " + string + " , milliseconds = " + f2.getTime());
            }
        }
        if (!b.contains("OT_IAB_TC_STR_LAST_UPDATED_IN_MILLISECONDS") && b.contains("OT_IAB_TCStr_LastUpdated")) {
            String string2 = b.getString("OT_IAB_TCStr_LastUpdated", "");
            if (!C35020d.m143605J(string2) && (f = C35020d.m143615f(string2)) != null) {
                b.edit().putLong("OT_IAB_TC_STR_LAST_UPDATED_IN_MILLISECONDS", f.getTime()).apply();
                OTLogger.m143460o("TCStringDate", "Updating tc string updated date in milliseconds,Date = " + string2 + " , milliseconds = " + f.getTime());
            }
        }
    }
}
