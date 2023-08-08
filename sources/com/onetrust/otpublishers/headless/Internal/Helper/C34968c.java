package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.c */
public class C34968c {

    /* renamed from: a */
    public SharedPreferences f85071a;

    public C34968c(@C0359n0 Context context) {
        this.f85071a = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
    }

    /* renamed from: a */
    public int mo103647a() {
        return this.f85071a.getInt("OT_UCP_USER_CONSENT_STATUS", -1);
    }

    /* renamed from: b */
    public void mo103648b(int i) {
        this.f85071a.edit().putInt("OT_UCP_USER_CONSENT_STATUS", i).apply();
    }

    /* renamed from: c */
    public void mo103649c(boolean z) {
        this.f85071a.edit().putInt("OTT_USER_CONSENT_STATUS", z ? 1 : 0).apply();
    }

    /* renamed from: d */
    public boolean mo103650d() {
        return this.f85071a.getInt("OTT_USER_CONSENT_STATUS", -1) == 1;
    }
}
