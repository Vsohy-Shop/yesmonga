package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.OTConsentInteractionType;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.w */
public class C34992w {

    /* renamed from: a */
    public SharedPreferences f85119a;

    public C34992w(@C0359n0 Context context) {
        this.f85119a = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
    }

    @C0359n0
    /* renamed from: a */
    public String mo103900a() {
        String string = this.f85119a.getString("INTERACTION_TYPE", "");
        return C35020d.m143605J(string) ? OTConsentInteractionType.BANNER_CLOSE : string;
    }

    /* renamed from: b */
    public void mo103901b(@C0359n0 String str) {
        this.f85119a.edit().putString("INTERACTION_TYPE", str).apply();
    }

    /* renamed from: c */
    public boolean mo103902c(@C0359n0 JSONObject jSONObject) {
        if (!jSONObject.has("AdvancedAnalyticsCategory")) {
            return false;
        }
        String string = jSONObject.getString("AdvancedAnalyticsCategory");
        if (C35020d.m143605J(string)) {
            return false;
        }
        OTLogger.m143447b("InteractionHandler", "advanceAnalyticsCategory set by admin = " + string);
        return true;
    }
}
