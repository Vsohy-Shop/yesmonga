package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.b */
public class C34966b {

    /* renamed from: a */
    public C35014d f85066a;

    public C34966b(@C0359n0 Context context) {
        this.f85066a = new C35014d(context, "OTT_DEFAULT_USER");
    }

    /* renamed from: a */
    public int mo103631a() {
        int i = this.f85066a.mo103965b().getInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1);
        OTLogger.m143447b("AgeGateConsentHandler", "Default Age Gate Consent status :" + i);
        return i;
    }

    /* renamed from: b */
    public void mo103632b(@C0359n0 String str) {
        SharedPreferences.Editor edit;
        int i;
        if (str.equals("OPT_IN")) {
            edit = this.f85066a.mo103965b().edit();
            i = 1;
        } else if (str.equals("OPT_OUT")) {
            edit = this.f85066a.mo103965b().edit();
            i = 0;
        } else {
            mo103633c();
            OTLogger.m143447b("AgeGateConsentHandler", "Saving Age Gate Consent :" + this.f85066a.mo103965b().getInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1));
        }
        edit.putInt("OT_AGE_GATE_USER_CONSENT_STATUS", i).apply();
        OTLogger.m143447b("AgeGateConsentHandler", "Saving Age Gate Consent :" + this.f85066a.mo103965b().getInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1));
    }

    /* renamed from: c */
    public void mo103633c() {
        this.f85066a.mo103965b().edit().putInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1).apply();
    }
}
