package com.onetrust.otpublishers.headless.Internal.Preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Preferences.d */
public class C35014d {

    /* renamed from: a */
    public final SharedPreferences f85170a;

    public C35014d(@C0359n0 Context context, @C0359n0 String str) {
        this.f85170a = context.getSharedPreferences("com.onetrust.otpublishers.headless.preference" + str, 0);
    }

    /* renamed from: a */
    public void mo103964a() {
        this.f85170a.edit().clear().apply();
    }

    @C0359n0
    /* renamed from: b */
    public SharedPreferences mo103965b() {
        return this.f85170a;
    }
}
